#数据结构

##栈  
    先进后出，入口和出口在一侧。如叠盘子 
##队列
    先进先出，入口和出口在两侧。如机场安检
##数组
      * 查询快：
        数组的地址是连续的，通过数组的首地址可以找的数组  
        通过数组的索引可以快速查找某个元素  
      * 增删满：
        数组的长度是固定的，增加/删除一个元素，  
        必须创建一个新数组把源数组的数据复制过来
##链表
          ˚
* 查询慢：
    链表的地址不是连续的，每次查询元素都必须从头开始查询
* 增删快：
    链表结构，增加/删除一个元素，对链表的整体结构没有影响
    所以增删快
1. 节点  
    链表中的每一个元素称之为节点  
    一个节点包含了一个数据源(存储数组)，两个指针域(存储地址)  
   |自己的地址|数据|下一个节点的地址|
2. 单向链表  
    链表中只有一条链子，不能保证元素的顺序(存储元素和取出元素的顺序可能不一致)
3. 双向链表  
    链表中有两条链子，有一条链子是专门记录元素的顺序，是一个有序的集合   
## 二叉树  
    分支不能超过两个
- 排序树/查找树  
  在二叉树的基础上，元素是有大小顺序的  
  左侧子树小，右侧子树大
- 平衡树  
  左侧和右侧数量相等
- 不平衡树
  左侧和右侧数量不相等
- 红黑树
  1. 特点：趋近于平衡树，查询速度非常快，查询叶子节点最大次数和最小次数不能超过2倍  
  2. 约束条件：
     1. 节点可以是红色或者黑色的
     2. 根节点是黑色的
     3. 叶子节点(空节点)是黑色的
     4. 每个红色的节点的子节点都是黑色的
     5. 任何一个节点到其每一个叶子节点的所有路径上黑色节点树相同
