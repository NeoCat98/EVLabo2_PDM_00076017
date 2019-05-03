package com.labo.myapplication

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_images_fragment.*
import kotlinx.android.synthetic.main.fragment_images_fragment.view.*


// TODO: Rename parameter arguments, choose names that match
class images_fragment : Fragment() {

    private var nombreImg:String = "https://vignette.wikia.nocookie.net/es.pokemon/images/9/9d/Pichu.png/revision/latest?cb=20150620210539"


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.fragment_images_fragment, container, false)
        bind(view)
        return view
    }

    companion object {
        fun newInstance(nameImg:String): images_fragment{
            val newFragment = images_fragment()
            newFragment.nombreImg = nameImg
            return newFragment
        }
    }

    fun bind(view: View){
        Glide.with(view)
            .load(nombreImg)
            .placeholder(R.drawable.ic_launcher_background)
            .into(view.image)

    }

}
