package ua.levelup;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Handler {
    private final List<Parser> parsers;

    public Handler() {
        this.parsers = new ArrayList<>();
        parsers.add(new TxtParser());
        parsers.add(new XmlParser());
    }

    public List<ResultItem> handle(File file, String string) throws IOException, ParserConfigurationException, SAXException {
        List<ResultItem> resultItemList = new ArrayList<>();
        for (Parser parser : parsers) {
            if (parser.isSuported(file.getName())) {
                resultItemList = parser.parse(file, string);
                break;
            }
        }
        return resultItemList;
    }
}
