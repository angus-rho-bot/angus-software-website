package views

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.a
import react.dom.h2
import react.dom.h3
import react.dom.p
import styled.styledDiv

@ExperimentalJsExport
@JsExport
class AngusPaintComponent() :
    RComponent<RProps, RState>() {

    override fun RBuilder.render() {
        styledDiv {
            h2 {
                +"Angus Paint"
            }
            h3 {
                +"Paint your own masterpiece with Angus Paint"
            }
            a {
                +"Available on the Google Play Store"
                attrs{
                    href = "https://play.google.com/store/apps/details?id=gms.angusgaming.anguspaint&hl=en"
                    target = "_blank"
                }
            }
            p {
                +"Use your finger as your painting tool. Paint with any color of the rainbow. "
                +"Paint with different brush sizes. Save your paintings to your device. "
                +"Paint upon a picture from your device. Paint in portrait or landscape mode. "
                +"Have fun, and please rate on Google Play!"
            }

        }
    }
}
