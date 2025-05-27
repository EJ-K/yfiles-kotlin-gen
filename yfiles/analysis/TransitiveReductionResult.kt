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
 * Represents the transitive edges of a graph as computed by [TransitiveReduction].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TransitiveReductionResult">Online Documentation</a>
 */
external class TransitiveReductionResult private constructor()  {
  /**
   * Gets a collection of the transitive edges in the graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TransitiveReductionResult%23edgesToRemove">Online Documentation</a>
   */
  final val edgesToRemove: ResultItemCollection<IEdge>
  
  companion object : ClassMetadata<TransitiveReductionResult> {
  }
}
