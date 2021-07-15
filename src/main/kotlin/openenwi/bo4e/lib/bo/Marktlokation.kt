package openenwi.bo4e.lib.bo

import openenwi.bo4e.lib.com.Adresse
import openenwi.bo4e.lib.com.Geokoordinaten
import openenwi.bo4e.lib.com.Katasteradresse
import openenwi.bo4e.lib.com.Messlokationszuordnung
import openenwi.bo4e.lib.enum.*

data class Marktlokation(
    val marktlokationsId: String,
    val sparte: Sparte,
    val energierichtung: Energierichtung,
    val bilanzierungsmethode: Bilanzierungsmethode,
    val verbrauchsart: Verbrauchsart?,
    val unterbrechbar: Boolean?,
    val netzebene: Netzebene,
    val netzbetreibercodenr: String?,
    val gebiettyp: Gebiettyp?,
    val netzgebietnr: String?,
    val bilanzierungsgebiet: String?,
    val grundversorgercodenr: String?,
    val gasqualitaet: Gasqualitaet?,
    val endkunde: Geschaeftspartner?,
    val lokationsadresse: Adresse?,
    val geoadresse: Geokoordinaten?,
    val katasterinformation: Katasteradresse?,
    val zugehoerigeMesslokationen: Set<Messlokationszuordnung>
) : Geschaeftsobjekt(boTyp = BOTyp.MARKTLOKATION)