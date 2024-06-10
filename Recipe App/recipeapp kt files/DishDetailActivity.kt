
package com.example.recipeapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class DishDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dish_detail)

        val imageViewDishDetail = findViewById<ImageView>(R.id.imageViewDishDetail)
        imageViewDishDetail.setImageResource(R.drawable.dish1)

        val buttonBackToHome1 = findViewById<Button>(R.id.buttonBackToHome1)
        buttonBackToHome1.setOnClickListener {
            finish()
        }
    }
}
