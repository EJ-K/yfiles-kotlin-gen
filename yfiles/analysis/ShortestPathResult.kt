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
 * Represents the shortest path between two nodes in a graph as computed by [ShortestPath].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPathResult">Online Documentation</a>
 */
external class ShortestPathResult private constructor()  {
  /**
   * Gets the distance of the path.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPathResult%23distance">Online Documentation</a>
   */
  final val distance: Double
  
  /**
   * Gets a collection of edges along the path.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPathResult%23edges">Online Documentation</a>
   */
  final val edges: ResultItemCollection<IEdge>
  
  /**
   * Gets a collection of nodes along the path, starting with the [source][ShortestPath] node and ending with the [sink][ShortestPath] node.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPathResult%23nodes">Online Documentation</a>
   */
  final val nodes: ResultItemCollection<INode>
  
  /**
   * Gets the shortest path found between [source][ShortestPath] and [sink][ShortestPath] if one exists.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPathResult%23path">Online Documentation</a>
   */
  final val path: Path?
  
  /**
   * Gets a mapping from each node to the last incoming edge of the shortest path to this node.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPathResult%23predecessors">Online Documentation</a>
   */
  final val predecessors: ResultItemMapping<INode, IEdge>
  
  companion object : ClassMetadata<ShortestPathResult> {
  }
}
