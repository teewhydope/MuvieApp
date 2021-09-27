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
        const val V3TOKEN = "028bbd9705c5cc69856cd9c39b322925" //Not used but might be useful in the future

        const val V4TOKEN = "eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiIwMjhiYmQ5NzA1YzVjYzY5ODU2Y2Q5YzM5YjMyMjkyNSIs" +
                "InN1YiI6IjYxM2U1OWVmNmFmOWRkMDA0Mzc3YTRmMiIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ." +
                "8wYlWsM0BlpT9qxoQrP23OPj851ETEsPw2S1Pp25feo"

        const val BASE_URL = "https://api.themoviedb.org/3"

        const val IMAGE_BASE_URL = "https://image.tmdb.org/t/p/original"

    }
}