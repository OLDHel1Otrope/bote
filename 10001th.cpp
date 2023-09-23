#include<iostream>
using namespace std;
int main()
{
    int number=3;
    int i;
    int count=2;
    while(count<10002){
    for(i=2;i<number;i++){
        if(number%i==0){
            break;
        }
    }
    if(i==number){
        cout<<number<<" is "<< count<<" prime"<<endl;
        count++;
    }
    number++;
    }
}