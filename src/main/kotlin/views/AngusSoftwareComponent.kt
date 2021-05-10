package views

import enums.AngusSoftwareApplicationsEnum
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.a
import react.dom.h1
import react.dom.img
import styled.css
import styled.styledDiv
import styles.AngusSoftwareStyles

@ExperimentalJsExport
@JsExport
class AngusSoftwareComponent(val angusSoftwareApplicationsEnum: AngusSoftwareApplicationsEnum) :
    RComponent<RProps, RState>() {

    override fun RBuilder.render() {
        styledDiv {
            css {
                +AngusSoftwareStyles.container
            }
            img(src = "./angus_software_logo.png") {}
            h1 {
                +"Welcome to Angus Software"
            }
            when(angusSoftwareApplicationsEnum){
                AngusSoftwareApplicationsEnum.BLINK_READER -> child(BlinkReaderComponent::class){ }
                else -> child(GooglePlayComponent::class) { }
            }
            a {
                +"Blink Reader"
                attrs {
                    href = "#/Blink_Reader"
                }
            }
        }
    }
}
