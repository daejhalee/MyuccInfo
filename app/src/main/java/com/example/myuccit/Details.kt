package com.example.myuccit

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)


        val index: String? = this.intent.getStringExtra("listIndex")


        val name: TextView = findViewById(R.id.tvName)
        val email: TextView = findViewById(R.id.tvEmail)
        val photo: ImageView = findViewById(R.id.ivProfile)
        val number: TextView = findViewById(R.id.tvTelephone)


        when(index){
            "0" -> {
                name.text = "ROSE, Natalie"
                email.text = "ithod@ucc.edu.jm"
                number.text = "(876)838-2408"
                photo.setImageResource(R.drawable.rose)

            }
            "1" -> {
                name.text = "DAVIDSON, Sonia"
                email.text = "businessadminhod@ucc.edu.jm"
                number.text = "(876)654-4887"
                photo.setImageResource(R.drawable.davidson)
            }
            "2" -> {
                name.text = "Mathison, Linda"
                email.text = "matlinda@ucc.edu.jm"
                number.text = "(876)458-7698"
                photo.setImageResource(R.drawable.mathison)
            }
            "3" -> {
                name.text = "MILLER, Ionie"
                email.text = "imillerfaculty@ucc.edu.jm"
                number.text = "(876)345-9876"
                photo.setImageResource(R.drawable.ionnie)

            }
            "4" -> {
                name.text = "Marlene, Roach"
                email.text = "deanglobalmar@ucc.edu.jm"
                number.text = "(876)667-3422"
                photo.setImageResource(R.drawable.roach)
            }
        }

        email.setOnClickListener{
            val intent = Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", email.toString(), null))
            intent.putExtra(Intent.EXTRA_EMAIL, email.toString())
            startActivity(intent)
        }
    }
}
