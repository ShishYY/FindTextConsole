package ua.levelup;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.List;

public interface Parser {
    List<String> getSuportedExtensions();

    boolean isSuported(String string);

    List<ResultItem> parse(File file, String string) throws IOException, ParserConfigurationException, SAXException;
}
