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
import yfiles.layout.SingleItem

/**
 * Finds the shortest path between one node and multiple other nodes in the graph (also known as the *single-source shortest path* problem).
 * @see [ShortestPaths.singleSource][yfiles.algorithms.ShortestPaths.singleSource]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SingleSourceShortestPaths">Online Documentation</a>
 * 
 * @constructor Creates a new [SingleSourceShortestPaths] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SingleSourceShortestPaths%23SingleSourceShortestPaths-constructor-SingleSourceShortestPaths">Online Documentation</a>
 */
external  class SingleSourceShortestPaths  () : YObject {

/**
 * Gets or sets a mapping for the cost for traversing an edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SingleSourceShortestPaths%23costs">Online Documentation</a>
 */
final var costs: ItemMapping<IEdge, Double>
/**
 * Gets or sets a value indicating whether edge direction should be considered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SingleSourceShortestPaths%23directed">Online Documentation</a>
 */
final var directed: Boolean
/**
 * Gets or sets a collection of sink (end, target) nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SingleSourceShortestPaths%23sinks">Online Documentation</a>
 */
final var sinks: ItemCollection<INode>
/**
 * Gets or sets the source (start) node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SingleSourceShortestPaths%23source">Online Documentation</a>
 */
final var source: SingleItem<INode>
/**
 * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SingleSourceShortestPaths%23subgraphEdges">Online Documentation</a>
 */
final var subgraphEdges: ItemCollection<IEdge>
/**
 * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SingleSourceShortestPaths%23subgraphNodes">Online Documentation</a>
 */
final var subgraphNodes: ItemCollection<INode>
/**
 * Finds the shortest paths between [source] and [sinks].
 * @param [graph] The input graph to run the algorithm on.
 * @return A [SingleSourceShortestPathsResult] containing the shortest paths between [source] and [sinks].
 * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SingleSourceShortestPaths%23SingleSourceShortestPaths-method-run">Online Documentation</a>
 */
 final   fun run( graph: IGraph ):SingleSourceShortestPathsResult

companion object : ClassMetadata<SingleSourceShortestPaths> {
}
}

inline fun SingleSourceShortestPaths(
    block: SingleSourceShortestPaths.() -> Unit
): SingleSourceShortestPaths {
    return SingleSourceShortestPaths()
        .apply(block)
}
