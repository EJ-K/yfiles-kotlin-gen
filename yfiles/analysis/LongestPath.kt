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
 * Finds the longest directed path in an acyclic graph.
 * @see [LayoutGraphAlgorithms.longestPath]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LongestPath">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LongestPath%23LongestPath-constructor-LongestPath">Online Documentation</a>
 */
external class LongestPath ()  {
  /**
   * Gets or sets a mapping for edge costs.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LongestPath%23costs">Online Documentation</a>
   */
  final var costs: ItemMapping<IEdge, Double>
  
  /**
   * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LongestPath%23subgraphEdges">Online Documentation</a>
   */
  final var subgraphEdges: ItemCollection<IEdge>
  
  /**
   * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LongestPath%23subgraphNodes">Online Documentation</a>
   */
  final var subgraphNodes: ItemCollection<INode>
  
  /**
   * Finds the longest directed path in an acyclic graph.
   * ### Preconditions
   * - The graph must be [acyclic][GraphStructureAnalyzer].
   * @param [graph] The input graph to run the algorithm on.
   * @return A [LongestPathResult] containing the longest directed path in the graph.
   * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LongestPath%23LongestPath-method-run">Online Documentation</a>
   */
  fun run(
    graph: IGraph,
  ): LongestPathResult
  
  companion object : ClassMetadata<LongestPath> {
  }
}

inline fun LongestPath(
    block: LongestPath.() -> Unit
): LongestPath {
    return LongestPath()
        .apply(block)
}
