// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.radial

/**
 * Specifies the policies used to determine the center nodes in a [RadialLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CenterNodesPolicy">Online Documentation</a>
 */

sealed external class CenterNodesPolicy {
  /**
   * Specifies a policy where all nodes with an in-degree of zero are chosen as center nodes.
   * 
   * Value - `0`
   * @see [RadialLayout.centerNodesPolicy]
   * @see [yfiles.analysis.LayoutGraphAlgorithms.findRoot]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CenterNodesPolicy%23DIRECTED">Online Documentation</a>
   */
  object DIRECTED: CenterNodesPolicy
  
  /**
   * Specifies a policy where the node with the highest centrality is chosen as the center node.
   * 
   * Value - `1`
   * @see [RadialLayout.centerNodesPolicy]
   * @see [yfiles.analysis.LayoutGraphAlgorithms.findCenterRoot]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CenterNodesPolicy%23CENTRALITY">Online Documentation</a>
   */
  object CENTRALITY: CenterNodesPolicy
  
  /**
   * Specifies a policy where the node with the highest weighted centrality is chosen as the center node.
   * 
   * Value - `2`
   * @see [RadialLayout.centerNodesPolicy]
   * @see [yfiles.analysis.LayoutGraphAlgorithms.findWeightedCenterNode]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CenterNodesPolicy%23WEIGHTED_CENTRALITY">Online Documentation</a>
   */
  object WEIGHTED_CENTRALITY: CenterNodesPolicy
}
