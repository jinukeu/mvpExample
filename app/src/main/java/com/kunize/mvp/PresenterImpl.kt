package com.kunize.mvp

class PresenterImpl : Presenter {
    private var view: Presenter.View? = null

    override fun takeView(view: Presenter.View) {
        this.view = view
    }

    override fun confirm(string: String) {
        view?.changeText(Model.clicked(string))
    }

}