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
 * Solves a minimum-cost flow problem.
 * @see [NetworkFlows.minCostFlow][yfiles.algorithms.NetworkFlows.minCostFlow]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MinimumCostFlow">Online Documentation</a>
 * 
 * @constructor Creates a new [MinimumCostFlow] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MinimumCostFlow%23MinimumCostFlow-constructor-MinimumCostFlow">Online Documentation</a>
 */
external open class MinimumCostFlow  () : YObject {

/**
 * Gets or sets a mapping for edge costs.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MinimumCostFlow%23costs">Online Documentation</a>
 */
final var costs: ItemMapping<IEdge, Double>
/**
 * Gets or sets a mapping for maximum capacities of edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MinimumCostFlow%23maximumCapacities">Online Documentation</a>
 */
final var maximumCapacities: ItemMapping<IEdge, Int>
/**
 * Gets or sets a mapping for the minimum capacities of edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MinimumCostFlow%23minimumCapacities">Online Documentation</a>
 */
final var minimumCapacities: ItemMapping<IEdge, Int>
/**
 * Gets or sets a single sink node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MinimumCostFlow%23sink">Online Documentation</a>
 */
final var sink: SingleItem<INode>
/**
 * Gets or sets a single source node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MinimumCostFlow%23source">Online Documentation</a>
 */
final var source: SingleItem<INode>
/**
 * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MinimumCostFlow%23subgraphEdges">Online Documentation</a>
 */
final var subgraphEdges: ItemCollection<IEdge>
/**
 * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MinimumCostFlow%23subgraphNodes">Online Documentation</a>
 */
final var subgraphNodes: ItemCollection<INode>
/**
 * Gets or sets a mapping which provides the supply (or demand, if negative) for each node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MinimumCostFlow%23supply">Online Documentation</a>
 */
final var supply: ItemMapping<INode, Double>
/**
 * Solves the minimum-cost flow problem.
 * @param [graph] The input graph to run the algorithm on.
 * @return A [MinimumCostFlowResult] containing the flow for each edge and the total cost.
 * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MinimumCostFlow%23MinimumCostFlow-method-run">Online Documentation</a>
 */
 final   fun run( graph: IGraph ):MinimumCostFlowResult

companion object : ClassMetadata<MinimumCostFlow> {
}
}

inline fun MinimumCostFlow(
    block: MinimumCostFlow.() -> Unit
): MinimumCostFlow {
    return MinimumCostFlow()
        .apply(block)
}
