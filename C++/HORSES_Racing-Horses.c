#include <iostream>
#include <algorithm>

using namespace std;

int main()
{
    int testCase;
    cin>>testCase;
    while(testCase--){
        int numberOfHorses;
        cin>>numberOfHorses;
        int stableOfHorses[numberOfHorses];
        for(int i=0;i<numberOfHorses;i++)
            cin>>stableOfHorses[i];
        sort(stableOfHorses,stableOfHorses+numberOfHorses);
        int minimumDifference=stableOfHorses[1]-stableOfHorses[0];
        for(int j=2; j<numberOfHorses; j++){
            if(minimumDifference>stableOfHorses[j]-stableOfHorses[j-1])
                minimumDifference=stableOfHorses[j]-stableOfHorses[j-1];
        }
        cout<<minimumDifference<<endl;
    }
    return 0;
}
