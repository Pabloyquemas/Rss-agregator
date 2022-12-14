package com.pgonrod.rss_agregator.data.remote

import retrofit2.Retrofit
import retrofit2.converter.simplexml.SimpleXmlConverterFactory

class ApiClient {

    private val apiServices: ApiService

    init {
        apiServices = getApiClient()
    }

    private fun getApiClient() =
        createRetrofitClient().create(ApiService::class.java)

    private fun createRetrofitClient() = Retrofit.Builder()
        .baseUrl("https://google.es/") //No hace falta, se pasa dinámicamente
        .addConverterFactory(SimpleXmlConverterFactory.create())
        .build();

    suspend fun getRss(urlRss: String) = apiServices.getRss(urlRss).body()!!

}