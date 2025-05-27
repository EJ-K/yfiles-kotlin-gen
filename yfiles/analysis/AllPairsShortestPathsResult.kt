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
import yfiles.lang.YObject

/**
 * Represents all shortest paths between pairs of source and sink nodes as computed by [AllPairsShortestPaths].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AllPairsShortestPathsResult">Online Documentation</a>
 */
external  class AllPairsShortestPathsResult 
private constructor () : YObject {

/**
 * Gets a collection of shortest paths between the [source nodes][AllPairsShortestPaths.sources] and [sink nodes][AllPairsShortestPaths.sinks].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AllPairsShortestPathsResult%23paths">Online Documentation</a>
 */
final val paths: ResultItemCollection<Path>
/**
 * Gets the length of the shortest path between `source` and `sink`.
 * @param [source] The path's source node.
 * @param [sink] The path's sink node.
 * @return The distance between a given `source` node and a given `sink` node or [Double.POSITIVE_INFINITY] if there is no path between them or `source` was not part of the [AllPairsShortestPaths.sources].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AllPairsShortestPathsResult%23AllPairsShortestPathsResult-method-getDistanceBetween">Online Documentation</a>
 */
 final   fun getDistanceBetween( source: INode ,
 sink: INode ):Double
/**
 * Gets the shortest path between a given `source` and `sink` node if one exists.
 * @param [source] The path's source node.
 * @param [sink] The path's sink node.
 * @return The shortest path between a given `source` and `sink` node or `null` if there is no path between them or either `source` or `sink` was not part of the [AllPairsShortestPaths.sources] or [AllPairsShortestPaths.sinks].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AllPairsShortestPathsResult%23AllPairsShortestPathsResult-method-getPathBetween">Online Documentation</a>
 */
 final   fun getPathBetween( source: INode ,
 sink: INode ):Path?
/**
 * Gets a mapping from each node to the last incoming edge of the shortest path to `source`.
 * @param [source] The source node to get the predecessor mapping for.
 * @return A mapping from which shortest paths between `source` and other nodes can be reconstructed o `null` if `source` was not part of [AllPairsShortestPaths.sources].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AllPairsShortestPathsResult%23AllPairsShortestPathsResult-method-getPredecessorsForSource">Online Documentation</a>
 */
 final   fun getPredecessorsForSource( source: INode ):ResultItemMapping<INode, IEdge>?

companion object : ClassMetadata<AllPairsShortestPathsResult> {
}
}
