Let's dry run the given string "abcabcbb" through the code:
​
1. Initialize the `arr` array of size 128 to store character counts.
2. Initialize `n` as the length of the string: 8, `max` as 0, `i` as 0, and `j` as 0.
3. Start iterating over the string from left to right.
​
Iteration 1:
- `j` is 0, so the character at index 0 is 'a'. Convert 'a' to ASCII, which is 97.
- Increment the count of 'a' in the `arr` array at index 97.
- Since it's the first occurrence of 'a', the count in the `arr` array is 1.
- No repeating characters found yet, so the `while` loop is not executed.
- Update `max` to 1 (j - i + 1).
​
Iteration 2:
- `j` is 1, so the character at index 1 is 'b'. Convert 'b' to ASCII, which is 98.
- Increment the count of 'b' in the `arr` array at index 98.
- Since it's the first occurrence of 'b', the count in the `arr` array is 1.
- No repeating characters found yet, so the `while` loop is not executed.
- Update `max` to 2 (j - i + 1).
​
Iteration 3:
- `j` is 2, so the character at index 2 is 'c'. Convert 'c' to ASCII, which is 99.
- Increment the count of 'c' in the `arr` array at index 99.
- Since it's the first occurrence of 'c', the count in the `arr` array is 1.
- No repeating characters found yet, so the `while` loop is not executed.
- Update `max` to 3 (j - i + 1).