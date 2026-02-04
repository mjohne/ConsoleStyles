package de.mjohne.consolestyles;

/**
 * Einfache Tests für die ConsoleStyles-Klasse.
 * Diese Klasse führt grundlegende Überprüfungen durch, um sicherzustellen,
 * dass die ConsoleStyles-Funktionalität wie erwartet funktioniert.
 */
public class ConsoleStylesTest {
    
    private static int testsPassed = 0;
    private static int testsFailed = 0;
    
    public static void main(String[] args) {
        System.out.println("=== ConsoleStyles Tests ===\n");
        
        testAnsiCodes();
        testFormatMethod();
        testStripAnsiMethod();
        testConstants();
        
        System.out.println("\n=== Testergebnisse ===");
        System.out.println(ConsoleStyles.GREEN + "Bestanden: " + testsPassed + ConsoleStyles.RESET);
        System.out.println(ConsoleStyles.RED + "Fehlgeschlagen: " + testsFailed + ConsoleStyles.RESET);
        
        if (testsFailed == 0) {
            System.out.println(ConsoleStyles.BOLD + ConsoleStyles.GREEN + "\nAlle Tests bestanden! ✓" + ConsoleStyles.RESET);
        } else {
            System.out.println(ConsoleStyles.BOLD + ConsoleStyles.RED + "\nEinige Tests fehlgeschlagen! ✗" + ConsoleStyles.RESET);
            System.exit(1);
        }
    }
    
    private static void testAnsiCodes() {
        System.out.println("Test: ANSI-Codes sind korrekt formatiert");
        
        assertTrue("RED sollte mit \\u001B[ beginnen", ConsoleStyles.RED.startsWith("\u001B["));
        assertTrue("RESET sollte \\u001B[0m sein", ConsoleStyles.RESET.equals("\u001B[0m"));
        assertTrue("BOLD sollte \\u001B[1m sein", ConsoleStyles.BOLD.equals("\u001B[1m"));
        assertTrue("BG_BLUE sollte \\u001B[44m sein", ConsoleStyles.BG_BLUE.equals("\u001B[44m"));
    }
    
    private static void testFormatMethod() {
        System.out.println("\nTest: format-Methode");
        
        String result = ConsoleStyles.format("Test", ConsoleStyles.RED);
        assertTrue("Format sollte Text enthalten", result.contains("Test"));
        assertTrue("Format sollte RED-Code enthalten", result.contains(ConsoleStyles.RED));
        assertTrue("Format sollte mit RESET enden", result.endsWith(ConsoleStyles.RESET));
        
        String multiStyle = ConsoleStyles.format("Test", ConsoleStyles.RED, ConsoleStyles.BOLD);
        assertTrue("Multi-Style sollte beide Codes enthalten", 
                   multiStyle.contains(ConsoleStyles.RED) && multiStyle.contains(ConsoleStyles.BOLD));
    }
    
    private static void testStripAnsiMethod() {
        System.out.println("\nTest: stripAnsi-Methode");
        
        String withAnsi = ConsoleStyles.RED + "Test" + ConsoleStyles.RESET;
        String stripped = ConsoleStyles.stripAnsi(withAnsi);
        
        assertTrue("stripAnsi sollte reinen Text zurückgeben", stripped.equals("Test"));
        assertTrue("stripAnsi sollte keine ANSI-Codes enthalten", !stripped.contains("\u001B["));
        
        String plain = "PlainText";
        assertTrue("stripAnsi sollte reinen Text unverändert lassen", 
                   ConsoleStyles.stripAnsi(plain).equals(plain));
        
        assertTrue("stripAnsi mit null sollte null zurückgeben", 
                   ConsoleStyles.stripAnsi(null) == null);
    }
    
    private static void testConstants() {
        System.out.println("\nTest: Konstanten existieren und sind nicht leer");
        
        // Textfarben
        assertNotEmpty("RED", ConsoleStyles.RED);
        assertNotEmpty("GREEN", ConsoleStyles.GREEN);
        assertNotEmpty("BLUE", ConsoleStyles.BLUE);
        assertNotEmpty("YELLOW", ConsoleStyles.YELLOW);
        
        // Helle Farben
        assertNotEmpty("BRIGHT_RED", ConsoleStyles.BRIGHT_RED);
        assertNotEmpty("BRIGHT_GREEN", ConsoleStyles.BRIGHT_GREEN);
        
        // Hintergrundfarben
        assertNotEmpty("BG_RED", ConsoleStyles.BG_RED);
        assertNotEmpty("BG_GREEN", ConsoleStyles.BG_GREEN);
        
        // Attribute
        assertNotEmpty("BOLD", ConsoleStyles.BOLD);
        assertNotEmpty("ITALIC", ConsoleStyles.ITALIC);
        assertNotEmpty("UNDERLINE", ConsoleStyles.UNDERLINE);
        assertNotEmpty("RESET", ConsoleStyles.RESET);
    }
    
    private static void assertTrue(String message, boolean condition) {
        if (condition) {
            testsPassed++;
            System.out.println("  ✓ " + message);
        } else {
            testsFailed++;
            System.out.println("  ✗ " + message);
        }
    }
    
    private static void assertNotEmpty(String name, String value) {
        assertTrue(name + " sollte nicht leer sein", value != null && !value.isEmpty());
    }
}
