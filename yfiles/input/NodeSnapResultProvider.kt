// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.graph.INode
import yfiles.lang.ClassMetadata

/**
 * The default implementation of the [INodeSnapResultProvider] interface.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSnapResultProvider">Online Documentation</a>
 */
open external class NodeSnapResultProvider protected constructor() : INodeSnapResultProvider {
  /**
   * Calculates a [SnapResult] and [adds it][CollectSnapResultsEventArgs] to the argument.
   * @param [context] The context in which the snapping is performed.
   * @param [event] The arguments to add the results to.
   * @param [snapCircle] The snap reference containing data about the circle.
   * @param [suggestedLayout] The layout of the node if it would move without snapping.
   * @param [node] The node that is currently being processed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSnapResultProvider%23NodeSnapResultProvider-method-collectCircleSnapResults">Online Documentation</a>
   */
  protected open fun collectCircleSnapResults(
    context: GraphSnapContext,
    event: CollectSnapResultsEventArgs,
    snapCircle: SnapCircle,
    suggestedLayout: Rect,
    node: INode,
  )
  
  /**
   * Calculates a [SnapResult] and [adds it][CollectSnapResultsEventArgs] to the argument.
   * @param [context] The context in which the snapping is performed.
   * @param [event] The arguments to add the results to.
   * @param [snapGrid] The snap reference containing data about the grid.
   * @param [location] A location in the layout of the suggested layout of the node that will be snapped to a grid point location.
   * @param [node] The node that is currently being processed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSnapResultProvider%23NodeSnapResultProvider-method-collectGridSnapResult">Online Documentation</a>
   */
  protected open fun collectGridSnapResult(
    context: GraphSnapContext,
    event: CollectSnapResultsEventArgs,
    snapGrid: SnapGrid,
    location: Point,
    node: INode,
  )
  
  /**
   * Collects snap results that snap the node to a grid and [adds them][CollectSnapResultsEventArgs] to the argument.
   * @param [context] The context in which the snapping is performed.
   * @param [event] The arguments to add the results to.
   * @param [snapGrid] The snap reference containing data about the grid.
   * @param [suggestedLayout] The layout of the node if it would move without snapping.
   * @param [node] The node that is currently being processed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSnapResultProvider%23NodeSnapResultProvider-method-collectGridSnapResults">Online Documentation</a>
   */
  protected open fun collectGridSnapResults(
    context: GraphSnapContext,
    event: CollectSnapResultsEventArgs,
    snapGrid: SnapGrid,
    suggestedLayout: Rect,
    node: INode,
  )
  
  /**
   * Collect snap results that snap the node center to the given snap line.
   * @param [context] The context in which the snapping is performed.
   * @param [event] The arguments to add the results to.
   * @param [snapLine] The snap line to test snapping for.
   * @param [suggestedLayout] The layout of the node if it would move without snapping.
   * @param [node] The node that is currently being processed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSnapResultProvider%23NodeSnapResultProvider-method-collectLineSnapResults">Online Documentation</a>
   */
  protected open fun collectLineSnapResults(
    context: GraphSnapContext,
    event: CollectSnapResultsEventArgs,
    snapLine: SnapLine,
    suggestedLayout: Rect,
    node: INode,
  )
  
  /**
   * Verifies whether the node will snap to the given snap line.
   * @param [context] The context in which the snapping is performed.
   * @param [event] The arguments to add the results to.
   * @param [snapLine] The snap line to test snapping for.
   * @param [suggestedLayout] The layout of the node if it would move without snapping.
   * @param [node] The node that is currently being processed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSnapResultProvider%23NodeSnapResultProvider-method-collectOrthogonalLineSnapResults">Online Documentation</a>
   */
  protected open fun collectOrthogonalLineSnapResults(
    context: GraphSnapContext,
    event: CollectSnapResultsEventArgs,
    snapLine: OrthogonalSnapLine,
    suggestedLayout: Rect,
    node: INode,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSnapResultProvider%23NodeSnapResultProvider-method-collectSnapResults">Online Documentation</a>
   */
  override fun collectSnapResults(
    context: GraphSnapContext,
    event: CollectSnapResultsEventArgs,
    suggestedLayout: Rect,
    node: INode,
  )
  
  companion object : ClassMetadata<NodeSnapResultProvider> {
    /**
     * Yields the static shared instance of this class.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeSnapResultProvider%23INSTANCE">Online Documentation</a>
     */
     val INSTANCE: INodeSnapResultProvider
  }
}
