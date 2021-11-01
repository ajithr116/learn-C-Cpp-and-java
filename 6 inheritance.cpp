#include <iostream>
using namespace std;
class electronics
{
public:
    string productname;
    int price;
    void showdetails()
    {
        cout<<"product name "<<productname<<endl;
        cout<<" product price "<<price<<endl;
    }
};
class television:public electronics
{

};
class laptop:public electronics
{

};
int main()
{
    television t1;
    laptop l1;

    t1.productname="sony tv ";
    t1.price=10000;
    t1.showdetails();

    l1.productname="apple";
    l1.price=20000;
    l1.showdetails();


   return 0;
}
