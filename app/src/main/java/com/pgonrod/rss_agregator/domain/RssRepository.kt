package com.pgonrod.rss_agregator.domain

interface RssRepository {
    fun create(name:String, url: String)
}