package views

import enums.AngusSoftwareApplicationsEnum
import react.*
import react.dom.*
import styled.css
import styled.styledDiv
import styles.AngusSoftwareStyles

external interface AngusSoftwareComponentProps : PropsWithChildren {
    var angusSoftwareApplicationsEnum: AngusSoftwareApplicationsEnum
}

@ExperimentalJsExport
@JsExport
class AngusSoftwareComponent() :
    RComponent<AngusSoftwareComponentProps, State>() {

    override fun RBuilder.render() {
        styledDiv {

            img(src = "./angus_software_logo.png") {}
            h1 {
                +"Welcome to Angus Software"
            }

            console.info(props.angusSoftwareApplicationsEnum)
            when (props.angusSoftwareApplicationsEnum) {
                AngusSoftwareApplicationsEnum.BLINK_READER -> child(BlinkReaderComponent::class) { }
                AngusSoftwareApplicationsEnum.ANGUS_PAINT -> child(AngusPaintComponent::class) { }
                AngusSoftwareApplicationsEnum.ANGUS_SOLITAIRE -> child(AngusSolitaireComponent::class) { }
                AngusSoftwareApplicationsEnum.TAP_TARGET_BOOSTER -> child(TapTargetBoosterComponent::class) { }
                AngusSoftwareApplicationsEnum.WEBSITE -> child(WebsiteComponent::class) { }
            }
        }
    }


}
