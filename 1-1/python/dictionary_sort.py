student ={
    20191564: 4.3, 20153180 : 3.7, 20153250 :4.5
}

for key,value in sorted (student.items(),key=lambda x:x[1],reverse=True):
    print(key,value)