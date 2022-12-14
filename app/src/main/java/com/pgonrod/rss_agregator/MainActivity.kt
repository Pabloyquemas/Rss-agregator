package com.pgonrod.rss_agregator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.pgonrod.rss_agregator.data.remote.ApiClient
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    val apiClient = ApiClient()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch {
            try {
                val model = apiClient.getRss("https://e00-marca.uecdn.es/rss/futbol/sevilla.xml")
                Log.d("@dev", "model:$model")
            } catch (ex: java.lang.Exception) {
                Log.d("@dev-e", ex.message!!)
            }
        }
    }
}