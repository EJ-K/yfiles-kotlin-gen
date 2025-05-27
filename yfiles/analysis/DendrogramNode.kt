// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.analysis

import yfiles.collections.IListEnumerable
import yfiles.graph.INode
import yfiles.lang.ClassMetadata

/**
 * Represents a node of the dendrogram which is a binary tree of clusters after [HierarchicalClustering].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DendrogramNode">Online Documentation</a>
 */
external class DendrogramNode private constructor()  {
  /**
   * Gets the children of this node.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DendrogramNode%23children">Online Documentation</a>
   */
  final val children: IListEnumerable<DendrogramNode>
  
  /**
   * Gets the [INode]s in the graph which belong to the cluster which is represented by this [DendrogramNode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DendrogramNode%23clusterNodes">Online Documentation</a>
   */
  final val clusterNodes: IListEnumerable<INode>
  
  /**
   * Gets the dissimilarity value associated with this node.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DendrogramNode%23dissimilarityValue">Online Documentation</a>
   */
  final val dissimilarityValue: Double
  
  /**
   * Gets a value indicating whether this node is a leaf node in the dendrogram.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DendrogramNode%23isLeaf">Online Documentation</a>
   */
  final val isLeaf: Boolean
  
  /**
   * Gets this node's level index in the dendrogram.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DendrogramNode%23level">Online Documentation</a>
   */
  final val level: Int
  
  /**
   * Gets the [INode] in the graph which is associated with this dendrogram node.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DendrogramNode%23node">Online Documentation</a>
   */
  final val node: INode?
  
  /**
   * Gets the parent of the current node.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DendrogramNode%23parent">Online Documentation</a>
   */
  final val parent: DendrogramNode?
  
  companion object : ClassMetadata<DendrogramNode> {
  }
}
