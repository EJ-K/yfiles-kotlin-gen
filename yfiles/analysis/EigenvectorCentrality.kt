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
 * Computes an eigenvector centrality for each node of a given undirected, unweighted graph.
 * @see [Centrality.eigenvectorCentrality][yfiles.algorithms.Centrality.eigenvectorCentrality]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EigenvectorCentrality">Online Documentation</a>
 * 
 * @constructor Creates a new instance of this class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EigenvectorCentrality%23EigenvectorCentrality-constructor-EigenvectorCentrality">Online Documentation</a>
 */
external open class EigenvectorCentrality  () : YObject {

/**
 * Gets or sets the precision used during the calculation of the power iteration method, i.e., the maximum possible difference to consider two values as equal.
 * 
 * The default is `0.001`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EigenvectorCentrality%23precision">Online Documentation</a>
 */
final var precision: Double
/**
 * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EigenvectorCentrality%23subgraphEdges">Online Documentation</a>
 */
final var subgraphEdges: ItemCollection<IEdge>
/**
 * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EigenvectorCentrality%23subgraphNodes">Online Documentation</a>
 */
final var subgraphNodes: ItemCollection<INode>
/**
 * Computes an eigenvector centrality for each node of a given undirected, unweighted graph.
 * @param [graph] The input graph to run the algorithm on.
 * @return A [EigenvectorCentralityResult] from which the calculated centrality values can be obtained.
 * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EigenvectorCentrality%23EigenvectorCentrality-method-run">Online Documentation</a>
 */
 final   fun run( graph: IGraph ):EigenvectorCentralityResult

companion object : ClassMetadata<EigenvectorCentrality> {
}
}

inline fun EigenvectorCentrality(
    block: EigenvectorCentrality.() -> Unit
): EigenvectorCentrality {
    return EigenvectorCentrality()
        .apply(block)
}
