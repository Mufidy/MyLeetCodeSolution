/*
 * Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

For example,
Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.

Note:
You may assume both s and t have the same length.
 */

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Collections.Generic;

namespace Isomorphic_Strings
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(IsIsomorphic("egg", "add"));
            Console.WriteLine(IsIsomorphic("foo", "bar"));
            Console.WriteLine(IsIsomorphic("paper", "title"));
            Console.WriteLine(IsIsomorphic("ab", "aa"));
            Console.Read();
        }

        public static bool IsIsomorphic(string s, string t)
        {
            int size = s.Length;
            Dictionary<char, char> d = new System.Collections.Generic.Dictionary<char, char>();
            for (int i = 0; i < size; i++)
            {
                if (d.ContainsKey(s[i]))
                {
                    if (d[s[i]] != t[i])
                    {
                        return false;
                    }
                }
                else
                {
                    if (d.ContainsValue(t[i]))
                    {
                        return false;
                    }
                    d.Add(s[i], t[i]);
                }               
            }
            return true;
        }
    }
}
