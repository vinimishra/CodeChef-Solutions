#include <iostream>
#include <algorithm>

using namespace std;

int main()
{
    int testCase;
    cin>>testCase;
    while(testCase--){
        int numberOfSongs;
        cin>>numberOfSongs;

        int playlist[numberOfSongs];

        for(int i=0;i<numberOfSongs;i++)
            cin>>playlist[i];

        int uncleJohnyIndex;
        cin>>uncleJohnyIndex;

        int point=playlist[uncleJohnyIndex-1];

        sort(playlist,playlist+numberOfSongs);

        for(int k=0;k<numberOfSongs;k++){
            if(point==playlist[k]){
                cout<<k+1<<endl;
                break;
            }
        }
    }
    return 0;
}
