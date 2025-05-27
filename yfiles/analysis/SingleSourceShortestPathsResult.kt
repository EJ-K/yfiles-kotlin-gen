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
 * Represents all shortest paths between a single source node and multiple sink nodes in a graph as computed by [SingleSourceShortestPaths].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SingleSourceShortestPathsResult">Online Documentation</a>
 */
external class SingleSourceShortestPathsResult private constructor()  {
  /**
   * Gets a mapping from each node to its shortest distance from the [source][SingleSourceShortestPaths] node.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SingleSourceShortestPathsResult%23distances">Online Documentation</a>
   */
  final val distances: ResultItemMapping<INode, Double>
  
  /**
   * Gets a collection of shortest paths between the [source][SingleSourceShortestPaths] node and [sink nodes][SingleSourceShortestPaths].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SingleSourceShortestPathsResult%23paths">Online Documentation</a>
   */
  final val paths: ResultItemCollection<Path>
  
  /**
   * Gets a mapping from each node to the last incoming edge of the shortest path to this node.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SingleSourceShortestPathsResult%23predecessors">Online Documentation</a>
   */
  final val predecessors: ResultItemMapping<INode, IEdge>
  
  /**
   * Gets the shortest path from the configured [source][SingleSourceShortestPaths] node to the given `sink` node if one exists.
   * @param [sink] The sink (target, end) node of the path to get.
   * @return The shortest path between the source and the sink node.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SingleSourceShortestPathsResult%23SingleSourceShortestPathsResult-method-getPathTo">Online Documentation</a>
   */
  fun getPathTo(
    sink: INode,
  ): Path?
  
  companion object : ClassMetadata<SingleSourceShortestPathsResult> {
  }
}
