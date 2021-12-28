package angussoftwarewebsite.enums

enum class AngusSoftwareApplicationsEnum {
    ANGUS_PAINT,
    ANGUS_SOLITAIRE,
    BLINK_READER,
    TAP_TARGET_BOOSTER,
    WEBSITE;

    override fun toString(): String {
        return when (this) {
            BLINK_READER -> "BlinkReaderComponent"
            ANGUS_PAINT -> "AngusPaintComponent"
            ANGUS_SOLITAIRE -> "AngusSolitaireComponent"
            TAP_TARGET_BOOSTER -> "TapTargetBoosterComponent"
            WEBSITE -> "WebsiteComponent"
        }
    }}