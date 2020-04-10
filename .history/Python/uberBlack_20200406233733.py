from car import Car
class UberBlack(Car):
    typearAccepted  = []
    seatsMaterial  = []

    def __init__(self,license, driver,typearAccepted,seatsMaterial):
        super.__init__(license,driver)
        self.typearAccepted = typearAccepted
        self.seatsMaterial = seatsMaterial