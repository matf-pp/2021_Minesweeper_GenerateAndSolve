import javafx.application.Platform
import javafx.geometry.Pos
import javafx.scene.control.ToggleGroup
import javafx.scene.layout.HBox
import tornadofx.*

class Igra : View ("Minesweeper_GenerateAndSolve") {

    private val toggleGroup = ToggleGroup()
    override val root: HBox = hbox(20, alignment = Pos.CENTER) {
        style {
            backgroundColor += c("#000000")
        }
        menubar {
            alignment = Pos.BASELINE_LEFT
            menu("Igra") {
                item("Nova igra", "Shortcut+P").action {
                    close()
                    find<MyView>().openWindow()
                }
                item("Izlaz", "Shortcut+Q").action { Platform.exit() }

            }
        }

        vbox(10) {
            //zasto labela nije na sredini kada se uveca ??
            label(" Minesweeper_GenerateAndSolve ") {
                style {
                    paddingAll = 20
                    fontSize = 40.px
                    textFill = c("#ff0000")
                    alignment = Pos.CENTER
                    fontFamily = "Comic Sans MS"

                }
            }

            vbox {
                alignment = Pos.CENTER
                label(" Izabrati nacin igranja igre: ") {
                    style {
                        paddingAll = 20
                        fontSize = 25.px
                        textFill = c("#ffffff")
                        alignment = Pos.TOP_CENTER
                        fontFamily = "Comic Sans MS"

                    }
                }
                hbox {
                    spacing = 40.0
                    alignment = Pos.CENTER
                    togglebutton("Igrac", toggleGroup) {
                        style {
                            fontFamily = "Comic Sans MS"

                        }
                        action { }
                    }
                    togglebutton("Kompjuter", toggleGroup) {
                        style { fontFamily = "Comic Sans MS" }
                        action { }
                    }
                }
            }

            gridpane {
                alignment = Pos.CENTER
                val tabla1 = Tabla(Level.BEGINNER, true)
                tabla1.initializeBoard()
                for (i in 0..8)
                    row {
                        for (j in 0..8) {
                            button("  ") {
                                action {
                                    setOnMouseClicked {
                                        if(tabla1.mines[i][j]==true)
                                            text="*"
                                            else text = tabla1.boardIgrac[i][j].toString()
                                    }
                                }
                            }

                        }
                    }
            }

        }

    }

}






