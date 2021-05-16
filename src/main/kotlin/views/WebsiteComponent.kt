package views

import react.*
import react.dom.h2
import react.dom.h3
import react.dom.p
import styled.styledDiv

@ExperimentalJsExport
@JsExport
class WebsiteComponent() :
    RComponent<RProps, RState>() {

    override fun RBuilder.render() {
        styledDiv {
            h2 {
                +"Angus Software Website"
            }

        }
    }
}
