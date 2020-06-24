#include <iostream>

using namespace std;

int main()
{
    int iterations,a1,a2,a3,sumOfAngles=0;
    cin>>iterations;
    while(iterations--)
    {
        cin>>a1>>a2>>a3;
        sumOfAngles=a1+a2+a3;
        if(sumOfAngles==180)
            cout<<"YES"<<endl;
        else
            cout<<"NO"<<endl;
    }
    return 0;
}
