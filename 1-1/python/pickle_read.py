import pickle

f=open('testPickle.dat','rb')
my_list = pickle.load(f)
print(my_list)
f.close()