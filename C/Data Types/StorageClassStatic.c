#include<stdio.h>
void addnumber();
int main(void)
{
	addnumber();
	return 0;
}
void addnumber()
{
	static int a=1;
	printf("\n%d",a);
	a+=1;
}
