package de.mjohne.consolestyles;

/**
 * ConsoleStyles ist eine Utility-Klasse zur konsistenten Gestaltung von Konsolenausgaben in Java.
 * Sie kapselt ANSI-Escape-Sequenzen und stellt vordefinierte Stilkonstanten bereit, um Textfarbe,
 * Hintergrundfarbe und Textattribute in der Konsole einfach und lesbar zu steuern.
 * 
 * <p>Beispiel-Verwendung:</p>
 * <pre>
 * System.out.println(ConsoleStyles.RED + "Fehler!" + ConsoleStyles.RESET);
 * System.out.println(ConsoleStyles.BOLD + ConsoleStyles.GREEN + "Erfolg!" + ConsoleStyles.RESET);
 * System.out.println(ConsoleStyles.BG_BLUE + ConsoleStyles.WHITE + "Info" + ConsoleStyles.RESET);
 * </pre>
 * 
 * @author mjohne
 * @version 1.0
 */
public class ConsoleStyles {
    
    // ANSI-Escape-Sequenz-Präfix
    private static final String ESCAPE = "\u001B[";
    
    // ==================== RESET ====================
    /**
     * Setzt alle Formatierungen zurück
     */
    public static final String RESET = ESCAPE + "0m";
    
    // ==================== TEXTATTRIBUTE ====================
    /**
     * Fettdruck
     */
    public static final String BOLD = ESCAPE + "1m";
    
    /**
     * Abgeschwächt/Dim
     */
    public static final String DIM = ESCAPE + "2m";
    
    /**
     * Kursiv
     */
    public static final String ITALIC = ESCAPE + "3m";
    
    /**
     * Unterstrichen
     */
    public static final String UNDERLINE = ESCAPE + "4m";
    
    /**
     * Blinkend
     */
    public static final String BLINK = ESCAPE + "5m";
    
    /**
     * Invertiert (Vordergrund- und Hintergrundfarben getauscht)
     */
    public static final String REVERSE = ESCAPE + "7m";
    
    /**
     * Verborgen
     */
    public static final String HIDDEN = ESCAPE + "8m";
    
    /**
     * Durchgestrichen
     */
    public static final String STRIKETHROUGH = ESCAPE + "9m";
    
    // ==================== VORDERGRUNDFARBEN (TEXT) ====================
    /**
     * Textfarbe: Schwarz
     */
    public static final String BLACK = ESCAPE + "30m";
    
    /**
     * Textfarbe: Rot
     */
    public static final String RED = ESCAPE + "31m";
    
    /**
     * Textfarbe: Grün
     */
    public static final String GREEN = ESCAPE + "32m";
    
    /**
     * Textfarbe: Gelb
     */
    public static final String YELLOW = ESCAPE + "33m";
    
    /**
     * Textfarbe: Blau
     */
    public static final String BLUE = ESCAPE + "34m";
    
    /**
     * Textfarbe: Magenta
     */
    public static final String MAGENTA = ESCAPE + "35m";
    
    /**
     * Textfarbe: Cyan
     */
    public static final String CYAN = ESCAPE + "36m";
    
    /**
     * Textfarbe: Weiß
     */
    public static final String WHITE = ESCAPE + "37m";
    
    // ==================== HELLE VORDERGRUNDFARBEN ====================
    /**
     * Textfarbe: Helles Schwarz (Grau)
     */
    public static final String BRIGHT_BLACK = ESCAPE + "90m";
    
    /**
     * Textfarbe: Helles Rot
     */
    public static final String BRIGHT_RED = ESCAPE + "91m";
    
    /**
     * Textfarbe: Helles Grün
     */
    public static final String BRIGHT_GREEN = ESCAPE + "92m";
    
    /**
     * Textfarbe: Helles Gelb
     */
    public static final String BRIGHT_YELLOW = ESCAPE + "93m";
    
    /**
     * Textfarbe: Helles Blau
     */
    public static final String BRIGHT_BLUE = ESCAPE + "94m";
    
    /**
     * Textfarbe: Helles Magenta
     */
    public static final String BRIGHT_MAGENTA = ESCAPE + "95m";
    
    /**
     * Textfarbe: Helles Cyan
     */
    public static final String BRIGHT_CYAN = ESCAPE + "96m";
    
    /**
     * Textfarbe: Helles Weiß
     */
    public static final String BRIGHT_WHITE = ESCAPE + "97m";
    
    // ==================== HINTERGRUNDFARBEN ====================
    /**
     * Hintergrundfarbe: Schwarz
     */
    public static final String BG_BLACK = ESCAPE + "40m";
    
    /**
     * Hintergrundfarbe: Rot
     */
    public static final String BG_RED = ESCAPE + "41m";
    
    /**
     * Hintergrundfarbe: Grün
     */
    public static final String BG_GREEN = ESCAPE + "42m";
    
    /**
     * Hintergrundfarbe: Gelb
     */
    public static final String BG_YELLOW = ESCAPE + "43m";
    
    /**
     * Hintergrundfarbe: Blau
     */
    public static final String BG_BLUE = ESCAPE + "44m";
    
    /**
     * Hintergrundfarbe: Magenta
     */
    public static final String BG_MAGENTA = ESCAPE + "45m";
    
    /**
     * Hintergrundfarbe: Cyan
     */
    public static final String BG_CYAN = ESCAPE + "46m";
    
    /**
     * Hintergrundfarbe: Weiß
     */
    public static final String BG_WHITE = ESCAPE + "47m";
    
    // ==================== HELLE HINTERGRUNDFARBEN ====================
    /**
     * Hintergrundfarbe: Helles Schwarz (Grau)
     */
    public static final String BG_BRIGHT_BLACK = ESCAPE + "100m";
    
    /**
     * Hintergrundfarbe: Helles Rot
     */
    public static final String BG_BRIGHT_RED = ESCAPE + "101m";
    
    /**
     * Hintergrundfarbe: Helles Grün
     */
    public static final String BG_BRIGHT_GREEN = ESCAPE + "102m";
    
    /**
     * Hintergrundfarbe: Helles Gelb
     */
    public static final String BG_BRIGHT_YELLOW = ESCAPE + "103m";
    
    /**
     * Hintergrundfarbe: Helles Blau
     */
    public static final String BG_BRIGHT_BLUE = ESCAPE + "104m";
    
    /**
     * Hintergrundfarbe: Helles Magenta
     */
    public static final String BG_BRIGHT_MAGENTA = ESCAPE + "105m";
    
    /**
     * Hintergrundfarbe: Helles Cyan
     */
    public static final String BG_BRIGHT_CYAN = ESCAPE + "106m";
    
    /**
     * Hintergrundfarbe: Helles Weiß
     */
    public static final String BG_BRIGHT_WHITE = ESCAPE + "107m";
    
    // ==================== HILFSMETHODEN ====================
    /**
     * Formatiert einen Text mit den angegebenen Stilen und setzt die Formatierung danach automatisch zurück.
     * 
     * @param text Der zu formatierende Text
     * @param styles Die anzuwendenden Stile (z.B. BOLD, RED, BG_BLUE)
     * @return Der formatierte Text mit automatischem Reset
     */
    public static String format(String text, String... styles) {
        StringBuilder result = new StringBuilder();
        for (String style : styles) {
            result.append(style);
        }
        result.append(text);
        result.append(RESET);
        return result.toString();
    }
    
    /**
     * Gibt an, ob ANSI-Farbcodes in der aktuellen Konsole unterstützt werden.
     * 
     * @return true, wenn ANSI-Codes unterstützt werden, sonst false
     */
    public static boolean isAnsiSupported() {
        // Prüft, ob die Konsole ANSI unterstützt
        String os = System.getProperty("os.name").toLowerCase();
        String term = System.getenv("TERM");
        
        // Windows 10+ unterstützt ANSI in der Konsole
        if (os.contains("win")) {
            String osVersion = System.getProperty("os.version");
            try {
                double version = Double.parseDouble(osVersion);
                return version >= 10.0;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        
        // Unix-basierte Systeme unterstützen ANSI in der Regel
        return term != null && !term.equals("dumb");
    }
    
    /**
     * Entfernt alle ANSI-Escape-Sequenzen aus einem Text.
     * 
     * @param text Der Text mit ANSI-Codes
     * @return Der Text ohne ANSI-Codes
     */
    public static String stripAnsi(String text) {
        if (text == null) {
            return null;
        }
        return text.replaceAll("\u001B\\[[0-9;]*m", "");
    }
    
    // Privater Konstruktor, um Instanziierung zu verhindern
    private ConsoleStyles() {
        throw new AssertionError("ConsoleStyles ist eine Utility-Klasse und kann nicht instanziiert werden.");
    }
}
