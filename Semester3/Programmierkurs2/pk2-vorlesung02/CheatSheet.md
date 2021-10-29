### Variable
- Eine Variable ist ein benannter logischer Speicherplatz mit dessen Inhalt
### Datentyp
- Ein Datentyp ist eine Zusammenfassung von Wertebereich und Operationen auf Wertebereich
### const
- bezeichnet auch logischen Speicherplatz
- darf aber nur einmal ein Wert zugewiesen werden
- Quasi final aus Java

### Wertebereich
- -2^n-1 .... 2^n-1-1
- kann durch Qualifier beeinflusst werden:
    - short (int) Bits: n/2
    - long  (int) Bits: n
    - signed (int) (negativer Wertebereich deleted und an positiven drangeklatscht)
    - unsigned (int)

- get wertebereich: sizeof()

### Anweisungen und Kontrollstrukturen

#### Funktionen
Funktion die auf globale Variablen zugreift keine mathematische Funktion.
Mathematische Funktion f(x) ist ja nur von den Parametern abhängig der body ist hinter dem = Zeichen.

#### Deklaration vs Definition
Deklaration bspw: int x(parameters);
- keine Speicherreservierung

Defintion bspw: int x (parameters) {
    int y = x + parameters
    return y; 
}

- reservierung von Speicher, implementierung einer Funktion