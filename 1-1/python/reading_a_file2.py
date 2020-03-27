f=open("hello.py","r",encoding="UTF8")
text = f.readline()
print(text.strip())
f.close()