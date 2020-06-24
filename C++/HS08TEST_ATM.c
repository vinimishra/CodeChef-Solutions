/*https://www.codechef.com/problems/HS08TEST*/

#include <iostream>

using namespace std;

int main()
{
    int withdrawAmount;
    float availableAmount;
    cin>>withdrawAmount>>availableAmount;
    if((withdrawAmount%5==0) && ((withdrawAmount+0.5)<availableAmount))
        cout<<availableAmount-withdrawAmount-0.5;
    else
        cout<<availableAmount;
    return 0;
}
