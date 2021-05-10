package styles

import kotlinx.css.*
import styled.StyleSheet

object AngusSoftwareStyles : StyleSheet("AngusSoftwareStyles", isStatic = true) {
    val container by css {
        val redColor = rgb(255, 0, 0)
        val greyColor = rgb(222, 202, 202)
        val purpleColor = rgb(129, 129, 230)
        val yellowColor = rgb(255, 255, 0)
        val blackColor = rgb(0, 0, 0)
        val pinkColor = rgb(201, 113, 113)
        val blueColor = rgb(0, 0, 255)

        textAlign = TextAlign.center
        fontFamily = "Palatino,Palatino Linotype,Palatino LT STD,Book Antiqua,Georgia,serif; "
        fontSize = 24.px
        backgroundColor = blackColor
        color = pinkColor
        height = 100.vh
        h1{
            marginTop = 0.px
        }

    }
} 
