import react.dom.render
import kotlinx.browser.document
import kotlinx.browser.window

import views.RootComponent

fun main() {
    window.onload = {
        render(document.getElementById("root")) {
            child(RootComponent::class) { }
        }
    }
}
