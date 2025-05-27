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
import yfiles.graph.IPort
import yfiles.lang.InterfaceMetadata

/**
 * Interface that is used by the [GraphSnapContext] for [port][IPort] to collect a number of [SnapResult]s during the move/edit operation.
 * @see [GraphSnapContext]
 * @see [PortDecorator.snapResultProvider][yfiles.graph.PortDecorator.snapResultProvider]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortSnapResultProvider">Online Documentation</a>
 */
external interface IPortSnapResultProvider  {
  /**
   * Called when a node is [dragged][IDragHandler] to add [SnapResult]s for [OrthogonalSnapLine]s to which this bend can potentially snap.
   * @param [context] The snap context which manages the snap lines and the settings.
   * @param [event] The event argument to obtain the necessary information from and [add results to][CollectSnapResultsEventArgs].
   * @param [suggestedLocation] The [location][yfiles.graph.IBend] of the bend if the bend would not snap.
   * @param [port] The port that is being moved
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortSnapResultProvider%23IPortSnapResultProvider-method-collectSnapResults">Online Documentation</a>
   */
  fun collectSnapResults(
    context: GraphSnapContext,
    event: CollectSnapResultsEventArgs,
    suggestedLocation: Point,
    port: IPort,
  )

  
  companion object : InterfaceMetadata<IPortSnapResultProvider> {
  
    /**
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortSnapResultProvider%23IPortSnapResultProvider-method-create">Online Documentation</a>
     */
    @JsName("create")
    operator fun  invoke(
      collectSnapResults: (context: GraphSnapContext, event: CollectSnapResultsEventArgs, suggestedLocation: Point, port: IPort) -> Unit
    ): IPortSnapResultProvider
  }
}
