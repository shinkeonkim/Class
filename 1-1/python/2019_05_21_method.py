class Student:
    def __init__(self,name,id):
        self.name=name
        self.id=id
    def self_introduce(self):
        print("안녕하세요")
        print("{} {}입니다.".format(self.id,self.name))
        print("반갑습니다")

student = Student("김신건",20191564)
student.self_introduce()