def secondSmallest(L):
    x=L[:]
    x.remove(min(x))
    return min(x)

X=[5,4,2,6,10,9,8,1,3,13]
print(secondSmallest(X))