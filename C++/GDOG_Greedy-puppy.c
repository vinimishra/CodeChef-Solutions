#include <iostream>

using namespace std;

int main()
{
    int testCase;
    cin>>testCase;
    int numberOfCoins, numberOfPeople;
    while(testCase--){
        cin>>numberOfCoins>>numberOfPeople;
        int tuzikCoins=0;
        for(int i=1; i<=numberOfPeople; i++){
            if(numberOfCoins%i>tuzikCoins)
                tuzikCoins=numberOfCoins%i;
        }
        cout<<tuzikCoins<<endl;
    }
    return 0;
}
