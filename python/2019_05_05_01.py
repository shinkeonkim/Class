count =0

def fibo (n):
    global count
    count +=1

    if n==0:
        return 0
    elif n == 1:
        return 1
    else:
        return fibo(n-1)+fibo(n-2)


n=int(input())
print(fibo(n))
print(count)