package com.labo.myapplication


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AppCompatDialogFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), button_fragment.OnFragmentInteractionListener{
    private lateinit var mainContentFragment: images_fragment
    private lateinit var imagenActual:String

    override fun ForwardButton() {
        when(imagenActual){
            "imagen1.png"->imagenActual = "imagen2.png"
            "imagen2.png"->imagenActual = "imagen3.png"
            "imagen3.png"->imagenActual = "imagen1.png"
        }
        initMainFragment(imagenActual)
    }

    override fun PreviousButton() {
        when(imagenActual){
            "imagen1.png"->imagenActual = "imagen3.png"
            "imagen2.png"->imagenActual = "imagen1.png"
            "imagen3.png"->imagenActual = "imagen2.png"
        }
        initMainFragment(imagenActual)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imagenActual = "imagen1.png"
        initMainFragment(imagenActual)
        initFragment()
    }

    fun initFragment(){
        supportFragmentManager.beginTransaction().replace(fragment_image.id,mainContentFragment).commit()
    }

    fun initMainFragment(image:String){
        mainContentFragment = images_fragment.newInstance(image)
    }
}
