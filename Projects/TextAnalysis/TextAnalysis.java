/* Jenna Bates
 * Dr. Steinberg
 * COP3330 Spring 2022
 * Programming Assignment 2
 */

public class TextAnalysis{

    // "This attribute is a String Class array that holds the text. Each element is a sentence"
    private String[] data;

    // "This attribute is a primitive integer array that stores the number of times a letter occurs in data. Each element corresponds to a letter.
    //For example, ‘a’ would be at index 0, ‘b’ at index 1, ‘c’ at index 2 and so on until ‘z’. You can assume that case sensitivity doesn’t matter.
    //That means ‘A’ and ‘a’ are considered the same.
    private int[] alphabet;

    // "This attribute is a primitive integer array that stores the size of each word. In simple terms it will store the size the of the words in of the
    //respective text documents. Each index represents the size the of word. For example, index 1 contains the number of occurrences one size words
    // appear in the document. Important: You can assume that there will only be words that have no more than 15 letters."
    private int[] wordsize;

    // "This attribute is a primitive integer array that stores the size of the actual sentence. In simple terms, the number of words per sentence.
    // Each index represents the total number of words in the sentence. For example, index 10 represents 10 words in a sentence.
    // Important: You can assume that there will only be sentences that have no more than 30 words
    private int[] wordcount;

    // "This attribute stores the max number of sentences to observe for the class object. Each class object will have a different limit."
    private int limit;


    public TextAnalysis(int limit, String[] data){
        this.limit = limit;
        this.data = data;
    }

}