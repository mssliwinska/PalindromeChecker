import java.util.*;

public class PalindromeChecker {
  String word;

public String getAWord(){
  System.out.println( "Write word you want to check: ");
  String word = System.console().readLine();
  return word;
}
public void checkIfPalindrome(String word){
  System.out.println("Checking if " + word + " is a palindrome...");
  String reverse = new StringBuffer(word).reverse().toString();
  if (word.equals(reverse)){
    System.out.println("Nice! That is a palindrome!");
  }
  else{
    System.out.println("Unfortunately, that is not a palindrome.");
  }
}
public static void main(String[] args){
  PalindromeChecker checker = new PalindromeChecker();
  String word = checker.getAWord();
  checker.checkIfPalindrome(word);
}

}
