// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.analysis

import yfiles.graph.IEdge
import yfiles.graph.INode
import yfiles.lang.ClassMetadata

/**
 * Represents a subtree computed by methods [getSubtree][TreeAnalysisResult] or [getDescendants][TreeAnalysisResult].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Subtree">Online Documentation</a>
 */
external class Subtree private constructor()  {
  /**
   * Gets the edges that belong to this subtree.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Subtree%23edges">Online Documentation</a>
   */
  final val edges: ResultItemCollection<IEdge>
  
  /**
   * Gets the nodes that belong to this subtree.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Subtree%23nodes">Online Documentation</a>
   */
  final val nodes: ResultItemCollection<INode>
  
  /**
   * Gets the root of the subtree.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Subtree%23root">Online Documentation</a>
   */
  final val root: INode
  
  companion object : ClassMetadata<Subtree> {
  }
}
