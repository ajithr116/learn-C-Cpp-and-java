#include <iostream>
using namespace std;

class parent
{
    public:
      void display()
      {
          cout<<"hallo world....";
      }
};
class child:public parent
{
};
class grandchild : public child
{
};
int main()
{
    grandchild obj;
    obj.display();
    return 0;
}
