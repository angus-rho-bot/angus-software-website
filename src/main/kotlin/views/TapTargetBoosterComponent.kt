package views

import react.*
import react.dom.h2
import react.dom.h3
import react.dom.p
import styled.css
import styled.styledDiv
import styles.AngusSoftwareStyles

@ExperimentalJsExport
@JsExport
class TapTargetBoosterComponent() :
    RComponent<RProps, RState>() {

    override fun RBuilder.render() {
        styledDiv {
            h2 {
                +"Tap Target Booster"
            }
            h3{
                +"Improve your touching and pressing aim with this targeting game."
            }
            p{
                +"With four different modes to help improve you accuracy and speed, Tap Target Booster is fun way to measure and hone your touch screen skills!"
            }
        }
    }
}
