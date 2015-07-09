根据老师给的Demo3进行了一些修改，成为一个可用于成绩登记的web应用  
可以实现成绩的创建、删除、更新并显示成绩列表和成绩的均值、方差计算  
每条记录包括学号、姓名、成绩和一个自动生成的id，此外还包括创建时间和更新时间（不显示)  
其中id和学号是唯一的   
使用H2数据库，在\springmvc\src\main\resources\META-INF\spring\springmvc-infra.properties中database.url项可改变数据库存储的位置  