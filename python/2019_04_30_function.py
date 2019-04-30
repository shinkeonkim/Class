def get_sum(start,end):
    S=0
    for num in range(start,end+1):
        S+=num
    return S
a,b=map(int,input().split())

print("{}부터 {}까지의 합은 {}입니다".format(a,b,get_sum(a,b)))