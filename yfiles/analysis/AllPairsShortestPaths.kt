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
import yfiles.graph.IGraph
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject
import yfiles.layout.ItemCollection
import yfiles.layout.ItemMapping

/**
 * Finds shortest paths between pairs of multiple [sources] and [sinks].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AllPairsShortestPaths">Online Documentation</a>
 * 
 * @constructor Creates a new [AllPairsShortestPaths] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AllPairsShortestPaths%23AllPairsShortestPaths-constructor-AllPairsShortestPaths">Online Documentation</a>
 */
external  class AllPairsShortestPaths  () : YObject {

/**
 * Gets or sets a mapping for the cost for traversing an edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AllPairsShortestPaths%23costs">Online Documentation</a>
 */
final var costs: ItemMapping<IEdge, Double>
/**
 * Gets or sets a value indicating whether edge direction should be considered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AllPairsShortestPaths%23directed">Online Documentation</a>
 */
final var directed: Boolean
/**
 * Gets or sets a collection of sink (end, target) nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AllPairsShortestPaths%23sinks">Online Documentation</a>
 */
final var sinks: ItemCollection<INode>
/**
 * Gets or sets a collection of source (start) nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AllPairsShortestPaths%23sources">Online Documentation</a>
 */
final var sources: ItemCollection<INode>
/**
 * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AllPairsShortestPaths%23subgraphEdges">Online Documentation</a>
 */
final var subgraphEdges: ItemCollection<IEdge>
/**
 * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AllPairsShortestPaths%23subgraphNodes">Online Documentation</a>
 */
final var subgraphNodes: ItemCollection<INode>
/**
 * Finds all shortest paths between pairs of nodes from [sources] and [sinks].
 * @return [AllPairsShortestPathsResult] containing all shortest paths between nodes from [sources] and [sinks].
 * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AllPairsShortestPaths%23AllPairsShortestPaths-method-run">Online Documentation</a>
 */
 final   fun run( graph: IGraph ):AllPairsShortestPathsResult

companion object : ClassMetadata<AllPairsShortestPaths> {
}
}

inline fun AllPairsShortestPaths(
    block: AllPairsShortestPaths.() -> Unit
): AllPairsShortestPaths {
    return AllPairsShortestPaths()
        .apply(block)
}
