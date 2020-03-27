from random import random

n=5000000

inside=0

for i in range(n):
    x=random()
    y=random()

    if x*x+y*y <= 1:
        inside+=1

pi= 4*inside/n

print(pi)