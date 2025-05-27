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

/**
 * Partitions the graph into clusters by analyzing its *biconnected components*.
 * @see [Groups.biconnectedComponentGrouping][yfiles.algorithms.Groups.biconnectedComponentGrouping]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BiconnectedComponentClustering">Online Documentation</a>
 * 
 * @constructor Creates a new [BiconnectedComponentClustering] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BiconnectedComponentClustering%23BiconnectedComponentClustering-constructor-BiconnectedComponentClustering">Online Documentation</a>
 */
external open class BiconnectedComponentClustering  () : YObject {

/**
 * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BiconnectedComponentClustering%23subgraphEdges">Online Documentation</a>
 */
final var subgraphEdges: ItemCollection<IEdge>
/**
 * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BiconnectedComponentClustering%23subgraphNodes">Online Documentation</a>
 */
final var subgraphNodes: ItemCollection<INode>
/**
 * Partitions the graph into clusters based on its biconnected components.
 * @param [graph] The input graph to run the algorithm on.
 * @return A [BiconnectedComponentClusteringResult] of clusters in the graph.
 * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BiconnectedComponentClustering%23BiconnectedComponentClustering-method-run">Online Documentation</a>
 */
 final   fun run( graph: IGraph ):BiconnectedComponentClusteringResult

companion object : ClassMetadata<BiconnectedComponentClustering> {
}
}

inline fun BiconnectedComponentClustering(
    block: BiconnectedComponentClustering.() -> Unit
): BiconnectedComponentClustering {
    return BiconnectedComponentClustering()
        .apply(block)
}
