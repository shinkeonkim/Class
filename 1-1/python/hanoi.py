def f(n,start,by,end):
    global Cnt
    Cnt += 1
    if(n==1):
        print("{} 원판을 {}에서 {}로 이동".format(n,start,end))
    else:
        f(n-1,start,end,by)
        print("{} 원판을 {}에서 {}로 이동".format(n,start,end))
        f(n-1,by,start,end)

Cnt=0
N=int(input())
f(N,1,2,3)
print("{}번 이동시켰습니다.".format(Cnt))
    