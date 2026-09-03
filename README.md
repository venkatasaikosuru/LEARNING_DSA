# 📚 DSA Learning Progress — Day 1

> **Daily DSA Practice & Learning Log**

---

## 📅 Daily Summary

| Details           | Information         |
| ----------------- | ------------------- |
| 📆 **Date**       | September 1, 2026   |
| 📍 **Day**        | Tuesday             |
| ✅ **Status**      | Completed           |

---

# 1️⃣ Hashing

Today I learned the fundamentals of **Hashing** and how it can be used to efficiently **precompute, store, and fetch data**.

### 🔹 Topics Covered

* Hashing fundamentals
* Precomputation and fetching
* Frequency counting
* Using arrays for hashing
* Using `HashMap` for hashing
* Understanding hashing through **5 levels**
* Fetching stored values efficiently
* Finding the most frequent element

### 🧠 Problems Practiced

* Frequency counting
* Fetching frequencies/values
* Finding the most frequent element
* Hashing using arrays
* Hashing using `HashMap`

---

# 2️⃣ Recursion

I learned the fundamentals of **Recursion** and how a function repeatedly calls itself until it reaches a **base condition**.

### 🔹 Topics Covered

* What is recursion?
* Base condition
* Recursive call
* Understanding the **call stack**
* Parametrized recursion
* Functional recursion
* Understanding how recursion **comes back/unwinds**

### 🧠 Problems Practiced

* Print numbers from **1 to N**
* Print numbers from **N to 1**
* Sum of N numbers
* Factorial of N
* Reverse an array using recursion

---

# 📊 Today's Progress

| Topic                  | Status      |
| ---------------------- | ----------- |
| Hashing Basics         | ✅ Completed |
| Precompute & Fetch     | ✅ Completed |
| Array Hashing          | ✅ Completed |
| HashMap                | ✅ Completed |
| Frequency Counting     | ✅ Completed |
| Most Frequent Element  | ✅ Completed |
| Recursion Basics       | ✅ Completed |
| Parametrized Recursion | ✅ Completed |
| Functional Recursion   | ✅ Completed |
| Print 1 → N            | ✅ Completed |
| Print N → 1            | ✅ Completed |
| Sum of N Numbers       | ✅ Completed |
| Factorial              | ✅ Completed |
| Reverse Array          | ✅ Completed |

---

## ⏱️ Study Session

**Total Study Time:** `5 Hours` 🕔 from 10:00 am - 11:00 am && 11:30 am - 1:30 pm

> **Hashing → Recursion → Problem Solving**

---

## 🚀 Key Takeaways

* Learned how hashing can be used for **fast precomputation and fetching**.
* Understood the difference between **array hashing and `HashMap` hashing**.
* Practiced frequency-based problems.
* Understood the basic structure of recursive functions.
* Learned the difference between **parametrized and functional recursion**.
* Practiced recursion through multiple problems.
* Improved understanding of how recursive calls **go down and come back up**.

---

## 📈 Progress

**Day 1 — Completed ✅**

> Consistency > Motivation
> **Learn → Practice → Solve → Repeat 🔥**

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
📚 DSA Learning Progress — Day 2

Daily DSA Practice & Learning Log

📅 Daily Summary
Details	Information
📆 Date	September 2, 2026
📍 Day	Wednesday
✅ Status	Completed
1️⃣ Sorting

Today I learned the fundamentals of Sorting and how different sorting techniques can be used to arrange elements in a specific order.

🔹 Topics Covered
What is Sorting?
Why sorting is useful
Ascending and descending order
Comparing elements
Swapping elements
In-place sorting
Stable and unstable sorting
Best, average, and worst-case complexity
Understanding sorting algorithms through dry runs
🧠 Problems Practiced
Sort an array in ascending order
Sort an array in descending order
Identify the largest and smallest elements
Rearrange elements using sorting techniques
Understand sorting through dry runs
2️⃣ Selection Sort

I learned how Selection Sort repeatedly finds the smallest element from the unsorted portion and places it at the correct position.

🔹 Topics Covered
Selection Sort fundamentals
Finding the minimum element
Sorted and unsorted portions
Swapping elements
Number of passes
In-place sorting
Time and space complexity
🧠 Problems Practiced
Sort an array using Selection Sort
Find the minimum element in each pass
Perform Selection Sort manually
Dry run Selection Sort on different arrays
3️⃣ Bubble Sort

I learned how Bubble Sort repeatedly compares adjacent elements and swaps them when they are in the wrong order.

🔹 Topics Covered
Bubble Sort fundamentals
Comparing adjacent elements
Swapping elements
Multiple passes
Largest element moving to the end
Optimized Bubble Sort
Time and space complexity
🧠 Problems Practiced
Sort an array using Bubble Sort
Perform Bubble Sort step-by-step
Understand adjacent element swapping
Identify how the largest element moves to the end
Practice optimized Bubble Sort
4️⃣ Insertion Sort

I learned how Insertion Sort builds the sorted portion of an array one element at a time by inserting each element into its correct position.

🔹 Topics Covered
Insertion Sort fundamentals
Sorted and unsorted portions
Selecting the current element
Comparing with previous elements
Shifting elements
Inserting an element at the correct position
Time and space complexity
🧠 Problems Practiced
Sort an array using Insertion Sort
Insert elements into their correct positions
Perform Insertion Sort manually
Understand shifting of elements
Dry run Insertion Sort on different arrays
5️⃣ Quick Sort

I learned the fundamentals of Quick Sort and how the pivot is used to divide an array into smaller sections.

🔹 Topics Covered
Quick Sort fundamentals
Divide and Conquer
Choosing a pivot
Taking the low element as pivot
Partitioning
Placing the pivot in its correct position
Recursive calls
Time and space complexity
Quick Sort dry runs
🧠 Problems Practiced
Sort an array using Quick Sort
Choose the low element as pivot
Perform partitioning
Understand recursive partitioning
Dry run Quick Sort step-by-step
6️⃣ Array Rotation

I practiced array rotation and understood how elements can be shifted from one position to another.

🔹 Topics Covered
Left rotation
Moving the first element to the end
Shifting array elements
Using a temporary variable/array
Understanding index positions
Time and space complexity
🧠 Problems Practiced
Rotate an array by one position
Left rotate an array
Store shifted elements temporarily
Move the first element to the last position
Print the rotated array
⏱️ Algorithm Complexity

Understanding Time Complexity and Space Complexity is an important part of analyzing DSA algorithms.

📊 Sorting Algorithm Complexity
Algorithm	Best Case	Average Case	Worst Case	Space	Stable
Selection Sort	O(n²)	O(n²)	O(n²)	O(1)	❌ No
Bubble Sort	O(n)*	O(n²)	O(n²)	O(1)	✅ Yes
Insertion Sort	O(n)	O(n²)	O(n²)	O(1)	✅ Yes
Quick Sort	O(n log n)	O(n log n)	O(n²)	O(log n)**	❌ No

* Bubble Sort achieves O(n) best case when implemented with an early-exit/swapped flag.
** Quick Sort's auxiliary space is typically O(log n) for balanced recursion, but can reach O(n) in the worst case due to the recursion stack.

🧠 Sorting Algorithm Comparison
Algorithm	Main Idea	How It Works
Selection Sort	Select Minimum	Find the minimum and place it at the correct position
Bubble Sort	Adjacent Swapping	Compare adjacent elements and swap when needed
Insertion Sort	Insert Correctly	Take an element and insert it into the sorted portion
Quick Sort	Divide & Conquer	Select a pivot and partition the array around it
🔍 Complexity Breakdown
Selection Sort

Time Complexity: O(n²)

Space Complexity: O(1)

Selection Sort scans the remaining unsorted elements for every position.

Outer loop  → O(n)
Inner loop  → O(n)

Total → O(n × n) → O(n²)
Bubble Sort

Best Case: O(n)*
Average Case: O(n²)
Worst Case: O(n²)
Space: O(1)

Bubble Sort repeatedly compares adjacent elements.

Best Case:
Already sorted → O(n)

Average/Worst:
Multiple passes + comparisons → O(n²)
Insertion Sort

Best Case: O(n)
Average Case: O(n²)
Worst Case: O(n²)
Space: O(1)

When the array is already sorted, each element requires only one comparison.

Best:
Already sorted → O(n)

Worst:
Reverse sorted → O(n²)
Quick Sort

Best Case: O(n log n)
Average Case: O(n log n)
Worst Case: O(n²)

Quick Sort works by repeatedly partitioning the array around a pivot.

Balanced partitions:
n → n/2 → n/4 → n/8 ...
              ↓
         log n levels

Each level → O(n)

Total → O(n log n)

If the pivot repeatedly creates highly unbalanced partitions:

n → n-1 → n-2 → n-3 ...

Total → O(n²)
🔄 Array Rotation Complexity

For a simple left rotation by one position:

Operation	Time Complexity	Space Complexity
Left Rotate by 1	O(n)	O(1)*

* O(1) extra space is possible when the rotation is performed in-place. Using an additional array would require O(n) space.

Example
Before:
[1, 2, 3, 4, 5]

After Left Rotation:
[2, 3, 4, 5, 1]
📌 Complexity Cheat Sheet
Complexity	Meaning
O(1)	Constant time
O(log n)	Logarithmic time
O(n)	Linear time
O(n log n)	Linearithmic time
O(n²)	Quadratic time
O(2ⁿ)	Exponential time
O(n!)	Factorial time
⭐ Important Order
O(1)
  ↓
O(log n)
  ↓
O(n)
  ↓
O(n log n)
  ↓
O(n²)
  ↓
O(2ⁿ)
  ↓
O(n!)

Goal: Always try to design algorithms with better time and space complexity whenever possible.

📊 Today's Progress
Topic	Status
Sorting Basics	✅ Completed
Selection Sort	✅ Completed
Bubble Sort	✅ Completed
Insertion Sort	✅ Completed
Quick Sort	✅ Completed
Pivot Concept	✅ Completed
Partitioning	✅ Completed
Quick Sort Dry Run	✅ Completed
Array Rotation	✅ Completed
Left Rotation	✅ Completed
Array Shifting	✅ Completed
Time Complexity	✅ Completed
Space Complexity	✅ Completed
Algorithm Comparison	✅ Completed
Problem Solving	✅ Completed
⏱️ Study Session

Total Study Time: 5 Hours 🕔

Sorting → Complexity → Dry Run → Array Manipulation → Problem Solving

🚀 Key Takeaways
Learned the fundamentals of Sorting algorithms.
Understood how Selection Sort finds and places the minimum element.
Learned how Bubble Sort compares and swaps adjacent elements.
Understood how Insertion Sort builds the sorted portion of an array.
Learned the Divide and Conquer approach used by Quick Sort.
Understood how the pivot helps partition an array.
Practiced Quick Sort using the low element as the pivot.
Improved my understanding of recursive partitioning.
Practiced array rotation and element shifting.
Learned to calculate Time Complexity.
Learned to calculate Space Complexity.
Compared different sorting algorithms based on their complexity.
Improved my ability to analyze algorithms before implementing them.
Practiced multiple dry runs to understand algorithms internally.
📈 Progress

Day 2 — Completed ✅

Consistency > Motivation
Learn → Understand → Practice → Analyze → Solve → Repeat 🔥


---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
