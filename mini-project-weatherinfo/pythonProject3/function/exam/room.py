class TV:
    width = 0
    company = None
    reply = None

    def turn_on(self):
        print('켜졌습니다')
    def turn_off(self):
        print('꺼졌습니다.')
    def __str__(self):
        return str(self.width) + ',' + str(self.company) + ',' + str(self.reply)