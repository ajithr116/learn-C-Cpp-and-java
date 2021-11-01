#include <iostream>
using namespace std;

class base
{
public:
  //Constructor
  base()
  {
    cout<<"Constructor is called"<<endl;
  }
  //Destructor
  ~base()
   {
    cout<<"Destructor is called"<<endl;
   }
   void display(){
     cout<<"Hello World!"<<endl;
   }
};
int main()
{
   base obj;
   obj.display();
   return 0;
}
