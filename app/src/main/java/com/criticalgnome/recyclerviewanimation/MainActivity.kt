package com.criticalgnome.recyclerviewanimation

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = listOf(
                "Александр Пушкин",
                "Михаил Лермонтов",
                "Александр Блок",
                "Николай Некрасов",
                "Фёдор Тютчев",
                "Сергей Есенин",
                "Владимир Маяковский"
        )

        myRecycler.adapter = MainAdapter(items)
        myRecycler.layoutAnimation = AnimationUtils.loadLayoutAnimation(myRecycler.context, R.anim.layout_animation_waterfall)

    }
}
