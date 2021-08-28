package ua.levelup;

import java.util.List;


public abstract class AbstrctParser implements Parser {

    private final List<String> supportedExtensions;

    public AbstrctParser(List<String> supportedExtensions) {
        this.supportedExtensions = supportedExtensions;
    }

    public List<String> getSupportedExtensions() {
        return this.supportedExtensions;
    }

    public boolean isSuported(String string) {
        if (string.lastIndexOf(".") == -1) {
            return false;
        } else {
            String extens = string.substring(string.lastIndexOf("."));
            return supportedExtensions.contains(extens);
        }
    }
}
