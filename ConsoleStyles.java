/**
 * ConsoleStyles is a utility class for consistent styling of console output in Java. It
 * encapsulates ANSI escape sequences and provides predefined style constants to easily
 * and legibly control text color, background color, and text attributes in the console.
 *
 * @author mjohne
 * @version 1.0
 */

public final class ConsoleStyles {
  
    // ANSI escape sequence prefix
    private static final String ESCAPE = "\u001B[";
    
    // ==================== RESET ====================
    /**
     * Resets all formatting
     */
    public static final String RESET = ESCAPE + "0m";
    
    // ==================== TEXT ATTRIBUTES ====================
    /**
     * Bold
     */
    public static final String BOLD = ESCAPE + "1m";
    
    /**
     * Attenuated/Dim
     */
    public static final String DIM = ESCAPE + "2m";
    
    /**
     * Italic
     */
    public static final String ITALIC = ESCAPE + "3m";
    
    /**
     * Underline
     */
    public static final String UNDERLINE = ESCAPE + "4m";
    
    /**
     * Blink
     */
    public static final String BLINK = ESCAPE + "5m";
    
    /**
     * Inverted (foreground and background colors swapped)
     */
    public static final String REVERSE = ESCAPE + "7m";
    
    /**
     * Hidden
     */
    public static final String HIDDEN = ESCAPE + "8m";
    
    /**
     * Strike through
     */
    public static final String STRIKETHROUGH = ESCAPE + "9m";
    
    // ==================== FOREGROUND COLORS (TEXT) ====================
    /**
     * Text color: Black
     */
    public static final String BLACK = ESCAPE + "30m";
    
    /**
     * Text color: Red
     */
    public static final String RED = ESCAPE + "31m";
    
    /**
     * Text color: Green
     */
    public static final String GREEN = ESCAPE + "32m";
    
    /**
     * Text color: Yellow
     */
    public static final String YELLOW = ESCAPE + "33m";
    
    /**
     * Text color: Blue
     */
    public static final String BLUE = ESCAPE + "34m";
    
    /**
     * Text color: Magenta
     */
    public static final String MAGENTA = ESCAPE + "35m";
    
    /**
     * Text color: Cyan
     */
    public static final String CYAN = ESCAPE + "36m";
    
    /**
     * Text color: White
     */
    public static final String WHITE = ESCAPE + "37m";
    
    // ==================== LIGHT FOREGROUND COLORS ====================
    /**
     * Text color: Light Black (Gray)
     */
    public static final String BRIGHT_BLACK = ESCAPE + "90m";
    
    /**
     * Text color: Light Red
     */
    public static final String BRIGHT_RED = ESCAPE + "91m";
    
    /**
     * Text color: Light Green
     */
    public static final String BRIGHT_GREEN = ESCAPE + "92m";
    
    /**
     * Text color: Light Yellow
     */
    public static final String BRIGHT_YELLOW = ESCAPE + "93m";
    
    /**
     * Text color: Light Blue
     */
    public static final String BRIGHT_BLUE = ESCAPE + "94m";
    
    /**
     * Text color: Light Magenta
     */
    public static final String BRIGHT_MAGENTA = ESCAPE + "95m";
    
    /**
     * Text color: Light Cyan
     */
    public static final String BRIGHT_CYAN = ESCAPE + "96m";
    
    /**
     * Text color: Light White
     */
    public static final String BRIGHT_WHITE = ESCAPE + "97m";
    
    // ==================== BACKGROUND COLORS ====================
    /**
     * Background color: Black
     */
    public static final String BG_BLACK = ESCAPE + "40m";
    
    /**
     * Background color: Red
     */
    public static final String BG_RED = ESCAPE + "41m";
    
    /**
     * Background color: Gren
     */
    public static final String BG_GREEN = ESCAPE + "42m";
    
    /**
     * Background color: Yellow
     */
    public static final String BG_YELLOW = ESCAPE + "43m";
    
    /**
     * Background color: Blue
     */
    public static final String BG_BLUE = ESCAPE + "44m";
    
    /**
     * Background color: Magenta
     */
    public static final String BG_MAGENTA = ESCAPE + "45m";
    
    /**
     * Background color: Cyan
     */
    public static final String BG_CYAN = ESCAPE + "46m";
    
    /**
     * Background color: White
     */
    public static final String BG_WHITE = ESCAPE + "47m";
    
    // ==================== LIGHT BACKGROUND COLORS ====================
    /**
     * Background color: Light Black (Gray)
     */
    public static final String BG_BRIGHT_BLACK = ESCAPE + "100m";
    
    /**
     * Background color: Light Red
     */
    public static final String BG_BRIGHT_RED = ESCAPE + "101m";
    
    /**
     * Background color: Light Green
     */
    public static final String BG_BRIGHT_GREEN = ESCAPE + "102m";
    
    /**
     * Background color: Light Yellow
     */
    public static final String BG_BRIGHT_YELLOW = ESCAPE + "103m";
    
    /**
     * Background color: Light Blue
     */
    public static final String BG_BRIGHT_BLUE = ESCAPE + "104m";
    
    /**
     * Background color: Light Magenta
     */
    public static final String BG_BRIGHT_MAGENTA = ESCAPE + "105m";
    
    /**
     * Background color: Light Cyan
     */
    public static final String BG_BRIGHT_CYAN = ESCAPE + "106m";
    
    /**
     * Background color: Light White
     */
    public static final String BG_BRIGHT_WHITE = ESCAPE + "107m";

    private ConsoleStyles() {
        // Prevent instantiation
    }
}
