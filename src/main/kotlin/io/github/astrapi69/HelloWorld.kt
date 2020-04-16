package io.github.astrapi69

import tornadofx.View
import tornadofx.hbox
import tornadofx.label

class HelloWorld : View() {
    override val root = hbox {
        label("Hello world")
    }
}
