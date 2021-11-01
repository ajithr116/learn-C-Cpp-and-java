#include<iostream>
using namespace std;

int main()
{
    int num;
    cout<<"to show the number alphabet using c++ "<<endl;
    cout<<"enter number "<<endl;
    cin>>num;
    switch(num)
    {
        case 1:
        cout<<"ONE "<<endl;
        break;
        case 2:
        cout<<" TWO "<<endl;
        break;
        case 3:
        cout<<" THREE "<<endl;
        break;
        case 4:
        cout<<"Four "<<endl;
        break;
        case 5:
        cout<<"FIVE "<<endl;
        break;
        default:
        cout<<"error "<<endl;
    }
    return 0;
}
