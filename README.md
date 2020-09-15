## $[19. 删除链表的倒数第N个节点](https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/)（中等；双指针）

+ ### 2020/8/20

	这题要想只进行一次遍历，可以采用双指针的方法。先将p2向前移动 n+1 个，再和p1一起向后移动。当p2移动到末尾的时候，p1也移动到了待删除节点的前面一个节点。然后 **p1.next = p1.next.next** 即可删除指定节点。

	但是这样会存在一个问题，就是没法去删除第一个节点。所以事先在head前面添加一个节点p，这样最后返回 p.next 即可。

***

## $[69. x 的平方根](https://leetcode-cn.com/problems/sqrtx/)（简单；二分搜索）

+ ### 2020/8/12

	采用二分搜索的思想，left等于1，right=x。循环地取middle，判断是大于x还是小于x，然后更改left或者right再逐步地去判断。如果刚好middle的平方等于x，就返回，不等于最终返回right。

	有一点需要注意，中间值的平方可能会超过Integer的最大值，所以middle和middle的平方应该是long型的。

***

## $[74. 搜索二维矩阵](https://leetcode-cn.com/problems/search-a-2d-matrix/)（中等；数组）

+ ### 2020/8/25

	这题可以采用二分查找的思想，行数是**matrix.length**，列数是**matrix[0].length**；行坐标是**middle/column**，列坐标是**middle&column**。然后就可以当作一维数组的方式处理了。

***

## $[80. 删除排序数组中的重复项 II](https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii/)（中等；双指针）

这题要求原地删除元素，所以可以采用双重循环。外层循环遍历整个数组，i<length，length代表数组的长度，当删除元素后，length的值相应改变。每次遍历的时候记录下当前元素出现的次数，如果大于二就开始内层循环删除元素。

***

## $[162. 寻找峰值](https://leetcode-cn.com/problems/find-peak-element/)（中等；数组）

+ ### 2020/8/13

	这题可以用线性扫描的暴力解法，但是时间复杂度就是O(n)，要想降低时间复杂度，可以采用二分搜索 + 递归 的方式。

	在指定的一段区间中找到middle的值。如果正好位于峰值，直接返回即可；如果处于上升期，递归middle右边的部分，如果处于下降区间，递归middle左边的部分。

***

## $[350. 两个数组的交集 II](https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/)（简单；哈希表）

+ ### 2020/8/15

	先将数组1放入一个Map中，key是数组中的数字，value是数字出现的次数。再准备一个List去存放结果。

	遍历数组2，如果Map中有对应的值，说明这个是交集，加入List并将Map中对应的Value减1。最后遍历List，转为int[]返回即可。

***

## $[844. 比较含退格的字符串](https://leetcode-cn.com/problems/backspace-string-compare/)（简单；链表）

+ ### 2020/9/15

	首先将两个字符串转换成数组，然后分别遍历并添加到相应的栈中，遍历的时候遇到非“#”就压栈，遇到“#”判断栈是否为空，空的话不做任何操作，不为空的话就出栈。

	最后将两个栈再转换成数组，通过**Arrays.equals()**进行比较，返回结果。

***

## $[1437. 是否所有 1 都至少相隔 k 个元素](https://leetcode-cn.com/problems/check-if-all-1s-are-at-least-length-k-places-away/)（中等；数组）

+ ### 2020/8/24

	虽然是判断是否所有1都至少相隔k个元素，但是只要判断相邻的两个1之间是否相隔k个元素，因为只要相邻的1满足条件，不相邻的1肯定满足条件。

	先遍历到第一个1所在的位置，记录下来。再接着遍历，没遇到一个1就判断是否满足，满足就更新1的位置，接着遍历。不满足就直接返回false。

***

## $[剑指 Offer 03. 数组中重复的数字](https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/)（简单）

+ ###  2020/9/1

	一个最简单的方法就是遍历，准备一个Map集合，依次判断Map中是否已经有相同的值了，有的话就说明是重复数字，直接返回，没有的话就放入Map中再进行下一步遍历。

## $[剑指 Offer 16. 数值的整数次方](https://leetcode-cn.com/problems/shu-zhi-de-zheng-shu-ci-fang-lcof/)



![微信公众号](https://gitee.com/RobodLee/image_store/raw/master/QRcode2.0.png)