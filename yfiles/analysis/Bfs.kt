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
 * Computes the layers of nodes constructed by a directed or undirected breadth-first search.
 * @see [LayoutGraphAlgorithms.bfs]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Bfs">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Bfs%23Bfs-constructor-Bfs">Online Documentation</a>
 */
external class Bfs ()  {
  /**
   * Gets or sets a collection of nodes to start from.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Bfs%23coreNodes">Online Documentation</a>
   */
  final var coreNodes: ItemCollection<INode>
  
  /**
   * Gets or sets the number of layers to return.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Bfs%23layerCount">Online Documentation</a>
   */
  final var layerCount: Int
  
  /**
   * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Bfs%23subgraphEdges">Online Documentation</a>
   */
  final var subgraphEdges: ItemCollection<IEdge>
  
  /**
   * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Bfs%23subgraphNodes">Online Documentation</a>
   */
  final var subgraphNodes: ItemCollection<INode>
  
  /**
   * Gets or sets a value indicating whether to follow only [incoming][TraversalDirection], only [outgoing][TraversalDirection], [BOTH][TraversalDirection] only incoming and only outgoing, or any edges [independent of their direction][TraversalDirection].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Bfs%23traversalDirection">Online Documentation</a>
   */
  final var traversalDirection: TraversalDirection
  
  /**
   * Returns the layers of nodes constructed by a breadth-first search.
   * @param [graph] The input graph to run the algorithm on.
   * @return A [BfsResult] containing the calculated node layers.
   * @throws InvalidOperationError if no [coreNodes][Bfs] are provided.
   * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Bfs%23Bfs-method-run">Online Documentation</a>
   */
  fun run(
    graph: IGraph,
  ): BfsResult
  
  companion object : ClassMetadata<Bfs> {
  }
}

inline fun Bfs(
    block: Bfs.() -> Unit
): Bfs {
    return Bfs()
        .apply(block)
}
