package com.api.movie.web

import spark.Spark

class MovieRoutes {
    fun load() {
        Spark.get("/kotlin") { req, res -> "Hello Kotlin" }
    }
}

