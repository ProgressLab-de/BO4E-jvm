package openenwi.bo4e.lib.com

import openenwi.bo4e.lib.enum.Rufnummernart

/**
 * Abbildung von Rufnummern.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see "https://www.bo4e.de/dokumentation/komponenten/com-rufnummer"
 */
data class Rufnummer(
    val nummerntyp: Rufnummernart,
    val rufnummer: String
)
