def tri(A,B,C):
    L=[A,B,C]
    L.sort()
    if L[2] >= L[0]+L[1]:
        return 3
    else:
        if L[2]**2 == L[0]**2+L[1]**2:
            return 0
        elif L[2]**2 > L[0]**2+L[1]**2:
            return 1
        else:
            return 2

print_list=['직각삼각형','둔각삼각형','예각삼각형','삼각형이 될 수 없습니다']

# a,b,c=map(int,input().split())
a=input("a>>")
b=input("b>>")
C=input("c>>")

print(tri(a,b,c),print_list[tri(a,b,c)])