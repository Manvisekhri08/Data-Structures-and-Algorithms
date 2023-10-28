package Recursion;

public class NestedRecursion {
    int funcNest(int n) {
        if(n > 100)
            return n-10;
        else
          return funcNest(funcNest(n+11));
    }
    public static void main(String[] args) {
        int  r = 95;
        NestedRecursion rec = new NestedRecursion();
        System.out.println(rec.funcNest(r));
    }
}
 //OP:- 91