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
 * Represents all shortest paths between pairs of source and sink nodes as computed by [AllPairsShortestPaths].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AllPairsShortestPathsResult">Online Documentation</a>
 */
external class AllPairsShortestPathsResult private constructor()  {
  /**
   * Gets a collection of shortest paths between the [source nodes][AllPairsShortestPaths] and [sink nodes][AllPairsShortestPaths].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AllPairsShortestPathsResult%23paths">Online Documentation</a>
   */
  final val paths: ResultItemCollection<Path>
  
  /**
   * Gets the length of the shortest path between `source` and `sink`.
   * @param [source] The path's source node.
   * @param [sink] The path's sink node.
   * @return The distance between a given `source` node and a given `sink` node, or [POSITIVE_INFINITY][Number] if there is no path between them or `source` was not part of the [sources][AllPairsShortestPaths].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AllPairsShortestPathsResult%23AllPairsShortestPathsResult-method-getDistanceBetween">Online Documentation</a>
   */
  fun getDistanceBetween(
    source: INode,
    sink: INode,
  ): Double
  
  /**
   * Gets the shortest path between a given `source` and `sink` node if one exists.
   * @param [source] The path's source node.
   * @param [sink] The path's sink node.
   * @return The shortest path between a given `source` and `sink` node or `null` if there is no path between them or either `source` or `sink` was not part of the [sources][AllPairsShortestPaths] or [sinks][AllPairsShortestPaths].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AllPairsShortestPathsResult%23AllPairsShortestPathsResult-method-getPathBetween">Online Documentation</a>
   */
  fun getPathBetween(
    source: INode,
    sink: INode,
  ): Path?
  
  /**
   * Gets a mapping from each node to the last incoming edge of the shortest path to `source`.
   * @param [source] The source node to get the predecessor mapping for.
   * @return A mapping from which shortest paths between `source` and other nodes can be reconstructed or `null` if `source` was not part of [sources][AllPairsShortestPaths].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AllPairsShortestPathsResult%23AllPairsShortestPathsResult-method-getPredecessorsForSource">Online Documentation</a>
   */
  fun getPredecessorsForSource(
    source: INode,
  ): ResultItemMapping<INode, IEdge>?
  
  companion object : ClassMetadata<AllPairsShortestPathsResult> {
  }
}
