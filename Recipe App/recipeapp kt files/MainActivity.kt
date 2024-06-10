package com.example.recipeapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageViewDish1 = findViewById<ImageView>(R.id.imageViewDish1)
        val imageViewDish2 = findViewById<ImageView>(R.id.imageViewDish2)
        val imageViewDish3 = findViewById<ImageView>(R.id.imageViewDish3)
        val imageViewDish4 = findViewById<ImageView>(R.id.imageViewDish4)

        imageViewDish1.setOnClickListener {
            startActivity(Intent(this, DishDetailActivity::class.java))
        }

        imageViewDish2.setOnClickListener {
            startActivity(Intent(this, Dish2DetailActivity::class.java))
        }

        imageViewDish3.setOnClickListener {
            startActivity(Intent(this, Dish3DetailActivity::class.java))
        }

        imageViewDish4.setOnClickListener {
            startActivity(Intent(this, Dish4DetailActivity::class.java))
        }

        val buttonInstructions = findViewById<Button>(R.id.buttonInstructions)
        buttonInstructions.setOnClickListener {
            showInstructionsDialog()
        }
    }

    private fun showInstructionsDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("App Instructions")

        val instructions = """

            1. Viewing Dishes:
               - On the home screen, you will see images of four different dishes.
               - Tap on any dish image to view more details about the dish, including its recipe and preparation steps.

            2. Dish Details:
               - Each dish detail page provides a comprehensive recipe for the dish you selected.
               - Scroll down to read the entire recipe and follow the steps to prepare the dish.

            3. Returning to Home:
               - On each dish detail page, there is a 'Back to Home' button at the bottom.
               - Tap this button to return to the home screen and explore more dishes.

            I hope you enjoy using the Dish App and have a great time cooking!
        """.trimIndent()

        builder.setMessage(instructions)
        builder.setPositiveButton("OK") { dialog, _ ->
            dialog.dismiss()
        }

        val dialog = builder.create()
        dialog.show()
    }
}