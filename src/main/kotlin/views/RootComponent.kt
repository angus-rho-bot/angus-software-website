package views

import HomeComponent
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.ul
import react.router.dom.hashRouter
import react.router.dom.redirect
import react.router.dom.route
import react.router.dom.switch
import styled.css

@ExperimentalJsExport
class RootComponent : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        hashRouter {// or "browserRouter"
            switch {
                route("/", HomeComponent::class, exact = true)
                route("/home", HomeComponent::class, exact = true)
                redirect(from = null, to = "/")
            }
        }
    }
}
