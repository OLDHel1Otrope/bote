#include<iostream>
using namespace std;
int main(){
    int binary_fom=0;
    int number,x,remainder;

    cout<<"decimal number";
    cin>>number;
    x=number;
    while(x!=0){
        if(x%2==0){
            remainder=0;
        }
        else remainder=1;
    binary_fom=(10*binary_fom)+remainder;
    x/=2;
    cout<<binary_fom;
    }

    cout<<endl <<binary_fom<<"  is the binary form of "<< number;
}