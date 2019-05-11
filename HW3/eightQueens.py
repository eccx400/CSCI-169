board = [[0]*8 for _ in range(0,8)]

def isSafe(row, col):
    for i in range(8):
        if board[row][i] == 1 or board[i][col] == 1:
            return True
    for j in range(8):
        for k in range(8):
            if (j + k == row + col) or (j - k == row - col):
                if board[j][k] == 1:
                    return True
    return False

def nqueens(n):
    if n == 0:
        return True
    for i in range(8):
        for j in range(8):
            if (isSafe(i,j) == False ):
                board[i][j] = 1
                if nqueens(n - 1) == True:
                    return True
                board[i][j] = 0
    return False

nqueens(8)
for i in board:
	print(i)

