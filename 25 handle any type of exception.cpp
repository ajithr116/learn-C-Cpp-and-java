#include <iostream>
using namespace std;

int main()
{
  try
  {
    int age = 15;
    if (age >= 18)
    {
      cout << "you are old enough.";
    }
    else
    {
      throw 505;
    }
  }
  catch (...)
   {
    cout << "You are not enough old";
  }
  return 0;
}
