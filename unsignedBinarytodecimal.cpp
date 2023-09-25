#include<iostream>
#include<cmath>
using namespace std;

int main(){
    string str;
    bool isNegative=false;
    int integerVal=0;
    cout<<"enter the binary number";
    cin>>str;
    int x=str.length();
    cout<<"the length of the string is \t";
    cout<<x<<endl;
    if(x==32 && str[0]==49){
        for(int i=0;i<str.length();i++){
            if(str[i]==48){
                str[i]=49;
            }
            else{
                str[i]=48;
            }
        cout<<str<<endl;
        }
        for(int i=str.length();i>0;i--){
            if(str[i]==49)
            {
                str[i]=48;
                for(x=str.length()-1;x>str.length()-i-1;x--){
                    str[i]=49;
                }
                break;
            }
        }
        for(int i=x-1;i>=0;i--){
            int c=str[i]-48;
            integerVal+=((pow(2,x-i-1))*c);
            cout<<c<<"\t"<<pow(2,x-i-1)<<"\t"<<integerVal<<endl;
        }
        integerVal*=-1;
    }
    else{
        for(int i=x-1;i>=0;i--){
            int c=str[i]-48;
            integerVal+=((pow(2,x-i-1))*c);

            cout<<c<<"\t"<<pow(2,x-i-1)<<"\t"<<integerVal<<endl;
        }
    }
    cout<<integerVal;
}

