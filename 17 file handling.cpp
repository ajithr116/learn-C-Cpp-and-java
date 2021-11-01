#include <fstream>
#include <iostream>
using namespace std;

int main () {
   char data[100];

   ofstream outfile;
   outfile.open("xyz.txt");
   cout << "Writing to the file" << endl;
   cout << "Enter name";
   cin.getline(data, 100);
   outfile << data << endl;
   outfile.close();

   ifstream infile;
   infile.open("xyz.txt");
   cout << "Reading from the file" << endl;
   cout << data << endl;
   infile.close();

   return 0;
}
