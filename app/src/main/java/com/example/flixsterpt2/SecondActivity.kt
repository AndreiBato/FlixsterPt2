package com.example.flixsterpt2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class SecondActivity: AppCompatActivity() {
        private lateinit var mediaImageView: ImageView
        private lateinit var titleTextView: TextView
        private lateinit var bylineTextView: TextView
        private lateinit var abstractTextView: TextView

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_second)


            mediaImageView = findViewById(R.id.mediaImage)
            titleTextView = findViewById(R.id.mediaTitle)
            bylineTextView = findViewById(R.id.mediaByline)
            abstractTextView = findViewById(R.id.mediaAbstract)


            val bundle = intent.extras
            val title = bundle!!.getString("title", "Default")
            val overview = bundle!!.getString("overview", "Default")
            val posterPath = bundle!!.getString("posterPath", "Default")
            val release_date = bundle!!.getString("release_date", "Default")


//
//            // TODO: Find the views for the screen

////            // TODO: Get the extra from the Intent
//            val article = intent.data
//            // TODO: Set the title, byline, and abstract information from the article
//            titleTextView.text = article.title
////            bylineTextView.text = article.byline?.original
//            abstractTextView.text = article.overview
//            // TODO: Load the media image
//
            Glide.with(this)
                .load("https://image.tmdb.org/t/p/w780${posterPath}")
                .placeholder(R.drawable.ic_launcher_foreground)
                .centerInside()
                .into(mediaImageView)

            titleTextView.setText(title)
            abstractTextView.setText(overview)
            bylineTextView.setText(release_date)
        }
}
