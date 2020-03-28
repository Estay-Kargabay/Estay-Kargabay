package com.estay.kotlinmedia.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.debug
import org.jetbrains.anko.runOnUiThread
import org.jetbrains.anko.toast

/**
 * all fragment fother
 */
abstract class BaseFragment :Fragment(),AnkoLogger{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()


    }

    protected fun init() {
        /**
         * init fragment
         */
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        return initView()
    }

    abstract fun initView(): View?
    /**
     * get layouut view
     */


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initListener()
        initData()
    }

    protected fun initData() {
        /**
         * init data
         */
    }

    protected fun initListener() {
        /**
         * adapter litener
         */
    }
    fun myToast (msg:String){
        context?.runOnUiThread { toast(msg) }
    }
}