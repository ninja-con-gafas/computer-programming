#include<stdio.h>
int main(void)
{
	int i=1001,x=0;
	x=~i;
	printf("\n%d\n",x);
	x=!i;
	printf("\n%d\n",x);
	x=-i;
	printf("\n%d\n",x);
	x=+i;
	printf("\n%d\n",x);
	x=&i;
	printf("\n%d\n",x);
	return 0;
}
