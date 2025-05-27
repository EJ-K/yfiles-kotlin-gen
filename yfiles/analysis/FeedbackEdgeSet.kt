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
 * Finds edges of a given graph whose removal or reversal would make the graph acyclic (also called *Feedback Arc Set*).
 * @see [LayoutGraphAlgorithms.findCycleEdges]
 * @see [LayoutGraphAlgorithms.findCycleEdgesDfs]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FeedbackEdgeSet">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FeedbackEdgeSet%23FeedbackEdgeSet-constructor-FeedbackEdgeSet">Online Documentation</a>
 */
external class FeedbackEdgeSet ()  {
  /**
   * Gets or sets a mapping for edge costs.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FeedbackEdgeSet%23costs">Online Documentation</a>
   */
  final var costs: ItemMapping<IEdge, Double>
  
  /**
   * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FeedbackEdgeSet%23subgraphEdges">Online Documentation</a>
   */
  final var subgraphEdges: ItemCollection<IEdge>
  
  /**
   * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FeedbackEdgeSet%23subgraphNodes">Online Documentation</a>
   */
  final var subgraphNodes: ItemCollection<INode>
  
  /**
   * Finds the edges of a given graph whose removal or reversal would make the graph acyclic.
   * @param [graph] The input graph to run the algorithm on.
   * @return A [FeedbackEdgeSetResult] containing the edges whose removal or reversal would make the graph acyclic.
   * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FeedbackEdgeSet%23FeedbackEdgeSet-method-run">Online Documentation</a>
   */
  fun run(
    graph: IGraph,
  ): FeedbackEdgeSetResult
  
  companion object : ClassMetadata<FeedbackEdgeSet> {
  }
}

inline fun FeedbackEdgeSet(
    block: FeedbackEdgeSet.() -> Unit
): FeedbackEdgeSet {
    return FeedbackEdgeSet()
        .apply(block)
}
