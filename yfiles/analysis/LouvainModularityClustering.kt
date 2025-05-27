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
 * Detects the communities in the specified input graph by applying the *Louvain modularity* method.
 * @see [LayoutGraphAlgorithms.louvainModularity]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LouvainModularityClustering">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LouvainModularityClustering%23LouvainModularityClustering-constructor-LouvainModularityClustering">Online Documentation</a>
 */
external class LouvainModularityClustering ()  {
  /**
   * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LouvainModularityClustering%23subgraphEdges">Online Documentation</a>
   */
  final var subgraphEdges: ItemCollection<IEdge>
  
  /**
   * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LouvainModularityClustering%23subgraphNodes">Online Documentation</a>
   */
  final var subgraphNodes: ItemCollection<INode>
  
  /**
   * Gets or sets a mapping for edge weights.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LouvainModularityClustering%23weights">Online Documentation</a>
   */
  final var weights: ItemMapping<IEdge, Double>
  
  /**
   * Detects the communities in the specified input graph by applying the *Louvain modularity* method.
   * @param [graph] The graph to partition.
   * @return The calculated clusters.
   * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LouvainModularityClustering%23LouvainModularityClustering-method-run">Online Documentation</a>
   */
  fun run(
    graph: IGraph,
  ): LouvainModularityClusteringResult
  
  companion object : ClassMetadata<LouvainModularityClustering> {
  }
}

inline fun LouvainModularityClustering(
    block: LouvainModularityClustering.() -> Unit
): LouvainModularityClustering {
    return LouvainModularityClustering()
        .apply(block)
}
