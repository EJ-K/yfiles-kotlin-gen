// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.IPoint
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.graph.IStripe
import yfiles.graph.StripeEventArgs
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.view.IRenderTreeElement

/**
 * Customized [IPositionHandler] implementation that moves a stripe in the table hierarchy when the stripe is dragged.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReparentStripePositionHandler">Online Documentation</a>
 * 
 * @constructor Creates a new instance of this position handler which moves `movedStripe`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReparentStripePositionHandler%23ReparentStripePositionHandler-constructor-ReparentStripePositionHandler">Online Documentation</a>
 */
open external class ReparentStripePositionHandler (
  movedStripe: IStripe,
) : IPositionHandler, IEventDispatcher {
  /**
   * Gets the current [IInputModeContext]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReparentStripePositionHandler%23inputModeContext">Online Documentation</a>
   */
  protected final val inputModeContext: IInputModeContext?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReparentStripePositionHandler%23location">Online Documentation</a>
   */
  final override val location: IPoint
  
  /**
   * Gets the moved stripe.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReparentStripePositionHandler%23movedStripe">Online Documentation</a>
   */
  final val movedStripe: IStripe?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReparentStripePositionHandler%23ReparentStripePositionHandler-method-cancelDrag">Online Documentation</a>
   */
  final override fun cancelDrag(
    context: IInputModeContext,
    originalLocation: Point,
  )
  
  /**
   * Create a ghost object for the source region of the reparent gesture.
   * 
   * The default implementation uses the return value of [getVisualCreator][yfiles.view.IObjectRenderer] with type [DRAG_SOURCE][StripeVisualizationType].
   * @param [context] The current input mode context
   * @return A render tree element that is used to visualize the target region.
   * @see [updateSourceGhost]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReparentStripePositionHandler%23ReparentStripePositionHandler-method-createSourceGhost">Online Documentation</a>
   */
  protected open fun createSourceGhost(
    context: IInputModeContext,
  ): IRenderTreeElement?
  
  /**
   * Create a ghost visualization for the target region of the reparent gesture.
   * 
   * The default implementation uses the return value of [getVisualCreator][yfiles.view.IObjectRenderer] with type [DROP_TARGET][StripeVisualizationType].
   * @param [context] The current input mode context
   * @param [stripe] The stripe for which the visualization should be created.
   * @return A render tree element that is used to visualize the target region.
   * @see [updateTargetGhost]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReparentStripePositionHandler%23ReparentStripePositionHandler-method-createTargetGhost">Online Documentation</a>
   */
  protected open fun createTargetGhost(
    context: IInputModeContext,
    stripe: IStripe?,
  ): IRenderTreeElement?
  
  /**
   * Determine the reparent gesture that would result from the given parameters.
   * @param [context] The current input mode context
   * @param [location] The current drag location
   * @param [sourceStripe] The stripe that is moved
   * @param [targetSubregion] The stripe subregion for the target.
   * @param [targetBounds] The target bounds
   * @return A [StripeReparentPolicy] that specifies the operation to perform.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReparentStripePositionHandler%23ReparentStripePositionHandler-method-determineGesture">Online Documentation</a>
   */
  protected open fun determineGesture(
    context: IInputModeContext,
    location: IPoint,
    sourceStripe: IStripe,
    targetSubregion: StripeSubregion?,
    targetBounds: Rect,
  ): StripeReparentPolicy
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReparentStripePositionHandler%23ReparentStripePositionHandler-method-dragFinished">Online Documentation</a>
   */
  final override fun dragFinished(
    context: IInputModeContext,
    originalLocation: Point,
    newLocation: Point,
  )
  
  /**
   * Finds the target stripe subregion at `location` and its associated owner node.
   * @param [location] The hit location.
   * @return A [StripeSubregion] that lies at `location`, or null if no such region could be found.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReparentStripePositionHandler%23ReparentStripePositionHandler-method-getTargetSubregion">Online Documentation</a>
   */
  protected open fun getTargetSubregion(
    location: Point,
  ): StripeSubregion?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReparentStripePositionHandler%23ReparentStripePositionHandler-method-handleMove">Online Documentation</a>
   */
  final override fun handleMove(
    context: IInputModeContext,
    originalLocation: Point,
    newLocation: Point,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReparentStripePositionHandler%23ReparentStripePositionHandler-method-initializeDrag">Online Documentation</a>
   */
  final override fun initializeDrag(
    context: IInputModeContext,
  )
  
  /**
   * Called whenever a change in the oldTable hierarchy occurs through this position handler.
   * @param [event] The [StripeEventArgs].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReparentStripePositionHandler%23ReparentStripePositionHandler-method-onStripeChanged">Online Documentation</a>
   */
  protected open fun onStripeChanged(
    event: StripeEventArgs,
  )
  
  /**
   * Called by clients to set the position to the given coordinates.
   * @param [location] The new location.
   * @see [IDragHandler.location]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReparentStripePositionHandler%23ReparentStripePositionHandler-method-setPosition">Online Documentation</a>
   */
  fun setPosition(
    location: Point,
  )
  
  /**
   * Updates the source ghost visualization after a drag.
   * 
   * The default does not change `sourceGhost`.
   * @param [context] The current input mode context.
   * @param [sourceGhost] The render tree element that represents the source ghost.
   * @param [movedStripe] The [IStripe] which is moved by this reparent gesture.
   * @param [reparentPosition] Where to place the stripe after reparenting.
   * @return An updated render tree element for the source ghost.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReparentStripePositionHandler%23ReparentStripePositionHandler-method-updateSourceGhost">Online Documentation</a>
   */
  protected open fun updateSourceGhost(
    context: IInputModeContext,
    sourceGhost: IRenderTreeElement?,
    movedStripe: IStripe?,
    reparentPosition: StripeReparentPolicy,
  ): IRenderTreeElement?
  
  /**
   * Modifies the target ghost visualization after a drag.
   * 
   * The default implementation only hides `targetGhost` iff `reparentPosition` is [INVALID][StripeReparentPolicy].
   * @param [context] The current input mode context.
   * @param [targetGhost] The render tree element for the target visualization.
   * @param [targetStripe] The target for the reparent gesture.
   * @param [reparentPosition] The mode that describes the results of the reparent gesture.
   * @param [targetBounds] The current visualization bounds that have been computed with [updateTargetGhostBounds][ReparentStripePositionHandler].
   * @return An updated render tree element for the target ghost.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReparentStripePositionHandler%23ReparentStripePositionHandler-method-updateTargetGhost">Online Documentation</a>
   */
  protected open fun updateTargetGhost(
    context: IInputModeContext,
    targetGhost: IRenderTreeElement?,
    targetStripe: IStripe?,
    reparentPosition: StripeReparentPolicy,
    targetBounds: Rect,
  ): IRenderTreeElement?
  
  /**
   * Updates the visualization bounds for the target visualization depending on the provided values.
   * @param [originalTargetBounds] The target bounds prior to this method call.
   * @param [reparentPosition] Where to place the stripe after the reparenting operations according to the reparent gesture.
   * @param [targetStripe] The target stripe which has been determined by the input mode.
   * @return Updated bounds for the target visualization.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReparentStripePositionHandler%23ReparentStripePositionHandler-method-updateTargetGhostBounds">Online Documentation</a>
   */
  protected open fun updateTargetGhostBounds(
    originalTargetBounds: Rect,
    reparentPosition: StripeReparentPolicy,
    targetStripe: IStripe,
  ): Rect
  
  companion object : ClassMetadata<ReparentStripePositionHandler> {
  }
}

/**
 * `stripe-changed`: Occurs when a stripe state is changed by this input mode.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReparentStripePositionHandler%23stripe-changed">Online Documentation</a>
 */
inline fun  ReparentStripePositionHandler.addStripeChangedHandler(
  crossinline handler: (event:StripeEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<StripeEventArgs> = { event, _ -> handler(event) }
  addEventListener("stripe-changed", listener)
  return { removeEventListener("stripe-changed", listener) }
}
