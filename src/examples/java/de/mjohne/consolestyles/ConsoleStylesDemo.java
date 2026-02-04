package de.mjohne.consolestyles;

/**
 * Demonstrationsklasse für die Verwendung von ConsoleStyles.
 * Diese Klasse zeigt verschiedene Anwendungsbeispiele für die Formatierung von Konsolenausgaben.
 */
public class ConsoleStylesDemo {
    
    public static void main(String[] args) {
        System.out.println("=== ConsoleStyles Demo ===\n");
        
        // Prüfen, ob ANSI unterstützt wird
        System.out.println("ANSI-Unterstützung: " + ConsoleStyles.isAnsiSupported() + "\n");
        
        // Textfarben demonstrieren
        System.out.println("--- Textfarben ---");
        System.out.println(ConsoleStyles.BLACK + "Schwarzer Text" + ConsoleStyles.RESET);
        System.out.println(ConsoleStyles.RED + "Roter Text" + ConsoleStyles.RESET);
        System.out.println(ConsoleStyles.GREEN + "Grüner Text" + ConsoleStyles.RESET);
        System.out.println(ConsoleStyles.YELLOW + "Gelber Text" + ConsoleStyles.RESET);
        System.out.println(ConsoleStyles.BLUE + "Blauer Text" + ConsoleStyles.RESET);
        System.out.println(ConsoleStyles.MAGENTA + "Magenta Text" + ConsoleStyles.RESET);
        System.out.println(ConsoleStyles.CYAN + "Cyan Text" + ConsoleStyles.RESET);
        System.out.println(ConsoleStyles.WHITE + "Weißer Text" + ConsoleStyles.RESET);
        System.out.println();
        
        // Helle Textfarben
        System.out.println("--- Helle Textfarben ---");
        System.out.println(ConsoleStyles.BRIGHT_BLACK + "Helles Schwarz (Grau)" + ConsoleStyles.RESET);
        System.out.println(ConsoleStyles.BRIGHT_RED + "Helles Rot" + ConsoleStyles.RESET);
        System.out.println(ConsoleStyles.BRIGHT_GREEN + "Helles Grün" + ConsoleStyles.RESET);
        System.out.println(ConsoleStyles.BRIGHT_YELLOW + "Helles Gelb" + ConsoleStyles.RESET);
        System.out.println(ConsoleStyles.BRIGHT_BLUE + "Helles Blau" + ConsoleStyles.RESET);
        System.out.println(ConsoleStyles.BRIGHT_MAGENTA + "Helles Magenta" + ConsoleStyles.RESET);
        System.out.println(ConsoleStyles.BRIGHT_CYAN + "Helles Cyan" + ConsoleStyles.RESET);
        System.out.println(ConsoleStyles.BRIGHT_WHITE + "Helles Weiß" + ConsoleStyles.RESET);
        System.out.println();
        
        // Textattribute
        System.out.println("--- Textattribute ---");
        System.out.println(ConsoleStyles.BOLD + "Fettdruck" + ConsoleStyles.RESET);
        System.out.println(ConsoleStyles.DIM + "Abgeschwächt" + ConsoleStyles.RESET);
        System.out.println(ConsoleStyles.ITALIC + "Kursiv" + ConsoleStyles.RESET);
        System.out.println(ConsoleStyles.UNDERLINE + "Unterstrichen" + ConsoleStyles.RESET);
        System.out.println(ConsoleStyles.BLINK + "Blinkend" + ConsoleStyles.RESET);
        System.out.println(ConsoleStyles.REVERSE + "Invertiert" + ConsoleStyles.RESET);
        System.out.println(ConsoleStyles.STRIKETHROUGH + "Durchgestrichen" + ConsoleStyles.RESET);
        System.out.println();
        
        // Hintergrundfarben
        System.out.println("--- Hintergrundfarben ---");
        System.out.println(ConsoleStyles.BG_BLACK + ConsoleStyles.WHITE + "Schwarzer Hintergrund" + ConsoleStyles.RESET);
        System.out.println(ConsoleStyles.BG_RED + ConsoleStyles.WHITE + "Roter Hintergrund" + ConsoleStyles.RESET);
        System.out.println(ConsoleStyles.BG_GREEN + ConsoleStyles.BLACK + "Grüner Hintergrund" + ConsoleStyles.RESET);
        System.out.println(ConsoleStyles.BG_YELLOW + ConsoleStyles.BLACK + "Gelber Hintergrund" + ConsoleStyles.RESET);
        System.out.println(ConsoleStyles.BG_BLUE + ConsoleStyles.WHITE + "Blauer Hintergrund" + ConsoleStyles.RESET);
        System.out.println(ConsoleStyles.BG_MAGENTA + ConsoleStyles.WHITE + "Magenta Hintergrund" + ConsoleStyles.RESET);
        System.out.println(ConsoleStyles.BG_CYAN + ConsoleStyles.BLACK + "Cyan Hintergrund" + ConsoleStyles.RESET);
        System.out.println(ConsoleStyles.BG_WHITE + ConsoleStyles.BLACK + "Weißer Hintergrund" + ConsoleStyles.RESET);
        System.out.println();
        
        // Kombinationen
        System.out.println("--- Kombinationen ---");
        System.out.println(ConsoleStyles.BOLD + ConsoleStyles.RED + "Fett und Rot" + ConsoleStyles.RESET);
        System.out.println(ConsoleStyles.UNDERLINE + ConsoleStyles.BLUE + "Unterstrichen und Blau" + ConsoleStyles.RESET);
        System.out.println(ConsoleStyles.BG_YELLOW + ConsoleStyles.BLACK + ConsoleStyles.BOLD + "Gelber Hintergrund, schwarzer fetter Text" + ConsoleStyles.RESET);
        System.out.println(ConsoleStyles.ITALIC + ConsoleStyles.BRIGHT_MAGENTA + "Kursiv und helles Magenta" + ConsoleStyles.RESET);
        System.out.println();
        
        // Verwendung der format-Methode
        System.out.println("--- Verwendung der format-Methode ---");
        System.out.println(ConsoleStyles.format("Erfolg!", ConsoleStyles.GREEN, ConsoleStyles.BOLD));
        System.out.println(ConsoleStyles.format("Warnung!", ConsoleStyles.YELLOW, ConsoleStyles.BOLD));
        System.out.println(ConsoleStyles.format("Fehler!", ConsoleStyles.RED, ConsoleStyles.BOLD));
        System.out.println(ConsoleStyles.format("Info", ConsoleStyles.BG_BLUE, ConsoleStyles.WHITE));
        System.out.println();
        
        // ANSI-Codes entfernen
        System.out.println("--- ANSI-Codes entfernen ---");
        String styledText = ConsoleStyles.RED + "Roter Text" + ConsoleStyles.RESET;
        System.out.println("Mit ANSI: " + styledText);
        System.out.println("Ohne ANSI: " + ConsoleStyles.stripAnsi(styledText));
        System.out.println();
        
        // Praktische Anwendungsbeispiele
        System.out.println("--- Praktische Beispiele ---");
        printSuccess("Operation erfolgreich abgeschlossen!");
        printWarning("Achtung: Dieser Vorgang kann nicht rückgängig gemacht werden.");
        printError("Fehler: Datei nicht gefunden.");
        printInfo("Hinweis: Die Verarbeitung kann einige Minuten dauern.");
    }
    
    private static void printSuccess(String message) {
        System.out.println(ConsoleStyles.format("✓ " + message, ConsoleStyles.GREEN, ConsoleStyles.BOLD));
    }
    
    private static void printWarning(String message) {
        System.out.println(ConsoleStyles.format("⚠ " + message, ConsoleStyles.YELLOW, ConsoleStyles.BOLD));
    }
    
    private static void printError(String message) {
        System.out.println(ConsoleStyles.format("✗ " + message, ConsoleStyles.RED, ConsoleStyles.BOLD));
    }
    
    private static void printInfo(String message) {
        System.out.println(ConsoleStyles.format("ℹ " + message, ConsoleStyles.CYAN));
    }
}
