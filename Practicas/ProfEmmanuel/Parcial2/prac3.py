num = int(input("Dame numero factorial: "))

factorial = 1
i = 1
while i<= num:
    factorial *= i
    i += 1
    
print ("El factorial de " + str(num) + " es " + str(factorial))