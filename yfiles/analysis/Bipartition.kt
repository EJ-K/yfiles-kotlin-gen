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
 * Calculates a bipartition of the given graph, if one exists.
 * @see [LayoutGraphAlgorithms.bipartition]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Bipartition">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Bipartition%23Bipartition-constructor-Bipartition">Online Documentation</a>
 */
external class Bipartition ()  {
  /**
   * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Bipartition%23subgraphEdges">Online Documentation</a>
   */
  final var subgraphEdges: ItemCollection<IEdge>
  
  /**
   * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Bipartition%23subgraphNodes">Online Documentation</a>
   */
  final var subgraphNodes: ItemCollection<INode>
  
  /**
   * Calculates a bipartition of the given graph, if one exists.
   * @param [graph] The input graph to run the algorithm on.
   * @return A [BipartitionResult] containing both partitions of `graph`. If the graph is not bipartite, the resulting partitions are empty and [isBipartite][BipartitionResult] is `false`.
   * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Bipartition%23Bipartition-method-run">Online Documentation</a>
   */
  fun run(
    graph: IGraph,
  ): BipartitionResult
  
  companion object : ClassMetadata<Bipartition> {
  }
}

inline fun Bipartition(
    block: Bipartition.() -> Unit
): Bipartition {
    return Bipartition()
        .apply(block)
}
