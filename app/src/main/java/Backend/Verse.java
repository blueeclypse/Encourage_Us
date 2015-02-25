package Backend;

/**
 * Created by Hoang on 2/23/2015.
 */
public class Verse {
    private String verse = ""; //stores the verse
    private int book; //book number(chronological order)
    private int chapter; //chapter number
    private int verseNum; //verse number

    public Verse(String verse, int book, int chapter, int verseNum){
        this.verse = verse;
        this.book = book;
        this.chapter = chapter;
        this.verseNum = verseNum;
        //this is a test
    }

    //returns the verse
    public String getVerse(){
        return verse;
    }

    //unfinished
    public String getReference(){
        return book+"";
    }
}
