from random import random

inside=0

f=open("test.txt",'rb')

data=f.read()

for i in range(0,len(data),2):
    x=data[i]/255
    y=data[i+1]/255

    if x*x+y*y <= 1:
        inside+=1

pi= 4*inside/(len(data)//2)

f.close()

print(pi)