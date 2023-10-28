package Recursion;

public class IndirectRecusrion {
    void funcA(int n) {
        if(n > 0) {
            System.out.println(n);
            funcB(n-1);
        }
    }
    void funcB(int n) {
        if(n > 1) {
            System.out.println(n);
            funcA(n/2);
        }
    }
    public static void main(String[] args) {
        int n = 20;
        IndirectRecusrion rec = new IndirectRecusrion();
        rec.funcA(n);
    }
}

// O.P:- 20 19 9 8 4 3 1