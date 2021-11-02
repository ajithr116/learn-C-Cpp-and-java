#include <iostream>
using namespace std;

int binarySearch(int array[], int x, int low, int high)
{
  while (low<=high)
    {
    int mid=low+(high-low)/2;

    if (array[mid] == x)
      return mid;

    if (array[mid] < x)
      low = mid + 1;

    else
      high = mid - 1;
  }
  return -1;
}
int main()
{
  int arr[10];
  int x ,i;
  int result;
  int num;

  cout<<"enter 10 numbers "<<endl;
  for(i=0;i<10;i++)
  {
      cin>>arr[i];
  }
  cout<<"enter 1 number to search "<<endl;
  cin>>num;

  result = binarySearch(arr, num, 0, 9);

  if (result == -1)
    cout<<"not found "<<endl;
  else
    cout<<"the position of the array is "<<result+1;
}
