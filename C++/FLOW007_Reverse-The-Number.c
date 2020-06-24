#include <iostream>

using namespace std;

int main()
{
    int T,N,rev,a;
    cin>>T;
    for(int i=0;i<T;i++)
    {
        cin>>N;
        rev=0;
        while(N!=0)
        {
            a=N%10;
            rev=(rev*10)+a;
            N=N/10;
        }
        cout<<rev<<endl;
    }
    return 0;
}
