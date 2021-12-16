package views

import react.Props
import react.RBuilder
import react.RComponent
import react.State
import react.dom.*
import styled.styledDiv

@ExperimentalJsExport
@JsExport
class AngusPaintComponent() :
    RComponent<Props, State
>() {

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
