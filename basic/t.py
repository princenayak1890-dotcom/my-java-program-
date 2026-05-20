# Using onlby 4 loops

n = 4

for i in range(n, 0, -1):

    # First part
    for j in range(1, i + 1):
        print(j, end="")

    # Middle spaces
    for j in range(1, 2 * (n - i)):
        print(" ", end="")

    # Second part
    for j in range(i, 0, -1):

        # Skip duplicate middle number in first row
        if i == n and j == i:
            continue

        print(j, end="")

    print()