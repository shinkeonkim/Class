class Vehicle:
    _ACCELERATION =5
    def __init__(self):
        self._speed = 0
    def speed_up(self):
        if self._speed + self._ACCELERATION <=240:
            self._speed +=self._ACCELERATION
    def __str__(self):
        return "현재 속도는 {} 입니다.".format(self._speed)

class AutonomousVehicle(Vehicle):
    def __init__(self):
        super().__init__()
        self.__autonomous_mode = False
    def activate_autonomous_mode(self):
        self.__autonomous_mode = True
    def deactive_autonomous_mode(self):
        self.__autonomous_mode = False
    def __str__(self):
        if self.__autonomous_mode:
            return "자율 주행 모드: 현재 속도는 {} 입니다.".format(self._speed)
        else:
            return "수동 주행 모드: 현재 속도는 {} 입니다.".format(self._speed)


vehicle = Vehicle()
autonomous_vehicle = AutonomousVehicle()
for i in range(1, 25) :
    autonomous_vehicle.speed_up()
    vehicle.speed_up()
print(autonomous_vehicle)
print(vehicle)
autonomous_vehicle.activate_autonomous_mode()
print(autonomous_vehicle)
print(vehicle)
