#include<iostream>

using namespace std;

struct Rectangle {
    int length;
    int breath;
} r;

int main() {
    //struct Rectangle r;
    r.length = 10;
    r.breath = 20;
    cout << "Area of Rectangle is : " << r.length * r.breath << endl;
    return 0;
}