package com.example.recipeapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class Dish3DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dish3_detail)

        val imageViewDishDetail3 = findViewById<ImageView>(R.id.imageViewDishDetail3)
        val buttonBackToHome3 = findViewById<Button>(R.id.buttonBackToHome3)

        imageViewDishDetail3.setImageResource(R.drawable.dish3)


        buttonBackToHome3.setOnClickListener {
            finish()
        }
    }
}
