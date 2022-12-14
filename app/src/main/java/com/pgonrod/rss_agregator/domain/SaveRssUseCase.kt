package com.pgonrod.rss_agregator.domain

class SaveRssUseCase (
    private val rssRepository: RssRepository)
{
    fun execute (name: String, url:String){
        rssRepository.create(name,url)
    }
}