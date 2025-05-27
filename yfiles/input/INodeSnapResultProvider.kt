// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.Rect
import yfiles.graph.INode
import yfiles.lang.InterfaceMetadata

/**
 * Interface that is used by the [GraphSnapContext] for [nodes][INode] to collect a number of [SnapResult]s during the move/edit operation.
 * @see [GraphSnapContext]
 * @see [NodeDecorator.snapResultProvider][yfiles.graph.NodeDecorator.snapResultProvider]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeSnapResultProvider">Online Documentation</a>
 */
external interface INodeSnapResultProvider  {
  /**
   * Called when a node is [dragged][IDragHandler] to add [SnapResult]s for [OrthogonalSnapLine]s to which this node can potentially snap.
   * @param [context] The snap context which manages the snap lines and the settings.
   * @param [event] The event argument to obtain the necessary information from and [add results to][CollectSnapResultsEventArgs].
   * @param [suggestedLayout] The [layout][INode] of the node if the node would not snap.
   * @param [node] The node that is being moved.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeSnapResultProvider%23INodeSnapResultProvider-method-collectSnapResults">Online Documentation</a>
   */
  fun collectSnapResults(
    context: GraphSnapContext,
    event: CollectSnapResultsEventArgs,
    suggestedLayout: Rect,
    node: INode,
  )

  
  companion object : InterfaceMetadata<INodeSnapResultProvider> {
  
    /**
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeSnapResultProvider%23INodeSnapResultProvider-method-create">Online Documentation</a>
     */
    @JsName("create")
    operator fun  invoke(
      collectSnapResults: (context: GraphSnapContext, event: CollectSnapResultsEventArgs, suggestedLayout: Rect, node: INode) -> Unit
    ): INodeSnapResultProvider
  }
}
