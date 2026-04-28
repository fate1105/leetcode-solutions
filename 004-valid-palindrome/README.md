# 125. Valid Palindrome

LeetCode: https://leetcode.com/problems/valid-palindrome/

## Topics

Two Pointers, String

---

## Problem

A phrase is a **palindrome** if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string `s`, return `true` if it is a **palindrome**, or `false` otherwise.

---

## Example

### Example 1:
**Input:** `s = "A man, a plan, a canal: Panama"`  
**Output:** `true`  
**Explanation:** `"amanaplanacanalpanama"` is a palindrome.

### Example 2:
**Input:** `s = "race a car"`  
**Output:** `false`  
**Explanation:** `"raceacar"` is not a palindrome.

### Example 3:
**Input:** `s = " "`  
**Output:** `true`  
**Explanation:** `s` is an empty string `""` after removing non-alphanumeric characters. Since an empty string reads the same forward and backward, it is a palindrome.

---

## Approach

We use the **Two-Pointer** technique to achieve the best performance:

1.  Initialize two pointers: `left` at the start (0) and `right` at the end (`s.length() - 1`).
2.  While `left < right`:
    *   If the character at `left` is not alphanumeric, increment `left`.
    *   Else if the character at `right` is not alphanumeric, decrement `right`.
    *   Otherwise, compare the characters at `left` and `right` (converting both to lowercase):
        *   If they don't match, return `false`.
        *   If they match, move both pointers towards the center (`left++`, `right--`).
3.  If the loop finishes, the string is a palindrome. Return `true`.

---

## Complexity

- Time Complexity: **O(n)** (each character is visited at most once)
- Space Complexity: **O(1)** (no extra strings or data structures created)

---

## Java Solution
