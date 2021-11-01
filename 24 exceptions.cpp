#include <iostream>
using namespace std;

int main()
{
  try
  {
    int age = 18;
    if (age >= 18)
        {
      cout << "you r old enough";
    } else
    {
      throw (age);
    }
  }
  catch (int myNum)
  {
    cout << "accees denied u r not enough old";
    cout << "Age is: " << myNum;
  }
  return 0;
}
