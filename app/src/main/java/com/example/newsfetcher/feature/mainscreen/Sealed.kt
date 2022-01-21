package com.example.newsfetcher.feature.mainscreen

import android.util.Log

/** Урок как работают Sealed Class */
class Sealed {

    val clazz: Hierarchy = Hierarchy.Two("HI")
    val enum: Enum = Enum.TWO

    init {
        when (clazz) {
            is Hierarchy.Four -> {
                Log.d("TAG", clazz.text)
            }
            is Hierarchy.One -> Log.d("TAG", clazz.text + clazz.index)
            is Hierarchy.Three -> Log.d("TAG", clazz.text)
            is Hierarchy.Two -> Log.d("TAG", clazz.text)
        }

        when (enum) {
            Enum.ONE -> TODO()
            Enum.TWO -> TODO()
            Enum.THREE -> TODO()
            Enum.FOUR -> TODO()
        }


    }

}

sealed class Hierarchy() {
    data class Two(val text: String) : Hierarchy()
    data class One(val text: String, val index: Int) : Hierarchy()
    data class Three(val text: String) : Hierarchy()
    data class Four(val text: String) : Hierarchy()

}


enum class Enum(val text: String) {
    ONE("1"),
    TWO("2"),
    THREE("3"),
    FOUR("4");
}