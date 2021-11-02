#include <iostream>
using namespace std;

int main()
{

    int mark=0,f,s,t;

      cout<<"1. WHICH ONE OF THE SMALLEST OCCEAN IN THE WORLD "<<endl;
      cout<<"1.indiana     2.Pacific    3.atlantic   4.artic "<<endl;
      cin>>f;
      if(f==4)
      {
          cout<<"correct "<<endl;
          mark++;
      }
      else
        {
           cout<<"wrong"<<endl;
        }
      cout<<"2. WHICH COUNTRY GIFTED THE STATUE OF LIBERTY TO USA IN 1886 "<<endl;
      cout<<"1.france    2.canada    3.brazil   4.england "<<endl;
      cin>>s;
         if(s==1)
      {
          cout<<"correct "<<endl;
          mark++;
      }
      else
        {
           cout<<"wrong"<<endl;
        }
      cout<<"3. In OCEAN BERMUDA TRIANGLE REGION IS LOCATED "<<endl;
      cout<<"1.indiana   2.atlantic  3.Pacific   4.artic "<<endl;
      cin>>t;
      if(t==1)
      {
          cout<<"correct "<<endl;
          mark++;
      }
      else
        {
           cout<<"wrong"<<endl;
        }
        cout<<endl<<"total mark oout of three is  : "<<mark;


	return 0;
}
