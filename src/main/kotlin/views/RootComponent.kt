package views

import enums.AngusSoftwareApplicationsEnum
import react.*
import react.router.dom.*
import styled.styledDiv

@ExperimentalJsExport
class RootComponent : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        styledDiv {
            hashRouter {// or "browserRouter"
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
                    route(GOOGLE_PLAY_ENDPOINT, exact = true) {
                        AngusSoftwareComponent(AngusSoftwareApplicationsEnum.GOOGLE_PLAY_STORE_LISTING).render() as? ReactElement
                    }
                }
            }
        }
    }

    companion object {
        const val ANGUS_PAINT_ENDPOINT =  "/angus_paint"
        const val GOOGLE_PLAY_ENDPOINT =  "/google_play"
        const val ANGUS_SOLITAIRE_ENDPOINT =  "/angus_solitaire"
        const val BLINK_READER_ENDPOINT =  "/blink_reader"
        const val TAP_TARGET_BOOSTER_ENDPOINT =  "/tap_target_booster"
        const val WEBSITE_ENDPOINT =  "/"
    }
}
