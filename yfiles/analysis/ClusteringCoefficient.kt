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
 * Calculates the local clustering coefficient for each node and returns the average clustering coefficient.
 * @see [LayoutGraphAlgorithms.clusteringCoefficient]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClusteringCoefficient">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClusteringCoefficient%23ClusteringCoefficient-constructor-ClusteringCoefficient">Online Documentation</a>
 */
external class ClusteringCoefficient ()  {
  /**
   * Gets or sets a value indicating whether edge direction should be considered.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClusteringCoefficient%23directed">Online Documentation</a>
   */
  final var directed: Boolean
  
  /**
   * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClusteringCoefficient%23subgraphEdges">Online Documentation</a>
   */
  final var subgraphEdges: ItemCollection<IEdge>
  
  /**
   * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClusteringCoefficient%23subgraphNodes">Online Documentation</a>
   */
  final var subgraphNodes: ItemCollection<INode>
  
  /**
   * Calculates the local clustering coefficient for each node and returns the average clustering coefficient.
   * @param [graph] the input graph
   * @return The coefficients for each node and the average coefficient.
   * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClusteringCoefficient%23ClusteringCoefficient-method-run">Online Documentation</a>
   */
  fun run(
    graph: IGraph,
  ): ClusteringCoefficientResult
  
  companion object : ClassMetadata<ClusteringCoefficient> {
  }
}

inline fun ClusteringCoefficient(
    block: ClusteringCoefficient.() -> Unit
): ClusteringCoefficient {
    return ClusteringCoefficient()
        .apply(block)
}
