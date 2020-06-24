#include <iostream>

using namespace std;

int main()
{
    int iterations,n1,n2,n3,secondLargest;
    cin>>iterations;
    while(iterations--)
    {
        cin>>n1>>n2>>n3;
        if(n1<n2)
        {
            if(n2<n3)
                secondLargest=n2;
            else
                secondLargest=(n1<n3?n3:n1);
        }
        else
        {
            if(n1<n3)
                secondLargest=n1;
            else
                secondLargest=(n2<n3?n3:n2);
        }
        cout<<secondLargest<<endl;
    }
    return 0;
}
