package com.akirachix.myblog

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.myblog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.rvBlog.layoutManager = LinearLayoutManager(this)

        displayBlogs()

    }



    fun displayBlogs() {
        val blog1 = Blog(
            "The Artsy Reader Girl",
            "",
            " Alexandria Warwick",
            "2022",
            "",
            "Description",
            "Brielle of Thornbrook has dedicated her life to the abbey She spends her days forging iron and her evenings studying the Text, all in preparation of becoming an acolyte.",
            "See more"
        )
        val blog2 = Blog(
            "The Artsy Reader Girl",
            "",
            " Alexandria Warwick",
            "2022",
            "",
            "Description",
            "Brielle of Thornbrook has dedicated her life to the abbey She spends her days forging iron and her evenings studying the Text, all in preparation of becoming an acolyte.",
            "See more"
        )
        val blog3 = Blog(
            "The Artsy Reader Girl",
            "",
            " Alexandria Warwick",
            "2022",
            "",
            "Description",
            "Brielle of Thornbrook has dedicated her life to the abbey She spends her days forging iron and her evenings studying the Text, all in preparation of becoming an acolyte.",
            "See more"
        )
        val blog4 = Blog(
            "The Artsy Reader Girl",
            "",
            " Alexandria Warwick",
            "2022",
            "",
            "Description",
            "Brielle of Thornbrook has dedicated her life to the abbey She spends her days forging iron and her evenings studying the Text, all in preparation of becoming an acolyte.",
            "See more"
        )
        val blog5 = Blog(
            "The Artsy Reader Girl",
            "",
            " Alexandria Warwick",
            "2022",
            "",
            "Description",
            "Brielle of Thornbrook has dedicated her life to the abbey She spends her days forging iron and her evenings studying the Text, all in preparation of becoming an acolyte.",
            "See more"
        )

        var books = listOf(blog1, blog2, blog3, blog4, blog5)

        val booksAdapter = BlogAdapter(books)
        binding.rvBlog.adapter = booksAdapter
    }
}