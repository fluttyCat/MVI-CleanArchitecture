package com.github.mvibase.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.DialogFragment

abstract class BaseMviDialog<VB : ViewDataBinding> : DialogFragment() {

    lateinit var dataBinding: VB

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dataBinding = DataBindingUtil.inflate(
            LayoutInflater.from(context),
            getResourceLayoutId(),
            container,
            false
        )

        return dataBinding.root
    }


    abstract fun getResourceLayoutId(): Int

}