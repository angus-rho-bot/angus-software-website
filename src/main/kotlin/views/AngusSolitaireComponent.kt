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
class AngusSolitaireComponent() :
    RComponent<RProps, RState>() {

    override fun RBuilder.render() {
        styledDiv {
            h2 {
                +"Angus Solitaire"
            }
            h3{
                +"New version of Solitaire!"
            }
            p{
                +"The objective of the game is to score as many points as possible before the deck runs out of cards. Scores less than 75 points are not submitted to High Scores.\n"
                +"Press on the deck to draw a card. If the card drawn is a face card (10s are face cards),it will automatically go to its “Place”. If the card drawn is any other card it will automatically go to the Black or Red “Place” based on its color.\n"
                +"The Black and Red “Places” can only contain one card at a time. For example, if a Black number card is drawn and there is already a card in the Black “Place”, you must either discard the drawn card or discard the card in the Black “Place”.\n"
                +"To score points, the “Pile” must contain one face card of each suit (one club, one diamond, one spade, and one heart) based on the current level, starting with Jack. Points are not scored until a level is completed. Having a complete “Pile” will move you to next level.\n"
                +"To “Collect” a face card into the “Pile”, you must have the following cards on the board (example shown above): The face card you want to “Collect” into the “Pile”, A number card that matches the suit of the face card in one of the color “Places”, and another number card of the opposing color in the other color “Place”. Once all of these cards are on the board, press the face card to “collect” it and move that card onto the pile. Face cards that can be “Collected” are surrounded with a red border.\n"
                +"The sum of the number cards used to “Collect” a face card is put towards your “Pile” total. Once a level has been completed the face cards from that level become “Wild”. “Wild” face cards can be “Collected” instead of the current level’s face cards. “Wild” face cards which can be “Collected” are surrounded with a red border. “Wild” face cards have the same prerequisites as the current level face cards to be collected onto the pile. 10s start the game as “Wild”.\n"
                +"“Wild” face cards can also be used as number cards. To use a “Wild” face card as a number card, press on that card and it will move to it’s respective color “Place”. “Wild” face cards that can be used as number cards will be surrounded with a yellow border. Pressing a “Wild” face card will only move it to it’s respective color “Place” if that “Wild” face card cannot “Collected”.\n"
                +"If you wish to skip the level you are currently on, press the “BREAK” button. Skipping a level will “break” the face cards of that level. You can only use the “BREAK” button once per game.\n"
                +"Once a level has been “Broken”, the face cards from that level cannot be “Collected”. The face cards from the “Broken” level cannot be used as “Wild” face cards."
            }
        }
    }
}
