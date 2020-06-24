package com.develogical;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class QueryProcessor {

    private Map<String, String> myAuthorList;

//    QueryProcessor() {
//        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
//        try(InputStream inputStream = classloader.getResourceAsStream("BooksList.csv")) {
//            InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
//            //try (BufferedReader in = new BufferedReader(streamReader)){
//            BufferedReader in = new BufferedReader(streamReader);
//            myAuthorList = in
//                    .lines()
//                    .skip(1)
//                    .map(line -> line.split(","))
//                    .collect(Collectors.toMap(line -> line[0], line -> line[1]));
//        }
//        catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    public String process(String query) {
        if (query.toLowerCase().contains("romeo and juliet")) {
            return "William Shakespeare";
        }
        if (query.toLowerCase().contains("gift of the magi")) {
            return "O'Henry";
        }
//        return myAuthorList.entrySet()
//                .stream()
//                .filter(entry -> query.toLowerCase().contains(entry.getKey().toLowerCase()))
//                .map(e -> e.toString()).collect(Collectors.joining( "," ));
        return "Arv";
    }
}
