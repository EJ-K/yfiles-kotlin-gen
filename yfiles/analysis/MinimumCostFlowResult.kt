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
import yfiles.lang.ClassMetadata

/**
 * Represents a minimum-cost flow through a graph as calculated by [MinimumCostFlow].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MinimumCostFlowResult">Online Documentation</a>
 */
external class MinimumCostFlowResult private constructor()  {
  /**
   * Gets a mapping from each edge to the flow over that edge.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MinimumCostFlowResult%23flow">Online Documentation</a>
   */
  final val flow: ResultItemMapping<IEdge, Double>
  
  /**
   * Gets the overall cost.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MinimumCostFlowResult%23totalCost">Online Documentation</a>
   */
  final val totalCost: Double
  
  companion object : ClassMetadata<MinimumCostFlowResult> {
  }
}
