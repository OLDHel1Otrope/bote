#include<iostream>
#include<cmath>
using namespace std;
int main(){
    int number,z,x,y=0,w;
    int arr[50];
    int i=0;
    bool isNegative=false;
    cout<<"Enter the number";
    cin>>number;
   

    if(number<0){
        number*=-1;
        isNegative=true;
    }
     x=number;
    while(x>0){
        arr[i]=x%10;
        x/=10;
        i++;
    }

    for(w=i-1,z=0;w>0,z<i;w--,z++){
        y+=(pow(10,w)*arr[z]);
    }
    if( isNegative==true){
        y*=-1;
    }
    cout<<"the inverted array is"<<y;


}