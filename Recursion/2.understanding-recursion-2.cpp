#include <iostream>
using namespace std;

void func1(int n){
    if(n > 0) {
        func1(n-1);
        cout << n;
    }
}

int main() {
    int n = 3;
    func1(n);
}

// op :- 123