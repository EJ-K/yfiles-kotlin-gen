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
 * Determines the strongly connected components of a given graph.
 * @see [LayoutGraphAlgorithms.stronglyConnectedComponents]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StronglyConnectedComponents">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StronglyConnectedComponents%23StronglyConnectedComponents-constructor-StronglyConnectedComponents">Online Documentation</a>
 */
external class StronglyConnectedComponents ()  {
  /**
   * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StronglyConnectedComponents%23subgraphEdges">Online Documentation</a>
   */
  final var subgraphEdges: ItemCollection<IEdge>
  
  /**
   * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StronglyConnectedComponents%23subgraphNodes">Online Documentation</a>
   */
  final var subgraphNodes: ItemCollection<INode>
  
  /**
   * Determines the strongly connected components of a given graph.
   * @param [graph] The input graph to run the algorithm on.
   * @return A [StronglyConnectedComponentsResult] containing the strongly connected components of `graph`.
   * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StronglyConnectedComponents%23StronglyConnectedComponents-method-run">Online Documentation</a>
   */
  fun run(
    graph: IGraph,
  ): StronglyConnectedComponentsResult
  
  companion object : ClassMetadata<StronglyConnectedComponents> {
  }
}

inline fun StronglyConnectedComponents(
    block: StronglyConnectedComponents.() -> Unit
): StronglyConnectedComponents {
    return StronglyConnectedComponents()
        .apply(block)
}
