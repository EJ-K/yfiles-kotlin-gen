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
 * Computes the betweenness centrality for each node and edge of a given graph.
 * @see [Centrality.nodeEdgeBetweenness][yfiles.algorithms.Centrality.nodeEdgeBetweenness]
 * @see [Centrality.nodeBetweenness][yfiles.algorithms.Centrality.nodeBetweenness]
 * @see [Centrality.edgeBetweenness][yfiles.algorithms.Centrality.edgeBetweenness]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BetweennessCentrality">Online Documentation</a>
 * 
 * @constructor Creates a new [BetweennessCentrality] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BetweennessCentrality%23BetweennessCentrality-constructor-BetweennessCentrality">Online Documentation</a>
 */
external open class BetweennessCentrality  () : YObject {

/**
 * Gets or sets a value indicating whether edge direction should be considered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BetweennessCentrality%23directed">Online Documentation</a>
 */
final var directed: Boolean
/**
 * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BetweennessCentrality%23subgraphEdges">Online Documentation</a>
 */
final var subgraphEdges: ItemCollection<IEdge>
/**
 * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BetweennessCentrality%23subgraphNodes">Online Documentation</a>
 */
final var subgraphNodes: ItemCollection<INode>
/**
 * Gets or sets a mapping for edge weights.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BetweennessCentrality%23weights">Online Documentation</a>
 */
final var weights: ItemMapping<IEdge, Double>
/**
 * Computes the betweenness centrality for each node and edge of a given graph.
 * @param [graph] The input graph to run the algorithm on.
 * @return A [BetweennessCentralityResult] from which the calculated centrality values can be obtained.
 * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BetweennessCentrality%23BetweennessCentrality-method-run">Online Documentation</a>
 */
 final   fun run( graph: IGraph ):BetweennessCentralityResult

companion object : ClassMetadata<BetweennessCentrality> {
}
}

inline fun BetweennessCentrality(
    block: BetweennessCentrality.() -> Unit
): BetweennessCentrality {
    return BetweennessCentrality()
        .apply(block)
}
