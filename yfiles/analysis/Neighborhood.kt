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
 * Finds the direct or indirect neighbors of a given set of nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Neighborhood">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Neighborhood%23Neighborhood-constructor-Neighborhood">Online Documentation</a>
 */
external class Neighborhood ()  {
  /**
   * Gets or sets the maximum distance from the [startNodes][Neighborhood] to consider.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Neighborhood%23maximumDistance">Online Documentation</a>
   */
  final var maximumDistance: Double
  
  /**
   * Gets or sets a collection of nodes from which to start the search.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Neighborhood%23startNodes">Online Documentation</a>
   */
  final var startNodes: ItemCollection<INode>
  
  /**
   * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Neighborhood%23subgraphEdges">Online Documentation</a>
   */
  final var subgraphEdges: ItemCollection<IEdge>
  
  /**
   * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Neighborhood%23subgraphNodes">Online Documentation</a>
   */
  final var subgraphNodes: ItemCollection<INode>
  
  /**
   * Gets or sets a value indicating whether to follow only [incoming][TraversalDirection], only [outgoing][TraversalDirection], [BOTH][TraversalDirection] only incoming and only outgoing, or any edges [independent of their direction][TraversalDirection].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Neighborhood%23traversalDirection">Online Documentation</a>
   */
  final var traversalDirection: TraversalDirection
  
  /**
   * Finds neighbors of a set of nodes.
   * @param [graph] The input graph to run the algorithm on.
   * @return A [NeighborhoodResult] containing neighbors of the [startNodes][Neighborhood] in the given [direction][Neighborhood].
   * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Neighborhood%23Neighborhood-method-run">Online Documentation</a>
   */
  fun run(
    graph: IGraph,
  ): NeighborhoodResult
  
  companion object : ClassMetadata<Neighborhood> {
  }
}

inline fun Neighborhood(
    block: Neighborhood.() -> Unit
): Neighborhood {
    return Neighborhood()
        .apply(block)
}
