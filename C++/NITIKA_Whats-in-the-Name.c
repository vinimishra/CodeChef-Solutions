#include <iostream>

using namespace std;

int main()
{
    int testCase;
    cin>>testCase;
    cin.ignore();

    while(testCase--){
        string name;
        getline(cin>>ws,name);

        int countOf=0;
        for(int i=0; i<name[i]!='\0';i++)
            if(name[i]==' ')
                countOf++;

        char abbName[name.length()];
        int j=0;
        int found = name.find_last_of(' ');
        if(countOf==2){
            abbName[j]=toupper(name[0]);
            j++;
            abbName[j]='.';
            j++;
            abbName[j]=' ';
            j++;
            for(int i=1;i<found;i++){
                if(name[i]==' '){
                    abbName[j]=toupper(name[i+1]);
                    j++;
                    abbName[j]='.';
                    j++;
                    abbName[j]=' ';
                    j++;
                    break;
                }
            }
        }
        if(countOf==1){
            abbName[j]=toupper(name[0]);
            j++;
            abbName[j]='.';
            j++;
            abbName[j]=' ';
            j++;
        }
        for(int i=found+1;i<name.length();i++){
            if(i==found+1){
                if(islower(name[i])){
                    abbName[j]=toupper(name[i]);
                    j++;
                }
                else{
                    abbName[j]=name[i];
                    j++;
                }
            }
            else{
                if(name[i]!=' '){
                    abbName[j]=tolower(name[i]);
                    j++;
                }
            }
        }
        abbName[j]='\0';
        for(int i=0; abbName[i]!='\0';i++)
            cout<<abbName[i];
        cout<<endl;
    }
    return 0;
}
