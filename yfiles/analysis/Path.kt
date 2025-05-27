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
 * Represents a path between two nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Path">Online Documentation</a>
 */
external class Path private constructor()  {
  /**
   * Gets the distance or length of the path.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Path%23distance">Online Documentation</a>
   */
  final val distance: Double
  
  /**
   * Gets an ordered collection of edges defining this path.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Path%23edges">Online Documentation</a>
   */
  final val edges: ResultItemCollection<IEdge>
  
  /**
   * Gets the end node of the path.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Path%23end">Online Documentation</a>
   */
  final val end: INode
  
  /**
   * Gets a collection of nodes along this path.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Path%23nodes">Online Documentation</a>
   */
  final val nodes: ResultItemCollection<INode>
  
  /**
   * Gets the start node of the path.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Path%23start">Online Documentation</a>
   */
  final val start: INode
  
  companion object : ClassMetadata<Path> {
  }
}
