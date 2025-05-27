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
 * Calculates a minimum spanning tree or forest for a graph.
 * @see [LayoutGraphAlgorithms.minimumSpanningTree]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SpanningTree">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SpanningTree%23SpanningTree-constructor-SpanningTree">Online Documentation</a>
 */
external class SpanningTree ()  {
  /**
   * Gets or sets a mapping for edge costs.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SpanningTree%23costs">Online Documentation</a>
   */
  final var costs: ItemMapping<IEdge, Double>
  
  /**
   * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SpanningTree%23subgraphEdges">Online Documentation</a>
   */
  final var subgraphEdges: ItemCollection<IEdge>
  
  /**
   * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SpanningTree%23subgraphNodes">Online Documentation</a>
   */
  final var subgraphNodes: ItemCollection<INode>
  
  /**
   * Calculates a minimum spanning tree or forest for the given graph.
   * @param [graph] The input graph to run the algorithm on.
   * @return A [SpanningTreeResult] containing the edges that make up the spanning tree (or forest).
   * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SpanningTree%23SpanningTree-method-run">Online Documentation</a>
   */
  fun run(
    graph: IGraph,
  ): SpanningTreeResult
  
  companion object : ClassMetadata<SpanningTree> {
  }
}

inline fun SpanningTree(
    block: SpanningTree.() -> Unit
): SpanningTree {
    return SpanningTree()
        .apply(block)
}
