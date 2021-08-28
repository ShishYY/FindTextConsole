package ua.levelup;

import java.io.File;


public class Config {
    private File destination;
    private String text4Search;

    public Config(String[] args) {
        parseArgs(args);
    }

    public File getDestination() {
        return this.destination;
    }

    public String getText4Search() {
        return this.text4Search;
    }

    private void parseArgs(String[] args) throws ConfigException {

        if (args.length < 2) {
            throw new ConfigException("Argument not found");
        }
        if (args[0].isEmpty()) {
            throw new ConfigException("No text fo search");
        }

        text4Search = args[0];

        File inputfile = new File(args[1]);

        if (inputfile.exists()) {
            destination = inputfile;

        } else {
            throw new ConfigException("Wrong file path");
        }


    }

}

