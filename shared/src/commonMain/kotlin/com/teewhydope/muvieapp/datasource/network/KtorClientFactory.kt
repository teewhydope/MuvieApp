package com.teewhydope.muvieapp.datasource.network

import com.teewhydope.muvieapp.datasource.network.model.MovieDto
import com.teewhydope.muvieapp.domain.model.Movie
import io.ktor.client.*

expect class KtorClientFactory {
    fun build(): HttpClient
}

fun MovieDto.toMovie(): Movie {
    return Movie(
        originalTitle = originalTitle,
        posterPath = posterPath,
        video = video,
        voteAverage = voteAverage,
        overview = overview,
        releaseDate = releaseDate,
        id = id,
        adult = adult,
        backdropPath = backdropPath,
        voteCount = voteCount,
        genreIDS = genreIDS,
        title = title,
        originalLanguage = originalLanguage,
        popularity = popularity,
        mediaType = mediaType,
    )
}

fun List<MovieDto>.toMovieList(): List<Movie> {
    return map { it.toMovie() }
}