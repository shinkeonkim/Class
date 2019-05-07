def f(n):
    if n==1:
        return 1
    else:
        return n+f(n-1)

n=int(input())
print(f(n))

S=0
for i in range(1,n+1):
    S+=i
print(S)