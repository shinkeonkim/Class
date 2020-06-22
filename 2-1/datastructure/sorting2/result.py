from matplotlib import pyplot as plt
import numpy as np


merge_x = np.array(["100","1000","10000","100000"]*9)
merge_y= np.array([1,0,5,55]+[1,0,8,300]+[3,2,30,416]+[1,1,7,240]+[1,1,13,258]+[2,2,11,356]+[1,3,12,267]+\
    [1,1,15,260]+[2,3,10,275])

plt.semilogy(merge_x,merge_y,'ro')

selection_x = np.array(["100","1000","10000","100000"]*9)
selection_y= np.array([1,4,129,48833]+[7,14,185,137124]+[3,11,469,142908]+[3,12,243,132851]+[2,11,210,208849]\
    +[4,31,918,195982]+[1,5,214,103704]+[1,9,281,226523]+[2,9,280,109036])

plt.semilogy(selection_x,selection_y,'bo')


plt.xlabel('the number of data')
plt.ylabel('time')
plt.title('sorting algorithm')
plt.grid()
plt.legend(['Merge Sort', 'Selection Sort'])

plt.show()
