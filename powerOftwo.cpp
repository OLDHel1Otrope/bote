#include<iostream>
using namespace std;
int main(){
    int num,x=1;
    bool flag=false;
    cout<<"enter the number";
    cin>>num;
    while(num>=x){
        if (x==num)
            flag=true;
        x*=2;
    }
    cout<< flag;
} 