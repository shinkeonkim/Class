import pickle

f=open('myDic.dat','wb')
pickle.dump({"waiver":"권리 포기, 면제","tuition":"수업료","insurance":"보험"},f)
f.close()

f=open('myDic.dat','rb')
dictionary = pickle.load(f)
print(dictionary)
f.close()