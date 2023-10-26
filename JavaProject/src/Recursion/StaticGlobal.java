package Recursion;

public class StaticGlobal {
    static int y = 0; // Declare y as a static class member

    int funGlobal(int n) {
        if (n > 0) {
            y++;
            return funGlobal(n - 1) + y;
        }
        return 0;
    }

    public static void main(String[] args) {
        int r = 5;
        StaticGlobal global = new StaticGlobal();
        System.out.print(global.funGlobal(r));
    }
}

//with static = 25
// with global = 15