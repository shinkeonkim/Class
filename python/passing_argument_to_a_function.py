def exp(g,m):
    return g(m)

def f1(x):
    return x*x

def f2(x):
    return x*x*x

n=5
print(n,exp(f1,n))
print(n,exp(f2,n))