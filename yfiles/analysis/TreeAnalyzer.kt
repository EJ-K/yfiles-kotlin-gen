// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.analysis

import yfiles.collections.IEnumerable
import yfiles.collections.IListEnumerable
import yfiles.graph.IGraph
import yfiles.graph.INode
import yfiles.lang.YObject

/**
 * Provides methods for querying and analyzing directed trees.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAnalyzer">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [TreeAnalyzer] class with the given graph.
 * @param [graph] The graph to use for subsequent queries.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAnalyzer%23TreeAnalyzer-constructor-TreeAnalyzer">Online Documentation</a>
 */
@Deprecated("Read documentation for more information")
external  class TreeAnalyzer  ( graph: IGraph ) : YObject {

/**
 * Gets the child nodes of the given node in the tree.
 * @param [node] The parent node to get children from.
 * @return An [IEnumerable] of `node`'s children.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAnalyzer%23TreeAnalyzer-method-getChildren">Online Documentation</a>
 */
 final   fun getChildren( node: INode ):IListEnumerable<INode>
/**
 * Gets the depth of the node, that is, the length of the path between the [root][getRoot] and `node`.
 * @param [node] The node to determine the depth for.
 * @return The distance between the root node and `node`.
 * @throws InvalidOperationError If the graph is not a tree.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAnalyzer%23TreeAnalyzer-method-getDepth">Online Documentation</a>
 */
 final   fun getDepth( node: INode ):Int
/**
 * Gets all leaf nodes of the tree.
 * @return An [IEnumerable] of leaf nodes in the tree.
 * @throws InvalidOperationError If the graph is not a tree.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAnalyzer%23TreeAnalyzer-method-getLeafNodes">Online Documentation</a>
 */
 final   fun getLeafNodes():IListEnumerable<INode>
/**
 * Determines the nearest common ancestor for the given nodes.
 * @param [nodes] The nodes for which to find the nearest common ancestor.
 * @return The nearest ancestor of all given nodes or `null` if `nodes` is empty.
 * @throws InvalidOperationError If the graph is not a tree.
 * @throws ArgumentError If `nodes` contain `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAnalyzer%23TreeAnalyzer-method-getNearestCommonAncestor(INode[])">Online Documentation</a>
 */
 final   fun getNearestCommonAncestor(vararg  nodes: INode ):INode?
/**
 * Determines the nearest common ancestor for the given nodes.
 * @param [nodes] The nodes for which to find the nearest common ancestor.
 * @return The nearest ancestor of all given nodes or `null` if `nodes` is empty.
 * @throws InvalidOperationError If the nodes are not in a subtree of a common ancestor.
 * @throws ArgumentError If `nodes` contain `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAnalyzer%23TreeAnalyzer-method-getNearestCommonAncestor(IEnumerable)">Online Documentation</a>
 */
 final   fun getNearestCommonAncestor( nodes: IEnumerable<INode> ):INode?
/**
 * Gets the parent of the given node in the tree.
 * @param [node] The child node to determine the parent of.
 * @return The parent node of `node` or `null` if `node` is the root of the tree.
 * @throws InvalidOperationError If the graph is not a tree.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAnalyzer%23TreeAnalyzer-method-getParent">Online Documentation</a>
 */
 final   fun getParent( node: INode ):INode?
/**
 * Determines the root node of the tree.
 * @return The root node for the tree or `null` if the graph is empty.
 * @throws InvalidOperationError If the graph is not a tree.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAnalyzer%23TreeAnalyzer-method-getRoot">Online Documentation</a>
 */
 final   fun getRoot():INode?
/**
 * Gets all nodes of the sub-tree that has `subtreeRoot` as root.
 * @param [subtreeRoot] The sub-tree root node.
 * @return An [IEnumerable] of nodes in the sub-tree of `subtreeRoot`.
 * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAnalyzer%23TreeAnalyzer-method-getSubtree">Online Documentation</a>
 */
 final   fun getSubtree( subtreeRoot: INode ):IListEnumerable<INode>

companion object  {
}
}
