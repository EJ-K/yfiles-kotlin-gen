// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.analysis

import yfiles.graph.IEdge
import yfiles.graph.INode
import yfiles.lang.ClassMetadata

/**
 * Represents the node and edge centrality values as computed by [BetweennessCentrality].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BetweennessCentralityResult">Online Documentation</a>
 */
external class BetweennessCentralityResult private constructor()  {
  /**
   * Gets a mapping from each edge to its absolute centrality value.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BetweennessCentralityResult%23edgeCentrality">Online Documentation</a>
   */
  final val edgeCentrality: ResultItemMapping<IEdge, Double>
  
  /**
   * Gets the maximum absolute edge centrality value.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BetweennessCentralityResult%23maximumEdgeCentrality">Online Documentation</a>
   */
  final val maximumEdgeCentrality: Double
  
  /**
   * Gets the maximum absolute node centrality value.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BetweennessCentralityResult%23maximumNodeCentrality">Online Documentation</a>
   */
  final val maximumNodeCentrality: Double
  
  /**
   * Gets the minimum absolute edge centrality value.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BetweennessCentralityResult%23minimumEdgeCentrality">Online Documentation</a>
   */
  final val minimumEdgeCentrality: Double
  
  /**
   * Gets the minimum absolute node centrality value.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BetweennessCentralityResult%23minimumNodeCentrality">Online Documentation</a>
   */
  final val minimumNodeCentrality: Double
  
  /**
   * Gets a mapping from each node to its absolute centrality value.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BetweennessCentralityResult%23nodeCentrality">Online Documentation</a>
   */
  final val nodeCentrality: ResultItemMapping<INode, Double>
  
  /**
   * Gets a mapping from each edge to its normalized centrality value.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BetweennessCentralityResult%23normalizedEdgeCentrality">Online Documentation</a>
   */
  final val normalizedEdgeCentrality: ResultItemMapping<IEdge, Double>
  
  /**
   * Gets a mapping from each node to its normalized centrality value.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BetweennessCentralityResult%23normalizedNodeCentrality">Online Documentation</a>
   */
  final val normalizedNodeCentrality: ResultItemMapping<INode, Double>
  
  companion object : ClassMetadata<BetweennessCentralityResult> {
  }
}
