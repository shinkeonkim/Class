import turtle as t
import time    

def f(length):
    global angle
    if(length>0):
        t.forward(length)
        t.left(angle)
        f((length*3)//5)
        t.right(angle*2)
        f((length*3)//5)
        t.left(angle)
        t.backward(length)

angle = 30 
t.left(90)
f(100)

time.sleep(1)