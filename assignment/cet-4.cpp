
#include<iostream>
using namespace std;
int main(void){
int arr[8];
int b,flag;
cout<<"please input the CET-4 scores(end of -1):"<<endl;
for(int i=0;i<8;i++){
   cin>>b;
   if(b==-1) break;
   else arr[i]=b;
}
for(int j=0;j<8;j++){
	if(arr[j]>=425){ flag=1;break;}
    else flag=0;
}
if(flag==1) cout<<"pass the cet-4"<<endl;
else cout<<"NOT pass!"<<endl;
}
