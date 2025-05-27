// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.analysis

import yfiles.algorithms.EdgeDirectedness
import yfiles.collections.ItemCollection
import yfiles.collections.ItemMapping
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.INode
import yfiles.lang.ClassMetadata

/**
 * Computes page rank values for all nodes based on their attached edges.
 * @see [LayoutGraphAlgorithms.pageRank]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PageRank">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PageRank%23PageRank-constructor-PageRank">Online Documentation</a>
 */
external class PageRank ()  {
  /**
   * Gets or sets a value between `0` and `1` denoting the factor of a node's rank that shall be distributed to its successors.
   * @throws ArgumentError if the value is not between `0` and `1`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PageRank%23dampingFactor">Online Documentation</a>
   */
  final var dampingFactor: Double
  
  /**
   * Gets or sets a mapping that stores the directedness of the edges.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PageRank%23edgeDirectedness">Online Documentation</a>
   */
  final var edgeDirectedness: ItemMapping<IEdge, EdgeDirectedness>
  
  /**
   * Gets or sets a mapping for edge weights.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PageRank%23edgeWeights">Online Documentation</a>
   */
  final var edgeWeights: ItemMapping<IEdge, Double>
  
  /**
   * Gets or sets a mapping that specifies the initial page rank for each node.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PageRank%23initialPageRank">Online Documentation</a>
   */
  final var initialPageRank: ItemMapping<INode, Double>
  
  /**
   * Gets or sets a mapping for node weights.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PageRank%23nodeWeights">Online Documentation</a>
   */
  final var nodeWeights: ItemMapping<INode, Double>
  
  /**
   * Gets or sets the non-negative precision of the calculated page ranks.
   * 
   * The default is `0.001`.
   * @throws ArgumentError if the value is negative.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PageRank%23precision">Online Documentation</a>
   */
  final var precision: Double
  
  /**
   * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PageRank%23subgraphEdges">Online Documentation</a>
   */
  final var subgraphEdges: ItemCollection<IEdge>
  
  /**
   * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PageRank%23subgraphNodes">Online Documentation</a>
   */
  final var subgraphNodes: ItemCollection<INode>
  
  /**
   * Computes page rank values for all nodes based on their attached edges.
   * @param [graph] The input graph to run the algorithm on.
   * @return A [PageRankResult] from which the calculated centrality values can be obtained. The values are between `0.0` and `1.0`.
   * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PageRank%23PageRank-method-run">Online Documentation</a>
   */
  fun run(
    graph: IGraph,
  ): PageRankResult
  
  companion object : ClassMetadata<PageRank> {
  }
}

inline fun PageRank(
    block: PageRank.() -> Unit
): PageRank {
    return PageRank()
        .apply(block)
}
