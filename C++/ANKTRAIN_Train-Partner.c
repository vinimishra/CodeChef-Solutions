#include <iostream>

using namespace std;

int main()
{
    int testCase;
    cin>>testCase;
    int number;
    while(testCase--){
        cin>>number;
        int q=number/8;
        if(number%8==0)
            q-=1;
        int r;
        for(int i=((8*q)+1);i<=((8*q)+8);i++){
            if(number==i){
                r=number%8;
                break;
            }
        }
        int result;
        if(r>=1 && r<=3){
            result=number+3;
            if(r==1)
                cout<<result<<"LB"<<endl;
            if(r==2)
                cout<<result<<"MB"<<endl;
            if(r==3)
                cout<<result<<"UB"<<endl;
        }
        else if(r>=4 && r<=6){
            result=number-3;
            if(r==4)
                cout<<result<<"LB"<<endl;
            if(r==5)
                cout<<result<<"MB"<<endl;
            if(r==6)
                cout<<result<<"UB"<<endl;
        }
        else if(r==7){
            result=number+1;
            cout<<result<<"SU"<<endl;
        }
        else if(r==0){
            result=number-1;
            cout<<result<<"SL"<<endl;
        }
    }
    return 0;
}
