/*
 ============================================================================
 Name        : swap.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {

	// swap 2
	int a=10,b=20;

	a=a+b;
	b=a-b;
	a=a-b;

	printf("a : %d \n",a);
	printf("b : %d \n",b);

	//	swap 1
	int temp,c=20,d=30;
	temp=c;
	c=d;
	d=temp;

	printf("c : %d \n",c);
	printf("d : %d \n",d);


	return EXIT_SUCCESS;
}
