package de.mjohne.consolestyles;

/**
 * Einfacher Test zur Verifikation der ConsoleStyles Funktionalität.
 */
public class ConsoleStylesTest {
    
    public static void main(String[] args) {
        boolean allTestsPassed = true;
        
        // Test 1: RESET konstante ist vorhanden
        if (!ConsoleStyles.RESET.equals("\u001B[0m")) {
            System.err.println("FEHLER: RESET konstante ist nicht korrekt");
            allTestsPassed = false;
        }
        
        // Test 2: Textfarben sind vorhanden
        if (!ConsoleStyles.RED.equals("\u001B[31m")) {
            System.err.println("FEHLER: RED konstante ist nicht korrekt");
            allTestsPassed = false;
        }
        
        // Test 3: Hintergrundfarben sind vorhanden
        if (!ConsoleStyles.BG_BLUE.equals("\u001B[44m")) {
            System.err.println("FEHLER: BG_BLUE konstante ist nicht korrekt");
            allTestsPassed = false;
        }
        
        // Test 4: Textattribute sind vorhanden
        if (!ConsoleStyles.BOLD.equals("\u001B[1m")) {
            System.err.println("FEHLER: BOLD konstante ist nicht korrekt");
            allTestsPassed = false;
        }
        
        // Test 5: format() Methode funktioniert
        String formatted = ConsoleStyles.format("Test", ConsoleStyles.RED);
        if (!formatted.equals("\u001B[31mTest\u001B[0m")) {
            System.err.println("FEHLER: format() Methode funktioniert nicht korrekt");
            allTestsPassed = false;
        }
        
        // Test 6: format() mit mehreren Stilen
        String multiStyled = ConsoleStyles.format("Test", ConsoleStyles.BOLD, ConsoleStyles.RED);
        if (!multiStyled.equals("\u001B[1m\u001B[31mTest\u001B[0m")) {
            System.err.println("FEHLER: format() mit mehreren Stilen funktioniert nicht korrekt");
            allTestsPassed = false;
        }
        
        // Test 7: ConsoleStyles kann nicht instanziiert werden
        try {
            // Dieser Code sollte nicht funktionieren
            java.lang.reflect.Constructor<?> constructor = ConsoleStyles.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            constructor.newInstance();
            System.err.println("FEHLER: ConsoleStyles konnte instanziiert werden");
            allTestsPassed = false;
        } catch (Exception e) {
            if (!(e.getCause() instanceof AssertionError)) {
                System.err.println("FEHLER: Falscher Exception-Typ beim Instanziierungsversuch");
                allTestsPassed = false;
            }
        }
        
        if (allTestsPassed) {
            ConsoleStyles.println("✓ Alle Tests erfolgreich bestanden!", ConsoleStyles.BOLD, ConsoleStyles.GREEN);
            System.exit(0);
        } else {
            ConsoleStyles.println("✗ Einige Tests sind fehlgeschlagen!", ConsoleStyles.BOLD, ConsoleStyles.RED);
            System.exit(1);
        }
    }
}
