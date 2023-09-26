#include<iostream>
#include<cmath>
using namespace std;
int main(){
    int number,rebmun=0;
    int x,z,i=0;
    int arr[100];
    cout<<"enter the number";
    cin>>number;
    x=number;

    while (x>0)
    {
        z=x%2;
        if(z==0){
            rebmun+=pow(2,i)*1;
        }
        if(z==1){
            rebmun+=pow(2,i)*0;
        }
        x/=2;
        cout<<i<<endl;
        i++;
    }
    
    cout<<rebmun;
}