package com.github.artptr.kotlintest

// import express.Express

external fun require(module: String): dynamic

fun main(args: Array<String>) {
    val express = require("express")
    val app = express()

    app.get("/") { req, res ->
        res.send("Hello World")
    }

    app.listen(3000) {
        println("Listening on port 3000")
    }
}
