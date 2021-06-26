package de.progresslab.bo4e.lib.enum

/**
 * Der Status eines Zählerstandes
 *
 * veröffentlicht am 07. Oktober 2020
 */
enum class Messwertstatus(val beschreibung: String) {
    ABGELESEN("Abgelesener Wert (abrechnungsrelevant)"),
    ERSATZWERT("Ersatzwert - geschätzt, veranschlagt (abrechnungsrelevant)"),
    VORSCHLAGSWERT("Vorschlagswert (nicht abrechnungsrelevant)"),
    NICHT_VERWENDBAR("Nicht verwendbarer Wert (nicht abrechnungsrelevant)"),
    PROGNOSEWERT("Ein prognostizierter Wert"),
    VOLAEUFIGERWERT("Ein vorläufiger Wert, dieser kann später angepasst werden."),
    ENERGIEMENGESUMMIERT("Summenwert, Bilanzsumme"),
    FEHLT("Explizite Kennzeichnung eines fehlenden Wertes"),
}
