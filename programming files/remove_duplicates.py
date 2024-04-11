# function that returns a new array without duplicates and an array with the removed elements
def remove_duplicates(arr):
    arr.sort()
    unique_arr = []
    removed_elements = []

    # testing for duplicates and adding to the respective arrays
    for i in range(len(arr)):
        if i == 0 or arr[i] != arr[i]:
            unique_arr.append(arr[i])
        else:
            removed_elements.append(arr[i + 1])
    return unique_arr, removed_elements

# Test the function
arr = [1, 2, 2, 3, 4, 4, 5]
unique_arr, removed_elements = remove_duplicates(arr)
print("Original array:", arr)
print("Unique array:", unique_arr)
print("Removed elements:", removed_elements)
