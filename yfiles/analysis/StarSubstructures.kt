// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.analysis

import yfiles.algorithms.EdgeDirectedness
import yfiles.collections.ItemCollection
import yfiles.collections.ItemMapping
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.INode
import yfiles.lang.ClassMetadata

/**
 * Detects [SubstructureItems] that represent isolated stars in the specified graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StarSubstructures">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StarSubstructures%23StarSubstructures-constructor-StarSubstructures">Online Documentation</a>
 */
external class StarSubstructures ()  {
  /**
   * Gets or sets a mapping that stores the directedness of the edges.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StarSubstructures%23edgeDirectedness">Online Documentation</a>
   */
  final var edgeDirectedness: ItemMapping<IEdge, EdgeDirectedness>
  
  /**
   * Gets or sets the minimum size of a star.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StarSubstructures%23minimumSize">Online Documentation</a>
   */
  final var minimumSize: Double
  
  /**
   * Gets or sets a mapping which maps the type of each node.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StarSubstructures%23nodeTypes">Online Documentation</a>
   */
  final var nodeTypes: ItemMapping<INode, Any>
  
  /**
   * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StarSubstructures%23subgraphEdges">Online Documentation</a>
   */
  final var subgraphEdges: ItemCollection<IEdge>
  
  /**
   * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StarSubstructures%23subgraphNodes">Online Documentation</a>
   */
  final var subgraphNodes: ItemCollection<INode>
  
  /**
   * Returns a list of [SubstructureItems] that represent isolated stars in the specified graph.
   * @param [graph] The graph to find the substructures in.
   * @return A list of [SubstructureItems] that represent the stars.
   * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StarSubstructures%23StarSubstructures-method-run">Online Documentation</a>
   */
  fun run(
    graph: IGraph,
  ): StarSubstructuresResult
  
  companion object : ClassMetadata<StarSubstructures> {
  }
}

inline fun StarSubstructures(
    block: StarSubstructures.() -> Unit
): StarSubstructures {
    return StarSubstructures()
        .apply(block)
}
