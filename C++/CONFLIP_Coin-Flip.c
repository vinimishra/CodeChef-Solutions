#include <iostream>

using namespace std;

int main()
{
    int testCase;
    cin>>testCase;
    while(testCase--){
        int numberOfGames;
        cin>>numberOfGames;
        int initialState, numberOfCoins, finalState;
        while(numberOfGames--){
            cin>>initialState>>numberOfCoins>>finalState;
            if(numberOfCoins%2==0 || initialState==finalState)
                cout<<numberOfCoins/2<<endl;
            else
                cout<<numberOfCoins/2+1<<endl;

        }
    }
    return 0;
}
