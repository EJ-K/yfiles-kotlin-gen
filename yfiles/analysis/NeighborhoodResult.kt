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
 * The direct or indirect neighbors of a given set of [startNodes][Neighborhood].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NeighborhoodResult">Online Documentation</a>
 */
external class NeighborhoodResult private constructor()  {
  /**
   * The direct or indirect neighbors of the [startNodes][Neighborhood].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NeighborhoodResult%23neighbors">Online Documentation</a>
   */
  final val neighbors: ResultItemCollection<INode>
  
  companion object : ClassMetadata<NeighborhoodResult> {
  }
}
