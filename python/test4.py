a=input()
Cnta=0
check=True
for i in a:
    if(i=='('):
        Cnta+=1
    if(i==')'):
        if(Cnta>0):
            Cnta-=1
        else:
            check=False
if(Cnta>0):
    check=False
if(check):
    print("올바른 문자열")
else:
    print("틀린 문자열")