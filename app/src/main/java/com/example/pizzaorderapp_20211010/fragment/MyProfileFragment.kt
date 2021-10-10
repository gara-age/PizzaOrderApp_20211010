package com.example.pizzaorderapp_20211010.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.pizzaorderapp_20211010.EditNicknameActivity
import com.example.pizzaorderapp_20211010.R
import kotlinx.android.synthetic.main.fragment_my_prohile.*

class MyProfileFragment : Fragment() {

    val REQ_FOR_NICKNAME = 1010

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_prohile,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        editNicknameBtn.setOnClickListener {

        val myIntent = Intent(requireContext(),EditNicknameActivity::class.java)

            startActivityForResult(myIntent,REQ_FOR_NICKNAME)
        }



    }

}