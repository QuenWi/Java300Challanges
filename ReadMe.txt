
In the package Helpers, are some scripts used for the test-files.
The scripts in there are not used for the tasks, with only a few exceptions.

All the methodes which are makes sense to create as a
generic methode, I implemented as such.
Furthermore, most of the methods can be copy and pasted by themself into other projects.

Furthermore the following Methodes follow the following:

-[9 Summary Ranges, 10 Missing Ranges, 11 Merge Intervals, 12 Insert Intervals]:
    They all use the selfmade Class "Intervals". I created this class myself to
    do this tasks. You can find this class under "Helpers/Interval.java".
    Furthermore, I implemented a Comperator for it.
-[23 Shortest Word Distance I, 25 Shortest Word Distance III]:
    Due to its similarity I just implemented both in one Methode. "Shortest Word Distance".
-[24 Shortest Word Distance II]
    I didn't implemented it.
-[26 Intersection of two Arrays, 27 Intersection of two Arrays II]
    I think there is a mistake in the file. This two tasks are the same.
-[28 Two Sum II Input array is sorted, 29 Two Sum III Data structure design, 30 3Sum, 31 4Sum]
    I implemented them all in one. The method is XSum. You can there find the sum
    of any amount of elements.
-[32 3Sum Closest]
    It is implemented in the method XSum_Shortest. You can additional do it with every amount of elements.
-[35 Longest Common Prefix]
    I don't understand the problem. Therefor I didn't solved it yet.
-[38 Median of two sorted Arrays]
    It is wrong. I've to do it another time again.
-[39 Find Minimum in Rotated Sorted Array II, 40 Find Minimum in Rotated Sorted Array II]
    They are put together in one method.
-[41 Find First and Last Position of Element in Sorted_Array]
    It uses the Interval class. (See first note)
-[44 Search in Rotated Sorted Array, 45 Search in Rotated Sorted Array II]
    It uses the Interval class. Furthermore, they are put together in one method.
-[49 HIndex, 50 HIndex II]
    They are put together in one method.
-[56 Two Sum]
    Implemented in XSum Method.
-[63 Substring with Concatenation of All Words]
    I implemented it wrong. I'll repeat it later.
-[69 Majority Element II]
    I skipped this task.
[75 Meeting Rooms II, 76 Meeting Rooms]
    It uses the Interval class. (See first note)
[77 Range Addition]
    I don't understand the task.
[103 Rotate Array in Java]
    This task exists two times in the document.
[109 Queue Reconstruction by Height]
    I don't understand this task.
[113 Design Snake Game]
    It would not fit good in here.
[115 Most Stones Removed with Same Row or Column]
    I don't understand this task.
[120 Number of Islands]
    This task exists two times in the document.
[123 Valid Sudoku]
    This task very similar to [122 Sudoku Solver]. Just as output a boolean and not the sudoku solved.
[123 Walls and Gates]
    The describtion of the task is missing. So I don't know what to do.
[138 Linked List Cycle, 139 Copy List with Random Pointer, 145 Intersection of Two Linked Lists]
    I have to create an own class (collection/container) for this tasks.
[150 Reverse Double Linked List]
    This task is done by 148 Reverse Linked List.
[155 Plus One Linked List]
    I don't understand this task.
[156 Binary Tree Preorder Traversal, 157 Binary Tree Inorder Traversal, 158 Binary Tree Postorder Traversal,
    159 Binary Tree Level Order Traversal, 160 Binary Tree Level Order Traversal II, 161 Binary Tree Vertical Order Traversal,
    162 Invert Binary Tree, 163 Kth Smallest Element in a BST, 164 Binary Tree Longest Consecutive Sequence,
    165 Validate Binary Search Tree, 166 Flatten Binary Tree to Linked List, 167 Path Sum, 168 Path Sum II,
    169 Construct Binary Tree from Inorder and Postorder Traversal, 170 Construct Binary Tree from Preorder and Inorder Traversal,
    171 Convert Sorted Array to Binary Search Tree, 172 Convert Sorted List to Binary Search Tree, 173 Minimum Depth of Binary Tree,
    174 Binary Tree Maximum Path Sum, 175 Balanced Binary Tree, 176 Symmetric Tree, 177 Binary Search Tree Iterator,
    178 Binary Tree Right Side View, 179 Lowest Common Ancestor of a Binary Search Tree, 180 Lowest Common Ancestor of a Binary Tree,
    181 Most Frequent Subtree Sum, 182 Verify Preorder Serialization of a Binary Tree, 183 Populating Next Right Pointers in Each Node,
    184 Populating Next Right Pointers in Each Node II, 185 Unique Binary Search Trees, 186 Unique Binary Search Trees II,
    187 Sum Root to Leaf Numbers, 188 Count Complete Tree Nodes, 189 Closest Binary Search Tree Value, 190 Binary Tree Paths,
    191 Maximum Depth of Binary Tree, 192 Recover Binary Search Tree, 193 Same Tree, 194 Serialize and Deserialize Binary Tree,
    195 Inorder Successor in BST, 196 Inorder Successor in BST II, 197 Find Leaves of Binary Tree,
    198 Largest BST Subtree, 199 Implement Trie (Prefix Tree)]:
    They all use the selfmade Class "BinaryTreeNode". I created this class myself to do this tasks.
    You can find this class under "Helpers/Interval.java".
    Furthermore, I implemented a BinaryTreeNode_AsList for creating Binary Trees and BST, aswell for printing them.
