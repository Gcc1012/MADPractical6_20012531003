package com.example.practical6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import com.example.practical6.databinding.ActivityMainBinding
import com.example.practical6.databinding.ActivityYouTubeBinding

class YouTubeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityYouTubeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_you_tube)

        binding = ActivityYouTubeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initYoutubePlayer()


    }

    private val youtubeId = "F9UC9DY-vIU"
    private fun initYoutubePlayer() {
        val webSettings: WebSettings = binding.YtWebview.settings
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true
        binding.YtWebview.loadUrl("https://www.youtube.com/embed/$youtubeId")

    }
}