#include <iostream>
#include<math.h>

using namespace std;

int main()
{
    int testCase;
    cin>>testCase;
    while(testCase--){
        int number;
        cin>>number;
        int sum=0;
        int divisor=5;
        while((number/divisor)>0){
            sum+=trunc(number/divisor);
            divisor=divisor*5;
        }
        cout<<sum<<endl;
    }
    return 0;
}
