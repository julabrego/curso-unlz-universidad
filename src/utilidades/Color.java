package utilidades;

public enum Color { 
    //Color end string, color reset
    RESET("\033[0m"), // Regular Colors. Normal color, no bold, background color etc.

    // Regular
    RED("\033[0;31m"), // RED
    GREEN("\033[0;32m"), // GREEN
    YELLOW("\033[0;33m"), // YELLOW
    BLUE("\033[0;34m"), // BLUE
    MAGENTA("\033[0;35m"), // MAGENTA
    CYAN("\033[0;36m"), // CYAN
    WHITE("\033[0;37m"), // WHITE
    GREY("\033[1;30m"), // GREY

    // Background
    RED_BACKGROUND("\033[41m"), // RED
    GREEN_BACKGROUND("\033[42m"), // GREEN
    YELLOW_BACKGROUND("\033[43m"), // YELLOW
    BLUE_BACKGROUND("\033[44m"), // BLUE
    MAGENTA_BACKGROUND("\033[45m"), // MAGENTA
    CYAN_BACKGROUND("\033[46m"), // CYAN
    GREY_BACKGROUND("\033[47m"), // GREY

    // Bright
    RED_BRIGHT("\033[1;31m"), // RED BRIGHT
    GREEN_BRIGHT("\033[1;32m"), // GREEN BRIGHT
    YELLOW_BRIGHT("\033[1;33m"), // YELLOW BRIGHT
    BLUE_BRIGHT("\033[1;34m"), // BLUE BRIGHT
    MAGENTA_BRIGHT("\033[1;35m"), // MAGENTA BRIGHT
    CYAN_BRIGHT("\033[1;36m"); // CYAN BRIGHT

    private final String code;

    Color(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}