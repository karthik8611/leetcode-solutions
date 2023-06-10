**Aprooach**
​
* Initialize two variables: closest_sum to keep track of the closest sum encountered so far, and min_diff to store the minimum difference between the target and the sums.
* Iterate through all possible combinations of three numbers from the given list. You can achieve this using nested loops.
* Calculate the sum of the current combination and find the absolute difference between the sum and the target.
* If the current difference is smaller than the minimum difference (min_diff), update min_diff with the new minimum difference and update closest_sum with the current sum.
* Repeat steps 3 and 4 until all combinations have been checked.
* After the iteration, closest_sum will hold the sum that is closest to the target.
​
**Complexity:**
Time Complexity: Sorting the array takes O(nlogn) time. The two-pointer approach runs in O(n^2) time. Therefore, the overall time complexity of the solution is O(n^2logn).
​
Space Complexity: We are not using any extra space in the solution. Therefore, the space complexity of the solution is O(1).