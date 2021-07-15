package openenwi.bo4e.lib.com

import java.time.ZonedDateTime

/**
 * Abbildung eines Tagesvektors eines beliebigen äquidistanten Zeitrasters.
 *
 * veröffentlicht am 07. Oktober 2020
 *
 * @see "https://www.bo4e.de/dokumentation/komponenten/com-tagesvektor"
 */
data class Tagesvektor(
    val tag: ZonedDateTime,
    val werte: List<Zeitreihenwertkompakt>
)
