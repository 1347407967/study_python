print('hello python')
print("are you ok ?")
print(500)
# 打印整数
print(400)
print(100+1)
# con=input("please input Content:")
# print("conint is %r"%con)

a=2.1
b=3.6
c=a+b+1
print(c)



# 数组
print('\n','#数组#')
# 定义数组
int=['a','b','c','c']
#显示数组的第一个数
print('显示数组的第一个数',int[0])
#显示数组的最后一个数
print('显示末尾最后一个数',int[-1])
# 在末尾添加元素
int.append('3')
print('在末尾添加元素',int)
#用下标添加元素,在指定位置添加元素
int.insert(3,'2')
print('用下标添加元素,在指定位置添加元素',int)
# 修改元素
int[0]='1'
print('修改元素',int)
# 删除元素（从末尾开始）
int.pop()
print('删除元素，从末尾开始',int)
# 删除指定位置元素
int.pop(1)
print('删除指定位置',int,'\n')


# 元组
print('#元组#')
yz=('2.1','2.2','2.3','2.4')
print('显示元组基本操作',yz)
# 显示第一个元素
print('显示元组第一个元素',yz[0])
# 显示第二个至第四个之间的元素
print('显示第二个至第四个之间的元素',yz[1:4])
# 显示元组的长度
print('显示元组的长度',len(yz))
# 显示元组最大的元素
print('显示元组最大的元素',max(yz))
# 显示元组最小的元素
print('显示元组最小的元素',min(yz),'\n')


# 字典
print('#字典#')
student={1:'a',2:'2',3:'C',4:'4'}
print('基本操作',student)
# 增加字典元素
student[5]='5'
print('增加字典元素',student)
#修改元素
student[3]='D'
print('修改元素',student)
# 删除字典
del student[1]
print('删除元素',student)