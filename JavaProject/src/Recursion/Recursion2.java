package Recursion;
public class Recursion2 {
    void funRec(int n) {
        if(n>0) {
            funRec(n-1);
            System.out.print(n);
        }
    }
    public static void main(String[] args) throws Exception {
        int x = 3;
        Recursion2 rec = new Recursion2();
        rec.funRec(x);
    }
}

// op :- 123
// here first the recursion call is made then printing is done. printing is done at returning time