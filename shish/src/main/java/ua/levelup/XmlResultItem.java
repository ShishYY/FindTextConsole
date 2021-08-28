package ua.levelup;

public class XmlResultItem {
    private String node;

    public XmlResultItem(String node) {
    }

    public String getFormatted() {
        return "->" + node;
    }
}
