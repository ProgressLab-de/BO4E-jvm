package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.bo.Geschaeftsobjekt.Companion.typ
import de.openenwi.bo4e.lib.com.Betrag
import de.openenwi.bo4e.lib.com.Zeitraum
import de.openenwi.bo4e.lib.enum.BOTyp.FREMDKOSTEN

/**
 * Mit diesem BO werden die Fremdkosten, beispielsweise für eine Angebotserstellung
 * oder eine Rechnungsprüfung, übertragen.
 * Die Fremdkosten enthalten dabei alle Kostenblöcke, die von anderen Marktteilnehmern oder Instanzen erhoben werden.
 *
 * veröffentlicht am 03. Juli 2019
 *
 * @see [BO Fremdkosten](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-fremdkosten)
 */
data class Fremdkosten(
    val gueltigkeit: Zeitraum,
    val summeKosten: Betrag? = null,
    val kostenbloecke: List<Fremdkosten> = emptyList(),
    val geschaeftsobjekt: Geschaeftsobjekt = typ(FREMDKOSTEN),
) : Geschaeftsobjekt by geschaeftsobjekt
