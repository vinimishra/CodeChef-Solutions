#include <iostream>

using namespace std;

int main()
{
    int testCase;
    cin>>testCase;

    while(testCase--){

        int numOfLines;
        cin>>numOfLines;

        int triangle[numOfLines][numOfLines];
        for(int i=0;i<numOfLines;i++)
            for(int j=0;j<=i;j++)
                cin>>triangle[i][j];

         for(int i=numOfLines-1;i>=0;i--)
           for(int j=i;j>=0;j--)
            {
                triangle[i-1][j]+=max(triangle[i][j],triangle[i][j+1]);
            }
          cout<<triangle[0][0]<<endl;
    }
    return 0;
}
