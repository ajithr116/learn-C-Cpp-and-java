#include <iostream>
using namespace std;

class parent
{
  public:
    parent()//constructor
    {
      cout << " hai , iam parent..... "<< endl;
    }
};

class child
{
  public:
    child()//constructor
    {
      cout << "hai......iam child..." << endl;
    }
};

class family: public parent, public child {};

int main() {
    family f1;
    return 0;
}
