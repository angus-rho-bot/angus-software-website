package angussoftwarewebsite.components

import react.RBuilder
import react.dom.*
import styled.styledDiv

fun RBuilder.angusSolitaireComponent() =
    styledDiv {
        h2 {
            +"Angus Solitaire"
        }
        h3 {
            +"A new version of Solitaire invented by Angus Software"
        }
        a {
            +"Available on the Google Play Store"
            attrs {
                href = "https://play.google.com/store/apps/details?id=gms.angus.angussoli"
                target = "_blank"
            }
        }
        p {
            +"The objective of the game is to score as many points as possible before the deck runs out of cards."
        }
    }