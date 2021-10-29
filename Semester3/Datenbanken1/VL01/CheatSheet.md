## Datenbanken 1 - VL01
Krähenfußnotation
https://de.wikipedia.org/wiki/Martin-Notation

### Datenbankentwurf
1. Was gibt es für Daten?
2. Wie sind die Daten strukturiert?
3. Wie stehen die Daten zueinander in Beziehung?

#### Buchhandlung
1. Was für Daten?
Interview
Entity-Relationship Modell
Primärschlüssel für eindeutige ID.


2. Welche Struktur?
Addresse als strukturiertes Attribut vs Addresse als eigene Entity

Attribut:
- Addresse als Attribut von Kunde mit Subattributen

Entity: 
- Wenn wesentliche Bedeutung in Kontext oder viele Eigenattribute
- Addresse als eigene Tabelle mit ID (Primärschlüssel) po Addresse und Relation zu Kunde

3. Relationen?

Anforderungsbeschreibung: "Kunden können mehrere Bücher kaufen"

Modellierung:

Kunde ->kauft-> n Bücher | ? : n Beziehung
Kann ein Buch von mehreren Kunden gekauft werden?
Ja -> m : n Beziehung
Nein -> 1:n Beziehung

### UML vs ER-Model
UML lack of primary keys


### Modellierung
Abstraktion von Realem Modell
Bspw Person -> Haarfarbe, Größe, Alter, Name, Nachname, Anrede etc.
DB Modell -> Name, Nachname, Anrede (Oder was auch immer im Kontext necessary ist)

Tabelle = Relation

Relationen beschrieben durch Attribute von Tabelle.

Alle Attribute zusammen = Relationales Schema (Tabllenkopf)

Daten = Extension
Datensatz = Tupel (Tabellenzeile)
Zelle = Attributwert (nur atomar (Zeichenketten Zahlenwerte bspw.))

### Mathematische Relation
- keine doppelten Tupel
- beliebige Reihenfolge der Tupel
- Beliebige Anordnung der Attribute

### Tabelle
- doppelte Tupel KÖNNEN auftreten (deswegen immer equals und hashcode nutzen)
- die Reihenfolge der Tupel ist festgelegt


### Wie werden Daten in einer relationalen Datenbank gespeichert?
- Nur attomare Attributwerte sind erlaubt
- Daten werden in TAbellen(Relationen) gespeichert

### Relationen Kundendaten - Simkarte
- bspw. shared attributes wobei shared attribute ist Primary key von andere Tabelle
genannt: Fremdschlüssel (Bspw. Kundennummer in Simkartentabelle)

bei m:n: 
Zwischentabelle mit zusammengesetzte Primärschlüssel

### Ein Tarif soll mehrere Tarife beinhalten können:
Zwischentabelle mit Primärschlüsselkombination von den jeweiligen Tarifen.
Bspw.
Tarif 27 | Tarif 42
Tarif 27 | Tarif 66
Tarif 66 | Tarif 1
etc.

### Rekursive Relation 
Bsp.

Artikelkategorie:
id ArtikelKategorie | id Parent

So wie bei meiner DB mit Trees in H2 DB mit Github zeug und treeReferenceID 

### Lieferservice Datenbank
Wie kommt Lieferer an Kundendaten?

SELECT IDBESTELLUNG FROM LIEFERBESTAETIGUNG WHERE IDLIEFERER = 'whatever'

und dann
SELECT IDKUNDE FROM BESTELLUNG WHERE IDBESTELLUNG = 'Result from previous command'

und dann
SELECT VORNAME, NACHNAME, STRASSE, WOHNORT FROM KUNDE WHERE IDKUNDE = 'Result from previous command'

und Note für mich. SQL Joins gucken


