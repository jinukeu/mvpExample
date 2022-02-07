package com.kunize.mvp

interface Presenter {
    fun takeView(view: View)
    fun confirm(string: String)

    interface View {
        fun changeText(string: String)
    }
}