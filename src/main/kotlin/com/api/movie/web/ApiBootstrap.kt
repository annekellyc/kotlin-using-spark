package com.api.movie.web

import org.springframework.stereotype.Component
import spark.Spark

@Component
class ApiBootstrap {

    fun init(port: Int) {
        Spark.port(port)
        Spark.init()
        MovieRoutes().load()
    }
}
