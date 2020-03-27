import numpy as np
import matplotlib.pyplot as plt

# 평균 55, 표준편차 5를 가지는 >>> # 난수 1000개를 발생시킴 
data = 55 + 5*np.random.randn(1000)

# histogram of the data
num_bins = 10
plt.hist(data, num_bins, normed=False)
plt.show()

labels = ['Java', 'C/C++', 'Python', 'JavaScript']
sizes = [35, 30, 25, 10]
colors = ['yellowgreen', 'gold', 'lightskyblue', 'lightcoral']
explode = (0, 0, 0.1, 0) # 2번째 슬라이스만 띄우기

plt.pie(sizes, explode=explode, labels=labels, colors=colors, autopct='%1.1f%%', shadow=True, startangle=90)

plt.axis('equal') # 그림이 찌그러지지 않게 하기
plt.show()
