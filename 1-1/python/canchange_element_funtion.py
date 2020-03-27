def get_sum(*args):
    ret=0
    for i in args:
        ret+=i
    return i
a=(1,2,3,4,5,6,7)
print(get_sum(*a))
