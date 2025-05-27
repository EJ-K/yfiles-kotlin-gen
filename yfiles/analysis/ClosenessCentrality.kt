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
import yfiles.collections.ItemMapping
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.INode
import yfiles.lang.ClassMetadata

/**
 * Computes the closeness centrality for the nodes of a graph.
 * @see [LayoutGraphAlgorithms.closenessCentrality]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClosenessCentrality">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClosenessCentrality%23ClosenessCentrality-constructor-ClosenessCentrality">Online Documentation</a>
 */
external class ClosenessCentrality ()  {
  /**
   * Gets or sets a value indicating whether edge direction should be considered.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClosenessCentrality%23directed">Online Documentation</a>
   */
  final var directed: Boolean
  
  /**
   * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClosenessCentrality%23subgraphEdges">Online Documentation</a>
   */
  final var subgraphEdges: ItemCollection<IEdge>
  
  /**
   * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClosenessCentrality%23subgraphNodes">Online Documentation</a>
   */
  final var subgraphNodes: ItemCollection<INode>
  
  /**
   * Gets or sets a mapping for edge weights.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClosenessCentrality%23weights">Online Documentation</a>
   */
  final var weights: ItemMapping<IEdge, Double>
  
  /**
   * Computes the closeness centrality for the nodes of a graph.
   * @param [graph] The input graph to run the algorithm on.
   * @return A [ClosenessCentralityResult] from which the calculated centrality values can be obtained.
   * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClosenessCentrality%23ClosenessCentrality-method-run">Online Documentation</a>
   */
  fun run(
    graph: IGraph,
  ): ClosenessCentralityResult
  
  companion object : ClassMetadata<ClosenessCentrality> {
  }
}

inline fun ClosenessCentrality(
    block: ClosenessCentrality.() -> Unit
): ClosenessCentrality {
    return ClosenessCentrality()
        .apply(block)
}
