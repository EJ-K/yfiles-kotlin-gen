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
import yfiles.lang.ClassMetadata

/**
 * The default implementation of the [INodeReshapeSnapResultProvider] interface.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeSnapResultProvider">Online Documentation</a>
 */
open external class NodeReshapeSnapResultProvider protected constructor() : INodeReshapeSnapResultProvider {
  /**
   * Collects the snap results for the grid.
   * @param [context] The context in which the snapping is performed.
   * @param [event] The [CollectSnapResultsEventArgs] instance containing the event data.
   * @param [snapGrid] The snap reference containing data about the grid.
   * @param [node] The node that is being reshaped.
   * @param [reshapeContext] The reshape context that describes how the node's layout is reshaped.
   * @param [suggestedLayout] The suggested layout of the node.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeSnapResultProvider%23NodeReshapeSnapResultProvider-method-collectGridSnapResults">Online Documentation</a>
   */
  protected open fun collectGridSnapResults(
    context: GraphSnapContext,
    event: CollectSnapResultsEventArgs,
    snapGrid: SnapGrid,
    node: INode,
    reshapeContext: ReshapeRectangleContext,
    suggestedLayout: Rect,
  )
  
  /**
   * Collects the snap results that make the node's bounds snap to the `snapLine`.
   * @param [context] The context in which the snapping is performed.
   * @param [event] The [CollectSnapResultsEventArgs] instance containing the event data.
   * @param [snapLine] The snap line to snap to.
   * @param [node] The node that is being reshaped.
   * @param [reshapeContext] The reshape context that contains information about the nature of the resize.
   * @param [suggestedLayout] The layout of the node as it would be if the mouse location would not be snapped.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeSnapResultProvider%23NodeReshapeSnapResultProvider-method-collectOrthogonalLineSnapResults">Online Documentation</a>
   */
  protected open fun collectOrthogonalLineSnapResults(
    context: GraphSnapContext,
    event: CollectSnapResultsEventArgs,
    snapLine: OrthogonalSnapLine,
    node: INode,
    reshapeContext: ReshapeRectangleContext,
    suggestedLayout: Rect,
  )
  
  /**
   * Collects the snap results that make the node the same size as other elements.
   * @param [context] The context in which the snapping is performed.
   * @param [event] The [CollectSnapResultsEventArgs] instance containing the event data.
   * @param [snapSize] The snap reference containing data about nodes with same sizes.
   * @param [node] The node that is being reshaped.
   * @param [reshapeContext] The reshape context that contains information about the nature of the resize.
   * @param [suggestedLayout] The layout of the node as it would be if the mouse location would not be snapped.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeSnapResultProvider%23NodeReshapeSnapResultProvider-method-collectSameSizeSnapResults">Online Documentation</a>
   */
  protected open fun collectSameSizeSnapResults(
    context: GraphSnapContext,
    event: CollectSnapResultsEventArgs,
    snapSize: SnapSize,
    node: INode,
    reshapeContext: ReshapeRectangleContext,
    suggestedLayout: Rect,
  )
  
  /**
   * Called when a node is [dragged][IDragHandler] to add [SnapResult]s for [SnapReference]s to which this node can potentially snap during resizing.
   * @param [context] The snap context which manages the snap references and the settings.
   * @param [event] The event argument to obtain the context from and add the results to.
   * @param [node] The node that is being reshaped.
   * @param [reshapeContext] Carries information about the reshape process.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeSnapResultProvider%23NodeReshapeSnapResultProvider-method-collectSnapResults">Online Documentation</a>
   */
  override fun collectSnapResults(
    context: GraphSnapContext,
    event: CollectSnapResultsEventArgs,
    node: INode,
    reshapeContext: ReshapeRectangleContext,
  )
  
  companion object : ClassMetadata<NodeReshapeSnapResultProvider> {
    /**
     * A shared singleton instance of this type.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeReshapeSnapResultProvider%23INSTANCE">Online Documentation</a>
     */
     val INSTANCE: INodeReshapeSnapResultProvider
  }
}
