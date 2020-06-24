#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
    int testCase;
    cin>>testCase;
    while(testCase--){
        double lengthOfSide, speedOfDogs;
        cin>>lengthOfSide>>speedOfDogs;
        cout<<fixed<<setprecision(9)<<((2/3.0)*(lengthOfSide/speedOfDogs))<<endl;
    }
    return 0;
}
