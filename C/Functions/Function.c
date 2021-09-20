#include<stdio.h>
int add();
int main(void)
{
  int a=0,b=0,sum=0;
  printf("\nEnter two numbers\n");
  scanf("%d",&a);
  printf("\n");
  scanf("%d",&b);
  sum=add(a,b);
  printf("\nSum =""%d",sum);
  return 0;
}
int add(int a,int b)
{
  int c=a+b;
  return c;
}
