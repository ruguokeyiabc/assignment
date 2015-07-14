#include<stdio.h>
int fun(int n){
  if(n==0||n==1)  return n;
 
  else  return fun(n-1)+fun(n-2);
}
int main()
{
  int i,n,fn;
  printf("please input n value:");
  scanf("%d",&n);
  if(n<0) printf("error!");
  for(i=0;i<n+1;i++)
  { fn=fun(i);
    printf("%d,",fn);
  }
   printf("\n");
     
}