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
 * Represents the maximum flow through edges of a graph as computed by [maximumFlow][MaximumFlowResult].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MaximumFlowResult">Online Documentation</a>
 */
external class MaximumFlowResult private constructor()  {
  /**
   * Gets a mapping from each edge to its flow.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MaximumFlowResult%23flow">Online Documentation</a>
   */
  final val flow: ResultItemMapping<IEdge, Double>
  
  /**
   * Gets the overall maximum flow.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MaximumFlowResult%23maximumFlow">Online Documentation</a>
   */
  final val maximumFlow: Int
  
  /**
   * Gets a collection of edges in the minimum cut.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MaximumFlowResult%23minimumCut">Online Documentation</a>
   */
  final val minimumCut: ResultItemCollection<IEdge>
  
  /**
   * Gets a collection of the nodes which are at the sink side of the [minimumCut][MaximumFlowResult].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MaximumFlowResult%23sinkPartition">Online Documentation</a>
   */
  final val sinkPartition: ResultItemCollection<INode>
  
  /**
   * Gets a collection of the nodes which are on the source side of the [minimumCut][MaximumFlowResult].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MaximumFlowResult%23sourcePartition">Online Documentation</a>
   */
  final val sourcePartition: ResultItemCollection<INode>
  
  companion object : ClassMetadata<MaximumFlowResult> {
  }
}
