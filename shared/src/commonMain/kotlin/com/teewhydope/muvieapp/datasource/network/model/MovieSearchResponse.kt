package com.teewhydope.muvieapp.datasource.network.model

import kotlinx.serialization.*


@Serializable
data class MovieSearchResponse (
    val page: Long,
    val results: List<MovieDto>,

    @SerialName("total_pages")
    val totalPages: Long,

    @SerialName("total_results")
    val totalResults: Long
)

