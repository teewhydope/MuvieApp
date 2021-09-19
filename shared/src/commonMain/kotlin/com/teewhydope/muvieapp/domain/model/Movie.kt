package com.teewhydope.muvieapp.domain.model


data class Movie (
    val originalTitle: String,
    val posterPath: String,
    val video: Boolean,
    val voteAverage: Double,
    val overview: String,
    val releaseDate: String,
    val id: Long,
    val adult: Boolean,
    val backdropPath: String,
    val voteCount: Long,
    val genreIDS: List<Long>? = null,
    val title: String,
    val originalLanguage: String,
    val popularity: Double,
    val mediaType: String? = null
)

