#include<bits/stdc++.h>
using namespace std;

int binarySearchString(string name[], string x, int low, int high)
{
   while (low <= high)
    {
      int mid;
      mid = (low+high) / 2;

      int res;
      if ((name[mid]==x))
         return mid;
      if (res == 0)
         return mid;
      if (x > (name[mid]))
         low = mid + 1;
      else
         high = mid - 1;
   }
   return -1;
}
int main ()
{
   string name[10] ;
   string x ;
   int low=0,high=9;
   int result,i;

   cout<<"enter 10 names "<<endl;
   for(i=0;i<10;i++)
   {
       cin>>name[i];
   }
   cout<<"eneter which name to find"<<endl;
   cin>>x;

   result = binarySearchString(name, x, low, high);
   if(result == -1)
      cout<<"Element not present";
   else
      cout<<"Position of the name is "<<result+1;
      return 0;
}
