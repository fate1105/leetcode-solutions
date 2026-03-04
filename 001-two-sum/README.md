# 1. Two Sum

LeetCode: https://leetcode.com/problems/two-sum/

## Topics

Array, Hash Table

---

## Problem

Given an array of integers `nums` and an integer `target`, return **indices of the two numbers** such that they add up to `target`.

You may assume that each input would have **exactly one solution**, and you may not use the same element twice.

You can return the answer in any order.

---

## Example

Input

nums = [2,7,11,15]
target = 9

Output

[0,1]

Explanation

nums[0] + nums[1] = 2 + 7 = 9

---

## Hint (from LeetCode)

* Brute force would check all pairs of numbers.
* Fix one number `x`, then search for `target - x`.
* Using a **HashMap** can speed up the lookup.

---

## Approach

Use a **HashMap** to store the value and its index while iterating through the array.

For each element:

1. Compute `target - nums[i]`
2. Check if the complement exists in the map
3. If it exists → return the indices
4. Otherwise store the current number in the map

---

## Complexity

- Time Complexity: **O(n)**
- Space Complexity: **O(n)**

---

## Java Solution
