from time import sleep

class client:
    def __init__(self):
        pass

def calculator():
    hours = float(input("type the study hours: "))
    videos = float(input("how many videos do you watch: "))
    books = float(input("how many books do you read: "))
    codes = float(input("how many lines codes do you write: "))

    mV = videos / hours
    mB = books / hours
    mC = codes / hours

    print("You see a " + str(mV) + " video per hour studied")
    print("You read a " + str(mB) + " book per hour studied")
    print("You write a " + str(mB) + " line codes per hour studied")

def print_hi(name):

    print("discover the password")
    index = 0
    for n in range(1, 6):
        print(n)
       # sleep(1)
    while index <= 0:
        text = input("say leviosa \n")
        if text == "leviosa":
            index = 1
        else:
            text = print("leviosa not leviosaaa")
    A = input("The first value: ")
    B = input("The second value: ")

    while(A>B):
        if(A<B):
            aux=A;
            A=B;
            B=aux;
            print("First value? ", A)
            print("Second value? ", B)
        else:
            aux = A;
            A = B;
            B = aux;
            print("Wrong values")
            A = input("The first value: ")
            B = input("The second value: ")

    print(f'Hi, {"Calil"}')


if __name__ == '__main__':
    calculator()
    print_hi('PyCharm')


