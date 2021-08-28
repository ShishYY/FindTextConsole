package ua.levelup;

public class SimpleResultItem implements ResultItem {
    private final String line;
    private final int lineNumber;

    public SimpleResultItem(String line, int lineNumber) {
        this.line = line;
        this.lineNumber = lineNumber;
    }

    public String getFormated() {
        return lineNumber + "->" + line;
    }
}
