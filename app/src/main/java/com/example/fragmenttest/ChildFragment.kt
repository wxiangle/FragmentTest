package com.example.fragmenttest

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


/**
 * created by wxiangle by 2019-06-04
 * email : wang_x_le@163.com
 */

class Fragment1 : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d(TAG,"onCreateView")
        val view = inflater.inflate(R.layout.fragment_1, container,false )
        view.findViewById<TextView>(R.id.tv_text).setOnClickListener {
            val data = "数据为${Math.random() * 100}"
            Log.d("my_data", "data from fragment,it is $data")
            mOnFragmentClickListener?.onTextChange(data)
        }
        return view
    }

    companion object {
        fun newInstance(): Fragment1 {
            return Fragment1()
        }
    }

    var mOnFragmentClickListener: OnFragmentClickListener? = null
}

interface OnFragmentClickListener {
    fun onTextChange(text: String?)
}