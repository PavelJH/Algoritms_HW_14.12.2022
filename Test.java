public class Test {

    void test1(int n)
    {
        if (n==1)
            return;
        for (int i=1; i<=n; i++) // O(n)
            for (int j=1; j<=n; j++) // O(1)
                System.out.println("*");
                    break;
    }
    // O = O(1 + n + 1) = O(n)


    void test2(int n)
    {
        if (n==1)
            return;
        for (int i=1; i<=n; i++) //O(n)
            for (int j=1; j<=n; j++) // (n)
                System.out.println("*");
    }
    //O = O(n * n) = O(n^2)

    void test3(int n)
    {
        int a = 0;
        for (i = 0; i < n; i++) //O(n)
            for (j = n; j > i; j--) // O(n/2)
                a = a + i + j;

    }
    //O = (n * n/2) = (n * n * 1/2) = (n^2)

    void test4(int n)
    {
        int i, j, a = 0;
        for (i = n/2; i <=n; i++) //O(n*1/2)
            for (j = 2; j <=n; j=j*2)//O(log n)
                a=a+n/2;

    }
    //O = (n * 1/2 * logn) = (n * logn)
    void test5(int n)
    {
        int a = 0, i = n;
        while (i > 0) {
            a += i;
            i /= 2;
        }
    }
    //O(logn)
    void method(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
    }
    //O(a+b)
    void method2(int n) {
        for (int i = 0; i < n / 2; i++) { //O (n/2)
            for (int j = 1; j + n / 2 <= n; j++) { // O (n/2)
                for (int k = 1; k <= n; k = k * 2) { // O (logn)
                    System.out.println("I am expert!");
                }
            }
        }
    }
    // O (n/2 * n/2 * logn) = n^2 * logn
    void method3(int n) {
        for (int i = 1; i <= n; i++) { // O (n)
            for (int j = 1; j <= n; j = j + i) {
                System.out.println("I am expert!");
            }
        }
    }
    //n(1/1/2...n/n)
    //O (n * logn)
}
