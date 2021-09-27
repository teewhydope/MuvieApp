package com.teewhydope.muvieapp.datasource.network

import com.teewhydope.muvieapp.datasource.network.model.MovieDto
import com.teewhydope.muvieapp.datasource.network.model.MovieSearchResponse
import com.teewhydope.muvieapp.domain.model.Movie
import io.ktor.client.*
import io.ktor.client.request.*

class MovieServiceImpl(
    private val httpClient: HttpClient,
): MovieService {
    override suspend fun getTrending(): List<Movie> {
       return httpClient.get<MovieSearchResponse> {
            url(urlString = "$BASE_URL/trending/movie/week")
            header("Authorization", "Bearer $V4TOKEN")
        }.results.toMovieList()
    }

    override suspend fun getOtherCategories(query: String): List<Movie> {
        return httpClient.get<MovieSearchResponse> {
            url(urlString = "$BASE_URL/movie/$query")
            header("Authorization", "Bearer $V4TOKEN")
        }.results.toMovieList()    }

    override suspend fun getSingleMovie(id: Int): Movie {
        return httpClient.get<MovieDto> {
            url(urlString = "$BASE_URL/movie/$id")
            header("Authorization", "Bearer $V4TOKEN")
        }.toMovie()
    }


    //Generate Api Token from https://developers.themoviedb.org
    companion object {
        const val V3TOKEN = "<-YOUR-V3-API-KEY->" //Not used but might be useful in the future

        const val V4TOKEN = "<-YOUR-V4-BEARER-TOKEN->"

        const val BASE_URL = "https://api.themoviedb.org/3"

        const val IMAGE_BASE_URL = "https://image.tmdb.org/t/p/original"

    }
}
