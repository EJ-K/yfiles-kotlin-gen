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

/**
 * Partitions the graph into clusters using *edge betweenness centrality*, as proposed by Girvan and Newman.
 * @see [LayoutGraphAlgorithms.edgeBetweennessClustering]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBetweennessClustering">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBetweennessClustering%23EdgeBetweennessClustering-constructor-EdgeBetweennessClustering">Online Documentation</a>
 */
external class EdgeBetweennessClustering ()  {
  /**
   * Gets or sets a value indicating whether edge direction should be considered.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBetweennessClustering%23directed">Online Documentation</a>
   */
  final var directed: Boolean
  
  /**
   * Gets or sets the maximum number of clusters that will be returned.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBetweennessClustering%23maximumClusterCount">Online Documentation</a>
   */
  final var maximumClusterCount: Int
  
  /**
   * Gets or sets the minimum number of clusters that will be returned.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBetweennessClustering%23minimumClusterCount">Online Documentation</a>
   */
  final var minimumClusterCount: Int
  
  /**
   * Gets or sets a desired quality value for the result.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBetweennessClustering%23qualityTimeRatio">Online Documentation</a>
   */
  final var qualityTimeRatio: Double
  
  /**
   * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBetweennessClustering%23subgraphEdges">Online Documentation</a>
   */
  final var subgraphEdges: ItemCollection<IEdge>
  
  /**
   * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBetweennessClustering%23subgraphNodes">Online Documentation</a>
   */
  final var subgraphNodes: ItemCollection<INode>
  
  /**
   * Gets or sets a mapping for edge weights.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBetweennessClustering%23weights">Online Documentation</a>
   */
  final var weights: ItemMapping<IEdge, Double>
  
  /**
   * Partitions the graph into groups using *edge betweenness centrality*.
   * @param [graph] The input graph to run the algorithm on.
   * @return A [EdgeBetweennessClusteringResult] containing the computed clusters.
   * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBetweennessClustering%23EdgeBetweennessClustering-method-run">Online Documentation</a>
   */
  fun run(
    graph: IGraph,
  ): EdgeBetweennessClusteringResult
  
  companion object : ClassMetadata<EdgeBetweennessClustering> {
  }
}

inline fun EdgeBetweennessClustering(
    block: EdgeBetweennessClustering.() -> Unit
): EdgeBetweennessClustering {
    return EdgeBetweennessClustering()
        .apply(block)
}
