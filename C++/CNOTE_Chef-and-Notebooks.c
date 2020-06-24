#include <iostream>
#include <vector>

using namespace std;

int main()
{
    int testCase;
    cin >> testCase;

    while(testCase--){
        int x, y, k, n;
        cin >> x >> y >> k >> n;

        vector <int> page(n);
        vector <int> cost(n);

        for(int i = 0; i < n; i++){
            cin >> page[i] >> cost[i];
        }

        vector <int> data(n, 0);
        for(int i = 0; i < n; i++){
            if((( y+page[i]) >= x) && (k >= cost[i])){
                data[i] = 1;
            }
        }

        int c = 0;
        for(int i = 0; i < n; i++){
            if(data[i] != 1){
                c++;
            }
        }

        if(c == n)
            cout << "UnluckyChef" <<endl;
        else
            cout << "LuckyChef" <<endl;
    }
    return 0;
}
