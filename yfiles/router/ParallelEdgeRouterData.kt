// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.collections.ICollection
import yfiles.collections.ItemCollection
import yfiles.lang.ClassMetadata
import yfiles.layout.LayoutData

/**
 * Specifies custom data for the [ParallelEdgeRouter].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouterData">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouterData%23ParallelEdgeRouterData-constructor-ParallelEdgeRouterData">Online Documentation</a>
 */
external class ParallelEdgeRouterData<TNode, TEdge, TNodeLabel, TEdgeLabel> () : LayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> {
  /**
   * Gets or sets the collection of edges affected by this router.
   * @see [ParallelEdgeRouter.AFFECTED_EDGES_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouterData%23affectedEdges">Online Documentation</a>
   */
  final var affectedEdges: ItemCollection<TEdge>
  
  /**
   * Gets or sets the collection of leading edges.
   * @see [ParallelEdgeRouter.LEADING_EDGE_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouterData%23leadingEdges">Online Documentation</a>
   */
  final var leadingEdges: ItemCollection<TEdge>
  
  /**
   * Gets the edge collection that, after the layout run, will contain all multi-edges that were routed and not treated as leading edges.
   * @see [ParallelEdgeRouter.ROUTED_MULTI_EDGES_RESULT_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouterData%23routedMultiEdgesResult">Online Documentation</a>
   */
  final val routedMultiEdgesResult: ICollection<out TEdge>
  
  companion object : ClassMetadata<ParallelEdgeRouterData<*, *, *, *>> {
  }
}
