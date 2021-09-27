package com.teewhydope.muvieapp.android.presentation.components


import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.teewhydope.muvieapp.android.presentation.navigation.HomeBottomNavigation
import com.teewhydope.muvieapp.android.presentation.navigation.currentScreenAsState
import com.teewhydope.muvieapp.android.presentation.navigation.findStartDestination

@Composable
fun ScaffoldBottomBar(
    navController: NavController,
    hasSoftKey: Boolean,
    navHostController: NavHostController,
    content: @Composable (PaddingValues) -> Unit,
) {
    Scaffold(
        bottomBar = {
            val currentSelectedItem by navController.currentScreenAsState()
            HomeBottomNavigation(
                selectedNavigation = currentSelectedItem,
                onNavigationSelected = { selected ->
                    navController.navigate(selected.route) {
                        popUpTo(findStartDestination(navController.graph).id) {
                            inclusive = true
                            saveState = true
                        }

                        launchSingleTop = true

                        restoreState = true

                    }
                },
                modifier = if (!hasSoftKey) Modifier
                    .height(100.dp)
                    .fillMaxWidth()
                else Modifier.fillMaxWidth(),
                hasSoftKey = hasSoftKey,
                navController = navHostController
            )
        },
        content = content,
    )
}