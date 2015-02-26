package Backend;

/**
 * Created by Hoang on 2/23/2015.
 */
public class Verse {
    private String verse = ""; //stores the verse
    private String bookName = ""; //name of the book
    private int book = 1; //book number(chronological order starting at 1)
    private int chapter = 1; //chapter number
    private int verseNum = 1; //verse number

    public Verse(String verse, String bookName, int book, int chapter, int verseNum){
        this.verse = verse;
        this.bookName = bookName;
        this.book = book;
        this.chapter = chapter;
        this.verseNum = verseNum;
    }

    //returns the verse
    public String getVerse(){
        return verse;
    }

    //unfinished
    public String getReference(){
        return bookName;
    }

    private String getBookName(int book){
        //will implement binary search tree with books of the Bible to allow for quick searching and scalability in the saerch method
        return "";
    }

}
