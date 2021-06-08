package views

import react.*
import react.dom.a
import react.dom.h2
import react.dom.h3
import react.dom.p
import styled.styledDiv

@ExperimentalJsExport
@JsExport
class WebsiteComponent() :
    RComponent<RProps, RState>() {

    override fun RBuilder.render() {
        styledDiv {
            h3 {
                +"The Official Website of Angus Software"
            }
            a {
                +"Link to the website (you're already here)"
                attrs {
                    href = "#/"
                }
            }
            p {
                +"This website was written entirely with "
                a {
                    +"React and Kotlin/JS."
                    attrs{
                        href = "https://play.kotlinlang.org/hands-on/Building%20Web%20Applications%20with%20React%20and%20Kotlin%20JS/01_Introduction"
                        target = "_blank"
                    }
                }
            }

        }
    }
}
