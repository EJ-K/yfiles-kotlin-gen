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
import yfiles.lang.TimeSpan

/**
 * Aggregates the nodes of a given graph and creates a hierarchical clustering structure subject to user-specified constraints.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregation">Online Documentation</a>
 * 
 * @constructor Creates a new instance with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregation%23NodeAggregation-constructor-NodeAggregation">Online Documentation</a>
 */
external class NodeAggregation ()  {
  /**
   * Gets or sets the policy applied for determining the clusters.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregation%23aggregationPolicy">Online Documentation</a>
   */
  final var aggregationPolicy: NodeAggregationPolicy
  
  /**
   * Gets or sets a mapping for specifying the directedness of edges.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregation%23edgeDirectedness">Online Documentation</a>
   */
  final var edgeDirectedness: ItemMapping<IEdge, EdgeDirectedness>
  
  /**
   * Gets or sets a mapping for specifying the (non-negative) weights of the edges.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregation%23edgeWeights">Online Documentation</a>
   */
  final var edgeWeights: ItemMapping<IEdge, Double>
  
  /**
   * Gets or sets the preferred maximum number of elements contained in a cluster.
   * @throws ArgumentError if a value `< 2` is set.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregation%23maximumClusterSize">Online Documentation</a>
   */
  final var maximumClusterSize: Int
  
  /**
   * Gets or sets the preferred minimum number of elements contained in a cluster.
   * @throws ArgumentError if a value `< 1` is set.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregation%23minimumClusterSize">Online Documentation</a>
   */
  final var minimumClusterSize: Int
  
  /**
   * Gets or sets how node types are handled for aggregation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregation%23nodeTypePolicy">Online Documentation</a>
   */
  final var nodeTypePolicy: NodeTypePolicy
  
  /**
   * Gets or sets a mapping which maps nodes to an object that specifies their type.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregation%23nodeTypes">Online Documentation</a>
   */
  final var nodeTypes: ItemMapping<INode, Any>
  
  /**
   * Gets or sets a mapping for specifying the (non-negative) weights of the nodes.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregation%23nodeWeights">Online Documentation</a>
   */
  final var nodeWeights: ItemMapping<INode, Double>
  
  /**
   * Gets or sets whether nodes are only mapped to leaves of the directed rooted [NodeAggregate] tree that represents the hierarchical clustering structure.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregation%23nodesOnlyOnLeaves">Online Documentation</a>
   */
  final var nodesOnlyOnLeaves: Boolean
  
  /**
   * Gets or sets the duration that this algorithm should preferably run before stopping.
   * @throws ArgumentError if the specified duration is less than [ZERO][TimeSpan].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregation%23stopDuration">Online Documentation</a>
   */
  final var stopDuration: TimeSpan
  
  /**
   * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregation%23subgraphEdges">Online Documentation</a>
   */
  final var subgraphEdges: ItemCollection<IEdge>
  
  /**
   * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregation%23subgraphNodes">Online Documentation</a>
   */
  final var subgraphNodes: ItemCollection<INode>
  
  /**
   * Gets or sets the top-level nodes of the aggregation info.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregation%23topLevelNodes">Online Documentation</a>
   */
  final var topLevelNodes: ItemCollection<INode>
  
  /**
   * Aggregates the nodes of the given `graph` and creates a hierarchical clustering structure.
   * @param [graph] The input graph to run the algorithm on.
   * @return The hierarchical clustering of the `graph`.
   * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregation%23NodeAggregation-method-run">Online Documentation</a>
   */
  fun run(
    graph: IGraph,
  ): NodeAggregationResult
  
  companion object : ClassMetadata<NodeAggregation> {
  }
}

inline fun NodeAggregation(
    block: NodeAggregation.() -> Unit
): NodeAggregation {
    return NodeAggregation()
        .apply(block)
}
