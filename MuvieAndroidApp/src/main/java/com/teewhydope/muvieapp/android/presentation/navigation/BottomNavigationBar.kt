package com.teewhydope.muvieapp.android.presentation.navigation

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavGraph
import androidx.navigation.NavHostController
import com.teewhydope.muvieapp.android.R

@Composable
internal fun HomeBottomNavigation(
    selectedNavigation: Screen,
    onNavigationSelected: (Screen) -> Unit,
    modifier: Modifier = Modifier,
    hasSoftKey: Boolean,
    navController: NavHostController,
) {
    Surface(
        color = MaterialTheme.colors.surface,
        contentColor = contentColorFor(MaterialTheme.colors.surface),
        elevation = 8.dp,
        modifier = modifier
    ) {
        Row(
            Modifier
                .padding()
                .fillMaxWidth()
                .height(56.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            HomeBottomNavigationItem(
                label = "Home",
                selected = selectedNavigation == Screen.Home,
                onClick = { onNavigationSelected(Screen.Home) },
                contentDescription = "Home",
                selectedPainter = painterResource(R.drawable.home),
                painter = painterResource(R.drawable.home),
                hasSoftKey = hasSoftKey
            )

            HomeBottomNavigationItem(
                label = "Coming Soon",
                selected = selectedNavigation == Screen.ComingSoon,
                onClick = { onNavigationSelected(Screen.ComingSoon) },
                contentDescription = "Coming Soon",
                selectedPainter = painterResource(R.drawable.coming_soon),
                painter = painterResource(R.drawable.coming_soon),
                hasSoftKey = hasSoftKey
            )

            HomeBottomNavigationItem(
                label = "Downloads",
                selected = selectedNavigation == Screen.Downloads,
                onClick = { onNavigationSelected(Screen.Downloads) },
                contentDescription = "Downloads",
                selectedPainter = painterResource(R.drawable.arrow_down_circle),
                painter = painterResource(R.drawable.arrow_down_circle),
                hasSoftKey = hasSoftKey
            )
        }
    }
}

@Composable
private fun RowScope.HomeBottomNavigationItem(
    selected: Boolean,
    selectedPainter: Painter? = null,
    painter: Painter,
    contentDescription: String,
    label: String,
    onClick: () -> Unit,
    hasSoftKey: Boolean

) {
    BottomNavigationItem(
        icon = {
            Column(
                if (!hasSoftKey) Modifier
                    .fillMaxSize()
                    .padding(top = 8.dp) else Modifier.fillMaxSize(),
                verticalArrangement = if (!hasSoftKey) Arrangement.Top else Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                if (selectedPainter != null) {

                    Crossfade(targetState = selected) { selected ->
                        Icon(
                            painter = if (selected) selectedPainter else painter,
                            contentDescription = contentDescription,
                            modifier = Modifier.size(20.dp)
                        )
                    }

                } else {
                    Icon(
                        painter = painter,
                        contentDescription = contentDescription ,
                        modifier = Modifier.size(20.dp)
                    )
                }
                Text(
                    text = label,
                    textAlign = TextAlign.Center,
                    fontSize = 10.sp
                )

            }
        },
        selected = selected,
        onClick = onClick,
    )
}


private val NavGraph.startDestination: NavDestination?
    get() = findNode(startDestinationId)

/**
 * Copied from similar function in NavigationUI.kt
 *
 * https://cs.android.com/androidx/platform/frameworks/support/+/androidx-main:navigation/navigation-ui/src/main/java/androidx/navigation/ui/NavigationUI.kt
 */
tailrec fun findStartDestination(graph: NavDestination): NavDestination {
    return if (graph is NavGraph) findStartDestination(graph.startDestination!!) else graph
}

/**
 * Returns true if a destination with the given [route] is in the ancestor chain of [destination].
 */
private fun isRouteInDestinationChain(
    destination: NavDestination,
    route: String,
): Boolean {
    var currentDestination: NavDestination = destination
    while (currentDestination.route != route && currentDestination.parent != null) {
        currentDestination = currentDestination.parent!!
    }
    return currentDestination.route == route
}

/**
 * Adds an [NavController.OnDestinationChangedListener] to this [NavController] and updates the
 * returned [State] which is updated as the destination changes.
 */
@Stable
@Composable
fun NavController.currentScreenAsState(): State<Screen> {
    val selectedItem = remember { mutableStateOf<Screen>(Screen.Home) }

    DisposableEffect(this) {
        val listener = NavController.OnDestinationChangedListener { _, destination, _ ->
            when {
                isRouteInDestinationChain(destination, Screen.Home.route) -> {
                    selectedItem.value = Screen.Home
                }
                isRouteInDestinationChain(destination, Screen.ComingSoon.route) -> {
                    selectedItem.value = Screen.ComingSoon
                }
                isRouteInDestinationChain(destination, Screen.Downloads.route) -> {
                    selectedItem.value = Screen.Downloads
                }
            }
        }
        addOnDestinationChangedListener(listener)

        onDispose {
            removeOnDestinationChangedListener(listener)
        }
    }

    return selectedItem
}

