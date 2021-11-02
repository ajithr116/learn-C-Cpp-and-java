#include <iostream>
using namespace std;

template <typename temp>
temp def(temp x, temp y)
{
return (x > y)? x: y;
}

int main()
{
    int a,b;
    float c,d;
    char e,f;

    cout<<"enter an 2 integer "<<endl;
    cin>>a>>b;
    cout << def<int>(a, b) << endl;

    cout<<"enter an 2 decimal "<<endl;
    cin>>c>>d;
    cout << def<double>(c,d) << endl;

    cout<<"enter 2 alphabet "<<endl; //example a,b,c,d,....
    cin>>e>>f;
    cout << def<char>(e,f) << endl; //char

return 0;
}

