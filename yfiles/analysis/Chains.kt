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
 * Finds all chains in a graph.
 * @see [Paths.findAllChains][yfiles.algorithms.Paths.findAllChains]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Chains">Online Documentation</a>
 * 
 * @constructor Creates a new [Chains] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Chains%23Chains-constructor-Chains">Online Documentation</a>
 */
external  class Chains  () : YObject {

/**
 * Gets or sets a value indicating whether the graph is considered directed or not.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Chains%23directed">Online Documentation</a>
 */
final var directed: Boolean
/**
 * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Chains%23subgraphEdges">Online Documentation</a>
 */
final var subgraphEdges: ItemCollection<IEdge>
/**
 * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Chains%23subgraphNodes">Online Documentation</a>
 */
final var subgraphNodes: ItemCollection<INode>
/**
 * Finds all chains in a graph.
 * @param [graph] The input graph to run the algorithm on.
 * @return A [ChainsResult] which contains all [chains][Path].
 * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
 * @see [Paths.findAllChains][yfiles.algorithms.Paths.findAllChains]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Chains%23Chains-method-run">Online Documentation</a>
 */
 final   fun run( graph: IGraph ):ChainsResult

companion object : ClassMetadata<Chains> {
}
}

inline fun Chains(
    block: Chains.() -> Unit
): Chains {
    return Chains()
        .apply(block)
}
