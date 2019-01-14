package com.benghazy.profileapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.benghazy.profileapp.R
import com.bumptech.glide.load.engine.DiskCacheStrategy
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = " "

        // Recognize toolbar
        setSupportActionBar(toolbar)

        // load profile

        GlideApp.with(this)
            .load(R.drawable.profile_face)
            .circleCrop()
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .into(profile)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId == R.id.menu_notification){
            Toast.makeText(this,"Hello guys",Toast.LENGTH_SHORT).show()
        }
        return true

    }
}
