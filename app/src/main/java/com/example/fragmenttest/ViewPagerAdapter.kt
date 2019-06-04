package com.example.fragmenttest

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter


/**
 * created by wxiangle by 2019-06-04
 * email : wang_x_le@163.com
 */
class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    var mfragments: ArrayList<Fragment>? = null
    override fun getItem(position: Int): Fragment? {
        return mfragments?.get(position)
    }

    override fun getCount(): Int {
        return mfragments?.size ?: 0
    }


}