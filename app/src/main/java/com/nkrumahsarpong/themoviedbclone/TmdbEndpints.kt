package com.nkrumahsarpong.themoviedbclone

import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.Call
interface TmdbEndpints {
    @GET("/3/movie/popular")
    fun getMovies(@Query("api_key") key: String): Call<PopularMovies>
}