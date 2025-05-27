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
 * Determines the biconnected components and articulation points of a given undirected graph.
 * @see [LayoutGraphAlgorithms.biconnectedComponents]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BiconnectedComponents">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BiconnectedComponents%23BiconnectedComponents-constructor-BiconnectedComponents">Online Documentation</a>
 */
external class BiconnectedComponents ()  {
  /**
   * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BiconnectedComponents%23subgraphEdges">Online Documentation</a>
   */
  final var subgraphEdges: ItemCollection<IEdge>
  
  /**
   * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BiconnectedComponents%23subgraphNodes">Online Documentation</a>
   */
  final var subgraphNodes: ItemCollection<INode>
  
  /**
   * Determines the biconnected components and articulation points of a given undirected graph.
   * @param [graph] The input graph to run the algorithm on.
   * @return A [BiconnectedComponentsResult] containing the biconnected components and articulation points of `graph`.
   * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BiconnectedComponents%23BiconnectedComponents-method-run">Online Documentation</a>
   */
  fun run(
    graph: IGraph,
  ): BiconnectedComponentsResult
  
  companion object : ClassMetadata<BiconnectedComponents> {
  }
}

inline fun BiconnectedComponents(
    block: BiconnectedComponents.() -> Unit
): BiconnectedComponents {
    return BiconnectedComponents()
        .apply(block)
}
