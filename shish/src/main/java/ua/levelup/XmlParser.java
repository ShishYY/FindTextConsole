package ua.levelup;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class XmlParser extends AbstrctParser {
    public XmlParser() {
        super(List.of(".xml"));
    }

    @Override
    public List<String> getSuportedExtensions() {
        return null;
    }

    @Override
    public List<ResultItem> parse(File file, String string) throws IOException, ParserConfigurationException, SAXException {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setValidating(true);
        factory.setIgnoringElementContentWhitespace(true);
        DocumentBuilder builder = factory.newDocumentBuilder();;
        Document doc = builder.parse(file);
        return null;
    }
}

