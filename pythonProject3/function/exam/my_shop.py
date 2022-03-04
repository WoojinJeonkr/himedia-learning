from function.exam.shop import Shop

shop1 = Shop()
shop1.order = 5
shop1.d_price = 3000

r1 = shop1.total_price()
print(r1)

shop1.visitor = 200
r2 = shop1.total_count()
print(r2)