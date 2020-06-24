#include <iostream>

using namespace std;

int main()
{
    int testCase;
    cin>>testCase;
    while(testCase--){
        int number;
        cin>>number;
        int reminder=0;
        int countOfFour=0;
        while(number!=0){
        reminder=(number%10);
        number/=10;
        if(reminder==4)
            countOfFour++;
        }
        cout<<countOfFour<<endl;
    }
    return 0;
}
