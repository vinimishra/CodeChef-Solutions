/*https://www.codechef.com/problems/INTEST*/

#include <iostream>

using namespace std;

int main()
{
    int n,k;
    cin>>n>>k;
    int countOf=0;
    while(n--){
        int num;
        cin>>num;
        if(num%k==0)
            countOf++;
    }
    cout<<countOf;
    return 0;
}
