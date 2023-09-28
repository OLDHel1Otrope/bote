//printing all pythagorean triplets whose sum is less than or equal to 1000
    float a, b;
    float c=0;
    int d=0;
    int e;
  for(a=1;a<500;a++){
        for(b=1;b<500;b++){
            c=a*a+b*b;
            c=pow(c,0.5);
            d=c;
            e=a+b+c;
            if(c==d && e<=1000){
                cout<<a<<"\t"<<b<<"\t"<<c<<"\t"<<e<<endl;
            }
        }
    }
