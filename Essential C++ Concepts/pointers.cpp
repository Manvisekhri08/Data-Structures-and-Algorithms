#include<iostream>

using namespace std;

struct Rectangle {
    int length;
    int breath;
} r;

int main() {
    // int a = 10;
    // int *p;
    // p = &a;
    // cout << a << endl << *p;

    // // Pointer to an array
    // int A[5] = {0,2,4,6,8};
    // int *p;
    // p = A;
    // for(int i =0; i<5; i++) {
    //     cout<< A[i]<<endl;
    //     cout<< p[i]<<endl;
    // }

    //array in a heap
    // int *p;
    // p = new int[5];
    // p[0] = 1;
    // p[1] = 2;
    // for(int i =0; i<5; i++) {
    //     cout<< p[i]<<endl;
    // }

    // DYNAMIC ALLOCATION :- whenever you are dynamically allocating a memory, you should release the memory also
    // int *p;
    // p = new int[5];
    // p[0] = 1;
    // p[1] = 2;
    // for(int i =0; i<5; i++) {
    //     cout<< p[i]<<endl;
    // }
    // delete []p;

    // whatever the type of pointer is, its independent of size and datatype
    int *p1;
    char *p2;
    float *p3;
    double *p4;
    struct Rectangle *p5;
    cout << sizeof(p1) << endl; //8
    cout << sizeof(p2) << endl; //8
    cout << sizeof(p3) << endl; //8
    cout << sizeof(p4) << endl; //8
    cout << sizeof(p5) << endl; //8
}