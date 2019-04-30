import math

def nCr(n,r):
    Nf=math.factorial(n)
    Rf=math.factorial(r)
    NminusRf=math.factorial(n-r)
    return Nf//(Rf*NminusRf)

# n,r=map(int,input().split())
n=input("n>>")
r=input("r>>")

print(nCr(n,r))