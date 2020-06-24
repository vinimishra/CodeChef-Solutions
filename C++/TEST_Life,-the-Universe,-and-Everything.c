/*https://www.codechef.com/problems/TEST*/

#include <iostream>

using namespace std;

int main()
{
    int number;
    while(1){
        cin>>number;
        if(number>99)
            continue;
        if(number==42)
            break;
        cout<<number<<endl;
    }
    return 0;
}
