#include<iostream>
using namespace std;

class MyClass {
  public:
    MyClass() {     // Constructor
      cout << "Hello World!";
    }
};

int main() {
  MyClass myObj;
  return 0;
}
