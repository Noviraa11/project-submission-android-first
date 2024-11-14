package com.dicoding.myapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.myapp.databinding.ItemArticleBinding

class ItemArticle(view: View) : RecyclerView.ViewHolder(view) {
    private val binding = ItemArticleBinding.bind(view)

    fun bind(article: Article) {
        binding.imageView.setImageResource(article.imageResId)
        binding.titleTextView.text = article.title
        binding.overviewTextView.text = article.overview
    }
}
