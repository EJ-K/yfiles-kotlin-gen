// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.analysis

import yfiles.graph.INode
import yfiles.lang.ClassMetadata

/**
 * Represents clusters in the graph as computed by [LouvainModularityClustering].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LouvainModularityClusteringResult">Online Documentation</a>
 */
external class LouvainModularityClusteringResult private constructor()  {
  /**
   * Gets a collection of all clusters in the graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LouvainModularityClusteringResult%23clusters">Online Documentation</a>
   */
  final val clusters: ResultItemCollection<Cluster>
  
  /**
   * Gets a value that estimates the quality of the partition of the nodes into the [clusters][LouvainModularityClusteringResult].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LouvainModularityClusteringResult%23modularity">Online Documentation</a>
   */
  final val modularity: Double
  
  /**
   * Gets a mapping from each node to its cluster ID.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LouvainModularityClusteringResult%23nodeClusterIds">Online Documentation</a>
   */
  final val nodeClusterIds: ResultItemMapping<INode, Int>
  
  /**
   * Gets a mapping from each node to its cluster.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LouvainModularityClusteringResult%23nodeClusters">Online Documentation</a>
   */
  final val nodeClusters: ResultItemMapping<INode, Cluster>
  
  companion object : ClassMetadata<LouvainModularityClusteringResult> {
  }
}
