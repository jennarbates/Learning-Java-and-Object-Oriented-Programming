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

    //This non-static method will display the content of text document stored in the class object data attribute. Each sentence will be displayed on its own line.
    public void display(){
        for(int i = 0; i<this.limit); i++){
            System.out.println(this.data[i]);
        }
    }

    //This non-static method will display the content of the analyses done in the text stored for the respective class object in a simple table format.
    public void tableDisplay(){

    }

    //This non-static overloaded method will analyze the words in the text document. This method will count the number of words used in each sentence.
    // The result of each sentence will be stored in the wordsize attribute. Do not count the special characters as part of the words. Your program
    //should also not count digits (101, 555, etc...). This information will get displayed in tableDisplay()
    public void letterAnalysis(){


    }

    //This non-static overloaded method will analyze the words in the text document. This method will count the number of words used in each sentence.
    //The result of each sentence will be stored in the wordsize attribute. Do not count the special characters as part of the words. Your program
    //should also not count digits (101, 555, etc...). This information will get displayed in tableDisplay()
    public void wordAnalysis(){

    }

    //This non-static overloaded method will analyze the words in the text document. This method will measure the length of each sentence.
    //In simple terms you will count the number of words contained in a sentence. You can assume that all sentences will have at least one word. This
    //method has one parameter of type int called num. The parameter num holds the number of sentences to be observed. For example, if data has 20 sentences
    //and num is passed 7, then the first 7 sentences will be analyzed. The result of each sentence will be stored in the wordcount
    //attribute. This information will get displayed in tableDisplay(). Make sure num is a positive number and that it does not exceed the limit attribute.
    //If the condition is not satisfied, the message “Exceeded and cannot produce an analysis on this component” Should be displayed to the terminal.
    public void wordAnalysis(int num){

    }





}