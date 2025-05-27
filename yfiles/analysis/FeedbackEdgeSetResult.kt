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
 * Represents edges that can be removed or reversed in a graph to make it acyclic as computed by [feedbackEdgeSet][FeedbackEdgeSetResult].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FeedbackEdgeSetResult">Online Documentation</a>
 */
external class FeedbackEdgeSetResult private constructor()  {
  /**
   * Gets a collection of edges whose removal or reversal would make the graph acyclic.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FeedbackEdgeSetResult%23feedbackEdgeSet">Online Documentation</a>
   */
  final val feedbackEdgeSet: ResultItemCollection<IEdge>
  
  companion object : ClassMetadata<FeedbackEdgeSetResult> {
  }
}
