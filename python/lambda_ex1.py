'''
get_sum = lambda x,y : x+y
print(get_sum(1,2))

a=[("Yoon",2010),("Lee",2006),("Lia",2004)]
a.sort(key=lambda x:x[1])

print(a)


a=[("Yoon",2010),("Lee",2006),("Lia",2004)]
a.sort(key=lambda x: abs(2007-x[1]))
print(a)

a=[("Yoon",2010),("Lee",2006),("Lia",2004)]
a.sort(key=lambda x: len(x[0]))
print(a)

'''

members = ["김유진","김신건","김은수","고강현","구형모","김민정","권소예"]

for number, name in enumerate(members,start=1):
    print(number,name)


# 문자열을 숫자로 인식한뒤 정렬하고 싶다면
b=["34","123","7"]
b.sort()
print(b)
b.sort(key=int)
print(b)