package com.pgonrod.rss_agregator.data

import com.pgonrod.rss_agregator.data.local.xml.XmlLocalDataSource
import com.pgonrod.rss_agregator.domain.RssRepository

class RssDataRepository(val localsource: XmlLocalDataSource): RssRepository {

    override fun create(name: String, url: String) = localsource.create(name, url)
}