int  main(){
  //not final
  sum=0;
  int n=5;
    if(n==1){
        sum=1;
    }
    else{
        sum+=(n+1)*(n+1);
        for(int j=1;j<=n;j++){
            sum+=8;
        }
    }
  cout<<sum;
}
