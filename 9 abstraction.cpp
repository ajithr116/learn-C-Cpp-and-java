#include <iostream>
using namespace std;

class number
{
	private:
		int a, b;
    public:
        void set(int x, int y)
		{
			a = x;
			b = y;
		}

		void display()
		{
			cout<<"a = " <<a << endl;
			cout<<"b = " << b << endl;
		}
};
int main()
{
	number obj;
	obj.set(10, 20);
	obj.display();
	return 0;
}
