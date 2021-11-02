#include <iostream>
#include <stdlib.h>
#include <ctime>

using namespace std;

int main()
{
	for(int i = 0; i<5; i++)
    {
        cout<<rand()<<endl; //it show same number when again and again run
    }
    cout<<endl;
	srand(time(0));

	for(int i = 0; i<5; i++)
    {
		cout<<rand()<<endl;
    }
	return 0;
}
