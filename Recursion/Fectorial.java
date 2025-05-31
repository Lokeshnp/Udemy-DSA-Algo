package Recursion;

public class Fectorial {
    public static void main(String[] args) {
        int myfact = fectorial(4);
        System.out.println("Printing factorial: "+myfact);
    }

    public static int fectorial(int n) {
      if(n == 1) return 1;
      return n * fectorial(n - 1);
    }

}