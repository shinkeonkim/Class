print(sum([x for x in range(1,101) if x%3==0 or x %5==0]))

total = 0
for num in range(1, 101) : # num 이 3의 배수이거나 5의 배수 이면 
    if num % 3 == 0 or num % 5 == 0 : 
        total += num 
print(total)