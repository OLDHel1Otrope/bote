#include<iostream>
#include<cmath>
using namespace std;
int main(){
    int binary_fom=0;
    int number=0;
    int x,remainder;
    int i=0;
    

    cout<<"enter binary format less than 31 digits";
    cin>>binary_fom;
    x=binary_fom;

 while(x>0){
    remainder=x%10;
    x/=10;
    cout<<x<<endl;
    number+=pow(2,i)*remainder;
    i++;

 }
    cout<<endl<<number;
    }