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
 * Calculates the transitive reduction for a directed acyclic graph.
 * @see [Transitivity.transitiveReduction][yfiles.algorithms.Transitivity.transitiveReduction]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TransitiveReduction">Online Documentation</a>
 * 
 * @constructor Creates a new [TransitiveReduction] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TransitiveReduction%23TransitiveReduction-constructor-TransitiveReduction">Online Documentation</a>
 */
external open class TransitiveReduction  () : YObject {

/**
 * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TransitiveReduction%23subgraphEdges">Online Documentation</a>
 */
final var subgraphEdges: ItemCollection<IEdge>
/**
 * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TransitiveReduction%23subgraphNodes">Online Documentation</a>
 */
final var subgraphNodes: ItemCollection<INode>
/**
 * Calculates the transitive reduction for a directed acyclic graph.
 * ### Preconditions
 * - The graph must be [acyclic][GraphStructureAnalyzer.isAcyclic].
 * @param [graph] The input graph to run the algorithm on.
 * @return A [TransitiveReductionResult] containing the transitive edges of the given graph. Removing those edges results in the transitive reduction of `graph`.
 * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TransitiveReduction%23TransitiveReduction-method-run">Online Documentation</a>
 */
 final   fun run( graph: IGraph ):TransitiveReductionResult

companion object : ClassMetadata<TransitiveReduction> {
}
}

inline fun TransitiveReduction(
    block: TransitiveReduction.() -> Unit
): TransitiveReduction {
    return TransitiveReduction()
        .apply(block)
}
