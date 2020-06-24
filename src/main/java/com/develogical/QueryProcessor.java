package com.develogical;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class QueryProcessor {

    private Map<String, String> myAuthorList;


    public String process(String query) {
        if (query.toLowerCase().contains("romeo and juliet")) {
            return "William Shakespeare";
        }
        if (query.toLowerCase().contains("gift of the magi")) {
            return "O'Henry";
        }
        if (query.toLowerCase().contains("what is your name")) {
            return "Arv";
        }
        return "";
    }
}
