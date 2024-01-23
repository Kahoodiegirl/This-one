Class First
{
    public static void main(String args[]);
    {
        int c, count = 0;
        float n, sum = 0.0, average;
        for (c = 1; c <=20; c++)
        printf ("Enter next number : ");
        scanf("%f", &n);
        if (n < 10)
        sum +=n;
        count ++;

        average = sum / count;
        printf ("averge = %4.2f", average);
        return 0;
    }
}