package com.example.pizzaorderapp_20211010.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.pizzaorderapp_20211010.fragment.MyProfileFragment
import com.example.pizzaorderapp_20211010.fragment.PizzaStoreListFragment

class MainViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {

        return 2
    }

    override fun getItem(position: Int): Fragment {

//
        return when(position){
            0 -> PizzaStoreListFragment()
            else -> MyProfileFragment()
        }
    }
}