package angussoftwarewebsite.components

import react.*
import react.dom.*
import styled.styledDiv

fun RBuilder.tapTargetBoosterComponent() =
        styledDiv {
            h2 {
                +"Tap Target Booster"
            }
            h3{
                +"Improve your touching and pressing aim with this targeting game"
            }
            a {
                +"Available on the Google Play Store"
                attrs{
                    href = "https://play.google.com/store/apps/details?id=angus.gaming.taptargetbooster"
                    target = "_blank"
                }
            }
            p{
                +"With four different modes to help improve you accuracy and speed, Tap Target Booster is fun way to "
                +"measure and hone your touch screen skills!"
            }
        }