#include <iostream>
using namespace std;
class bankac
{
    private:
    int acbal;
    public:
        void setbalance(int b)
        {
            acbal=b;
        }
        int getbal()
        {
            return acbal;
        }
};

int main()
{
   bankac ac1;
   ac1.setbalance(1000);
   cout<<ac1.getbal();

  return 0;
}
