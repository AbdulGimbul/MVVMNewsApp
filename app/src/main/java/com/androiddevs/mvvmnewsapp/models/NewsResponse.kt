package com.androiddevs.mvvmnewsapp.ui

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class NewsResponse(

	@field:SerializedName("totalResults")
	val totalResults: Int? = null,

	@field:SerializedName("articles")
	val articles: MutableList<ArticlesItem?>? = null,

	@field:SerializedName("status")
	val status: String? = null
)

@Entity(
	tableName = "articles"
)

data class ArticlesItem(
	@PrimaryKey(autoGenerate = true)
	var id: Int? = null,

	val publishedAt: String? = null,

	val author: String? = null,

	val urlToImage: String? = null,

	val description: String? = null,

	val source: Source? = null,

	val title: String? = null,

	val url: String? = null,

	val content: String? = null
) : Serializable

data class Source(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: Any? = null
)
