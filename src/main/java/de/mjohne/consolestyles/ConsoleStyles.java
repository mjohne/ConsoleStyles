package de.mjohne.consolestyles;

/**
 * ConsoleStyles ist eine Utility-Klasse zur konsistenten Gestaltung von 
 * Konsolenausgaben in Java. Sie kapselt ANSI-Escape-Sequenzen und stellt 
 * vordefinierte Stilkonstanten bereit, um Textfarbe, Hintergrundfarbe und 
 * Textattribute in der Konsole einfach und lesbar zu steuern.
 * 
 * @author mjohne
 * @version 1.0
 */
public class ConsoleStyles {
    
    // Reset
    public static final String RESET = "\u001B[0m";
    
    // Textfarben (Foreground Colors)
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    
    // Helle Textfarben (Bright Foreground Colors)
    public static final String BRIGHT_BLACK = "\u001B[90m";
    public static final String BRIGHT_RED = "\u001B[91m";
    public static final String BRIGHT_GREEN = "\u001B[92m";
    public static final String BRIGHT_YELLOW = "\u001B[93m";
    public static final String BRIGHT_BLUE = "\u001B[94m";
    public static final String BRIGHT_MAGENTA = "\u001B[95m";
    public static final String BRIGHT_CYAN = "\u001B[96m";
    public static final String BRIGHT_WHITE = "\u001B[97m";
    
    // Hintergrundfarben (Background Colors)
    public static final String BG_BLACK = "\u001B[40m";
    public static final String BG_RED = "\u001B[41m";
    public static final String BG_GREEN = "\u001B[42m";
    public static final String BG_YELLOW = "\u001B[43m";
    public static final String BG_BLUE = "\u001B[44m";
    public static final String BG_MAGENTA = "\u001B[45m";
    public static final String BG_CYAN = "\u001B[46m";
    public static final String BG_WHITE = "\u001B[47m";
    
    // Helle Hintergrundfarben (Bright Background Colors)
    public static final String BG_BRIGHT_BLACK = "\u001B[100m";
    public static final String BG_BRIGHT_RED = "\u001B[101m";
    public static final String BG_BRIGHT_GREEN = "\u001B[102m";
    public static final String BG_BRIGHT_YELLOW = "\u001B[103m";
    public static final String BG_BRIGHT_BLUE = "\u001B[104m";
    public static final String BG_BRIGHT_MAGENTA = "\u001B[105m";
    public static final String BG_BRIGHT_CYAN = "\u001B[106m";
    public static final String BG_BRIGHT_WHITE = "\u001B[107m";
    
    // Textattribute (Text Attributes)
    public static final String BOLD = "\u001B[1m";
    public static final String DIM = "\u001B[2m";
    public static final String ITALIC = "\u001B[3m";
    public static final String UNDERLINE = "\u001B[4m";
    public static final String BLINK = "\u001B[5m";
    public static final String REVERSE = "\u001B[7m";
    public static final String HIDDEN = "\u001B[8m";
    public static final String STRIKETHROUGH = "\u001B[9m";
    
    /**
     * Privater Konstruktor, um Instanziierung zu verhindern.
     * Diese Klasse ist als reine Utility-Klasse gedacht.
     */
    private ConsoleStyles() {
        throw new AssertionError("ConsoleStyles ist eine Utility-Klasse und darf nicht instanziiert werden.");
    }
    
    /**
     * Formatiert einen Text mit den angegebenen Stilkonstanten.
     * 
     * @param text Der zu formatierende Text
     * @param styles Die anzuwendenden Stilkonstanten
     * @return Der formatierte Text mit ANSI-Escape-Sequenzen
     */
    public static String format(String text, String... styles) {
        StringBuilder sb = new StringBuilder();
        for (String style : styles) {
            sb.append(style);
        }
        sb.append(text);
        sb.append(RESET);
        return sb.toString();
    }
    
    /**
     * Gibt einen formatierten Text in der Konsole aus.
     * 
     * @param text Der auszugebende Text
     * @param styles Die anzuwendenden Stilkonstanten
     */
    public static void println(String text, String... styles) {
        System.out.println(format(text, styles));
    }
    
    /**
     * Gibt einen formatierten Text in der Konsole aus (ohne Zeilenumbruch).
     * 
     * @param text Der auszugebende Text
     * @param styles Die anzuwendenden Stilkonstanten
     */
    public static void print(String text, String... styles) {
        System.out.print(format(text, styles));
    }
}
