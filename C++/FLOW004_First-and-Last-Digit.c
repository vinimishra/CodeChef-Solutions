#include <iostream>
#include <math.h>

using namespace std;

int main()
{
    int t,n,sum,first,last,ndigit;
    cin>>t;
    for(int i=0;i<t;i++)
    {
        cin>>n;
        sum=0;
        last=n%10;
        ndigit=(int)log10(n);
        first=(int)(n/pow(10,ndigit));
        sum=first+last;
        cout<<sum<<endl;
    }
    return 0;
}
