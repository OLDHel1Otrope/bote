#include<iostream>
using namespace std;int main(){
    float y=0;
    float fact=1;
    int n=5;
    for(int i=1;i<n+1;i++){
        fact*=i;
        y=y+(1/fact);
     cout<<fact<<"\t"<<y<<endl;
    }
    cout<<y;
}
