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
 * Calculates the transitive edges that connect the [visible nodes][visibleNodes] in the specified graph.
 * @see [Transitivity.transitiveEdges][yfiles.algorithms.Transitivity.transitiveEdges]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TransitiveEdges">Online Documentation</a>
 * 
 * @constructor Creates a new instance of this class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TransitiveEdges%23TransitiveEdges-constructor-TransitiveEdges">Online Documentation</a>
 */
external open class TransitiveEdges  () : YObject {

/**
 * Gets or sets a boolean that specifies whether the graph is directed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TransitiveEdges%23directed">Online Documentation</a>
 */
final var directed: Boolean
/**
 * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TransitiveEdges%23subgraphEdges">Online Documentation</a>
 */
final var subgraphEdges: ItemCollection<IEdge>
/**
 * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TransitiveEdges%23subgraphNodes">Online Documentation</a>
 */
final var subgraphNodes: ItemCollection<INode>
/**
 * Gets or sets a collection of nodes to start from.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TransitiveEdges%23visibleNodes">Online Documentation</a>
 */
final var visibleNodes: ItemCollection<INode>
/**
 * Calculates the transitive edges that connect the [visible nodes][visibleNodes] in the specified graph.
 * @param [graph] the original graph that contains both the visible and invisible nodes
 * @return A [TransitiveEdgesResult] containing placeholders for edges that can be inserted to obtain the transitive closure of `graph`.
 * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TransitiveEdges%23TransitiveEdges-method-run">Online Documentation</a>
 */
 final   fun run( graph: IGraph ):TransitiveEdgesResult

companion object : ClassMetadata<TransitiveEdges> {
}
}

inline fun TransitiveEdges(
    block: TransitiveEdges.() -> Unit
): TransitiveEdges {
    return TransitiveEdges()
        .apply(block)
}
