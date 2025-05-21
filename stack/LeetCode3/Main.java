package stack.LeetCode3;

public class Main {

  public static String reverseString(String string){
      Stack<Character> stack = new Stack<>();
      String reverse = "";
      for(char c: string.toCharArray()){
          stack.push(c);
      }
      while(!stack.isEmpty()){
          reverse += stack.pop();
      }
      return reverse;
  }

    public static void main(String[] args) {

        String myString = "hello";
        String reversedString = reverseString(myString);
        System.out.println(reversedString);

        /*
            EXPECTED OUTPUT:
            ----------------
            olleh
        */

    }

}
