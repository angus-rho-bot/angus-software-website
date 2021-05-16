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
class AngusPaintComponent() :
    RComponent<RProps, RState>() {

    override fun RBuilder.render() {
        styledDiv {
            h2 {
                +"Angus Paint"
            }
            h3{
                +"Paint your own masterpiece with Angus Paint"
            }
            p{
                +"Paint your own masterpiece with Angus!\n"
                        +"Use your finger as your painting tool\n"
                        +"Paint with any color of the rainbow\n"
                        +"Paint with different brush sizes\n"
                        +"Save your paintings to your device\n"
                        +"Paint upon a picture on your device\n"
                        +"Paint in portrait or landscape mode\n"
                        +"Have fun, and please rate on Google Play!"
            }
        }
    }
}
