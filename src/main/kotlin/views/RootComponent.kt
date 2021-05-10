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
                    route("/", exact = true) {
                        AngusSoftwareComponent(AngusSoftwareApplicationsEnum.GOOGLE_PLAY_STORE_LISTING).render() as? ReactElement
                    }
                    route("/Blink_Reader", exact = true) {
                        AngusSoftwareComponent(AngusSoftwareApplicationsEnum.BLINK_READER).render() as? ReactElement
                    }
                }
            }
        }
    }
}
