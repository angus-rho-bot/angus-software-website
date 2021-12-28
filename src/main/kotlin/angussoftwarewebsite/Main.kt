package angussoftwarewebsite

import kotlinx.browser.document
import react.dom.render
import angussoftwarewebsite.components.rootComponent

@OptIn(ExperimentalJsExport::class)
fun main() {
    render(document.getElementById("root")) {
        rootComponent()
    }
}
