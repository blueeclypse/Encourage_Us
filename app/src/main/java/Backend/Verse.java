package Backend;

/**
 * Created by Hoang on 2/23/2015.
 */
public class Verse {
    private String verse = ""; //stores the verse
    private int chapter = 1; //chapter number
    private int verseNum = 1; //verse number

    public Verse(String verse, int chapter, int verseNum){
        this.verse = verse;
        this.chapter = chapter;
        this.verseNum = verseNum;
    }

    //returns the verse
    public int getChapter(){
        return chapter;
    }

    //returns the verse
    public int getVerseNum(){
        return verseNum;
    }

    //returns the verse
    public String getVerse(){
        return verse;
    }


}
