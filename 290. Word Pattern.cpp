/*Given a pattern and a string str, find if str follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Examples:
pattern = "abba", str = "dog cat cat dog" should return true.
pattern = "abba", str = "dog cat cat fish" should return false.
pattern = "aaaa", str = "dog cat cat dog" should return false.
pattern = "abba", str = "dog dog dog dog" should return false.
Notes:
You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.*/

#include <iostream>
#include <string>
#include <map>
#include <vector>
using namespace std;

bool wordPattern(string pattern, string str)
{
    int n = 0;
    for (int i = 0; i < str.length(); i++)
    {
        if (str.at(i)==' ')
        {
            n++;
        }
    }
    if (n + 1 != pattern.length())
        return false;
    map<char, string> pattMap;
    map<string, char> strMap;
    int left = 0, index = 0;
    for (int i = 0; i < str.length(); i++)
    {
        if (str.at(i) == ' ' || i == str.length()-1)
        {
            string word = (i == str.length() - 1) ?
                str.substr(left, i - left + 1) : str.substr(left, i - left);
            char letterInPattern = pattern.at(index);
            if (pattMap.count(letterInPattern) > 0)
            {
                if (pattMap.at(letterInPattern) != word)
                {
                    return false;
                }
            }
            else
            {
                pattMap.insert(std::pair<char,string>(letterInPattern, word));
            }
            if (strMap.count(word) > 0 )
            {
                if (strMap.at(word) != letterInPattern)
                {
                    return false;
                }
            }
            else
            {
                strMap.insert(std::pair<string, char>(word, letterInPattern));
            }
            index++;
            left = i + 1;
        }        
    }
    return true;
}

int main()
{
    string pattern = "abba", str = "dog cat cat dog";
    cout << wordPattern(pattern, str);
}