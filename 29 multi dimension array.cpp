#include <iostream>
using namespace std;

int main()
{
    int i,j;
    int num[50][50];

   cout<<"enter 9 numbers "<<endl;
   for(i=0;i<3;i++)
   {
    for(j=0;j<3;j++)
      {
    cin>>num[i][j];
      }}
         for(i=0;i<3;i++)
   {
    for(j=0;j<3;j++)
      {
    cout<<"  "<<num[i][j];
      }
      cout<<endl;}
    return 0;
}
