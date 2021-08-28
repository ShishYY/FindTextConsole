package ua.levelup;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class TxtParser extends AbstrctParser {
    private File fileReader;

    public TxtParser() {
        super(List.of(".txt"));
    }

    @Override
    public List<String> getSuportedExtensions() {
        return null;
    }

    public List<ResultItem> parse(File file, String string) throws IOException {
        List<ResultItem> resultItemList = new ArrayList<>();
        FileReader readfromfile = new FileReader();
        List<String> listOfStringFromFile = readfromfile.readLines(file);
        int linenumber = 0;
        for (String s : listOfStringFromFile) {
            linenumber++;
            if (s.contains(string)) {
                resultItemList.add(new SimpleResultItem(s, linenumber));
            }
        }
        return resultItemList;
    }
}
