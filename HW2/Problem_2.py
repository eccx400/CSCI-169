def report(arr):
    name = []
    totalname = []
    sum = 0
    count = 0
    for i in arr:
        if type(i) == type(1):
            for j in name:
                totalname.append(j)
            name = []
            count += 1
            sum += i
        elif len(name) < 2:
            name.append(i)
    average = sum / count
    print(totalname ,"averaged", average)

test = ["Jill", "Johnson", 87, "Billy", "Ray", "Cyrus", 78, "Rita", "Yeats", 94, "Bobbie", "Sue", "Palmer", 72]
report(test)