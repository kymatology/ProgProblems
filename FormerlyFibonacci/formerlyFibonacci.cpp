#include <stdio.h>

int main()
{
	int a,b,c,n;
	scanf("%x,%x,%x,%x", &a,&b,&c,&n);
	if(n == 1)
	{
		printf("%d\n",a);
	}
	else if(n == 2)
	{
		printf("%d\n",b);
	}
	for(int i = 0; i<n-2; i++)
	{
		int d = a + b + c;
		a = b;
		b = c;
		c = d;	
	}
	printf("%d\n",c);
	return 0;
}
