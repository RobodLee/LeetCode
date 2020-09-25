# LeetCode题解

+ [CSDN](https://blog.csdn.net/weixin_43461520)  
+ [掘金](https://juejin.im/user/3175045314120631)  
+ [博客园](https://www.cnblogs.com/robod/)
+ 公众号：[Robod](https://gitee.com/RobodLee/image_store/blob/master/QRcode2.0.png)
+ Github：[https://github.com/RobodLee](https://github.com/RobodLee)

## $[19. 删除链表的倒数第N个节点](https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/)（中等；双指针）

### 2020/8/20

这题要想只进行一次遍历，可以采用双指针的方法。先将p2向前移动 n+1 个，再和p1一起向后移动。当p2移动到末尾的时候，p1也移动到了待删除节点的前面一个节点。然后 **p1.next = p1.next.next** 即可删除指定节点。

但是这样会存在一个问题，就是没法去删除第一个节点。所以事先在head前面添加一个节点p，这样最后返回 p.next 即可。

***

## $[69. x 的平方根](https://leetcode-cn.com/problems/sqrtx/)（简单；二分搜索）

### 2020/8/12

采用二分搜索的思想，left等于1，right=x。循环地取middle，判断是大于x还是小于x，然后更改left或者right再逐步地去判断。如果刚好middle的平方等于x，就返回，不等于最终返回right。

有一点需要注意，中间值的平方可能会超过Integer的最大值，所以middle和middle的平方应该是long型的。

***

## $[74. 搜索二维矩阵](https://leetcode-cn.com/problems/search-a-2d-matrix/)（中等；数组）

### 2020/8/25

这题可以采用二分查找的思想，行数是**matrix.length**，列数是**matrix[0].length**；行坐标是**middle/column**，列坐标是**middle&column**。然后就可以当作一维数组的方式处理了。

***

## $[80. 删除排序数组中的重复项 II](https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii/)（中等；双指针）

### 2020/9/6

这题要求原地删除元素，所以可以采用双重循环。外层循环遍历整个数组，i<length，length代表数组的长度，当删除元素后，length的值相应改变。每次遍历的时候记录下当前元素出现的次数，如果大于二就开始内层循环删除元素。

***

## $[94. 二叉树的中序遍历](https://leetcode-cn.com/problems/binary-tree-inorder-traversal/)（中等；树）

### 2020-9-17

二叉树的中序遍历是 **根—左—右** 的顺序，所以采用递归的方式比较简单，先去递归左子树，再将根节点的值放入list，再递归右子树。

***

## $[162. 寻找峰值](https://leetcode-cn.com/problems/find-peak-element/)（中等；数组）

### 2020/8/13

这题可以用线性扫描的暴力解法，但是时间复杂度就是O(n)，要想降低时间复杂度，可以采用二分搜索 + 递归 的方式。

在指定的一段区间中找到middle的值。如果正好位于峰值，直接返回即可；如果处于上升期，递归middle右边的部分，如果处于下降区间，递归middle左边的部分。

***

## $[350. 两个数组的交集 II](https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/)（简单；哈希表）

### 2020/8/15

先将数组1放入一个Map中，key是数组中的数字，value是数字出现的次数。再准备一个List去存放结果。

遍历数组2，如果Map中有对应的值，说明这个是交集，加入List并将Map中对应的Value减1。最后遍历List，转为int[]返回即可。

***

## $[844. 比较含退格的字符串](https://leetcode-cn.com/problems/backspace-string-compare/)（简单；链表）

### 2020/9/15

首先将两个字符串转换成数组，然后分别遍历并添加到相应的栈中，遍历的时候遇到非“#”就压栈，遇到“#”判断栈是否为空，空的话不做任何操作，不为空的话就出栈。

最后将两个栈再转换成数组，通过**Arrays.equals()**进行比较，返回结果。

***

## $[1437. 是否所有 1 都至少相隔 k 个元素](https://leetcode-cn.com/problems/check-if-all-1s-are-at-least-length-k-places-away/)（中等；数组）

### 2020/8/24

虽然是判断是否所有1都至少相隔k个元素，但是只要判断相邻的两个1之间是否相隔k个元素，因为只要相邻的1满足条件，不相邻的1肯定满足条件。

先遍历到第一个1所在的位置，记录下来。再接着遍历，没遇到一个1就判断是否满足，满足就更新1的位置，接着遍历。不满足就直接返回false。

***

## $[剑指 Offer 03. 数组中重复的数字](https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/)（简单）

###  2020/9/1

一个最简单的方法就是遍历，准备一个Map集合，依次判断Map中是否已经有相同的值了，有的话就说明是重复数字，直接返回，没有的话就放入Map中再进行下一步遍历。

## $[剑指 Offer 04. 二维数组中的查找](https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/)（简单）

### 2020/9/15

因为题目给出的二维数组是从左往右递增，从上往下递增。所以先选中右上角作为基准点，循环地去判断，当基准大于目标值的时候掉基准所在的那一列，当基准小于目标值的，排除掉基准所在的那一行，这样逐步找到目标值。

***

## $[剑指 Offer 05. 替换空格](https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/)（简单）

### 2020/9/18

在Java中，字符串被设计为不可变，所以这题比较简单的做法就是使用一个StringBuilder去拼接字符串。遍历原始字符串，不是空格就直接添加到StringBuilder中，是空格就添加一个“%20”。

***

## $[剑指 Offer 06. 从尾到头打印链表](https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/)（简单）

### 2020-9-18

先遍历一遍链表，将结果依次放入栈中，这样再从栈中取值就是逆序打印了。

遍历完链表后就可以知道数的个数，然后创建一个数组。依次从栈中取值放入数组中，然后返回。

***

## $[剑指 Offer 09. 用两个栈实现队列](https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/)（简单）

### 2020-9-18

队列是先进先出，栈是先进后出。添加数据时存入Stack1中，取数据时，判断stack2中是否有数据，有的话从stack2中取，没有的话将stack1中的数据依次弹出再压入stack2，再从stack2中取，如果此时stack2中没有数据，说明队列中没有数据，返回-1。

***

## $[剑指 Offer 10- I. 斐波那契数列](https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/)（简单）

### 2020-9-20

这题采用递归的方式很好理解，但是如果数比较大的话，递归栈压得就比较深，耗性能。所以采用循环的方式叠加上去，因为f(n) = f(n)-1 + f(n)-2。所以从0开始往上加就可以了。

***

## $[剑指 Offer 10- II. 青蛙跳台阶问题](https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/)（简单）

### 2020-9-20

当n=0的时候只有一种跳法，当n=1的时候也只有一种跳法，当n=2的时候有两种跳法。当n=3的时候，上一步可能在台阶1或者台阶2，所以是n=1和n=2的跳法之和。所以当n>=3的时候，**f(n) = f(n)-1 + f(n)-2**。就是斐波那契数列，和上一题解法一样。

***

## $[剑指 Offer 11. 旋转数组的最小数字](https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/)（简单；二分查找）

### 2020/9/20

正常的情况下，第一个元素是大于等于最后一个元素的。所以中间元素如果大于等于left，则中间元素在第一个递增序列；如果中间元素小于right，则中间元素在第二个递增序列。最后的情况应该是left指向第一个递增序列的最后一个元素，right指向第二个递增序列的第一个元素，所以**right-left==1**的时候就可以找到最小的元素。但是也有特殊的情况，就是**left=middle=right**，这种情况只能从头遍历。

***

## $[剑指 Offer 12. 矩阵中的路径](https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof/)（中等，回溯）

### 2020/9/21

该题采用回溯的方法，当走到一格的时候，分别从上下左右四个方向去试，如果某个方向不行的话就返回false退回上一步。走过的格子临时将其改为 **“~”**，当遇到**“~”**的时候说明该格已经走过，返回false，当返回false的时候将改为~的格子再改回去。

***

## $[剑指 Offer 13. 机器人的运动范围](https://leetcode-cn.com/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/)（中等；回溯）

### 20209/24

和上一题类似，采用回溯的算法，先用一个二维的boolean数组存放某个格子时候走过，然后从0,0开始走，每到一个格子都走上下左右四个方向。

## $[剑指 Offer 15. 二进制中1的个数](https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/)（简单）

先定义一个变量flag=1。然后和n进行与操作，比较完了之后再将flag左移一位，这样就是一位一位的比较，但是最高位比不了。所以最后和第32位单独与一下。

## $[剑指 Offer 16. 数值的整数次方](https://leetcode-cn.com/problems/shu-zhi-de-zheng-shu-ci-fang-lcof/)（中等）

### 2020-9-25

![](https://gitee.com/RobodLee/image_store/raw/master/算法和数据结构/LeetCode题解/a的n次方公式.jpg)

这题可以采用上述公式递归的方式求解。一开始要考虑几个特殊情况

+ 任何数的0次方等于1，0的0次方也当成0处理
+ 1的任意次方等于1
+ -1的偶数次方等于1，奇数次方等于-1
+ 如果n小于等于Integer.MIN_VALUE的话，结果会非常小，当成0处理

***



![微信公众号](https://gitee.com/RobodLee/image_store/raw/master/QRcode2.0.png)