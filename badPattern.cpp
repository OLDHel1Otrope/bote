#include<iostream>
#include<string>
using namespace std;
int main(){
    string c;
    string m="bad";
    getline(cin,c,'\n');
    if (c.length()<3){
        cout<<false;
    }
    else if(m==c.substr(0,3)||m==c.substr(1,3)){
        cout<<true;
    }
    else{
        cout<<false;
    }

}
