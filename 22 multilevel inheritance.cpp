#include <iostream>
using namespace std;

class parent
{
    public:
      void display()
      {
          cout<<"Base class content.";
      }
};
class child : public parent
{

};
class grandchild : public child
{

};
int main() {
    grandchild obj;
    obj.display();
    return 0;
}
