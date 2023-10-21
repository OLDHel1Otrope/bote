//unfinished
#include<iostream>
#include<string>
using namespace std;

struct number_names{
    int number;
    string name;
    int name_st_c;
};

int main(){
    number_names x[10]={{0,"zero",4},{1,"one",3},{2,"two",3},{3,"three",5},{4,"four",4},{5,"five",4},{6,"six",3},{7,"seven",5},{8,"eight",5},{9,"nine",4}};
    for(int i=1;i<=1000;i++){
        cout<<i<<endl;
        int bif=i;
        while(bif>0){
            cout<<x[bif%10].name<<"\t";
            bif/=10;
        }
    }
}
