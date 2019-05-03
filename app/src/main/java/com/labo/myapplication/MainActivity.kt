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
            "https://vignette.wikia.nocookie.net/es.pokemon/images/9/9d/Pichu.png"->imagenActual = "https://vignette.wikia.nocookie.net/es.pokemon/images/7/77/Pikachu.png"
            "https://vignette.wikia.nocookie.net/es.pokemon/images/7/77/Pikachu.png"->imagenActual = "https://www.ecured.cu/Raichu#/media/File:Raichu1.png"
            "https://www.ecured.cu/Raichu#/media/File:Raichu1.png"->imagenActual = "https://vignette.wikia.nocookie.net/es.pokemon/images/9/9d/Pichu.png"
        }
        initMainFragment(imagenActual)
    }

    override fun PreviousButton() {
        when(imagenActual){
            "https://vignette.wikia.nocookie.net/es.pokemon/images/9/9d/Pichu.png"->imagenActual = "https://www.ecured.cu/Raichu#/media/File:Raichu1.png"
            "https://vignette.wikia.nocookie.net/es.pokemon/images/7/77/Pikachu.png"->imagenActual = "https://vignette.wikia.nocookie.net/es.pokemon/images/9/9d/Pichu.png"
            "https://www.ecured.cu/Raichu#/media/File:Raichu1.png"->imagenActual = "https://vignette.wikia.nocookie.net/es.pokemon/images/7/77/Pikachu.png"
        }
        initMainFragment(imagenActual)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imagenActual = "https://vignette.wikia.nocookie.net/es.pokemon/images/9/9d/Pichu.png"
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
