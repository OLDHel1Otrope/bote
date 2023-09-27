#include<iostream>
#include <cmath>
using namespace std;

void trianglePrint(){
        for(int i=1;i<6;i++){
        for(int j=5-i;j>=0;j--){
            cout<<"\t";
        }

        for(int j=i;j>0;j--){
            cout<<j<<"\t";
        }
        cout<<endl;
    }
}

void lucasSequence(int a, int b, int m, int n)
{
    int x;
    x=a+b+m;
    cout<<x<<"\t";
    a=b;
    m++;
    if(m==n){
    }
    if(m<n+1)
    lucasSequence(a,x,m,n);

}

void sineSeries(int x){
    int power=x;
    int sum=0;
    for(int i=0;i<3;i++){
        sum+=(power*pow(-1,i));
    }
    power*=x*x;
}

void lowerToupper(){
    string x;
    int y;
    cout<<"enter the string";
    cin>>x;
    y=x.length();
    for(int i=0;i<y;i++){
        if(islower(x[i])){
            x[i]-=32;
        }
    }
}

int main(){
    int x;
    while(true){
        cout<<"enter the number, and 5 to end";
        cin>>x;

        if(x==1){

        }
         if(x==2){
            
        }
         if(x==3){
            
        }
         if(x==5){
            
        }

        if(x==5){
            break;
        }
    }
}