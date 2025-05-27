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
 * Determines the connected components of a given graph.
 * @see [LayoutGraphAlgorithms.connectedComponents]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConnectedComponents">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConnectedComponents%23ConnectedComponents-constructor-ConnectedComponents">Online Documentation</a>
 */
external class ConnectedComponents ()  {
  /**
   * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConnectedComponents%23subgraphEdges">Online Documentation</a>
   */
  final var subgraphEdges: ItemCollection<IEdge>
  
  /**
   * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConnectedComponents%23subgraphNodes">Online Documentation</a>
   */
  final var subgraphNodes: ItemCollection<INode>
  
  /**
   * Determines the connected components of a given graph.
   * @param [graph] The input graph to run the algorithm on.
   * @return A [ConnectedComponentsResult] containing the connected components of `graph`.
   * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConnectedComponents%23ConnectedComponents-method-run">Online Documentation</a>
   */
  fun run(
    graph: IGraph,
  ): ConnectedComponentsResult
  
  companion object : ClassMetadata<ConnectedComponents> {
  }
}

inline fun ConnectedComponents(
    block: ConnectedComponents.() -> Unit
): ConnectedComponents {
    return ConnectedComponents()
        .apply(block)
}
