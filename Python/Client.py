class Client:

    print("Only test")

    def __init__(self, n, num):
        self._name = n
        self._number=num
        self._money

    def set_name(self, name):
        self.name = name

    def set_number(self, number):
        self.number = number

    def set_money(self, money):
        if(money < 0):
            print("deposit a valid money")
        else:
            self._money = money

    def get_name(self):
        return self._name    
    def get_number(self):
        return self._number
    def get_money(self):
        return serl._money