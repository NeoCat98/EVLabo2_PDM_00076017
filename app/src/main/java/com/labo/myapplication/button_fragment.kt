package com.labo.myapplication

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_button.*


class button_fragment: Fragment() {


    private var interfaceFrag: OnFragmentInteractionListener ?= null


    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if(context is OnFragmentInteractionListener){
            interfaceFrag = context
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        interfaceFrag = null
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.fragment_button, container, false)


        button_forward?.setOnClickListener {
            interfaceFrag?.ForwardButton()
        }
        button_previous?.setOnClickListener {
            interfaceFrag?.PreviousButton()
        }
        return view
    }

    interface OnFragmentInteractionListener {
        fun ForwardButton()
        fun PreviousButton()
    }

}

