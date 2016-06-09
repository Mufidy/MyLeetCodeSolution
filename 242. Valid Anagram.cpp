/*Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? How would you adapt your solution to such case?*/

#include <iostream>
using namespace std;

bool isAnagram(string s, string t)
{
    int lens = s.length();
    int lent = t.length();
    if (lens != lent)
        return false;
    const int length = 128;
    int arrs[length] = { 0 };
    int arrt[length] = { 0 };
    for (int i = 0; i < lens; i++)
    {
        arrs[s.at(i)]++;
        arrt[t.at(i)]++;
    }
    for (int i = 0; i < length; i++)
    {
        if (arrs[i] != arrt[i])
        {
            return false;
        }
    }
    return true;
}

int main()
{
    string s = "anagram", t = "nagaram";
    cout << isAnagram(s, t);
}