package components

import enums.AngusSoftwareApplicationsEnum
import kotlinx.html.classes
import kotlinx.html.id
import react.RBuilder
import react.dom.attrs
import react.dom.footer
import react.router.dom.BrowserRouter
import react.router.dom.HashRouter
import react.router.dom.Route
import react.router.dom.Switch
import styled.css
import styled.styledDiv
import styles.AngusSoftwareStyles

fun RBuilder.rootComponent() = styledDiv {
    css {
        +AngusSoftwareStyles.rootComponent
    }
    attrs {
        id = "main"
    }
    styledDiv {
        attrs {
            classes = setOf("content")
            id = "routerDiv"
        }
        HashRouter {
            // or "browserRouter"
            Switch {
                Route {
                    attrs {
                        path = arrayOf("/")
                        exact = true
                    }
                    angusSoftwareComponent(AngusSoftwareApplicationsEnum.WEBSITE)
                }
                Route {
                    attrs {
                        path = arrayOf(BLINK_READER_ENDPOINT)
                        exact = true
                    }
                    angusSoftwareComponent(AngusSoftwareApplicationsEnum.BLINK_READER)
                }
                Route {
                    attrs {
                        path = arrayOf(ANGUS_PAINT_ENDPOINT)
                        exact = true
                    }
                    angusSoftwareComponent(AngusSoftwareApplicationsEnum.ANGUS_PAINT)
                }
                Route {
                    attrs {
                        path = arrayOf(ANGUS_SOLITAIRE_ENDPOINT)
                        exact = true
                    }
                    angusSoftwareComponent(AngusSoftwareApplicationsEnum.ANGUS_SOLITAIRE)
                }
                Route {
                    attrs {
                        path = arrayOf(TAP_TARGET_BOOSTER_ENDPOINT)
                        exact = true
                    }
                    angusSoftwareComponent(AngusSoftwareApplicationsEnum.TAP_TARGET_BOOSTER)
                }
            }
        }
    }
    footer {
        navigationComponent()
    }
}

const val ANGUS_PAINT_ENDPOINT = "/angus_paint"
const val ANGUS_SOLITAIRE_ENDPOINT = "/angus_solitaire"
const val BLINK_READER_ENDPOINT = "/blink_reader"
const val TAP_TARGET_BOOSTER_ENDPOINT = "/tap_target_booster"
const val WEBSITE_ENDPOINT = "/"

