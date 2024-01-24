# <code>DSp6BST</code> Binary Search Tree Part 1

## Overview
For this assignment you will be implementing the basic functionality of the Binary Search Tree ADT.
This project is based on the content of chapters 9 and 10 in the Java Software Structures book.

### Table of Contents
**[Files to complete](#files-to-complete)**<br>
**[Support Code API](#support-code-api)**<br>
**[Part One: Import Project](#part-one-import-project)**<br>
**[Part Two: Implement the BinaryTreeNode Interface](#part-two-implement-the-binarytreenode-interface)**<br>
**[Part Three: Implement the BinaryTreeUtility Interface](#part-three-implement-the-binarytreeutility-interface)**<br>


## Files to complete
You are expected to write an implementation for each of the interfaces listed in the `Configuration` class:
`BinaryTreeNode`, `BinaryTreeUtility`, and `BinarySearchTree`. Update the methods in `Configuration.java`
as these implementation are completed.

### Test files
In the test folder, you are provided with several JUnit test cases that will help you keep on track while completing
this assignment. It will help you to run the tests often and use them as a checklist of things to do next.
Please do not modify my test cases, but you may add your own JUnit classes to fill out the test suite.

## Part One: Import Project 
When you get your project from GitHub Classroom, you will want to ensure that your project has no errors
and contain the following root items:

**src** - The source folder where all code you are submitting must go. You can change anything you want in this folder,
you can add new files, etc...<br>
**test** - The test folder where all the public unit tests are available<br>
**support** - This folder contains support code for you to use. You probably do not want to change files in this folder.<br>
**JUnit 5** - A library that is used to run the test programs<br>
**JRE System Library** - This is what allows java to run<br>

If you are missing any of the above or errors are present in the project, seek help immediately, so you can get started.

## Part Two: Implement the BinaryTreeNode Interface
A `BinaryTreeNode` represents a node in a binary tree. It stores data of generic type `T` and may have a right
and a left child, each a reference to another `BinaryTreeNode`.  The `BinaryTreeNode` interface includes standard
getters and setters for the left and right children of a `BinaryTreeNode`, as well as its data.

## Part Three: Implement the BinaryTreeUtility Interface
The `BinaryTreeUtility` interface provides basic functions for working with a binary tree.

**Depth** -- The depth of the tree is the maximum level of any leaf node in the tree.  Recall that the level
of a node begins at zero for the root of a tree with no children.  A child of the root is at level 1.

**Balance** -- The balance of a tree measures how close it is to a full or complete tree.  You will implement
the method `isBalanced(BinaryTreeNode<T> root, int tolerance)` which determines whether the maximum difference
in the depth of any two children is no larger than the given tolerance value.

**Testing the BST property** -- Recall that a BST is a binary tree that also satisfies a special sorting property:
if all elements in left subtree of any node X are less than or equal to node X and all nodes in the right subtree
of X are greater than X.  You will write a function `isBST(root)` which returns true if `root` is the root
of a valid binary search tree.  Your function need not explicitly test basic requirements of the binary tree
(e.g. that there is a unique path from the root to every node in the tree).  Testing the BST property has a nice
recursive solution, but it requires some thought.

**Recursive Preorder Iterator** -- There is a class provided that generates a preorder iterator for the binary tree,
`structures/PreorderIterator`, that uses a stack that gets used for the `hasNext` and `next` methods. (The class
actually uses a `Deque`, but it is being used as a stack.) Build a different version of this class, using recursion.
This is essentially using the call stack instead of an instance field stack.

**Bonus Assignment - more Iterators** -- If you are looking for more challenge, implement the methods
`getInorderIterator` and `getPostorderIterator`, either by building additional classes in the `structures`
package, or using inner classes.

**Feeling ambitious?**<br>
See if you can make a level-order iterator!
