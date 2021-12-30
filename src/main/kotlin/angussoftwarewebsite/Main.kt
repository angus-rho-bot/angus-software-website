package angussoftwarewebsite

import kotlinx.browser.document
import react.dom.render
import angussoftwarewebsite.components.rootComponent

@OptIn(ExperimentalJsExport::class)
fun main() {
    document.getElementById("root")?.let{
        render(it) {
            rootComponent()
        }
    }

}
