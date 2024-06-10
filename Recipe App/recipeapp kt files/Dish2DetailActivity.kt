package com.example.recipeapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class Dish2DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dish2_detail)

        val imageViewDishDetail2 = findViewById<ImageView>(R.id.imageViewDishDetail2)
        val buttonBackToHome2 = findViewById<Button>(R.id.buttonBackToHome2)

        imageViewDishDetail2.setImageResource(R.drawable.dish2)


        buttonBackToHome2.setOnClickListener {
            finish()
        }
    }
}
