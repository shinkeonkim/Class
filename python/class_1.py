class Student :
    def __init__(self,name,id):
        print("생성자가 실행 되었습니다.")
        self.name= name
        self.id = id
    def __del__(self):
        print("소멸자가 실행되었습니다.")

student = Student("김영채",20153160)

print(student.name)
print(student.id)

student = 1
print(student)