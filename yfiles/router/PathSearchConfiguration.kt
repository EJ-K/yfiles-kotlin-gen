// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.lang.ClassMetadata
import yfiles.lang.TimeSpan
import yfiles.layout.LayoutGraph
import yfiles.layout.LayoutGraphGrouping

/**
 * This class contains the basic configuration used by path search algorithms.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchConfiguration">Online Documentation</a>
 */
external class PathSearchConfiguration private constructor()  {
  /**
   * Gets the edge routing algorithm using this configuration.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchConfiguration%23edgeRouter">Online Documentation</a>
   */
  final val edgeRouter: EdgeRouter
  
  /**
   * Gets the graph containing the edges whose path is searched.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchConfiguration%23graph">Online Documentation</a>
   */
  final val graph: LayoutGraph
  
  /**
   * Gets the grouping information of the graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchConfiguration%23grouping">Online Documentation</a>
   */
  final val grouping: LayoutGraphGrouping
  
  /**
   * Gets the [IRouterPartition] that is currently in use.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchConfiguration%23partition">Online Documentation</a>
   */
  final val partition: IRouterPartition
  
  /**
   * Gets the remaining time within which the algorithm should complete its calculation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchConfiguration%23remainingTime">Online Documentation</a>
   */
  final val remainingTime: TimeSpan
  
  companion object : ClassMetadata<PathSearchConfiguration> {
  }
}
