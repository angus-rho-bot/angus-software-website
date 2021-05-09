import kotlinx.css.*
import styled.StyleSheet

object WelcomeStyles : StyleSheet("WelcomeStyles", isStatic = true) {
    val textContainer by css {
        textAlign = TextAlign.center
        fontFamily = "Palatino,Palatino Linotype,Palatino LT STD,Book Antiqua,Georgia,serif; "
        fontSize = 24.px
        backgroundColor = rgb(71, 178, 255)
        color = rgb(255, 71, 178)
        borderSpacing = 0.px
    }
} 
