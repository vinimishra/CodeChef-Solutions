#include <iostream>

using namespace std;

int main()
{
    int t,a,b,rem;
    cin>>t;
    for(int i=0;i<t;i++)
    {
        cin>>a>>b;
        rem=a%b;
        cout<<rem<<endl;
    }
    return 0;
}
