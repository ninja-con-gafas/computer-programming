#include <stdio.h>
int main(void)
{
	int in,i,fact=1;
	printf("\nEnter A number\n");
	scanf("%d",&in);
	for(i=1;i<=in;i++)
	{
		fact=fact*i;
	}
	printf("\nFactorial of %d is %d\n",in,fact);
	return 0;
}
