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
            " Shonda Rhymes",
            "2022",
            "",
            "A Year Of Yes",
            "In this poignant, hilarious and deeply intimate call to arms, Hollywood's most powerful woman, the mega-talented creator of Grey's Anatomy and Scandal and executive producer of How to Get Away with Murder and Catch, reveals how saying YES changed her life -- and how it can change yours too",
            "See more"
        )
        val blog3 = Blog(
            "The Artsy Reader Girl",
            "",
            " Viola Davis",
            "2022",
            "",
            "Finding Me",
            "In my book, you will meet a little girl named Viola who ran from her past until she made a life-changing decision to stop running forever.\n" +
                    "\n" +
                    "This is my story, from a crumbling apartment in Central Falls, Rhode Island, to the stage in New York City, and beyond. This is the path I took to finding my purpose but also my voice in a world that didn’t always see me.",
            "See more"
        )
        val blog4 = Blog(
            "The Artsy Reader Girl",
            "",
            " Britney Spears",
            "2022",
            "",
            "The Woman In Me",
            "In June 2021, the whole world was listening as Britney Spears spoke in open court. The impact of sharing her voice—her truth—was undeniable, and it changed the course of her life and the lives of countless others." +
                    " The Woman in Me reveals for the first time her incredible journey—and the strength at the core of one of the greatest performers in pop music history.",
            "See more"
        )
        val blog5 = Blog(
            "The Artsy Reader Girl",
            "",
            "Taylor Jenkins ",
            "2022",
            "",
            "The Seven husbands of Evwlyn Hugo",
            "Aging and reclusive Hollywood movie icon Evelyn Hugo is finally ready" +
                    " to tell the truth about her glamorous and scandalous life. But when she chooses unknown magazine reporter " +
                    "Monique Grant for the job, no one is more astounded than Monique herself. Why her? Why now?",
            "See more"
        )

        var books = listOf(blog1, blog2, blog3, blog4, blog5)

        val booksAdapter = BlogAdapter(books)
        binding.rvBlog.adapter = booksAdapter
    }
}