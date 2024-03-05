@file:Suppress("DEPRECATION")

package com.example.marvelfandom

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {

    companion object {
        const val MARVEL_DATA = "marvel"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val ivAvatar: ImageView = findViewById(R.id.iv_avatar)
        val tvName: TextView = findViewById(R.id.tv_detail_name)
        val tvAliases: TextView = findViewById(R.id.tv_detail_aliases)
        val tvDesc: TextView = findViewById(R.id.tv_detail_desc)
        val tvCategory: TextView = findViewById(R.id.tv_detail_category)


        val dataMarvel = if (Build.VERSION.SDK_INT >= 33) {
            intent.getParcelableExtra(MARVEL_DATA, Marvel::class.java)
        } else {
            intent.getParcelableExtra(MARVEL_DATA)
        }

        if (dataMarvel != null) {
            Glide.with(this).load(dataMarvel.photo).into(ivAvatar)
            tvName.text = dataMarvel.name
            tvAliases.text = dataMarvel.alias
            tvCategory.text = dataMarvel.category
            tvDesc.text = dataMarvel.description
        }

        val btnShare: Button = findViewById(R.id.action_share)
        btnShare.setOnClickListener {
            shareMarvelData(dataMarvel)
        }

//        Log.d("marvel", dataMarvel?.name.toString())
    }

    private fun shareMarvelData(dataMarvel: Marvel?) {
        if (dataMarvel != null) {
            val shareIntent = Intent().apply {
                action = Intent.ACTION_SEND
                type = "text/plain"
                putExtra(
                    Intent.EXTRA_TEXT,
                    "cek Marvel character this out :\n${dataMarvel.name}\n\n${dataMarvel.description}"
                )
            }
            startActivity(Intent.createChooser(shareIntent, "Share Marvel Fandom"))
        }
    }
}