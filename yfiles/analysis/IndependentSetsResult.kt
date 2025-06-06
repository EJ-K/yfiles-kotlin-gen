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
 * Represents a partitioning of a graph into independent sets of nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IndependentSetsResult">Online Documentation</a>
 */
external class IndependentSetsResult private constructor()  {
  /**
   * Gets a collection of all independent sets in the result.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IndependentSetsResult%23independentSets">Online Documentation</a>
   */
  final val independentSets: ResultItemCollection<IndependentSet>
  
  /**
   * Gets a mapping for each node to its set ID.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IndependentSetsResult%23nodeSetIds">Online Documentation</a>
   */
  final val nodeSetIds: ResultItemMapping<INode, Int>
  
  /**
   * Gets a mapping for each node to its [IndependentSet].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IndependentSetsResult%23nodeSets">Online Documentation</a>
   */
  final val nodeSets: ResultItemMapping<INode, IndependentSet>
  
  companion object : ClassMetadata<IndependentSetsResult> {
  }
}
