package Recursion;

public class StaticGlobal {
   // static int y = 0; // Declare y as a static class member
    int z = 0;
    int funGlobal(int n) {
        if (n > 0) {
            z++;
            return funGlobal(n - 1) + z;
        }
        return 0;
    }

    public static void main(String[] args) {
        int r;
        r = 5;
        StaticGlobal global = new StaticGlobal();
        System.out.println(global.funGlobal(r));
        r = 5;
        System.out.println(global.funGlobal(r));
        r = 5;
        System.out.println(global.funGlobal(r));
    }
}

//with static = 25
// with global = 15
// with global z = 25

// with calling it twice o/p :- 25 & 50
// when first call is made the value of x is 5
// when second call is made again trying to increment x, for 5 times here x++, then x, will become 10
// when third time x is 10 and it increment to 15;