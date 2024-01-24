package structures;

import java.util.LinkedList;
import java.util.Queue;

import config.Configuration;

/**
 * This class creates a .dot file for the Graphvix graph visualization program
 * available at <a href="https://www.graphviz.org/">graphviz.org</a>
 */
public class TreeViewer {
	public static <T> String toDotFormat(BinaryTreeNode<T> root) {
		// header
		int count = 0;
		StringBuilder dot = new StringBuilder("digraph G { \n");
		dot.append("graph [ordering=\"out\"]; \n");
		// iterative traversal
		Queue<BinaryTreeNode<T>> queue = new LinkedList<>();
		queue.add(root);
		BinaryTreeNode<T> cursor;
		while (!queue.isEmpty()) {
			cursor = queue.remove();
			if (cursor.hasLeftChild()) {
				// add edge from cursor to left child
				dot.append(cursor.getData().toString()).append(" -> ").append(cursor.getLeftChild().getData().toString()).append(";\n");
				queue.add(cursor.getLeftChild());
			} else {
				// add dummy node
				dot.append("node").append(count).append(" [shape=point];\n");
				dot.append(cursor.getData().toString()).append(" -> ").append("node").append(count).append(";\n");
				count++;
			}
			if (cursor.hasRightChild()) {
				// add edge from cursor to right child
				dot.append(cursor.getData().toString()).append(" -> ").append(cursor.getRightChild().getData().toString()).append(";\n");
				queue.add(cursor.getRightChild());
			} else {
				// add dummy node
				dot.append("node").append(count).append(" [shape=point];\n");
				dot.append(cursor.getData().toString()).append(" -> ").append("node").append(count).append(";\n");
				count++;
			}
		}
		dot.append("};");
		return dot.toString();
	}

	private static final <T> BinaryTreeNode<T> node(BinaryTreeNode<T> left,
			T elem, BinaryTreeNode<T> right) {
		return Configuration.createBinaryTreeNode(left, elem, right);
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> tree =
				node(
						node(
								node(null, 1, null),
								3,
								node(null, 2, null)
						),
						5,
						node(
								node(
										node(null, 4, null),
										1,
										null),
								19,
								null)
				);
		System.out.println(toDotFormat(tree));
	}
}
