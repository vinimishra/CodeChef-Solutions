#include <bits/stdc++.h>

#define LIMIT 31623

using namespace std;

bool markPrimes[LIMIT+1];
vector <int> primeNow;

void simpleSieve(){

    memset(markPrimes,true,sizeof(markPrimes));

    for(int i=2;i<=LIMIT;i++){
        if(markPrimes[i]==true){
            for(int j=i*i;j<=LIMIT;j+=i){
                markPrimes[j]=false;
            }
        }
     }

     int primeSize=0;

     for(int k=2;k<LIMIT;k++){
        if(markPrimes[k]==true){
            primeNow.push_back(k);
            primeSize++;
        }
     }
}

void segmentedSieve(int low, int high){

    vector <bool> primeGenerator(high-low+1);
    for(size_t z=0;z<primeGenerator.size();z++){
        primeGenerator[z]=true;
    }

    int s=0, size = primeNow.size();
    while(primeNow[s]*primeNow[s] <= high && s < size){
       int p=primeNow[s];

        int temp=(low/p)*p;


            for(int j=temp;j<=high;j+=p){
                if(j<low )
                    continue;
                    if(j != p)
                    primeGenerator[j-low]=false;

            }
        s++;
    }

    for(size_t prime=0;prime<primeGenerator.size();prime++){
        if(primeGenerator[prime]==true && low+prime != 1){
            cout<<low+prime<<endl;
        }
    }
}

int main(){

    simpleSieve();

    int testCase;
    cin>>testCase;
    while(testCase--){
        int low, high;
        cin>>low>>high;
        segmentedSieve(low,high);
    }
    return 0;
}
