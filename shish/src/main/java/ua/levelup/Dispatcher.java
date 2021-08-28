package ua.levelup;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Dispatcher {
    private final Config config;
    private final Handler handler;
    private final ViewResolver viewResolver;
    private List<View> views;


    public Dispatcher(String[] args) {
        this.config = new Config(args);
        this.handler = new Handler();
        this.viewResolver = new ViewResolver();

    }

    public void dispatch() throws IOException, ParserConfigurationException, SAXException {
        Result result = new Result();
        if (config.getDestination().isFile()) {
            result.addMatches(config.getDestination(),
                    this.handler.handle(config.getDestination(),
                            config.getText4Search())
            );
        } else {
            File[] listoffile = config.getDestination().listFiles();
            if (listoffile != null) {
                for (File filefromlist : listoffile) {
                    result.addMatches(filefromlist,
                            this.handler.handle(filefromlist.getCanonicalFile(),
                                    config.getText4Search()));
                }
            }
        }
        ConsoleView out = new ConsoleView();
        out.print(viewResolver.resolve(result, config.getText4Search()));
    }
}