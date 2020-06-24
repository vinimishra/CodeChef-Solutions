#include<stdio.h>

int main()
{
    int testCase;
    scanf("%d", &testCase);
    while (testCase--)
    {
        float quantity, price;
        printf("\n");
        scanf("%f %f", &quantity, &price);
        if (quantity>1000)
            printf("%f", quantity*price*0.9);
        else
            printf("%f", quantity*price);
    }
    return 0;
}
