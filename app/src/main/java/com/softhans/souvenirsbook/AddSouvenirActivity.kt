package com.softhans.souvenirsbook

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_add_souvenir.*


class AddSouvenirActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_souvenir)

        /**
         * Add permission to read external storage in the AndroidManifest xml file
         */

        //Code to tap on image and select image from your phone storage
        imageAdd.setOnClickListener {

            //Check if permission is granted
            if(checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED){

                //request permission if not have it
                requestPermissions(arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE),2)
            }else {

                val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
                startActivityForResult(intent, 1)
            }

        }

        //Save Button
        btnSave.setOnClickListener {

        }
    }

    override fun onRequestPermissionsResult( requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {

        if (requestCode == 2){
            if (grantResults.size >0 && grantResults[0] ==PackageManager.PERMISSION_GRANTED ){
                
            }
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }
}
