#include<stdio.h>
int main(void)
{
  int i=0,j=0;
  for(i=1;i<=5;i++)
  {
    for(j=1;j<=i;j++)
    {
      printf("*");
    }
    printf("\n");
  }
}
