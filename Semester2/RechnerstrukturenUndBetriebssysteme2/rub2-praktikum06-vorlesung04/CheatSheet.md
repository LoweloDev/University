### Threads
- Zustand: aktiv, bereit etc.
- Kontext: Programmzähler, Stackpointer, Framepointer etc.
- Stack: Für lokale Variablen
- Speicherplatz: Threadlokale Variablen

#### Asynchrones Warten
Überbrückung von Wartezeiten, responsivität der Benutzeroberfläche während im Hintergrund
kalkulationen laufen

#### Seperation of concerns
Übersicht und maintainability der Applikation erhöht, aber auch grundsätzliche Dinge die unabhängig laufen müssen,
bspw. Animation und Logik (bspw. man läuft in GTA 5 durch die Pampa und das ingame Handy klingelt und popped up)

#### Performance
Bessere performance durch asynchrone arbeit, parallel laufende Routinen, basically Teil von asynchronem Warten und arbeiten und Responsivität der Applikation währenddessen.

#### User Level Threads
Threads wie sie für uns sichtbar sind im Code
Der Kernel weis nichts von diesen Threads.

m:1 Zuordnung: Alle threads laufen auf einem Kern. I.e. Hardware-Parallelität nicht nutzbar.

#### Kernel Level Threads
Werden vom Kernel direkt im Prozess behandelt. Quasi Abstraktion von Prozessen.

1:1 Zuordnung: langsamere Umschlatung zwischen Threads als Userlevel n:1 Zuordnung (UserLevel Thread : Kernel Thread)

### Prozesse vs Threads

Prozess:
- Instanz eines Programms
- Adressraum, REssourcen (Dateien etc), Kontrollfluss (Code basically)
- läuft isoliert von anderen Prozessen

Thread:
- Potentielle (meist asynchron laufende) subroutine eines Prozesses
- kann eine oder mehrere Threads im Prozess geben

### Race Condition
Mehrere asynchrone Prozesse greifen unkoordiniert auf gemeinsame Ressource zu.
Ergebnis abhängig von nicht-deterministischer Reihenfolge. Ergo, problematisch.

#### Wechselseitiger Ausschluss
Prozesse müssen in dem Fall synchronisiert werden um conflicts bei access auf Ressourcen zu vermeiden.

Bedingungen: Nur ein prozess darf sich zu einem Zeitpnkt in einem kirtischen Abschnitt befinden.
Prozesse im kritischen Abschnitt sollten immer Prio vor Prozessen in nicht-kritischen Abschnitten haben.
Dennoch sollte kein Prozess ewig darauf warten in seinen kritischen Abschnitt zu kommen, i.e. keine endless Loops, die eine Ressource blockieren.

Ein OS stellt Mechanismen für mutual exclusion bereit.

#### kritischer Abschnitt
ist der Teil des Prozesses der auf eine gemeinsam genutzte Ressource zugreift.
Einen kritischen Abschnitt, also gemeinsam genutzte Ressourcen zu vermeiden, vermeidet auch Race conditions...
obviously...

### Semaphor
- Objekte des OS
- Atomare Operatoren P() V() (down und up)
- Semaphor geht auf Eisenbahnsignale zurück ob Abschnitt befahren werden darf oder nicht.

- Identität: Instanzbezeichnung von Sempahor
- Zähler: Markenzähler mit default value
- Ws: Warteschlange (Liste blockierter Prozesse)
- P: down
- V: up

Typen:
- Binär: 0 oder 1 als Wert erlaubt
- Zählend: bleiebig viele positive Werte

Funktionalität P (down):
if (zähler > 0){
zähler = zähler--;

Marke vergeben;
Prozess darf weiter arbeiten;

} else {
remove Prozess von Bereitliste;
add Prozess zu Semaphor-Queue;

reschedule CPU;
}

Funktionalität V(up):
if (semaphor warteschlange leer) {
Zähler = zähler++;
remove 1 Marke;
} else {
remove ältesten Prozess von Semaphor-Queue;
add ältesten Prozess zu Bereitliste;

reschedule CPU;
}

### POSIX Threads
- <pthread.h>
- pthread_<object>_t
- pthread_<object>_<operation>()

https://man7.org/linux/man-pages/man7/pthreads.7.html

- eindeutige ID pthread_t
- abfragen mit pthread_self
- vergleich mit pthread_equal
- warten auf beendigung anderer threads pthread_join

### POSIX Semaphores
- named semaphore (in allen Prozessen sichtbar)
- unnamed semaphore (nur in Prozessen sichtbar, die sich den gleichen Speicher teilen)

https://man7.org/linux/man-pages/man7/sem_overview.7.html

- sem_init unnamed semaphor
- *sem pointer auf Variable in der die ID kommt
- pshared zeigt ob Semaphor ziwschen Prozessen geteilt wird
- value ist initialwert


### Aufgabe 1
Wird hinzugefügt im laufe der Zeit da ich dieses Semester so oder so wiederholen werde.

### Aufgabe 2
| P<sub>A</sub> | P<sub>B</sub> |
|---------------|---------------|
| sem_init = 1  |               |
| P(sem_init)   | P(sem_init)   |
| V= ...;       | printf(V);    |
| V(sem_init);  | V(sem_init);  |

### Aufgabe 3
mit 1. Sind ja nur 2 Prozesse und 1 Ressource zu einem Zeitpunkt.

### Aufgabe 4
Wird hinzugefügt im laufe der Zeit da ich dieses Semester so oder so wiederholen werde.
