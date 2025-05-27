// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.analysis

import yfiles.lang.ClassMetadata

/**
 * Represents the edges that have to be added to obtain the transitive edges of a graph as computed by [TransitiveEdges].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TransitiveEdgesResult">Online Documentation</a>
 */
external class TransitiveEdgesResult private constructor()  {
  /**
   * Gets a collection of edge placeholders.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TransitiveEdgesResult%23edgesToAdd">Online Documentation</a>
   */
  final val edgesToAdd: ResultItemCollection<TransitiveEdge>
  
  companion object : ClassMetadata<TransitiveEdgesResult> {
  }
}
