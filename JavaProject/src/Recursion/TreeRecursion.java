package Recursion;

public class TreeRecursion {
    void funTreeRec(int n) {
        if(n > 0) {
            System.out.println(n);
            funTreeRec(n-1);
            funTreeRec(n-1);
        }
    }
    public static void main(String[] args) {
        int r = 3;
        TreeRecursion rec = new TreeRecursion();
        rec.funTreeRec(r);
    }
}

//OP:- 3 2 1 1 2 1 1

// first print and line 7 will be completed once the first recursion calls complete then it will go to next recusion call and then check the condition and repeat the process