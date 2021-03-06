package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    val foodList = arrayListOf("Chinese", "Burger", "Pizza", "Pudding", "Rice Cake")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideButton.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectedDinnerText.text = foodList[randomFood]
        }

        addFoodButton.setOnClickListener {
            val newFood = addFoodText.text.toString()
            if (!foodList.contains(newFood)) {
                foodList.add(newFood)
            }
            addFoodText.text.clear()
        }
    }
}