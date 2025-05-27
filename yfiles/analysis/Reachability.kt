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
 * Determines the nodes that are reachable from one or more [startNodes][Reachability].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Reachability">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Reachability%23Reachability-constructor-Reachability">Online Documentation</a>
 */
external class Reachability ()  {
  /**
   * Gets or sets a value indicating whether edge direction should be considered.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Reachability%23directed">Online Documentation</a>
   */
  final var directed: Boolean
  
  /**
   * Gets or sets a collection of nodes from which to determine reachability.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Reachability%23startNodes">Online Documentation</a>
   */
  final var startNodes: ItemCollection<INode>
  
  /**
   * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Reachability%23subgraphEdges">Online Documentation</a>
   */
  final var subgraphEdges: ItemCollection<IEdge>
  
  /**
   * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Reachability%23subgraphNodes">Online Documentation</a>
   */
  final var subgraphNodes: ItemCollection<INode>
  
  /**
   * Determines the set of nodes that are reachable from the [startNodes][Reachability].
   * @param [graph] The input graph to run the algorithm on.
   * @return A [ReachabilityResult] containing the nodes reachable from [startNodes][Reachability].
   * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Reachability%23Reachability-method-run">Online Documentation</a>
   */
  fun run(
    graph: IGraph,
  ): ReachabilityResult
  
  companion object : ClassMetadata<Reachability> {
  }
}

inline fun Reachability(
    block: Reachability.() -> Unit
): Reachability {
    return Reachability()
        .apply(block)
}
