package angussoftwarewebsite.styles

import kotlinx.css.*
import styled.StyleSheet

object AngusSoftwareStyles : StyleSheet("AngusSoftwareStyles", isStatic = true) {
    private val redColor = rgb(255, 0, 0)
    private val greyColor = rgb(222, 202, 202)
    private val purpleColor = rgb(129, 129, 230)
    private val yellowColor = rgb(255, 255, 0)
    private val blackColor = rgb(0, 0, 0)
    private val pinkColor = rgb(201, 113, 113)
    private val blueColor = rgb(0, 0, 255)

    val rootComponent by css {
        height = 100.pct
        display = Display.flex
        flexDirection = FlexDirection.column
        overflow = Overflow.hidden

        backgroundColor = blackColor
        color = greyColor

        textAlign = TextAlign.center
        fontFamily = "Palatino,Palatino Linotype,Palatino LT STD,Book Antiqua,Georgia,serif; "
        fontSize = 3.vw

        media("screen and (max-width: 1000px)") {
            fontSize = 5.vw
        }

        h1 {
            color = pinkColor
        }

        h2 {
            color = purpleColor
        }

        h3 {
            color = blueColor
        }

        a {
            visited {
                color = redColor
            }
            color = yellowColor
        }

        rule(".footer") {
            media("screen and (max-width: 1000px)") {
                paddingLeft = 5.vw
                paddingRight = 5.vw
            }
            media("screen and (min-width: 1000px)") {
                a {
                    fontSize = 3.vw
                }
            }
            paddingBottom = 10.vh
            width = 500.pct
            height = 0.pct
            flexShrink = 0.0
        }

        rule(".content") {
            media("screen and (max-width: 1000px)") {
                paddingLeft = 5.vw
                paddingRight = 5.vw
            }
            paddingTop = 10.vh
            paddingBottom = 10.vh
            flex(
                flexGrow = 1.0,
                flexShrink = 0.0,
                flexBasis = FlexBasis.auto
            )
            height = 0.px
            overflowY = Overflow.scroll
            position = Position.relative
        }
    }
} 
