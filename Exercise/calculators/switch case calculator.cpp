#include <iostream>

using namespace std;

int main()
{
    int num1,num2,c;

    cout<<"enter 1st number "<<endl;
    cin>>num1;
    again:
    cout<<"1. '+' "<<endl;
    cout<<"2. '-' "<<endl;
    cout<<"3. '*'  "<<endl;
    cout<<"4. '/' "<<endl;

    cout<<"Enter the number for the specified charater "<<endl;
    cin>>c;
    if(c!=1&c!=2&c!=3&c!=4)
    {
          cout<<"invalid charater . enter again "<<endl;
          goto again;
    }

    cout<<"Enter the 2nd number "<<endl;
    cin>>num2;

     switch(c)
     {
     case 1:
        cout<<"sum = "<<num1+num2;
        break;
     case 2:
        cout<<"sub = "<<num1-num2;
        break;
     case 3:
        cout<<"result = "<<num1*num2;
        break;
     case 4:
         cout<<"division is  "<<num1/num2;
         break;
     }


return 0;
}
