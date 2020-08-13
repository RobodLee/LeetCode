## $69. [x 的平方根](https://leetcode-cn.com/problems/sqrtx/)（简单、二分搜索）

+ ### 2020/8/12

采用二分搜索的思想，left等于1，right=x。循环地取middle，判断是大于x还是小于x，然后更改left或者right再逐步地去判断。如果刚好middle的平方等于x，就返回，不等于最终返回right。

有一点需要注意，中间值的平方可能会超过Integer的最大值，所以middle和middle的平方应该是long型的。

***

## $162. [寻找峰值](https://leetcode-cn.com/problems/find-peak-element/)（中等，数组）

+ ### 2020/8/13

这题可以用线性扫描的暴力解法，但是时间复杂度就是O(n)，要想降低时间复杂度，可以采用二分搜索 + 递归 的思想。

在指定的一段区间中找到middle的值。如果正好位于峰值，直接返回即可；如果处于上升期，递归middle右边的部分，如果处于下降区间，递归middle左边的部分。

***

