package com.example.recipeapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class Dish4DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dish4_detail)

        val imageViewDishDetail4 = findViewById<ImageView>(R.id.imageViewDishDetail4)
        val buttonBackToHome4 = findViewById<Button>(R.id.buttonBackToHome4)

        imageViewDishDetail4.setImageResource(R.drawable.dish4)


        buttonBackToHome4.setOnClickListener {
            finish()
        }
    }
}
