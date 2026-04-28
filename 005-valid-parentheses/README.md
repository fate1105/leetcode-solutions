# 20. Valid Parentheses

LeetCode: https://leetcode.com/problems/valid-parentheses/

## Topics

Stack, String

---

## Problem

Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.

An input string is valid if:
1.  Open brackets must be closed by the same type of brackets.
2.  Open brackets must be closed in the correct order.
3.  Every close bracket has a corresponding open bracket of the same type.

---

## Example

### Example 1:
**Input:** `s = "()"`  
**Output:** `true`

### Example 2:
**Input:** `s = "()[]{}"`  
**Output:** `true`

### Example 3:
**Input:** `s = "(]"`  
**Output:** `false`

### Example 4:
**Input:** `s = "([])"`  
**Output:** `true`

---

## Approach

We use a **Stack** data structure to solve this problem efficiently:

1.  Initialize an empty stack.
2.  Iterate through each character `c` in the string:
    *   If `c` is an opening bracket (`(`, `[`, `{`), push its corresponding **closing** bracket onto the stack. This makes checking later much easier.
    *   If `c` is a closing bracket:
        *   Check if the stack is empty. If it is, there's no matching opening bracket, so return `false`.
        *   Pop the top element from the stack and compare it with `c`. If they don't match, return `false`.
3.  After the loop, if the stack is empty, all brackets were correctly matched. Return `true`. Otherwise, return `false`.

---

## Complexity

- Time Complexity: **O(n)** (we process each character exactly once)
- Space Complexity: **O(n)** (in the worst case, the stack could store all characters if they are all opening brackets)

---

## Java Solution
