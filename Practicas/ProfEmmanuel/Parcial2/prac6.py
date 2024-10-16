num = int(input("Dame altura de alrbol: "))

for i in range(num):
    print(" " * (num - i) + "*" * (2 * i - 1))