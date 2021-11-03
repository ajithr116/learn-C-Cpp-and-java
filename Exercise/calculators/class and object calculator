#include <iostream>
#include <math.h>
using namespace std;
class Calculator {
    double A, B;
public:
    void get() {
        cout << "Enter First Number: ";
        cin >> A;
        cout << "Enter Second Number: ";
        cin >> B;
    }
    double add() {
        return A + B;
    }
    double sub() {
        return A - B;
    }
    double mul() {
        return A * B;
    }
    double div() {
        if (B == 0) {
            cout << "Divison By Zero" << endl;
            return INFINITY;
        }
        else {
            return A / B;
        }
    }
};
int main() {
    int choice;
    Calculator cal; // simple calculator object
    cout << "Enter 1 Add 2 Numbers"
        << "\nEnter 2 Subtract 2 Numbers"
        << "\nEnter 3 Multiply 2 Numbers"
        << "\nEnter 4 Divide 2 Numbers"
        << "\nEnter 0 To Exit"
        << "\n";
    do {
        cout << "\nEnter Choice: ";
        cin >> choice;
        switch (choice) {
        case 1:
            cal.get();
            cout << "Result: " << cal.add() << endl;
            break;
        case 2:
            cal.get();
            cout << "Result: " << cal.sub() << endl;
            break;
        case 3:
            cal.get();
            cout << "Result: " << cal.mul() << endl;
            break;
        case 4:
            cal.get();
            cout << "Result: " << cal.div() << endl;
            break;
        }
    } while (choice >= 1 && choice <= 4);
    return 0;
}
