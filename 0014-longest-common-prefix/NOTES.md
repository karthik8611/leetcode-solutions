**Complexity**
**Time complexity:**
Sorting the array of strings takes O(Nlog(N)) time. This is because most of the common sorting algorithms like quicksort, mergesort, and heapsort have an average time complexity of O(Nlog(N)).
Iterating over the characters of the first and last strings takes O(M) time. This is because the code compares the characters of the two strings until it finds the first mismatch.
Therefore, the total time complexity is O(Nlog(N) + M).
​
**Space complexity:**
The space used by the two string variables s1 and s2 is proportional to the length of the longest string in the array. Therefore, the space complexity is O(1) as it does not depend on the size of the input array.