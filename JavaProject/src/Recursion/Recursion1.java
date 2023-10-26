package Recursion;
public class Recursion1 {

    void funRec(int n) {
        if(n>0) {
            System.out.print(n);
            funRec(n-1);
        }
    }
    public static void main(String[] args) throws Exception {
        int n = 3;
        Recursion1 rec = new Recursion1();
        rec.funRec(n);
    }
}

// op :- 321
// here first printing is done then recursive call is made. printing is done at calling time
