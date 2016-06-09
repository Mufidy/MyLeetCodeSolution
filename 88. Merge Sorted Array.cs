/*
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
 * 
 */

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LeetCode_CSharp
{
    class Merge_Sorted_Array
    {
        static void Main()
        {
            int[] nums1 = new int[10];
            for (int i = 0; i < 5; i++)
                nums1[i] = i * 2;
            int[] nums2 = { 3, 5, 8 };
            Merge(nums1, 5, nums2, 3);
            for (int i = 0; i < 8; i++)
                Console.Write(nums1[i] + " ");
            Console.WriteLine();
            int[] n1 = { 2, 0 };
            int[] n2 = { 1 };
            Merge(n1, 1, n2, 1);
            for (int i = 0; i < 2; i++)
                Console.Write(n1[i] + " ");
            Console.Read();
        }

        public static void Merge(int[] nums1, int m, int[] nums2, int n)
        {
            if (m == 0)
            {
                for (int i1 = 0; i1 < n; i1++)
                {
                    nums1[i1] = nums2[i1];
                }
                return;
            }
            int i = m-1;
            int j = n-1;
            int index = m + n - 1;
            while (index >= 0)
            {
                if (i < 0)
                {
                    for (int t = 0; t < j+1; t++)
                    {
                        nums1[t] = nums2[t];
                    }
                    break;
                }
                if (j < 0)
                {
                    break;
                }
                if (nums1[i] > nums2[j])
                {
                    nums1[index--] = nums1[i];
                    i--;
                }
                else if (nums1[i] < nums2[j])
                {
                    nums1[index--] = nums2[j];
                    j--;
                }
                else
                {
                    nums1[index--] = nums1[i];
                    nums1[index--] = nums2[j];
                    i--;
                    j--;
                }
            }
        }
    }
}
