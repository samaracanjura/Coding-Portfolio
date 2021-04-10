  // Name: Samara Canjura 
  // Title: Box Office
  // This program prompts the user to enter a name of a movie and the number of tickets they would like to buy.
  // Then it will show the box office report of the profit of both the Gross Box Office and Net Box Office,
  // and the amount paid to Distributor.
 
  #include <iostream>
  #include <string>
  #include <iomanip>
  #include "format_numbers.h"
  using namespace std;

  string format_integer(long long);
  string format_currency(long double, bool);

  int main()
  {
     string movieName;
     int amountA;
     int amountCH;
     int totalA;
     int totalCH;
     int const adultCost = 12.00;
     int const childCost = 6.00;
     int gross;
     int net;
     int dist;
    
   
     cout << " Please enter the title a movie: " <<endl;
     cin >> movieName;
    
     cout << " Enter amount of adult tickets purchased: " <<endl;
     cin >> amountA;
    
     cout << " Enter amount of child tickets purchased: " << endl;
     cin >> amountCH;
    
     totalA = ( amountA * adultCost );
     totalCH = ( amountCH * childCost);
   
     gross = ( totalA + totalCH );
    
    net = ( (gross * 20) / 100);
   
    dist = ( gross - net );
   
    cout << " Movie Name: " << '\t' << movieName << endl;
   
    cout << "" << setw(20) << " Adult Tickets Sold: " << '\t';
    cout << setw(25) << format_integer(amountA) << endl;
   
    cout << "" << setw(20) << " Child Tickets Sold: " << '\t';
    cout << setw(25) << format_integer(amountCH) << endl;
   
    cout << "" << setw(20) << " Gross Box Office Profit: " << '\t';
    cout << setw(25) << format_currency(gross,true) << endl;
   
    cout << "" << setw(20) << " Net Box Office Profit: "  << '\t';
    cout << setw(25) << format_currency(net, true) << endl;
   
    cout << "" << setw(20) << " Amount Paid to Distributor: " << '\t';
    cout << setw(25) << format_currency(dist, true) << endl;
  
    return 0;
 }

 

