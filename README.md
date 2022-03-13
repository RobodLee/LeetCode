# LeetCode题解

+ [CSDN](https://blog.csdn.net/weixin_43461520)  
+ [掘金](https://juejin.im/user/3175045314120631)  
+ [博客园](https://www.cnblogs.com/robod/)
+ 公众号：[Robod](https://gitee.com/RobodLee/image_store/blob/master/QRcode2.0.png)
+ Github：[https://github.com/RobodLee](https://github.com/RobodLee)
+ DayDayUP：[https://github.com/RobodLee/DayDayUP](https://github.com/RobodLee/DayDayUP)

> **`对应代码参考相应的代码文件`**
>
> 部分题目的题解直接在代码文件的注释部分给出。

#### [54. 螺旋矩阵](https://leetcode-cn.com/problems/spiral-matrix/)

![](https://gitee.com/RobodLee/image_store/raw/master/算法和数据结构/LeetCode题解/54螺旋矩阵1.png)

矩阵的扫描是按照从外向内一圈一圈顺时针扫描。每一圈的扫描可以划分为四个方向。分别是：

1. 上侧从左向右
2. 右侧从上至下
3. 下侧从右向左
4. 左侧从下至上

如果是一个5×5的正方形矩阵，则需要扫描三圈，最中间的13是第三圈。

如果按照四边等宽的方式（右图）进行扫描，结合代码可以看出，for循环的结束条件是每侧留最后一个元素不扫描，留给下一个方向。比如第一圈元素5是方向2扫描的，25是方向3扫描的。所以最中间的13对于四个方向来说，都是最后一个元素，所以13就不会被扫描到。

所以扫描只能按照四边不等宽的方式进行（左图），这里是方向1扫描一整行的元素，其余三个方向均是留最后一个元素给下一个方向扫描。

这是在矩阵为正方形，且是奇数×奇数的时才会出现的中间元素扫描不到的情况，也可以采用四边等宽的方式进行扫描，对中间元素进行单独处理。如果是长方形矩阵，可以采用四边等宽的方式进行扫描，不会出现元素扫描不到的情况。

![微信公众号](https://gitee.com/RobodLee/image_store/raw/master/QRcode2.0.png)