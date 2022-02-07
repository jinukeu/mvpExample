package com.kunize.mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity(), Presenter.View {

    lateinit var presenter: Presenter
    lateinit var number: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = PresenterImpl()
        presenter.takeView(this)

        number = findViewById(R.id.number)
        number.setOnClickListener {
            presenter.confirm(number.text.toString())
        }
    }

    override fun changeText(string: String) {
        number.text = string
    }
}