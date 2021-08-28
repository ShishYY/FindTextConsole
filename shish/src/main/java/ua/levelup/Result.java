package ua.levelup;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result {
    private final Map<File, List<ResultItem>> matches = new HashMap<>();

    public Result() {
    }

    public void addMatches(File file, List<ResultItem> resultItemList) {
        this.matches.put(file, resultItemList);
    }

    public Map<File, List<ResultItem>> getMatches() {
        return this.matches;
    }

    public boolean isEmpty() {
        return matches.isEmpty();
    }
}
