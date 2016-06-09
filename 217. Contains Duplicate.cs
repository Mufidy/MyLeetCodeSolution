using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Contains_Duplicate
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
            Console.WriteLine(ContainsDuplicate(a));
            Console.WriteLine(ContainsDuplicate(a));
            
            a[8] = 3;
            Console.WriteLine(ContainsNearbyDuplicate(a, 5));
            Console.WriteLine(ContainsNearbyDuplicate(a, 3));
            Console.Read();
        }

        public static bool ContainsDuplicate(int[] nums)
        {
            //   method 1
            //for (int i = 0; i < nums.Length; i++)
            //{
            //    for (int j = i + 1; j < nums.Length; j++)
            //    {
            //        if (nums[i] == nums[j])
            //        {
            //            return true;
            //        }
            //    }
            //}
            //return false;

            //  method 2
            //Dictionary<int, int> d = new Dictionary<int, int>();
            //for (int i = 0; i < nums.Length; i++)
            //{
            //    if (d.ContainsKey(nums[i]))
            //    {
            //        return true;
            //    }
            //    d.Add(nums[i], 0);
            //}
            //return false;

            //  method 3
            HashSet<int> d = new HashSet<int>();
            for (int i = 0; i < nums.Length; i++)
            {
                if (!d.Add(nums[i]))
                {
                    return true;
                }
            }
            return false;
        }

        public static bool ContainsNearbyDuplicate(int[] nums, int k)
        {
            Dictionary<int, int> d = new Dictionary<int, int>();
            for (int i = 0; i < nums.Length; i++)
            {
                if (d.ContainsKey(nums[i]))
                {
                    if (i - d[nums[i]] <= k)
                        return true;
                    else
                    {
                        d[nums[i]] = i;
                    }
                }
                else
                {
                    d.Add(nums[i], i);
                }
            }
            return false;
        }
    }
}
