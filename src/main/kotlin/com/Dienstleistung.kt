package de.openenwi.bo4e.lib.com

import de.openenwi.bo4e.lib.enum.Dienstleistungstyp

/**
 * Abbildung einer abrechenbaren Dienstleistung.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [COM Dienstleistung](https://www.bo4e.de/dokumentation/komponenten/com-dienstleistung)
 */
data class Dienstleistung(val dienstleistungstyp: Dienstleistungstyp, val bezeichnung: String)
