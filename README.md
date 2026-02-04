# ConsoleStyles

ConsoleStyles ist eine Utility-Klasse zur konsistenten Gestaltung von Konsolenausgaben in Java. Sie kapselt ANSI-Escape-Sequenzen und stellt vordefinierte Stilkonstanten bereit, um Textfarbe, Hintergrundfarbe und Textattribute in der Konsole einfach und lesbar zu steuern.

## Features

- 🎨 **Textfarben**: 8 Standardfarben + 8 helle Varianten
- 🖌️ **Hintergrundfarben**: 8 Standardfarben + 8 helle Varianten
- ✨ **Textattribute**: Fett, Kursiv, Unterstrichen, Durchgestrichen, Blinken, etc.
- 🔧 **Hilfsmethoden**: Formatierung mit automatischem Reset, ANSI-Support-Erkennung
- 📦 **Keine Abhängigkeiten**: Reine Java-Implementierung ohne externe Bibliotheken

## Schnellstart

### Grundlegende Verwendung

```java
import de.mjohne.consolestyles.ConsoleStyles;

public class Example {
    public static void main(String[] args) {
        // Einfache Textfarbe
        System.out.println(ConsoleStyles.RED + "Fehler!" + ConsoleStyles.RESET);
        
        // Kombinierte Stile
        System.out.println(ConsoleStyles.BOLD + ConsoleStyles.GREEN + "Erfolg!" + ConsoleStyles.RESET);
        
        // Hintergrundfarbe
        System.out.println(ConsoleStyles.BG_BLUE + ConsoleStyles.WHITE + "Info" + ConsoleStyles.RESET);
    }
}
```

### Verwendung der format-Methode

```java
// Mit automatischem Reset
System.out.println(ConsoleStyles.format("Erfolg!", ConsoleStyles.GREEN, ConsoleStyles.BOLD));
System.out.println(ConsoleStyles.format("Warnung!", ConsoleStyles.YELLOW, ConsoleStyles.BOLD));
System.out.println(ConsoleStyles.format("Fehler!", ConsoleStyles.RED, ConsoleStyles.BOLD));
```

## Verfügbare Konstanten

### Textfarben
- `BLACK`, `RED`, `GREEN`, `YELLOW`, `BLUE`, `MAGENTA`, `CYAN`, `WHITE`
- `BRIGHT_BLACK`, `BRIGHT_RED`, `BRIGHT_GREEN`, `BRIGHT_YELLOW`, `BRIGHT_BLUE`, `BRIGHT_MAGENTA`, `BRIGHT_CYAN`, `BRIGHT_WHITE`

### Hintergrundfarben
- `BG_BLACK`, `BG_RED`, `BG_GREEN`, `BG_YELLOW`, `BG_BLUE`, `BG_MAGENTA`, `BG_CYAN`, `BG_WHITE`
- `BG_BRIGHT_BLACK`, `BG_BRIGHT_RED`, `BG_BRIGHT_GREEN`, `BG_BRIGHT_YELLOW`, `BG_BRIGHT_BLUE`, `BG_BRIGHT_MAGENTA`, `BG_BRIGHT_CYAN`, `BG_BRIGHT_WHITE`

### Textattribute
- `BOLD` - Fettdruck
- `DIM` - Abgeschwächt
- `ITALIC` - Kursiv
- `UNDERLINE` - Unterstrichen
- `BLINK` - Blinkend
- `REVERSE` - Invertiert (Vordergrund/Hintergrund getauscht)
- `HIDDEN` - Verborgen
- `STRIKETHROUGH` - Durchgestrichen
- `RESET` - Alle Formatierungen zurücksetzen

## Hilfsmethoden

### format(String text, String... styles)
Formatiert einen Text mit den angegebenen Stilen und setzt die Formatierung automatisch zurück.

```java
String formatted = ConsoleStyles.format("Text", ConsoleStyles.RED, ConsoleStyles.BOLD);
System.out.println(formatted);
```

### isAnsiSupported()
Prüft, ob ANSI-Escape-Sequenzen in der aktuellen Konsole unterstützt werden.

```java
if (ConsoleStyles.isAnsiSupported()) {
    System.out.println(ConsoleStyles.GREEN + "ANSI wird unterstützt!" + ConsoleStyles.RESET);
}
```

### stripAnsi(String text)
Entfernt alle ANSI-Escape-Sequenzen aus einem Text.

```java
String plain = ConsoleStyles.stripAnsi(ConsoleStyles.RED + "Text" + ConsoleStyles.RESET);
// Ergebnis: "Text"
```

## Kompilierung und Ausführung

### Kompilieren der Hauptklasse
```bash
javac -d out src/main/java/de/mjohne/consolestyles/ConsoleStyles.java
```

### Kompilieren und Ausführen der Demo
```bash
javac -cp out -d out src/examples/java/de/mjohne/consolestyles/ConsoleStylesDemo.java
java -cp out de.mjohne.consolestyles.ConsoleStylesDemo
```

## Praktische Beispiele

### Logger-ähnliche Ausgaben

```java
public class Logger {
    public static void success(String message) {
        System.out.println(ConsoleStyles.format("✓ " + message, ConsoleStyles.GREEN, ConsoleStyles.BOLD));
    }
    
    public static void warning(String message) {
        System.out.println(ConsoleStyles.format("⚠ " + message, ConsoleStyles.YELLOW, ConsoleStyles.BOLD));
    }
    
    public static void error(String message) {
        System.out.println(ConsoleStyles.format("✗ " + message, ConsoleStyles.RED, ConsoleStyles.BOLD));
    }
    
    public static void info(String message) {
        System.out.println(ConsoleStyles.format("ℹ " + message, ConsoleStyles.CYAN));
    }
}
```

### Tabellarische Ausgabe

```java
System.out.println(ConsoleStyles.BOLD + ConsoleStyles.UNDERLINE + "Name          | Status    | Wert" + ConsoleStyles.RESET);
System.out.println("Server 1      | " + ConsoleStyles.GREEN + "Online" + ConsoleStyles.RESET + "    | 42");
System.out.println("Server 2      | " + ConsoleStyles.RED + "Offline" + ConsoleStyles.RESET + "   | 0");
System.out.println("Server 3      | " + ConsoleStyles.YELLOW + "Warnung" + ConsoleStyles.RESET + "  | 23");
```

## Systemkompatibilität

- **Windows 10+**: Volle ANSI-Unterstützung in der Konsole
- **Linux/Unix**: Volle ANSI-Unterstützung in den meisten Terminals
- **macOS**: Volle ANSI-Unterstützung in Terminal.app und iTerm2

## Lizenz

Dieses Projekt ist unter der MIT-Lizenz lizenziert. Siehe die [LICENSE](LICENSE) Datei für Details.

## Autor

mjohne
