def calculateTax(price,tax_rate):
    total = price + (price * tax_rate)
    global my_price
    my_price=my_price+200
    return total

my_price = float(input("Enter a Price : "))

total_Price =calculateTax(my_price,0.06)

print("price = ",my_price,"Total price = ", total_Price)