#include <iostream>
using namespace std;
void message()
{
    cout<<"hello world "<<endl;
}
int message2(int num)
{
    cout<<" number is "<< num;
}
int message3(string name)
{
    cout<<" name is "<< name;
}

int main()
{
    int num;
    string name;
     message();
     cout<<"enter number "<<endl;
     cin>>num;
     message2(num);
     cout<<"enter name "<<endl;
     cin>>name;
     message3(name);

	return 0;
}
