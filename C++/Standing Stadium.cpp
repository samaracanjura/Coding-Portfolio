 //Samara Canjura
 //Student ID: 1239028 
 // Standing Stadium
 // This program prompts the user to enter how many tickets of each of the classes
 // they would like to purchase. Then the program will show the total amount for the purchases.
 
 #include <iostream>
 #include <string>
 #include <iomanip>
 #include "format_numbers.h"
 using namespace std;

 string format_integer(long long);
 string format_currency(long double, bool);

 int main()
 {
    int amountA;
    int amountB;
    int amountC;
    int const costA = 15;
    int const costB = 12;
    int const costC = 9;
    int totalA;
    int totalB;
    int totalC;
    int grandTotal;
   
    cout << "Softball game tickets for sale!" << '\n';
    cout << "Class A seats cost $15, Class B seats cost $12,"<< '\n';
    cout << "and Class C seats cost $9." << endl;
   
    cout << "Please enter the amount of seats that" << '\n';
    cout << "you would like to purchase in Class A: " << endl;
    cin >> amountA;
  
    cout << "Please enter the amount of seats that" << '\n';
    cout << "you would like to purchase in Class B: " << endl;
    cin >> amountB;
   
    cout << "Please enter the amount of seats that" << '\n';
    cout << "you would like to purchase in Class C: " << endl;
    cin >> amountC;
   
    totalA = (amountA * costA);
    totalB = (amountB * costB);
    totalC = (amountC * costC);
   
    grandTotal = (totalA + totalB + totalC);
   
    cout << "" << setw(20) << "Total for Class A tickets:" <<'\t';
    cout << setw(25) << format_currency(totalA) << endl;
   
    cout << "" << setw(20) << "Total for Class B tickets:" << '\t';
    cout << setw(25) << format_currency(totalB) << endl;
   
    cout << "" << setw(20) << "Total for Class C tickets:" << '\t';
    cout << setw(25) << format_currency(totalC) << endl;
   
    cout << "-----------------------------------------------------------" << endl;
   
    cout << "" << setw(20) << "Total Ticket Sales:  " << '\t' << '\t'; 
    cout << setw(25) << format_currency(grandTotal, true )<< endl;
   
    return 0;
   
}
