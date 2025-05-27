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
 * Solves a maximum flow problem.
 * @see [NetworkFlows.calcMaxFlowMinCut][yfiles.algorithms.NetworkFlows.calcMaxFlowMinCut]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MaximumFlow">Online Documentation</a>
 * 
 * @constructor Creates a new [MaximumFlow] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MaximumFlow%23MaximumFlow-constructor-MaximumFlow">Online Documentation</a>
 */
external open class MaximumFlow  () : YObject {

/**
 * Gets or sets a mapping for capacities of edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MaximumFlow%23capacities">Online Documentation</a>
 */
final var capacities: ItemMapping<IEdge, Int>
/**
 * Gets or sets a collection of sink nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MaximumFlow%23sinks">Online Documentation</a>
 */
final var sinks: ItemCollection<INode>
/**
 * Gets or sets a collection of source nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MaximumFlow%23sources">Online Documentation</a>
 */
final var sources: ItemCollection<INode>
/**
 * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MaximumFlow%23subgraphEdges">Online Documentation</a>
 */
final var subgraphEdges: ItemCollection<IEdge>
/**
 * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MaximumFlow%23subgraphNodes">Online Documentation</a>
 */
final var subgraphNodes: ItemCollection<INode>
/**
 * Solves a maximum flow problem.
 * @param [graph] The input graph to run the algorithm on.
 * @return A [MaximumFlowResult] containing the computed flows as well as a cut between sources and sinks.
 * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MaximumFlow%23MaximumFlow-method-run">Online Documentation</a>
 */
 final   fun run( graph: IGraph ):MaximumFlowResult

companion object : ClassMetadata<MaximumFlow> {
}
}

inline fun MaximumFlow(
    block: MaximumFlow.() -> Unit
): MaximumFlow {
    return MaximumFlow()
        .apply(block)
}
