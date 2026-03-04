# 2. Palindrome Number

LeetCode: https://leetcode.com/problems/palindrome-number/

## Topics

Math

---

## Problem

Given an integer `x`, return **true** if `x` is a palindrome, and **false** otherwise.

A palindrome number reads the same **forward and backward**.

---

## Example

Input:
x = 121

Output:
true

Explanation:
121 reads as 121 from left to right and from right to left.

---

## Hint (from LeetCode)

* Beware of **integer overflow** when reversing the number.

---

## Approach

Instead of reversing the entire number, we **reverse only half of the digits**.

Steps:

1. Negative numbers are not palindromes.
2. Numbers ending with `0` (except `0` itself) cannot be palindromes.
3. Reverse digits until the reversed half becomes greater than or equal to the remaining half.
4. Compare the two halves.

---

## Complexity

Time Complexity: **O(log n)**
Because we process about half of the digits of the number.

Space Complexity: **O(1)**
Only a few integer variables are used.

---

## Java Solution
