Class First
{
    public static void main(String args[]);
    {
        int n;
        printf("Enter your number, terninate with a letter : ");
        while(scanf("%d", &n))
        if ((n % 5 == 0 || n % 7 == 0) && (n % 11 != 0))
                printf ("Number passes test\n");
        else
            printf("NUmber fails test\n");
        return 0; 
    }
}