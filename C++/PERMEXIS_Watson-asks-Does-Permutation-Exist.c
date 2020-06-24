#include <iostream>
#include <stdlib.h>

using namespace std;

int main()
{
    int testCase;
    cin>>testCase;
    while(testCase--){
        int numberOfELements;
        cin>>numberOfELements;

        int arrayA[numberOfELements];

        for(int i=0;i<numberOfELements;i++)
            cin>>arrayA[i];
        int arrayB[numberOfELements-1],countOf=0;
        for(int j=0;j<numberOfELements;j++){
            arrayB[j]=arrayA[j]-arrayA[j+1];
        }
        for(int k=0;k<numberOfELements;k++){
             if(abs(arrayB[k])<=1)
                countOf++;
        }
        if(countOf==numberOfELements-1)
            cout<<"YES"<<endl;
        else
            cout<<"NO"<<endl;

    }
    return 0;
}
