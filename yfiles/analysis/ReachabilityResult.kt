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
 * Represents the nodes that are reachable from a given set of other nodes as computed by [Reachability].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReachabilityResult">Online Documentation</a>
 */
external class ReachabilityResult private constructor()  {
  /**
   * Gets a collection of nodes that are reachable from the [startNodes][Reachability].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReachabilityResult%23reachableNodes">Online Documentation</a>
   */
  final val reachableNodes: ResultItemCollection<INode>
  
  /**
   * Determines whether a given node is reachable.
   * @param [node] The node to check for reachability.
   * @return `true` if the given node is reachable, `false` otherwise.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReachabilityResult%23ReachabilityResult-method-isReachable">Online Documentation</a>
   */
  fun isReachable(
    node: INode,
  ): Boolean
  
  companion object : ClassMetadata<ReachabilityResult> {
  }
}
