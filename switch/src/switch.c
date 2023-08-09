/*
 ============================================================================
 Name        : switch.c
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

	int choice;
	float num1,num2,total;

	printf("Enter 1st number : ");
	fflush(stdout);
	scanf("%f",&num1);

	RENTER:
	printf(" 1) add \n 2) sum\n 3) division \n 4) multiplication \n\n");
	printf("ENTER UR CHOICE \n");
	fflush(stdout);
	scanf("%d",&choice);



	switch(choice)
	{
		case 1:
			total=num1+num2;
			break;
		case 2:
			total=num1-num2;
			break;
		case 3:
			total=num1/num2;
			break;
		case 4:
			total=num1*num2;
			break;
		default:
			printf("INVALID CHOICE\n");
			goto RENTER;
	}

	printf("Enter 2nd number : ");
	fflush(stdout);
	scanf("%f",&num2);

	printf("total : %f",total);

	return EXIT_SUCCESS;
}
