def calc(val):
    if val > 1500:
        return 0
    else:
        return (1 / val) + -1 * calc(val + 2)

print(4 * calc(1))
