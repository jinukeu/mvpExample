package com.kunize.mvp

object Model {
    fun clicked(string: String): String {
        return "${string.toInt() + 1}"
    }
}
