package com.idapgroup.android.mvp.impl

import android.os.Bundle
import com.idapgroup.android.mvp.MvpPresenter

abstract class BasePresenter<V> : MvpPresenter<V> {

    var view : V? = null
        private set

    final override fun attachView(view: V) {
        this.view = view
    }

    final override fun detachView() {
        this.view = null
    }

    override fun onCreate() { }
    override fun onSaveState(savedState: Bundle) { }
    override fun onRestoreState(savedState: Bundle) { }
    override fun onAttachedView(view: V) {}
    override fun onDetachedView() {}
}
