def print_f(input):
    for i in input:
        print(i)

def partition( array , p, r):
    pivot = array[r]

    while p < r :
        while array[p] < pivot :
            p += 1
        while array[r] > pivot :
            r -= 1
        if array[p] == array[r] :
            p += 1
        elif p < r :
            tmp = array[p]
            array[p] = array[r]
            array[r] = tmp
    return r

def quicksort(arr, l, s):
    if  l < s :
        j = partition(arr, l, s)
        quicksort(arr, l, j-1)
        quicksort(arr, j+1, s)

test = [500, 700, 800, 100, 300, 200, 900, 400, 1000, 600]
print("Input: ")
print_f(test)

quicksort(test, 0, 9)
print("Output: ")
print_f(test)

