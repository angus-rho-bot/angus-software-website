package views

import enums.AngusSoftwareApplicationsEnum
import kotlinx.html.classes
import kotlinx.html.id
import react.*
import react.dom.footer
import react.router.dom.hashRouter
import react.router.dom.route
import react.router.dom.switch
import styled.css
import styled.styledDiv
import styles.AngusSoftwareStyles

@ExperimentalJsExport
class RootComponent : RComponent<RProps, RState>() {

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
                }
                hashRouter {
                    // or "browserRouter"
                    switch {
                        route(WEBSITE_ENDPOINT, exact = true) {
                            AngusSoftwareComponent(AngusSoftwareApplicationsEnum.WEBSITE).render() as? ReactElement
                        }
                        route(BLINK_READER_ENDPOINT, exact = true) {
                            AngusSoftwareComponent(AngusSoftwareApplicationsEnum.BLINK_READER).render() as? ReactElement
                        }
                        route(ANGUS_PAINT_ENDPOINT, exact = true) {
                            AngusSoftwareComponent(AngusSoftwareApplicationsEnum.ANGUS_PAINT).render() as? ReactElement
                        }
                        route(ANGUS_SOLITAIRE_ENDPOINT, exact = true) {
                            AngusSoftwareComponent(AngusSoftwareApplicationsEnum.ANGUS_SOLITAIRE).render() as? ReactElement
                        }
                        route(TAP_TARGET_BOOSTER_ENDPOINT, exact = true) {
                            AngusSoftwareComponent(AngusSoftwareApplicationsEnum.TAP_TARGET_BOOSTER).render() as? ReactElement
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
        const val ANGUS_PAINT_ENDPOINT = "/angus_paint"
        const val ANGUS_SOLITAIRE_ENDPOINT = "/angus_solitaire"
        const val BLINK_READER_ENDPOINT = "/blink_reader"
        const val TAP_TARGET_BOOSTER_ENDPOINT = "/tap_target_booster"
        const val WEBSITE_ENDPOINT = "/"
    }
}
