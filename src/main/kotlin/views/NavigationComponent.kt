package views

import kotlinx.html.classes
import kotlinx.html.id
import react.*
import react.dom.a
import react.dom.attrs
import react.dom.h2
import styled.css
import styled.styledDiv
import styles.AngusSoftwareStyles

@ExperimentalJsExport
@JsExport
class NavigationComponent() :
    RComponent<Props, State
>() {

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
                +"Angus Solitaire"
                attrs {
                    href = convertEndpointToLink(RootComponent.ANGUS_SOLITAIRE_ENDPOINT)
                }
            }
            + " | "
            a {
                +"Blink Reader"
                attrs {
                    href = convertEndpointToLink(RootComponent.BLINK_READER_ENDPOINT)
                }
            }
            + " | "
            a {
                +"Tap Target Booster"
                attrs {
                    href = convertEndpointToLink(RootComponent.TAP_TARGET_BOOSTER_ENDPOINT)
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
                    href = convertEndpointToLink(RootComponent.WEBSITE_ENDPOINT)
                }
            }
        }
    }

    private fun convertEndpointToLink(endpoint: String): String {
        return "#$endpoint"
    }
}
