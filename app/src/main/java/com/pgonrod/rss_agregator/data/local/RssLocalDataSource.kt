package com.pgonrod.rss_agregator.data.local

interface RssLocalDataSource {

    fun create(name:String, url:String)
}