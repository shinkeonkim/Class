import os

path="C:/"
dirfiles = os.listdir(path)
#print(dirfiles)

dir_names=[]
file_names=[]

for each in dirfiles:
    full_name = path + each
    if os.path.isdir(full_name):
        dir_names.append(full_name+"/")
    else:
        file_names.append(full_name)

print("dir names: ",end="")
print(dir_names)
print("files name: ",end="")
print(file_names)