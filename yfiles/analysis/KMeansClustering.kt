// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.analysis

import yfiles.collections.IEnumerable
import yfiles.collections.ItemCollection
import yfiles.geometry.Point
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.INode
import yfiles.lang.ClassMetadata

/**
 * Partitions the graph into clusters using *k*-means clustering.
 * @see [LayoutGraphAlgorithms.kMeansClustering]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KMeansClustering">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KMeansClustering%23KMeansClustering-constructor-KMeansClustering">Online Documentation</a>
 */
external class KMeansClustering ()  {
  /**
   * Gets or sets the initial centroids.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KMeansClustering%23centroids">Online Documentation</a>
   */
  final var centroids: IEnumerable<Point>?
  
  /**
   * Gets or sets the number of clusters.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KMeansClustering%23k">Online Documentation</a>
   */
  final var k: Int
  
  /**
   * Gets or sets the maximum number of iterations performed by the algorithm for convergence.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KMeansClustering%23maximumIterations">Online Documentation</a>
   */
  final var maximumIterations: Int
  
  /**
   * Gets or sets a metric to determine the distance between nodes and between nodes and [centroids][KMeansClustering].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KMeansClustering%23metric">Online Documentation</a>
   */
  final var metric: KMeansDistanceMetric
  
  /**
   * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KMeansClustering%23subgraphEdges">Online Documentation</a>
   */
  final var subgraphEdges: ItemCollection<IEdge>
  
  /**
   * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KMeansClustering%23subgraphNodes">Online Documentation</a>
   */
  final var subgraphNodes: ItemCollection<INode>
  
  /**
   * Partitions the graph into clusters using *k*-means clustering.
   * @param [graph] The input graph to run the algorithm on.
   * @return The resulting (non-empty) clusters
   * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KMeansClustering%23KMeansClustering-method-run">Online Documentation</a>
   */
  fun run(
    graph: IGraph,
  ): KMeansClusteringResult
  
  companion object : ClassMetadata<KMeansClustering> {
  }
}

inline fun KMeansClustering(
    block: KMeansClustering.() -> Unit
): KMeansClustering {
    return KMeansClustering()
        .apply(block)
}
