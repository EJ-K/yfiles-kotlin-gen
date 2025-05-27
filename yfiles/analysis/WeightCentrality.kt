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
 * Computes the weight centrality for the nodes of a graph.
 * @see [Centrality.weightCentrality][yfiles.algorithms.Centrality.weightCentrality]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WeightCentrality">Online Documentation</a>
 * 
 * @constructor Creates a new [WeightCentrality] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WeightCentrality%23WeightCentrality-constructor-WeightCentrality">Online Documentation</a>
 */
external open class WeightCentrality  () : YObject {

/**
 * Gets or sets a value indicating whether incoming edges contribute to the centrality values of their target nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WeightCentrality%23considerIncomingEdges">Online Documentation</a>
 */
final var considerIncomingEdges: Boolean
/**
 * Gets or sets a value indicating whether outgoing edges contribute to the centrality values of their source nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WeightCentrality%23considerOutgoingEdges">Online Documentation</a>
 */
final var considerOutgoingEdges: Boolean
/**
 * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WeightCentrality%23subgraphEdges">Online Documentation</a>
 */
final var subgraphEdges: ItemCollection<IEdge>
/**
 * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WeightCentrality%23subgraphNodes">Online Documentation</a>
 */
final var subgraphNodes: ItemCollection<INode>
/**
 * Gets or sets a mapping for edge weights.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WeightCentrality%23weights">Online Documentation</a>
 */
final var weights: ItemMapping<IEdge, Double>
/**
 * Computes the weight centrality for the nodes of a graph.
 * @param [graph] The input graph to run the algorithm on.
 * @return A [WeightCentralityResult] from which the calculated centrality values can be obtained.
 * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WeightCentrality%23WeightCentrality-method-run">Online Documentation</a>
 */
 final   fun run( graph: IGraph ):WeightCentralityResult

companion object : ClassMetadata<WeightCentrality> {
}
}

inline fun WeightCentrality(
    block: WeightCentrality.() -> Unit
): WeightCentrality {
    return WeightCentrality()
        .apply(block)
}
