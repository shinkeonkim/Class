class Vector2D :
    def __init__(self,x,y):
        self.x=x
        self.y=y
    def __add__(self,other):
        return Vector2D(self.x + other.x , self.y + other.y)
    def __sub__(self,other):
        return Vector2D(self.x - other.x , self.y - other.y)
    def __eq__(self,other):
        return self.x == other.x and self.y == other.y
    def __ne__(self,other):
        print("호출")
        return self.x != other.x or self.y != other.y
    def __str__(self):
        return "({} , {})".format(self.x,self.y)

u=Vector2D(0,1)
v=Vector2D(2,0)

print("u + v =",u+v)
print("u - v =",u-v)