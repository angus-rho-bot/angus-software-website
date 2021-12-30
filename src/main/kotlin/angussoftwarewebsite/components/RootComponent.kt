package angussoftwarewebsite.components

import angussoftwarewebsite.enums.AngusSoftwareApplicationsEnum
import angussoftwarewebsite.styles.AngusSoftwareStyles
import kotlinx.html.classes
import kotlinx.html.id
import react.RBuilder
import react.createElement
import react.dom.attrs
import react.dom.footer
import react.router.Route
import react.router.Routes
import react.router.dom.BrowserRouter
import react.router.dom.HashRouter
import styled.css
import styled.styledDiv

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
        // or "browserRouter"
        HashRouter {
            Routes {
                Route {
                    attrs {
                        path = "/"
                        element = createElement {
                            angusSoftwareComponent(AngusSoftwareApplicationsEnum.WEBSITE)
                        }
                    }
                }
                Route {
                    attrs {
                        path = BLINK_READER_ENDPOINT
                        element = createElement {
                            angusSoftwareComponent(AngusSoftwareApplicationsEnum.BLINK_READER)
                        }
                    }
                }
                Route {
                    attrs {
                        path = ANGUS_PAINT_ENDPOINT
                        element = createElement {
                            angusSoftwareComponent(AngusSoftwareApplicationsEnum.ANGUS_PAINT)
                        }
                    }
                }
                Route {
                    attrs {
                        path = ANGUS_SOLITAIRE_ENDPOINT
                        element = createElement {
                            angusSoftwareComponent(AngusSoftwareApplicationsEnum.ANGUS_SOLITAIRE)
                        }
                    }
                }
                Route {
                    attrs {
                        path = TAP_TARGET_BOOSTER_ENDPOINT
                        element = createElement {
                            angusSoftwareComponent(AngusSoftwareApplicationsEnum.TAP_TARGET_BOOSTER)
                        }
                    }
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

