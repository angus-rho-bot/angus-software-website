package angussoftwarewebsite.components

import angussoftwarewebsite.enums.AngusSoftwareApplicationsEnum
import react.RBuilder
import react.dom.h1
import react.dom.img
import styled.styledDiv


fun RBuilder.angusSoftwareComponent(angusSoftwareApplicationsEnum: AngusSoftwareApplicationsEnum) = styledDiv {

    img(src = "angus_software_logo.png") {}
    h1 {
        +"Welcome to Angus Software"
    }

    console.info("attention! $angusSoftwareApplicationsEnum")
    when (angusSoftwareApplicationsEnum) {
        AngusSoftwareApplicationsEnum.BLINK_READER -> blinkReaderComponent()
        AngusSoftwareApplicationsEnum.ANGUS_PAINT -> angusPaintComponent()
        AngusSoftwareApplicationsEnum.ANGUS_SOLITAIRE -> angusSolitaireComponent()
        AngusSoftwareApplicationsEnum.TAP_TARGET_BOOSTER -> tapTargetBoosterComponent()
        AngusSoftwareApplicationsEnum.WEBSITE -> websiteComponent()
    }
}
