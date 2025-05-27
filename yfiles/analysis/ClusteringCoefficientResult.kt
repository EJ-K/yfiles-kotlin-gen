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
 * Represents the clustering coefficients in the graph as computed by [ClusteringCoefficient].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClusteringCoefficientResult">Online Documentation</a>
 */
external class ClusteringCoefficientResult private constructor()  {
  /**
   * Gets the average clustering coefficient.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClusteringCoefficientResult%23averageCoefficient">Online Documentation</a>
   */
  final val averageCoefficient: Double
  
  /**
   * Gets a map that returns the clustering coefficient for each node.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClusteringCoefficientResult%23clusteringCoefficients">Online Documentation</a>
   */
  final val clusteringCoefficients: ResultItemMapping<INode, Double>
  
  companion object : ClassMetadata<ClusteringCoefficientResult> {
  }
}
