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
import yfiles.lang.Func3

/**
 * Finds the shortest path between two nodes (also known as the *single-source single-sink shortest path* problem).
 * @see [LayoutGraphAlgorithms.shortestPath]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPath">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPath%23ShortestPath-constructor-ShortestPath">Online Documentation</a>
 */
external class ShortestPath ()  {
  /**
   * Gets or sets a mapping for the cost for traversing an edge.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPath%23costs">Online Documentation</a>
   */
  final var costs: ItemMapping<IEdge, Double>
  
  /**
   * Gets or sets a value indicating whether edge direction should be considered.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPath%23directed">Online Documentation</a>
   */
  final var directed: Boolean
  
  /**
   * Gets or sets a function that estimates the distance between two nodes.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPath%23heuristic">Online Documentation</a>
   */
  final var heuristic: Func3<INode, INode, Double>?
  
  /**
   * Gets or sets the sink (end, target) node of the path.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPath%23sink">Online Documentation</a>
   */
  final var sink: ItemCollection<INode>
  
  /**
   * Gets or sets the source (start) node of the path.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPath%23source">Online Documentation</a>
   */
  final var source: ItemCollection<INode>
  
  /**
   * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPath%23subgraphEdges">Online Documentation</a>
   */
  final var subgraphEdges: ItemCollection<IEdge>
  
  /**
   * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPath%23subgraphNodes">Online Documentation</a>
   */
  final var subgraphNodes: ItemCollection<INode>
  
  /**
   * Finds the shortest path between [source][ShortestPath] and [sink][ShortestPath].
   * @param [graph] The input graph to run the algorithm on.
   * @return A [ShortestPathResult] containing the shortest path between [source][ShortestPath] and [sink][ShortestPath] if one exists.
   * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPath%23ShortestPath-method-run">Online Documentation</a>
   */
  fun run(
    graph: IGraph,
  ): ShortestPathResult
  
  companion object : ClassMetadata<ShortestPath> {
  }
}

inline fun ShortestPath(
    block: ShortestPath.() -> Unit
): ShortestPath {
    return ShortestPath()
        .apply(block)
}
