#include <iostream>
using namespace std;

void func1(int n){
    if(n > 0) {
        cout << n;
        func1(n-1);
    }
}

int main() {
    int n = 3;
    func1(n);
}

// op :- 321
// here first printing is done then recursive call is made. printing is done at calling time