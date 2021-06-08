package views

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.a
import react.dom.h2
import react.dom.h3
import react.dom.p
import styled.styledDiv

@ExperimentalJsExport
@JsExport
class AngusSolitaireComponent() :
    RComponent<RProps, RState>() {

    override fun RBuilder.render() {
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
    }
}
