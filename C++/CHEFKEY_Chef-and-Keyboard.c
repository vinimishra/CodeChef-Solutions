#include <iostream>

using namespace std;

int main()
{
    int testCase;
    cin>>testCase;
    int n,m,c;
    while(testCase--){
        cin>>n>>m>>c;
        int i=1;
        int cf=0;
        int big=m>n?m:n;
        while(i<=big){
            if(c%i==0)
                if(i<=n && ((c/i)<=m))
                    cf++;
                i++;
        }
        if(cf==0)
            cout<<"0"<<endl;
        else
            cout<<cf<<endl;
    }
    return 0;
}
