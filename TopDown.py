def minimum_coins(coin_list, change):
    min_coins = change
    if change in coin_list:
        return 1, [change]
    else:
        cl = []
        for coin in coin_list:
            if coin < change:
                mt, t = minimum_coins(coin_list, change - coin)
                num_coins = 1 + mt
                if num_coins < min_coins:
                    min_coins = num_coins
                    cl = t + [coin]
    return min_coins, cl

change=int(input("enter the amount"))
coin_list = [1,2,5]
min, c = minimum_coins(coin_list, change)
print("Total number of coins required is %s." % min, c) 
