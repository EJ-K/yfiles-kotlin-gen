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
 * Computes the graph centrality for the nodes of a graph.
 * @see [Centrality.graphCentrality][yfiles.algorithms.Centrality.graphCentrality]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCentrality">Online Documentation</a>
 * 
 * @constructor Creates a new [GraphCentrality] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCentrality%23GraphCentrality-constructor-GraphCentrality">Online Documentation</a>
 */
external open class GraphCentrality  () : YObject {

/**
 * Gets or sets a value indicating whether edge direction should be considered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCentrality%23directed">Online Documentation</a>
 */
final var directed: Boolean
/**
 * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCentrality%23subgraphEdges">Online Documentation</a>
 */
final var subgraphEdges: ItemCollection<IEdge>
/**
 * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCentrality%23subgraphNodes">Online Documentation</a>
 */
final var subgraphNodes: ItemCollection<INode>
/**
 * Gets or sets a mapping for edge weights.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCentrality%23weights">Online Documentation</a>
 */
final var weights: ItemMapping<IEdge, Double>
/**
 * Computes the graph centrality for the nodes of a graph.
 * @param [graph] The input graph to run the algorithm on.
 * @return A [GraphCentralityResult] from which the calculated centrality values can be obtained.
 * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCentrality%23GraphCentrality-method-run">Online Documentation</a>
 */
 final   fun run( graph: IGraph ):GraphCentralityResult

companion object : ClassMetadata<GraphCentrality> {
}
}

inline fun GraphCentrality(
    block: GraphCentrality.() -> Unit
): GraphCentrality {
    return GraphCentrality()
        .apply(block)
}
