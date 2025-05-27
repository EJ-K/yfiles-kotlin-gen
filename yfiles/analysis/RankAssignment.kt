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
import yfiles.lang.TimeSpan
import yfiles.lang.YObject
import yfiles.layout.ItemCollection
import yfiles.layout.ItemMapping

/**
 * Solves the rank assignment problem.
 * @see [RankAssignments.simplex][yfiles.algorithms.RankAssignments.simplex]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RankAssignment">Online Documentation</a>
 * 
 * @constructor Creates a new instance of this class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RankAssignment%23RankAssignment-constructor-RankAssignment">Online Documentation</a>
 */
external open class RankAssignment  () : YObject {

/**
 * Gets or sets the preferred time limit for the algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RankAssignment%23maximumDuration">Online Documentation</a>
 */
final var maximumDuration: TimeSpan
/**
 * Gets or sets a mapping for each edge's desired minimum length.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RankAssignment%23minimumEdgeLengths">Online Documentation</a>
 */
final var minimumEdgeLengths: ItemMapping<IEdge, Double>
/**
 * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithm to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RankAssignment%23subgraphEdges">Online Documentation</a>
 */
final var subgraphEdges: ItemCollection<IEdge>
/**
 * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithm to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RankAssignment%23subgraphNodes">Online Documentation</a>
 */
final var subgraphNodes: ItemCollection<INode>
/**
 * Gets or sets a mapping for edge weights.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RankAssignment%23weights">Online Documentation</a>
 */
final var weights: ItemMapping<IEdge, Double>
/**
 * Solves the rank assignment problem.
 * ### Preconditions
 * - The graph must be acyclic.
 * @param [graph] The input graph to run the algorithm on.
 * @return A [RankAssignmentResult] with the calculated ranking for each node.
 * @throws InvalidOperationError If the algorithm cannot create a valid result due to an invalid graph structure or wrongly configured properties.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RankAssignment%23RankAssignment-method-run">Online Documentation</a>
 */
 final   fun run( graph: IGraph ):RankAssignmentResult

companion object : ClassMetadata<RankAssignment> {
}
}

inline fun RankAssignment(
    block: RankAssignment.() -> Unit
): RankAssignment {
    return RankAssignment()
        .apply(block)
}
