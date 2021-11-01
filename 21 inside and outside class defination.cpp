#include <iostream>
using namespace std;
class car
{
  private:
    int car_number;
    char car_model[10];
  public:
    void getdata()
    {
        cout<<"Enter car number: "; cin>>car_number;
        cout<<"\n Enter car model: "; cin>>car_model;
    }
    void showdata();
};
void car::showdata()
 {
   cout<<"Car number is "<<car_number;
   cout<<"\n Car model is "<<car_model;
 }
int main()
 {
    car c1;
    c1.getdata();
    c1.showdata();

    return 0;
 }
