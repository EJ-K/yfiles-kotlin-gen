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
 * Represents the node centrality values as computed by [WeightCentrality].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WeightCentralityResult">Online Documentation</a>
 */
external class WeightCentralityResult private constructor()  {
  /**
   * Gets the maximum absolute node centrality value.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WeightCentralityResult%23maximumNodeCentrality">Online Documentation</a>
   */
  final val maximumNodeCentrality: Double
  
  /**
   * Gets the minimum absolute node centrality value.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WeightCentralityResult%23minimumNodeCentrality">Online Documentation</a>
   */
  final val minimumNodeCentrality: Double
  
  /**
   * Gets a mapping from each node to its absolute centrality value.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WeightCentralityResult%23nodeCentrality">Online Documentation</a>
   */
  final val nodeCentrality: ResultItemMapping<INode, Double>
  
  /**
   * Gets a mapping from each node to its normalized centrality value.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WeightCentralityResult%23normalizedNodeCentrality">Online Documentation</a>
   */
  final val normalizedNodeCentrality: ResultItemMapping<INode, Double>
  
  companion object : ClassMetadata<WeightCentralityResult> {
  }
}
