Import java.util.*;
public class Main{
     static int fact(int n ){
        if(n==0) return 1;
        return n* fact(n-1);
    }
    public static void main (String[]args){
        scanner sc = new scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}
