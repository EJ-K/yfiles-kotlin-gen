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
 * Calculates the transitive closure for a directed acyclic graph.
 * @see [Transitivity.transitiveClosure][yfiles.algorithms.Transitivity.transitiveClosure]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TransitiveClosure">Online Documentation</a>
 * 
 * @constructor Creates a new [TransitiveClosure] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TransitiveClosure%23TransitiveClosure-constructor-TransitiveClosure">Online Documentation</a>
 */
external open class TransitiveClosure  () : YObject {

/**
 * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TransitiveClosure%23subgraphEdges">Online Documentation</a>
 */
final var subgraphEdges: ItemCollection<IEdge>
/**
 * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TransitiveClosure%23subgraphNodes">Online Documentation</a>
 */
final var subgraphNodes: ItemCollection<INode>
/**
 * Calculates the transitive closure for a directed acyclic graph.
 * ### Preconditions
 * - The graph must be [acyclic][GraphStructureAnalyzer.isAcyclic].
 * @param [graph] The input graph to run the algorithm on.
 * @return A [TransitiveClosureResult] containing placeholders for edges that can be inserted to obtain the transitive closure of `graph`.
 * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TransitiveClosure%23TransitiveClosure-method-run">Online Documentation</a>
 */
 final   fun run( graph: IGraph ):TransitiveClosureResult

companion object : ClassMetadata<TransitiveClosure> {
}
}

inline fun TransitiveClosure(
    block: TransitiveClosure.() -> Unit
): TransitiveClosure {
    return TransitiveClosure()
        .apply(block)
}
