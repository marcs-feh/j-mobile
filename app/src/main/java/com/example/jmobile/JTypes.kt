package com.example.jmobile

data class Post(
    val author : User,
    val text : String,
    val likes : Int,
    val dislikes : Int,
    val parent : Post?,
)

data class User(
    val id : Int,
    val name : String,
)

data class Board (
    val name : String,
    val desc : String,
    val posts : ArrayList<Post>,
)