package components

import react.*
import react.dom.a
import react.dom.attrs
import styled.styledDiv

fun RBuilder.navigationComponent() =
        styledDiv {
            a {
                +"Angus Paint"
                attrs {
                    href = ANGUS_PAINT_ENDPOINT
                }
            }
            + " | "
            a {
                +"Angus Solitaire"
                attrs {
                    href = ANGUS_SOLITAIRE_ENDPOINT
                }
            }
            + " | "
            a {
                +"Blink Reader"
                attrs {
                    href = BLINK_READER_ENDPOINT
                }
            }
            + " | "
            a {
                +"Tap Target Booster"
                attrs {
                    href = TAP_TARGET_BOOSTER_ENDPOINT
                }
            }
            + " | "
            a {
                +"Google Play Store Listing"
                attrs {
                    href = "https://play.google.com/store/apps/dev?id=7308269362866323199"
                    target = "_blank"
                }
            }
            + " | "
            a {
                +"Angus Software Website"
                attrs {
                    href = WEBSITE_ENDPOINT
                }
            }
        }
