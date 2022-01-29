package com.example.recyclerviewanimations

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsItemAdapter(private val newsItem: MutableList<NewsItem>): RecyclerView.Adapter<NewsItemAdapter.NewsItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsItemViewHolder {
        val adapter = LayoutInflater.from(parent.context).inflate(R.layout.news_item_container, parent, false)
        return NewsItemViewHolder(adapter)
    }

    override fun onBindViewHolder(holder: NewsItemViewHolder, position: Int) {
        val item = newsItem[position]
        holder.textTitle.text = item.title
        holder.textDescription.text = item.description
    }

    override fun getItemCount(): Int = newsItem.size

    class NewsItemViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
        val textTitle: TextView = view!!.findViewById(R.id.textTitle)
        val textDescription: TextView = view!!.findViewById(R.id.textDescription)
    }
}