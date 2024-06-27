package com.akirachix.myblog

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class BlogAdapter(var blogList: List<Blog>): RecyclerView.Adapter<BlogViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.blog_lists,parent,false)
        return BlogViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: BlogViewHolder, position: Int) {
       val blog = blogList[position]
        holder.tvBlogName.text = blog.blogName
        holder.tvYearOfPublication.text = blog.yearOfPublication
        holder.tvDescription.text = blog.description
        holder.tvFullDescription.text = blog.fullDescription
        holder.button.text = blog.button
    }

    override fun getItemCount(): Int {
       return blogList.size
    }
}


class BlogViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    var tvBlogName = itemView.findViewById<TextView>(R.id.tvBlogName)
    var imAuthor = itemView.findViewById<ImageView>(R.id.imAuthor)
    var tvAuthorName = itemView.findViewById<TextView>(R.id.tvAuthorName)
    var tvYearOfPublication = itemView.findViewById<TextView>(R.id.tvYearOfPublication)
    var imBookCover  = itemView.findViewById<ImageView>(R.id.imBookCover)
    var tvDescription = itemView.findViewById<TextView>(R.id.tvDescription)
    var tvFullDescription = itemView.findViewById<TextView>(R.id.tvFullDescription)
    var button = itemView.findViewById<Button>(R.id.button)
}