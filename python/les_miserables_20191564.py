# 20191564 김신건
# 레미제라블 단어 분포

f=open("Les_Miserables-Victor_Hugo.txt","r")
text=f.read().split()

dic={}
for i in text:

    #모두 대문자로 전환
    i=i.upper()
    #특수문자 삭제
    i=i.replace("!","")
    i=i.replace("?","")
    i=i.replace(">","")
    i=i.replace('"',"")
    i=i.replace('#',"")
    i=i.replace("'","")

    #위의 처리에 따라 문자가 사라진 경우, 처리 안함
    if(i==""):
        continue

    # 딕셔너리에 개수 추가 or 초기화
    if(i in dic):
        dic[i]+=1
    else:
        dic[i]=1

# 정렬
k=sorted(dic.items(),key=lambda t : t[1])
k.reverse()

# 출력
cnt=0
for i in k:
    if(cnt>10):
        break
    print(i,end=" ")
    print(i[1]/k[0][1])
    cnt+=1


