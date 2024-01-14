import java.util.Arrays;

public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
//        String inputString = "Hello WOrLD ExaMPLE";
//        String modifiedString1 = capVowelsLowRest(inputString);
//        System.out.println(modifiedString1);
//        String modifiedString2 = camelCase(inputString);
//        System.out.println(modifiedString2);
//        System.out.println(Arrays.toString(allIndexOf("Hello world",'l')));
        System.out.println(camelCase(" tWo    wordS"));
        
    }

    public static String capVowelsLowRest (String string) {
        // Write your code here:
        String res = "";
        for (int i = 0; i < string.length(); i++) { // loop for to go over all char of the string
            char currentChar = string.charAt(i); // the current char
            if (isVowel(currentChar)){ // if the current char is a vowel
                res += toHigh(currentChar);
            }
            else{// if the char is not a vowel
                res += toLow(currentChar);
            }
        }
        return res;
    }

    public static String camelCase (String string) {
        // Write your code here:
        String res = "";
        res += toLow(string.charAt(0)); // get the first letter of the string
        if (res.charAt(0) == ' '){
            res = "";
        }
        for (int i = 1; i < string.length() ; i++){ // loop for to go over all char of the string
            char currentChar = string.charAt(i);
            char prevChar = string.charAt(i-1);
            if (currentChar != ' ' && prevChar != ' '){ // iff the current char and the previous char are not space
                res += toLow(currentChar);
            }
            if (currentChar != ' ' && prevChar == ' ') {// if the current char is not a space and the previous char is a space
                res += toHigh(string.charAt(i));
            }
        }

        return res;
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        int counter = 0;
        for (int i = 0; i < string.length(); i++){ // loop for to go over all char of the string
            if (string.charAt(i) == chr){ // if the char at the index i is the same char as we get in the function we add 1 to the counter
                counter++;
            }
        }
        int res [] = new int [counter];// new array with a length of counter
        int index = 0;
        // add in the new array the index we're appears the char in the string
        for (int j = 0; j < string.length(); j++){
            if (string.charAt(j) == chr){
                res[index++] = j;
            }
        }
        return res;
    }

    // function to check if a char is a vowel
    private static boolean isVowel(char ch) {
        String vowel = "aeiouAEIOU";
        return vowel.indexOf(ch) != -1;
    }

    // function to change  upper char to a lower char
    private static char toLow(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return (char) (ch + 32);
        }
    return ch;
    }
    // function to change a lower char to  upper char
    private static char toHigh(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return (char) (ch - 32);
        }
        return ch;
    }
}
