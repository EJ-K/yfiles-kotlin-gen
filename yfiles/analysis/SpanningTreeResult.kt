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
 * Represents the edges of a minimum spanning tree as calculated by [SpanningTree].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SpanningTreeResult">Online Documentation</a>
 */
external class SpanningTreeResult private constructor()  {
  /**
   * Gets a collection of edges that form the spanning tree or forest.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SpanningTreeResult%23edges">Online Documentation</a>
   */
  final val edges: ResultItemCollection<IEdge>
  
  /**
   * Gets the total cost for the calculated minimum spanning tree or forest.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SpanningTreeResult%23totalCost">Online Documentation</a>
   */
  final val totalCost: Double
  
  companion object : ClassMetadata<SpanningTreeResult> {
  }
}
