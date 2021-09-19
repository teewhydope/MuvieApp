package com.teewhydope.muvieapp.datasource.network.model

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*


@Serializable
data class MovieDto (
    @SerialName("original_title")
    val originalTitle: String,

    @SerialName("poster_path")
    val posterPath: String,

    val video: Boolean,

    @SerialName("vote_average")
    val voteAverage: Double,

    val overview: String,

    @SerialName("release_date")
    val releaseDate: String,

    val id: Long,
    val adult: Boolean,

    @SerialName("backdrop_path")
    val backdropPath: String,

    @SerialName("vote_count")
    val voteCount: Long,

    @SerialName("genre_ids")
    val genreIDS: List<Long>? = null,

    val title: String,

    @SerialName("original_language")
    val originalLanguage: String,

    val popularity: Double,

    @SerialName("media_type")
    val mediaType: String? = null
)



