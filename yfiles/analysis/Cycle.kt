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
 * Finds a directed or undirected cycle of edges in a graph.
 * @see [LayoutGraphAlgorithms.findCycle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cycle">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cycle%23Cycle-constructor-Cycle">Online Documentation</a>
 */
external class Cycle ()  {
  /**
   * Gets or sets a value indicating whether edge direction should be considered.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cycle%23directed">Online Documentation</a>
   */
  final var directed: Boolean
  
  /**
   * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cycle%23subgraphEdges">Online Documentation</a>
   */
  final var subgraphEdges: ItemCollection<IEdge>
  
  /**
   * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cycle%23subgraphNodes">Online Documentation</a>
   */
  final var subgraphNodes: ItemCollection<INode>
  
  /**
   * Finds a cycle in the given graph.
   * @param [graph] The input graph to run the algorithm on.
   * @return A [CycleResult] with a cycle (if one exists in the graph).
   * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Cycle%23Cycle-method-run">Online Documentation</a>
   */
  fun run(
    graph: IGraph,
  ): CycleResult
  
  companion object : ClassMetadata<Cycle> {
  }
}

inline fun Cycle(
    block: Cycle.() -> Unit
): Cycle {
    return Cycle()
        .apply(block)
}
