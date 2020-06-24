#include <iostream>

using namespace std;

int main()
{
    int T,N,sum,rem;
    cin>>T;
    for(int i=0;i<T;i++)
    {
        cin>>N;
        sum=0;rem=0;
        while(N!=0)
        {
            rem=N%10;
            sum=sum+rem;
            N=N/10;
        }
        cout<<sum<<endl;
    }
    return 0;
}
