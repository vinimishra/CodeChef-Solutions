#include <iostream>
#define SIZE 1000000

using namespace std;

int main()
{
    int listOfElements[SIZE]={0};
    int numberOfElements,a;
    cin>>numberOfElements;
    while(numberOfElements--)
    {
        cin>>a;
        listOfElements[a]++;
    }
    cout<<endl;
    for(int j=0;j<SIZE;j++)
        if(listOfElements[j]!=0)
            while(listOfElements[j]--)
                cout<<j<<endl;
    return 0;
}
