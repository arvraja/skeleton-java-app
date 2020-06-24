package com.develogical;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class QueryProcessor {

    private Map<String, String> myAuthorList;

    QueryProcessor(){
        myAuthorList = new HashMap<String, String>();
        myAuthorList.put("romeo and juliet","William Shakespeare");
        myAuthorList.put("gift of the magi","O'Henry");
        myAuthorList.put("what is your name","Arv");
    }

    public void addEntry(String key,String value){
        myAuthorList.put(key,value);
    }

    public String processOld(String query) {
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

    public String process2(String query) {
        Map<String, String> result = myAuthorList.entrySet()
                .stream()
                .filter(map -> query.toLowerCase().contains(map.getKey().toLowerCase()))
                .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));
        if (result.size()==1) return result.entrySet().iterator().next().getValue();
        return "";
    }

    public String process(String query) {
        if (query.toLowerCase().contains("which of the following numbers is the largest")) {
            String[] splitQ = query.split(":");
            List<Integer> numbers = Arrays.asList(splitQ[2].split(","))
                    .stream()
                    .map(String::trim)
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            return Collections.max(numbers).toString();
        }
        if (query.toLowerCase().contains("plus")) {
            String[] splitQ = query.split(":");
            String[] plusNums = splitQ[1].trim().split(" ");
            Integer val = Integer.parseInt(plusNums[2])+Integer.parseInt(plusNums[4]);
            return val.toString();
        }
        return "";
    }
}
