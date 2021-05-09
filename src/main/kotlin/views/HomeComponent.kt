import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.h1
import styled.css
import styled.styledDiv

data class AngusSoftwareWebsiteState(val name: String) : RState

@ExperimentalJsExport
@JsExport
class HomeComponent :
    RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        styledDiv {
            css {
                +WelcomeStyles.textContainer
            }
            +"Welcome to Angus Software"
        }
    }
}
