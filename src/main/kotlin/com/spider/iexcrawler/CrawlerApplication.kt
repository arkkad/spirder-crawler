package com.spider.iexcrawler

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [
    DataSourceAutoConfiguration::class,
    HibernateJpaAutoConfiguration::class
])
class CrawlerApplication

fun main(args: Array<String>) {
    runApplication<CrawlerApplication>(*args)
}
