#include <bits/stdc++.h>

using namespace std;

int main()
{
    int testCase;
    cin >> testCase;

    while(testCase--){
        int days;
        cin >> days;

        string attendence;
        cin.ignore();
        getline(cin, attendence);

        int presentCount = count(attendence.begin(), attendence.end(), 'P');
        if((float)presentCount/days >= 0.75){
            cout << "0" <<endl;
            continue;
        }
        int proxyCount = 0;
        int flag = -1;
        for(int i = 2; i < days-2; i++){
            if((attendence[i] == 'A') && ((attendence[i - 1] == 'P') || (attendence[i - 2] == 'P')) && ((attendence[i + 1] == 'P') || (attendence[i + 2] == 'P'))){
                proxyCount++;
            }
            if(((float)(presentCount+proxyCount)/days) >= 0.75){
                flag = 0;
                break;
            }

        }
        if(flag == 0)
            cout << proxyCount << endl;
        else
            cout << flag << endl;
    }
    return 0;
}
