package views

import react.*
import react.dom.a
import react.dom.h2
import styled.css
import styled.styledDiv
import styles.AngusSoftwareStyles

@ExperimentalJsExport
@JsExport
class NavigationComponent() :
    RComponent<RProps, RState>() {

    override fun RBuilder.render() {
        styledDiv {
            a {
                +"Angus Paint"
                attrs {
                    href = convertEndpointToLink(RootComponent.ANGUS_PAINT_ENDPOINT)
                }
            }
            + " | "
            a {
                +"Angus Software Website"
                attrs {
                    href = convertEndpointToLink(RootComponent.WEBSITE_ENDPOINT)
                }
            }
            + " | "
            a {
                +"Angus Solitaire"
                attrs {
                    href = convertEndpointToLink(RootComponent.ANGUS_SOLITAIRE_ENDPOINT)
                }
            }
            + " | "
            a {
                +"Google Play Store Listing"
                attrs {
                    href = convertEndpointToLink(RootComponent.GOOGLE_PLAY_ENDPOINT)
                }
            }
            + " | "
            a {
                +"Tap Target Booster"
                attrs {
                    href = convertEndpointToLink(RootComponent.TAP_TARGET_BOOSTER_ENDPOINT)
                }
            }
        }
    }

    private fun convertEndpointToLink(endpoint: String): String {
        return "#$endpoint"
    }
}
