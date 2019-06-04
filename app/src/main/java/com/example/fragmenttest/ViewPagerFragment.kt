package com.example.fragmenttest

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


/**
 * created by wxiangle by 2019-06-04
 * email : wang_x_le@163.com
 */

class ViewPagerFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_view_pager, container,false ).apply {
            Log.d(TAG,"onCreateView")
            findViewById<ViewPager>(R.id.view_pager).adapter = ViewPagerAdapter(childFragmentManager).apply {
                mfragments = arrayListOf(
                    Fragment1.newInstance().apply {
                        mOnFragmentClickListener = object : OnFragmentClickListener {
                            override fun onTextChange(text: String?) {
                                Log.d("my_data", "data from activity 1,it is $text")
                            }

                        }
                    },
                    Fragment1.newInstance(),
                    Fragment1.newInstance(),
                    Fragment1.newInstance()
                )
            }
        }
    }
}