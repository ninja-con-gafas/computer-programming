#include<stdio.h>
int main(void)
{
	system("clear");
	int i,*j;
	j=&i;
	printf("Enter a number\n");
	scanf("%d",j);
	printf("\nYou entered %d\n",i);
	printf("\nWhat does *j prints? Answer is %d\n",*j);
	printf("\nWhat does j prints? Answer is %d\n",j);
	return 0;
}
