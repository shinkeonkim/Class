def f1():
    print("f1 start")
    f2()
    print("f2 end")
def f2():
    print("f2 start")
    f3()
    print("f2 end")
def f3():
    print("f3 start")
    print("f3 end")

print("Main Program start")
f1()
print("Main Program end")