#include <iostream>

using namespace std;

int main()
{
    int testCase;
    cin>>testCase;
    int score1[testCase],score2[testCase],total1=0,total2=0,lead=0,player;;

    for(int i=0;i<testCase;i++){
        cin>>score1[i]>>score2[i];
        total1+=score1[i];
        total2+=score2[i];

        if(total1-total2>lead){
            lead=total1-total2;
            player=1;
        }
        else if(total2-total1>lead){
            lead=total2-total1;
            player=2;
        }
    }
    cout<<player<<" "<<lead<<endl;

    return 0;
}
