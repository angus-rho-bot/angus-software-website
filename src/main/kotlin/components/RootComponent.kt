package components

import enums.AngusSoftwareApplicationsEnum
import kotlinx.html.classes
import kotlinx.html.id
import react.*
import react.dom.attrs
import react.dom.footer
import react.router.dom.*
//import react.router.dom.hashRouter
//import react.router.dom.route
//import react.router.dom.switch
import styled.css
import styled.styledDiv
import styles.AngusSoftwareStyles

@ExperimentalJsExport
class RootComponent : RComponent<Props, State>() {

    override fun RBuilder.render() {
        styledDiv {
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
                BrowserRouter {
                    // or "browserRouter"
                    Switch {
                        Route{
                            attrs{
                                path = arrayOf("/")
                                exact = true
                            }
                            child(AngusSoftwareComponent::class) {
                                attrs.angusSoftwareApplicationsEnum = AngusSoftwareApplicationsEnum.WEBSITE
                            }
                        }
                        Route{
                            attrs{
                                path = arrayOf(BLINK_READER_ENDPOINT)
                                exact = true
                            }
                            child(AngusSoftwareComponent::class) {
                                attrs.angusSoftwareApplicationsEnum = AngusSoftwareApplicationsEnum.BLINK_READER
                            }
                        }
                        Route{
                            attrs{
                                path = arrayOf(ANGUS_PAINT_ENDPOINT)
                                exact = true
                            }
                            child(AngusSoftwareComponent::class) {
                                attrs.angusSoftwareApplicationsEnum = AngusSoftwareApplicationsEnum.ANGUS_PAINT
                            }
                        }
                        Route{
                            attrs{
                                path = arrayOf(ANGUS_SOLITAIRE_ENDPOINT)
                                exact = true
                            }
                            child(AngusSoftwareComponent::class) {
                                attrs.angusSoftwareApplicationsEnum = AngusSoftwareApplicationsEnum.ANGUS_SOLITAIRE
                            }
                        }
                        Route{
                            attrs{
                                path = arrayOf(TAP_TARGET_BOOSTER_ENDPOINT)
                                exact = true
                            }
                            child(AngusSoftwareComponent::class) {
                                attrs.angusSoftwareApplicationsEnum = AngusSoftwareApplicationsEnum.TAP_TARGET_BOOSTER
                            }
                        }
                    }
                }
            }
            footer {
                child(NavigationComponent::class) { }
            }
        }
    }

    companion object {
        const val ANGUS_PAINT_ENDPOINT = "/#/angus_paint"
        const val ANGUS_SOLITAIRE_ENDPOINT = "/#/angus_solitaire"
        const val BLINK_READER_ENDPOINT = "/#/blink_reader"
        const val TAP_TARGET_BOOSTER_ENDPOINT = "/#/tap_target_booster"
        const val WEBSITE_ENDPOINT = "/"
    }
}
