// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.graph.INode
import yfiles.lang.InterfaceMetadata

/**
 * Interface for an implementation which evaluates a list of given [SnapLine]s for a node which is resized and adds a set of [SnapResult]s for sizes to which this node can potentially snap.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeReshapeSnapResultProvider">Online Documentation</a>
 */
external interface INodeReshapeSnapResultProvider  {
  /**
   * Called when a node's handle is [dragged][IDragHandler] to add [SnapResult]s for [OrthogonalSnapLine]s or sizes to which this node can potentially snap during resizing.
   * @param [context] The snap context which manages the snap lines and the settings.
   * @param [event] The event argument to obtain the context from and add the results to.
   * @param [node] The node that is being reshaped.
   * @param [reshapeContext] Carries information about the reshape operation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeReshapeSnapResultProvider%23INodeReshapeSnapResultProvider-method-collectSnapResults">Online Documentation</a>
   */
  fun collectSnapResults(
    context: GraphSnapContext,
    event: CollectSnapResultsEventArgs,
    node: INode,
    reshapeContext: ReshapeRectangleContext,
  )

  
  companion object : InterfaceMetadata<INodeReshapeSnapResultProvider> {
  
    /**
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeReshapeSnapResultProvider%23INodeReshapeSnapResultProvider-method-create">Online Documentation</a>
     */
    @JsName("create")
    operator fun  invoke(
      collectSnapResults: (context: GraphSnapContext, event: CollectSnapResultsEventArgs, node: INode, reshapeContext: ReshapeRectangleContext) -> Unit
    ): INodeReshapeSnapResultProvider
  }
}
