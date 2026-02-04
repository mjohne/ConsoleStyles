# ConsoleStyles

ConsoleStyles ist eine Utility-Klasse zur konsistenten Gestaltung von Konsolenausgaben in Java. Sie kapselt ANSI-Escape-Sequenzen und stellt vordefinierte Stilkonstanten bereit, um Textfarbe, Hintergrundfarbe und Textattribute in der Konsole einfach und lesbar zu steuern.

## Features

- **Textfarben**: Standardfarben (Schwarz, Rot, Grün, Gelb, Blau, Magenta, Cyan, Weiß) und helle Varianten
- **Hintergrundfarben**: Standardfarben und helle Varianten für Hintergründe
- **Textattribute**: Fett, Kursiv, Unterstrichen, Durchgestrichen, Blinken, Invertiert, etc.
- **Einfache API**: Statische Methoden zum Formatieren und Ausgeben von Text
- **Kombination**: Mehrere Stile können einfach kombiniert werden

## Verwendung

### Grundlegende Textausgabe

```java
import de.mjohne.consolestyles.ConsoleStyles;

// Text in Farbe ausgeben
ConsoleStyles.println("Roter Text", ConsoleStyles.RED);
ConsoleStyles.println("Grüner Text", ConsoleStyles.GREEN);
ConsoleStyles.println("Blauer Text", ConsoleStyles.BLUE);
```

### Text mit Hintergrundfarbe

```java
// Gelber Text auf blauem Hintergrund
ConsoleStyles.println("Warnung!", ConsoleStyles.YELLOW, ConsoleStyles.BG_BLUE);

// Weißer Text auf rotem Hintergrund
ConsoleStyles.println("Fehler!", ConsoleStyles.WHITE, ConsoleStyles.BG_RED);
```

### Textattribute

```java
// Fetter Text
ConsoleStyles.println("Wichtig!", ConsoleStyles.BOLD);

// Unterstrichener Text
ConsoleStyles.println("Hinweis", ConsoleStyles.UNDERLINE);

// Kombinierte Attribute
ConsoleStyles.println("Sehr wichtig!", ConsoleStyles.BOLD, ConsoleStyles.UNDERLINE, ConsoleStyles.RED);
```

### format() Methode

```java
// Text formatieren ohne direkte Ausgabe
String formatted = ConsoleStyles.format("Erfolg", ConsoleStyles.BOLD, ConsoleStyles.GREEN);
System.out.println("Status: " + formatted);
```

### print() Methode (ohne Zeilenumbruch)

```java
// Ausgabe ohne Zeilenumbruch
ConsoleStyles.print("Rot", ConsoleStyles.RED);
System.out.print(", ");
ConsoleStyles.print("Grün", ConsoleStyles.GREEN);
System.out.println();
```

## Verfügbare Stilkonstanten

### Textfarben
- `BLACK`, `RED`, `GREEN`, `YELLOW`, `BLUE`, `MAGENTA`, `CYAN`, `WHITE`
- `BRIGHT_BLACK`, `BRIGHT_RED`, `BRIGHT_GREEN`, `BRIGHT_YELLOW`, `BRIGHT_BLUE`, `BRIGHT_MAGENTA`, `BRIGHT_CYAN`, `BRIGHT_WHITE`

### Hintergrundfarben
- `BG_BLACK`, `BG_RED`, `BG_GREEN`, `BG_YELLOW`, `BG_BLUE`, `BG_MAGENTA`, `BG_CYAN`, `BG_WHITE`
- `BG_BRIGHT_BLACK`, `BG_BRIGHT_RED`, `BG_BRIGHT_GREEN`, `BG_BRIGHT_YELLOW`, `BG_BRIGHT_BLUE`, `BG_BRIGHT_MAGENTA`, `BG_BRIGHT_CYAN`, `BG_BRIGHT_WHITE`

### Textattribute
- `BOLD` - Fett
- `DIM` - Abgedunkelt
- `ITALIC` - Kursiv
- `UNDERLINE` - Unterstrichen
- `BLINK` - Blinkend
- `REVERSE` - Invertiert
- `HIDDEN` - Versteckt
- `STRIKETHROUGH` - Durchgestrichen
- `RESET` - Alle Formatierungen zurücksetzen

## Demo ausführen

```bash
# Kompilieren
javac -d out src/main/java/de/mjohne/consolestyles/*.java

# Demo ausführen
java -cp out de.mjohne.consolestyles.ConsoleStylesDemo
```

## Lizenz

Siehe [LICENSE](LICENSE) Datei für Details.
