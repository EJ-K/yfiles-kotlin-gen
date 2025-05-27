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
 * Represents a group of nodes with the same [rank][RankAssignmentRank].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RankAssignmentRank">Online Documentation</a>
 */
external class RankAssignmentRank private constructor()  {
  /**
   * Gets the rank or layer index.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RankAssignmentRank%23index">Online Documentation</a>
   */
  final val index: Int
  
  /**
   * Gets a collection of all nodes with the same rank.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RankAssignmentRank%23nodes">Online Documentation</a>
   */
  final val nodes: ResultItemCollection<INode>
  
  companion object : ClassMetadata<RankAssignmentRank> {
  }
}
