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
 * Detects [SubstructureItems] that represent isolated chains in the specified graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChainSubstructures">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChainSubstructures%23ChainSubstructures-constructor-ChainSubstructures">Online Documentation</a>
 */
external class ChainSubstructures ()  {
  /**
   * Gets or sets a mapping that stores the directedness of the edges.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChainSubstructures%23edgeDirectedness">Online Documentation</a>
   */
  final var edgeDirectedness: ItemMapping<IEdge, EdgeDirectedness>
  
  /**
   * Gets or sets the minimum size of a chain.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChainSubstructures%23minimumSize">Online Documentation</a>
   */
  final var minimumSize: Double
  
  /**
   * Gets or sets a mapping which maps the type of each node.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChainSubstructures%23nodeTypes">Online Documentation</a>
   */
  final var nodeTypes: ItemMapping<INode, Any>
  
  /**
   * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChainSubstructures%23subgraphEdges">Online Documentation</a>
   */
  final var subgraphEdges: ItemCollection<IEdge>
  
  /**
   * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChainSubstructures%23subgraphNodes">Online Documentation</a>
   */
  final var subgraphNodes: ItemCollection<INode>
  
  /**
   * Returns a list of [SubstructureItems] that represent isolated chains in the specified graph.
   * @param [graph] The graph to find the substructures in.
   * @return A list of [SubstructureItems] that represent the chains.
   * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChainSubstructures%23ChainSubstructures-method-run">Online Documentation</a>
   */
  fun run(
    graph: IGraph,
  ): ChainSubstructuresResult
  
  companion object : ClassMetadata<ChainSubstructures> {
  }
}

inline fun ChainSubstructures(
    block: ChainSubstructures.() -> Unit
): ChainSubstructures {
    return ChainSubstructures()
        .apply(block)
}
