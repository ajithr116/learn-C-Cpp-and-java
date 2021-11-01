#include <iostream>
using namespace std;

int main () {
    int a,b=1,c=1;
   // for loop execution
   for(  a = 0; a < 10; a = a + 1 ) {
      cout << "value of a: " << a << endl;
   }
   // while loop execution
   while( b < 10 ) {
      cout << "value of a: " << a << endl;
      b++;
   }
   // do while loop execution
   do {
      cout << "value of a: " << a << endl;
      c = c + 1;
   } while( c < 20 );

   return 0;
}
