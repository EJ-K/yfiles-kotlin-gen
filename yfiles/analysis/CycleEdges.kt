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
 * Finds all edges that are part of at least one directed or undirected simple cycle in the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CycleEdges">Online Documentation</a>
 * 
 * @constructor Creates a new [CycleEdges] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CycleEdges%23CycleEdges-constructor-CycleEdges">Online Documentation</a>
 */
external  class CycleEdges  () : YObject {

/**
 * Gets or sets a value indicating whether edge direction should be considered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CycleEdges%23directed">Online Documentation</a>
 */
final var directed: Boolean
/**
 * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CycleEdges%23subgraphEdges">Online Documentation</a>
 */
final var subgraphEdges: ItemCollection<IEdge>
/**
 * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CycleEdges%23subgraphNodes">Online Documentation</a>
 */
final var subgraphNodes: ItemCollection<INode>
/**
 * Finds all edges that are part of at least one directed or undirected simple cycle.
 * @param [graph] The input graph to run the algorithm on.
 * @return A [CycleEdgesResult] with all edges that are part of at least one cycle in the graph.
 * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CycleEdges%23CycleEdges-method-run">Online Documentation</a>
 */
 final   fun run( graph: IGraph ):CycleEdgesResult

companion object : ClassMetadata<CycleEdges> {
}
}

inline fun CycleEdges(
    block: CycleEdges.() -> Unit
): CycleEdges {
    return CycleEdges()
        .apply(block)
}
