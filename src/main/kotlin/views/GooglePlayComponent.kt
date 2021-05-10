package views

import react.*
import react.dom.h2
import styled.css
import styled.styledDiv
import styles.AngusSoftwareStyles

@ExperimentalJsExport
@JsExport
class GooglePlayComponent() :
    RComponent<RProps, RState>() {

    override fun RBuilder.render() {
        styledDiv {
            h2 {
                +"Google Play Store Listing"
            }
        }
    }
}
