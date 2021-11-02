#include<iostream>
#include<cstdlib>
#include<ctime>

using namespace std;

int main()
{

   int arr[3][3];

   cout<<"enter 9 numbers "<<endl;

   for(int i=0;i<3;i++)
   {
       for(int j=0;j<3;j++)
       {
           cin>>arr[i][j];
       }
   }
cout<<endl;
     for(int i=0;i<3;i++)
   {
       for(int j=0;j<3;j++)
       {
           cout<<arr[i][j];
           cout<<"  ";
       }
       cout<<endl;
   }
   cout<<endl;
     for(int i=0;i<3;i++)
   {
       for(int j=0;j<3;j++)
       {
           cout<<arr[j][i];
           cout<<"  ";
       }
    cout<<endl;
   }

    return 0;
}
