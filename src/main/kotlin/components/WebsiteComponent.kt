package components

import react.*
import react.dom.*
import styled.styledDiv

fun RBuilder.websiteComponent() =
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
