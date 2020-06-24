#include <iostream>
#include <vector>
#include <numeric>

using namespace std;

int main()
{
    int testCase;
    cin >> testCase;

    while(testCase--){
        int n,c;
        cin>> n >> c;

        vector <int> a(n);
        for(int i = 0; i < n; i++){
            cin>>a[i];
        }

        int sum = accumulate(a.begin(), a.end(), 0);

        if(sum > c)
            cout<<"No"<<endl;
        else
            cout<<"Yes"<<endl;

     }
    return 0;
}
