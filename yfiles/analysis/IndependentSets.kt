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
 * Partitions the set of nodes of the given graph into independent sets.
 * @see [LayoutGraphAlgorithms.independentSets]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IndependentSets">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IndependentSets%23IndependentSets-constructor-IndependentSets">Online Documentation</a>
 */
external class IndependentSets ()  {
  /**
   * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IndependentSets%23subgraphEdges">Online Documentation</a>
   */
  final var subgraphEdges: ItemCollection<IEdge>
  
  /**
   * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IndependentSets%23subgraphNodes">Online Documentation</a>
   */
  final var subgraphNodes: ItemCollection<INode>
  
  /**
   * Partitions the set of nodes of the given graph into independent sets.
   * ### Preconditions
   * - The input graph is [simple][GraphStructureAnalyzer], i.e., it contains neither parallel edges nor self-loops.
   * @param [graph] The input graph to run the algorithm on.
   * @return A [IndependentSetsResult] containing the independent sets of nodes in `graph`.
   * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IndependentSets%23IndependentSets-method-run">Online Documentation</a>
   */
  fun run(
    graph: IGraph,
  ): IndependentSetsResult
  
  companion object : ClassMetadata<IndependentSets> {
  }
}

inline fun IndependentSets(
    block: IndependentSets.() -> Unit
): IndependentSets {
    return IndependentSets()
        .apply(block)
}
