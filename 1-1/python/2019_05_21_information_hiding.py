class Student:
    def __init__(self,name,age):
        self.name=name
        self.__age=age
    def set_age(self,age):
        if(age>0):
            self.__age=age
    def get_age(self):
        return self.__age
    def __str__(self):
        return "{} {}살".format(self.name, self.__age)

student = Student("한채연",22)
student.__age = -20
print(student)
student.set_age(20)
print(student)

