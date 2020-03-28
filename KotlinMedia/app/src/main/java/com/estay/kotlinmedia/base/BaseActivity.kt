package com.estay.kotlinmedia.base

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.debug
import org.jetbrains.anko.toast

abstract class BaseActivity:AppCompatActivity (),AnkoLogger{
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(getLayoutId())
        initListener()
        initData()

        //toast("demo of estay")
       // debug { "hello log.d" }
    }

    protected fun initData() {
        /**
         * init data
         */
    }

    protected fun initListener() {
        /**
         * get id from  other
         */
    }

    abstract fun getLayoutId(): Int

    protected fun mmyTost(msg:String){
        runOnUiThread { toast(msg)}
    }
}