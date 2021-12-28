package angussoftwarewebsite.components

import react.*
import react.dom.*
import styled.styledDiv

fun RBuilder.blinkReaderComponent() =
        styledDiv {
            h2 {
                +"Blink Reader"
            }
            h3 {
                +"Read at an enhanced speed with Blink Reader"
            }
            a {
                +"Available on the Google Play Store"
                attrs{
                    href = "https://play.google.com/store/apps/details?id=com.woods.blinkreader"
                    target = "_blank"
                }
            }
            p {
                +"Blink Reader is an Application for the Android mobile Operating System. The purpose of the Blink Reader "
                +"app is to provide its users with an Application for reading text at an enhanced speed. "
                +"This enhanced reading speed is achieved by displaying one word of the text which the user is reading at a time. "
                +"By displaying one word at a time, the user doesn't have to move their eyes, "
                +"and can manually control the words per minute at which the text displays."
            }
        }
