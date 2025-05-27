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
 * Finds all simple directed or undirected paths between one or more [startNodes][Paths] and [endNodes][Paths].
 * @see [LayoutGraphAlgorithms.allPaths]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Paths">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Paths%23Paths-constructor-Paths">Online Documentation</a>
 */
external class Paths ()  {
  /**
   * Gets or sets a value indicating whether edge direction should be considered.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Paths%23directed">Online Documentation</a>
   */
  final var directed: Boolean
  
  /**
   * Gets or sets a collection of end nodes.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Paths%23endNodes">Online Documentation</a>
   */
  final var endNodes: ItemCollection<INode>
  
  /**
   * Gets or sets a collection of start nodes.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Paths%23startNodes">Online Documentation</a>
   */
  final var startNodes: ItemCollection<INode>
  
  /**
   * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Paths%23subgraphEdges">Online Documentation</a>
   */
  final var subgraphEdges: ItemCollection<IEdge>
  
  /**
   * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Paths%23subgraphNodes">Online Documentation</a>
   */
  final var subgraphNodes: ItemCollection<INode>
  
  /**
   * Finds all paths between [startNodes][Paths] and [endNodes][Paths].
   * @param [graph] The input graph to run the algorithm on.
   * @return A [PathsResult] containing all paths between [startNodes][Paths] and [endNodes][Paths].
   * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Paths%23Paths-method-run">Online Documentation</a>
   */
  fun run(
    graph: IGraph,
  ): PathsResult
  
  companion object : ClassMetadata<Paths> {
  }
}

inline fun Paths(
    block: Paths.() -> Unit
): Paths {
    return Paths()
        .apply(block)
}
