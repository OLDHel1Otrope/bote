#include<iostream>
#include<math.h>
using namespace std;
int main(){
    int binary_fom=0;
    int number,x,remainder;

    cout<<"decimal number";
    cin>>number;
    x=number;
    int i=1;
    while(x!=0){
        if(x%2==0){
            remainder=0;
        }
        else remainder=1;
    binary_fom=binary_fom+(i*remainder);
    cout<<x<<"\t"<<remainder<<endl;
    //cout<<binary_fom;
    i*=10;
    x/=2;
    }

    cout<<endl <<binary_fom<<"  is the binary form of "<< number;
}