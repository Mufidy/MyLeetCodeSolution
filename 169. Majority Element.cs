/*
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
*/

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Majority_Element
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] nums = { 1, 1, 1, 1, 2, 3 };
            Solution s = new Solution();
            Console.WriteLine(s.MajorityElement(nums));
            Console.ReadKey();
        }

    }

    public class Solution
    {
        public int MajorityElement(int[] nums)
        {
            int result = nums[0];
            int count = 0;
            for (int i = 0; i < nums.Length; i++)
            {
                if (count == 0)
                {
                    result = nums[i];
                }
                if (nums[i] == result)
                {
                    count++;
                }
                else
                {
                    count--;
                }
            }
            return result;
        }
    }
}
