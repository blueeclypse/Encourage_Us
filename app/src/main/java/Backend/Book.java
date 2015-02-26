package Backend;
import java.io.*;
import java.util.*;

/**
 * Created by Hoang on 2/26/2015.
 */
public class Book {
    private String name = ""; //name of the book
    private Map <Integer, Map<Integer,Verse>> book;//hash map, will take integer as key and verse as value

    public Book(String name, int numChapters){
        this.name = name;
        book = new HashMap<Integer,Map<Integer,Verse>>();
    }

    public void createChapter(int chapterNum){
        Map<Integer,Verse> chapter = new HashMap<Integer,Verse>();
        book.put(chapterNum,chapter);
    }

}
