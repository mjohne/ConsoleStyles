package de.mjohne.consolestyles;

/**
 * Demo-Klasse zur Veranschaulichung der ConsoleStyles Funktionalität.
 * Zeigt verschiedene Textfarben, Hintergrundfarben und Textattribute.
 * 
 * @author mjohne
 * @version 1.0
 */
public class ConsoleStylesDemo {
    
    public static void main(String[] args) {
        System.out.println("=== ConsoleStyles Demo ===\n");
        
        // Textfarben demonstrieren
        System.out.println("--- Textfarben ---");
        ConsoleStyles.println("Schwarzer Text", ConsoleStyles.BLACK);
        ConsoleStyles.println("Roter Text", ConsoleStyles.RED);
        ConsoleStyles.println("Grüner Text", ConsoleStyles.GREEN);
        ConsoleStyles.println("Gelber Text", ConsoleStyles.YELLOW);
        ConsoleStyles.println("Blauer Text", ConsoleStyles.BLUE);
        ConsoleStyles.println("Magenta Text", ConsoleStyles.MAGENTA);
        ConsoleStyles.println("Cyan Text", ConsoleStyles.CYAN);
        ConsoleStyles.println("Weißer Text", ConsoleStyles.WHITE);
        
        System.out.println("\n--- Helle Textfarben ---");
        ConsoleStyles.println("Helles Schwarz (Grau)", ConsoleStyles.BRIGHT_BLACK);
        ConsoleStyles.println("Helles Rot", ConsoleStyles.BRIGHT_RED);
        ConsoleStyles.println("Helles Grün", ConsoleStyles.BRIGHT_GREEN);
        ConsoleStyles.println("Helles Gelb", ConsoleStyles.BRIGHT_YELLOW);
        ConsoleStyles.println("Helles Blau", ConsoleStyles.BRIGHT_BLUE);
        ConsoleStyles.println("Helles Magenta", ConsoleStyles.BRIGHT_MAGENTA);
        ConsoleStyles.println("Helles Cyan", ConsoleStyles.BRIGHT_CYAN);
        ConsoleStyles.println("Helles Weiß", ConsoleStyles.BRIGHT_WHITE);
        
        // Hintergrundfarben demonstrieren
        System.out.println("\n--- Hintergrundfarben ---");
        ConsoleStyles.println("Schwarzer Hintergrund", ConsoleStyles.BG_BLACK, ConsoleStyles.WHITE);
        ConsoleStyles.println("Roter Hintergrund", ConsoleStyles.BG_RED, ConsoleStyles.WHITE);
        ConsoleStyles.println("Grüner Hintergrund", ConsoleStyles.BG_GREEN, ConsoleStyles.BLACK);
        ConsoleStyles.println("Gelber Hintergrund", ConsoleStyles.BG_YELLOW, ConsoleStyles.BLACK);
        ConsoleStyles.println("Blauer Hintergrund", ConsoleStyles.BG_BLUE, ConsoleStyles.WHITE);
        ConsoleStyles.println("Magenta Hintergrund", ConsoleStyles.BG_MAGENTA, ConsoleStyles.WHITE);
        ConsoleStyles.println("Cyan Hintergrund", ConsoleStyles.BG_CYAN, ConsoleStyles.BLACK);
        ConsoleStyles.println("Weißer Hintergrund", ConsoleStyles.BG_WHITE, ConsoleStyles.BLACK);
        
        // Textattribute demonstrieren
        System.out.println("\n--- Textattribute ---");
        ConsoleStyles.println("Fetter Text", ConsoleStyles.BOLD);
        ConsoleStyles.println("Dunkler Text", ConsoleStyles.DIM);
        ConsoleStyles.println("Kursiver Text", ConsoleStyles.ITALIC);
        ConsoleStyles.println("Unterstrichener Text", ConsoleStyles.UNDERLINE);
        ConsoleStyles.println("Blinkender Text", ConsoleStyles.BLINK);
        ConsoleStyles.println("Invertierter Text", ConsoleStyles.REVERSE);
        ConsoleStyles.println("Durchgestrichener Text", ConsoleStyles.STRIKETHROUGH);
        
        // Kombinationen demonstrieren
        System.out.println("\n--- Kombinationen ---");
        ConsoleStyles.println("Fetter roter Text", ConsoleStyles.BOLD, ConsoleStyles.RED);
        ConsoleStyles.println("Unterstrichener grüner Text", ConsoleStyles.UNDERLINE, ConsoleStyles.GREEN);
        ConsoleStyles.println("Fetter, unterstrichener blauer Text", ConsoleStyles.BOLD, ConsoleStyles.UNDERLINE, ConsoleStyles.BLUE);
        ConsoleStyles.println("Gelber Text auf blauem Hintergrund", ConsoleStyles.YELLOW, ConsoleStyles.BG_BLUE);
        ConsoleStyles.println("Fetter weißer Text auf rotem Hintergrund", ConsoleStyles.BOLD, ConsoleStyles.WHITE, ConsoleStyles.BG_RED);
        
        // format() Methode demonstrieren
        System.out.println("\n--- format() Methode ---");
        String formattedText = ConsoleStyles.format("Dieser Text ist formatiert", ConsoleStyles.BOLD, ConsoleStyles.CYAN);
        System.out.println("Normal: " + formattedText + " und zurück zu normal.");
        
        // print() Methode demonstrieren
        System.out.println("\n--- print() Methode (ohne Zeilenumbruch) ---");
        ConsoleStyles.print("Rot", ConsoleStyles.RED);
        System.out.print(", ");
        ConsoleStyles.print("Grün", ConsoleStyles.GREEN);
        System.out.print(", ");
        ConsoleStyles.print("Blau", ConsoleStyles.BLUE);
        System.out.println();
        
        System.out.println("\n=== Demo abgeschlossen ===");
    }
}
