package ua.levelup;

import java.io.File;
import java.util.List;
import java.util.Map;


public class ViewResolver {

    public ViewResolver() {
    }

    public String resolve(Result result, String string) throws RuntimeException {

        Map<File, List<ResultItem>> totalresult = result.getMatches();
        StringBuilder stringforconsole = new StringBuilder();
        stringforconsole.append("---Smart File Handler CLI----\n");
        stringforconsole.append("Text for search:" + string + "\n");
        for (Map.Entry<File, List<ResultItem>> fileListEntry : totalresult.entrySet()) {
            if (fileListEntry.getValue().isEmpty()) {
                stringforconsole.append("Searching in File:" + fileListEntry.getKey()
                        + "-->" + "No matches was found \n");
            } else {
                stringforconsole.append("Searching in File:" + fileListEntry.getKey()
                        + "\n" + "Find matches on line:" + fileListEntry.getValue()
                        .iterator().next().getFormated());
            }
        }
        return stringforconsole.toString();
    }
}