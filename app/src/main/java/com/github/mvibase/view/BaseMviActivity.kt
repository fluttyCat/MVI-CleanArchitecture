package com.github.mvibase.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseMviActivity<VB : ViewDataBinding> : AppCompatActivity() {

    lateinit var dataBinding: VB


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this, getResourceLayoutId())
    }

    abstract fun getResourceLayoutId(): Int
}