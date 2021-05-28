package com.anastasianesterova.lab4

import androidx.fragment.app.Fragment

interface INavigationActivity {
    fun showFragment(fragment: Fragment)
    fun showFragment(fragment: Fragment, tag: String?)
}