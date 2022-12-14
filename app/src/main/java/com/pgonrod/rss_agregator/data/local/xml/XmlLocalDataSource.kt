package com.pgonrod.rss_agregator.data.local.xml

import android.content.SharedPreferences
import com.pgonrod.rss_agregator.data.local.RssLocalDataSource

class XmlLocalDataSource (private val sharedPreferences: SharedPreferences): RssLocalDataSource {

    private val editor = sharedPreferences.edit()

    override fun create(name: String, url: String) {
        editor.putString(name, url).apply()
    }

}