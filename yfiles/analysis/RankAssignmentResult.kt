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
 * Represents a ranking for nodes in a graph as computed by [RankAssignment].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RankAssignmentResult">Online Documentation</a>
 */
external class RankAssignmentResult private constructor()  {
  /**
   * Gets a mapping from each node to its rank index.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RankAssignmentResult%23nodeRankIds">Online Documentation</a>
   */
  final val nodeRankIds: ResultItemMapping<INode, Int>
  
  /**
   * Gets a mapping from each node to a collection of all nodes of this rank.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RankAssignmentResult%23nodeRanks">Online Documentation</a>
   */
  final val nodeRanks: ResultItemMapping<INode, RankAssignmentRank>
  
  /**
   * Gets a mapping from a rank index to a collection of nodes at that rank.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RankAssignmentResult%23ranks">Online Documentation</a>
   */
  final val ranks: ResultItemMapping<Number, RankAssignmentRank>
  
  companion object : ClassMetadata<RankAssignmentResult> {
  }
}
