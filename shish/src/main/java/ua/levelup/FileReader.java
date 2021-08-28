package ua.levelup;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    public FileReader() {
    }

    public List<String> readLines(File file) throws IOException {
        List<String> stringList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new java.io.FileReader(file));
        String stringfromfiletemp;
        while ((stringfromfiletemp = reader.readLine()) != null) {
            stringList.add(stringfromfiletemp);
        }
        return stringList;
    }
}
