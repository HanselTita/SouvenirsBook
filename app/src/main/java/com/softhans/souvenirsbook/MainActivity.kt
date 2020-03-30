package com.softhans.souvenirsbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //Adding menu to MainActivity
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.add_svn, menu)

        return super.onCreateOptionsMenu(menu)
    }

    //option select item from menu
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.add_souvenir){
            val intent = Intent(this, AddSouvenirActivity::class.java)
            startActivity(intent)

        }
        return super.onOptionsItemSelected(item)
    }



}
