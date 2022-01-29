package com.example.recyclerviewanimations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerviewanimations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val newsItems = mutableListOf<NewsItem>()

        for (i in 0..14) {
            newsItems.add(
                NewsItem(
                "News Item $i",
                resources.getString(R.string.dummy_news_text)
            )
            )
        }
        binding.newsItemRecyclerView.adapter = NewsItemAdapter(newsItems)
    }
}