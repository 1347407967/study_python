# a=71
# if a>90:
#     print('优秀')
# elif a>80:
#     print('还可以')
# elif a>70:
#     print('ke')
# else:
#     print('回去种地吧')


# 猜数字小游戏
# # 生成随机数
# import random
# random=random.randint(1,100)
# # 用户输入数字
# a=int(input('请输入1-100之间的数字：'))
# # 判断数字的大小
# while random!=a:
#     if a>random:
#         a=int(input('大了，请重新输入：'))
#     elif a<random:
#         a=int(input('小了，请重新输入：'))
# # 玩家胜利，游戏结束
# print("恭喜你猜对了，游戏结束")

# def min_num(a,b):
#     if a!=b:
#         if a>b:
#             return a
#         elif a<b:
#             return b
#         else:
#             return a
#
# print(min_num(10,10))



# from time import sleep
#
# class Student():
#     def __init__(self,name,city):
#         self.name=name
#         self.city=city
#         print('hello,我的名字是%s,我家住在%s'%(name,city))
#     def talk(self):
#         print("hello，hello")
# stu1=Student("JKchen","黄土高坡")
# stu1.talk()
# sleep(5)
# stu2=Student("JKchen2","黄土高gao坡")
# stu2.talk()
# sleep(2)
# stu2=Student("JKchen2","黄土高gao坡")
# stu2.talk()


# try:
#     fillName=input('输入你要查询的文件名：')
#     open("%s.txt"%fillName)
#     print('有这个文件')
# except BaseException:
#     print("%s.txt这个文件不存在"%fillName)




# 文件处理
f=open('123.txt','r')
lines=f.readlines()
print(lines)
for line in lines:
    print(line.split(',')[0])



