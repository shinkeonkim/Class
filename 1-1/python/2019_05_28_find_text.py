import os
import queue as q

def get_subdir(path):
    sub_directory = []
    try:
        dirfiles = os.listdir(path)
    except PermissionError:
        return sub_directory

    for i in dirfiles:
        fullname=path+i
        if os.path.isdir(fullname):
            sub_directory.append(fullname+"/")
        else:
            if fullname.find(".txt")>-1:
                print(fullname)
    return sub_directory

dir_queue= q.Queue()
dir_queue.put("C:/Program Files/")

while not dir_queue.empty():
    dir_name = dir_queue.get()
    #print(dir_name)
    sub_directory = get_subdir(dir_name)

    for i in sub_directory:
        dir_queue.put(i)