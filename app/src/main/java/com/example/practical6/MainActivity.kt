package com.example.practical6

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.i
import android.widget.MediaController
import android.widget.VideoView
import com.example.practical6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initvideoplayer()
        binding.btnSwitch.setOnClickListener {
           Intent(this,YouTubeActivity::class.java).also { startActivity(it) }
        }
    }
    private fun initvideoplayer(){
        val mediaController = MediaController(this)
        val uri:Uri= Uri.parse("android.resourse://"+packageName+"/"+ R.raw.thestoryoflight)
        binding.myvideoview.setMediaController(mediaController)
        mediaController.setAnchorView(binding.myvideoview)
        binding.myvideoview.setVideoURI(uri)
        binding.myvideoview.requestFocus()
        binding.myvideoview.start()
    }
}