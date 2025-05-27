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
import yfiles.graph.IEdge
import yfiles.graph.INode
import yfiles.lang.ClassMetadata

/**
 * Represents the analysis result computed by [TreeAnalysis].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAnalysisResult">Online Documentation</a>
 */
external class TreeAnalysisResult private constructor()  {
  /**
   * Gets whether or not the analyzed structure is a directed, rooted tree.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAnalysisResult%23directedRootedTree">Online Documentation</a>
   */
  final val directedRootedTree: Boolean
  
  /**
   * Gets all leaf nodes of the tree.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAnalysisResult%23leafNodes">Online Documentation</a>
   */
  final val leafNodes: ResultItemCollection<INode>
  
  /**
   * Gets the edges that would need to be reversed in order to make the graph a directed, rooted tree.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAnalysisResult%23reversedEdges">Online Documentation</a>
   */
  final val reversedEdges: ResultItemCollection<IEdge>
  
  /**
   * Gets the root of the tree.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAnalysisResult%23root">Online Documentation</a>
   */
  final val root: INode?
  
  /**
   * Gets the child nodes of the given node in the tree.
   * @param [node] The parent node to get children from.
   * @return An [IEnumerable] of `node`'s children.
   * @throws ArgumentError If the given node was not part of the graph at the time the analysis was invoked via [run][TreeAnalysis]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAnalysisResult%23TreeAnalysisResult-method-getChildren">Online Documentation</a>
   */
  fun getChildren(
    node: INode,
  ): ResultItemCollection<INode>
  
  /**
   * Gets the depth of the node, that is, the length of the path between the [root][TreeAnalysisResult] and `node`.
   * @param [node] The node to determine the depth for.
   * @return The distance between the root node and `node`.
   * @throws ArgumentError If the given node was not part of the graph at the time the analysis was invoked via [run][TreeAnalysis]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAnalysisResult%23TreeAnalysisResult-method-getDepth">Online Documentation</a>
   */
  fun getDepth(
    node: INode,
  ): Int
  
  /**
   * Gets all nodes that are descendants of `root`, including the edges that connect the descendants.
   * @param [root] The root node for which the descendants should be queried.
   * @return A [Subtree] holding the descendant nodes of the given `root` and the edges connecting them.
   * @throws ArgumentError If the given node was not part of the graph at the time the analysis was invoked via [run][TreeAnalysis]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAnalysisResult%23TreeAnalysisResult-method-getDescendants">Online Documentation</a>
   */
  fun getDescendants(
    root: INode,
  ): Subtree
  
  /**
   * Determines the nearest common ancestor for the given nodes.
   * @param [nodes] The nodes for which to find the nearest common ancestor.
   * @return The nearest ancestor of all given nodes or `null` if `nodes` is empty.
   * @throws ArgumentError If `nodes` contain `null` or if one of the nodes was not part of the graph at the time the analysis was invoked via [run][TreeAnalysis].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAnalysisResult%23TreeAnalysisResult-method-getNearestCommonAncestor(INode[])">Online Documentation</a>
   */
  fun getNearestCommonAncestor(
    vararg nodes: INode,
  ): INode?
  
  /**
   * Determines the nearest common ancestor for the given nodes.
   * @param [nodes] The nodes for which to find the nearest common ancestor.
   * @return The nearest ancestor of all given nodes or `null` if `nodes` is empty.
   * @throws ArgumentError If `nodes` contain `null` or if one of the nodes was not part of the graph at the time the analysis was invoked via [run][TreeAnalysis].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAnalysisResult%23TreeAnalysisResult-method-getNearestCommonAncestor(IEnumerable)">Online Documentation</a>
   */
  fun getNearestCommonAncestor(
    nodes: IEnumerable<INode>,
  ): INode?
  
  /**
   * Gets the parent node of the given tree node.
   * @param [node] The child node to determine the parent of.
   * @return The parent node of `node` or `null` if `node` is the root of the tree.
   * @throws ArgumentError If the given node was not part of the graph at the time the analysis was invoked via [run][TreeAnalysis]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAnalysisResult%23TreeAnalysisResult-method-getParent">Online Documentation</a>
   */
  fun getParent(
    node: INode,
  ): INode?
  
  /**
   * Gets all nodes and edges of the subtree that has `subtreeRoot` as root.
   * @param [subtreeRoot] The subtree root node.
   * @return A [Subtree] holding the nodes and edges of the subtree rooted at the given `subtreeRoot`.
   * @throws ArgumentError If the given node was not part of the graph at the time the analysis was invoked via [run][TreeAnalysis]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeAnalysisResult%23TreeAnalysisResult-method-getSubtree">Online Documentation</a>
   */
  fun getSubtree(
    subtreeRoot: INode,
  ): Subtree
  
  companion object : ClassMetadata<TreeAnalysisResult> {
  }
}
