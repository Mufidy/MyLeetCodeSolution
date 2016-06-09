/*Given an integer, write a function to determine if it is a power of two.*/
#include <iostream>
using namespace std;

bool isPowerOfTwo(int n)
{
    if (n < 0)
        return false;
    int tmp, count = 0;
    for (int i = 0; i < 31; i++)
    {
        tmp = n & (1 << i);
        if (tmp>0)
        {
            count++;
        }
    }
    return count == 1;
}

int main()
{
    int n = 0;
    while (cin>>n)
    {
        cout << isPowerOfTwo(n) << endl;
    }
}