package com.akirachix.myblog

import android.content.ClipDescription
import android.widget.Button

data class Blog(
    var blogName: String,
    var authorImage : String,
    var authorName: String,
    var yearOfPublication : String,
    var bookCover : String,
    var description:  String,
    var fullDescription: String,
    var button: String
)
