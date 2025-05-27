// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.analysis

import yfiles.collections.ItemCollection
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.INode
import yfiles.lang.ClassMetadata

/**
 * Computes the degree centrality for the nodes of a given graph.
 * @see [LayoutGraphAlgorithms.degreeCentrality]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DegreeCentrality">Online Documentation</a>
 * 
 * @constructor Creates a new instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DegreeCentrality%23DegreeCentrality-constructor-DegreeCentrality">Online Documentation</a>
 */
external class DegreeCentrality ()  {
  /**
   * Gets or sets a value indicating whether incoming edges contribute to the centrality values of their target nodes.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DegreeCentrality%23considerIncomingEdges">Online Documentation</a>
   */
  final var considerIncomingEdges: Boolean
  
  /**
   * Gets or sets a value indicating whether outgoing edges contribute to the centrality values of their source nodes.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DegreeCentrality%23considerOutgoingEdges">Online Documentation</a>
   */
  final var considerOutgoingEdges: Boolean
  
  /**
   * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DegreeCentrality%23subgraphEdges">Online Documentation</a>
   */
  final var subgraphEdges: ItemCollection<IEdge>
  
  /**
   * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DegreeCentrality%23subgraphNodes">Online Documentation</a>
   */
  final var subgraphNodes: ItemCollection<INode>
  
  /**
   * Computes the degree centrality for the nodes of a given graph.
   * ### Preconditions
   * - At least one of the flags [considerIncomingEdges][DegreeCentrality] and [considerOutgoingEdges][DegreeCentrality] must be `true`.
   * @param [graph] The input graph to run the algorithm on.
   * @return A [DegreeCentralityResult] from which the calculated centrality values can be obtained.
   * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DegreeCentrality%23DegreeCentrality-method-run">Online Documentation</a>
   */
  fun run(
    graph: IGraph,
  ): DegreeCentralityResult
  
  companion object : ClassMetadata<DegreeCentrality> {
  }
}

inline fun DegreeCentrality(
    block: DegreeCentrality.() -> Unit
): DegreeCentrality {
    return DegreeCentrality()
        .apply(block)
}
