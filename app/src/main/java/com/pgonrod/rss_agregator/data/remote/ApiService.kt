package com.pgonrod.rss_agregator.data.remote

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiService {
    @GET
    suspend fun getRss(@Url urlRss: String): Response<RssApiModel>
}