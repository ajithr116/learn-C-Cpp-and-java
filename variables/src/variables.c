/*
 ============================================================================
 Name        : variables.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */
#include <stdio.h>
#include <stdlib.h>

int main(void)
{
	int num1,num2,sum;
	printf("enter 1st number : ");
	fflush(stdout);
	scanf("%d",&num1);

	printf("enter number 2 ");
	fflush(stdout);
	scanf("%d",&num2);

	sum=num1+num2;
	printf("total : %d",sum);

	return EXIT_SUCCESS;
}
