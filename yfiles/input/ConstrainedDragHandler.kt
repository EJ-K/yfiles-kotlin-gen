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
import yfiles.lang.ClassMetadata

/**
 * An implementation of the [IDragHandler] interface that can be used to constrain the movement of an existing instance.
 * @param [TWrapped] The exact type of the wrapped implementation.
 * @see [ConstrainedHandle]
 * @see [ConstrainedPositionHandler]
 * @see [constrainNewLocation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstrainedDragHandler">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [ConstrainedDragHandler] class that delegates to the `wrappedHandler`.
 * @param [wrappedHandler] The handler to wrap.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstrainedDragHandler%23ConstrainedDragHandler-constructor-ConstrainedDragHandler">Online Documentation</a>
 * 
 * @property wrappedHandler
 * Gets the wrapped handler to which calls will be ultimately delegated.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstrainedDragHandler%23wrappedHandler">Online Documentation</a>
 */
abstract external class ConstrainedDragHandler<TWrapped : IDragHandler> protected constructor(
protected final val wrappedHandler: TWrapped) : IDragHandler {
  /**
   * Gets the [wrappedHandler][ConstrainedDragHandler]'s [location][IDragHandler] property.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstrainedDragHandler%23location">Online Documentation</a>
   */
  open override val location: IPoint
  
  /**
   * Cancels the move operation and calls [onCanceled][ConstrainedDragHandler]
   * @param [context] The context to retrieve information about the drag from.
   * @param [originalLocation] The value of the coordinate of the [location][ConstrainedDragHandler] property at the time of [initializeDrag][ConstrainedDragHandler].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstrainedDragHandler%23ConstrainedDragHandler-method-cancelDrag">Online Documentation</a>
   */
  final override fun cancelDrag(
    context: IInputModeContext,
    originalLocation: Point,
  )
  
  /**
   * Applies the constraints for the new location.
   * @param [context] The context in which the drag will be performed.
   * @param [originalLocation] The value of the [location][ConstrainedDragHandler] property at the time of [initializeDrag][ConstrainedDragHandler].
   * @param [newLocation] The coordinates in the world coordinate system that the client wants the handle to be at. Depending on the implementation the [location][ConstrainedDragHandler] may or may not be modified to reflect the new value.
   * @return The constrained value of `newLocation`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstrainedDragHandler%23ConstrainedDragHandler-method-constrainNewLocation">Online Documentation</a>
   */
  protected abstract fun constrainNewLocation(
    context: IInputModeContext,
    originalLocation: Point,
    newLocation: Point,
  ): Point
  
  /**
   * Handles the finish operation and invokes [onFinished][ConstrainedDragHandler]
   * @param [context] The context to retrieve information about the drag from.
   * @param [originalLocation] The value of the [location][ConstrainedDragHandler] property at the time of [initializeDrag][ConstrainedDragHandler].
   * @param [newLocation] The coordinates in the world coordinate system that the client wants the handle to be at. Depending on the implementation the [location][ConstrainedDragHandler] may or may not be modified to reflect the new value. This is the same value as delivered in the last invocation of [handleMove][ConstrainedDragHandler]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstrainedDragHandler%23ConstrainedDragHandler-method-dragFinished">Online Documentation</a>
   */
  final override fun dragFinished(
    context: IInputModeContext,
    originalLocation: Point,
    newLocation: Point,
  )
  
  /**
   * Handles the move operation and subsequently calls [onMoved][ConstrainedDragHandler]
   * @param [context] The context in which the drag will be performed.
   * @param [originalLocation] The value of the [location][ConstrainedDragHandler] property at the time of [initializeDrag][ConstrainedDragHandler].
   * @param [newLocation] The coordinates in the world coordinate system that the client wants the handle to be at. Depending on the implementation the [location][ConstrainedDragHandler] may or may not be modified to reflect the new value.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstrainedDragHandler%23ConstrainedDragHandler-method-handleMove">Online Documentation</a>
   */
  final override fun handleMove(
    context: IInputModeContext,
    originalLocation: Point,
    newLocation: Point,
  )
  
  /**
   * Initializes the drag operation and subsequently calls [onInitialized][ConstrainedDragHandler]
   * @param [context] The context in which the drag will be performed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstrainedDragHandler%23ConstrainedDragHandler-method-initializeDrag">Online Documentation</a>
   */
  final override fun initializeDrag(
    context: IInputModeContext,
  )
  
  /**
   * Called when the [cancelDrag][ConstrainedDragHandler] method has been called.
   * @param [context] The input mode context.
   * @param [originalLocation] The original location.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstrainedDragHandler%23ConstrainedDragHandler-method-onCanceled">Online Documentation</a>
   */
  protected open fun onCanceled(
    context: IInputModeContext,
    originalLocation: Point,
  )
  
  /**
   * Called when the [dragFinished][ConstrainedDragHandler] method has been called.
   * @param [context] The input mode context.
   * @param [originalLocation] The original location.
   * @param [newLocation] The new location.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstrainedDragHandler%23ConstrainedDragHandler-method-onFinished">Online Documentation</a>
   */
  protected open fun onFinished(
    context: IInputModeContext,
    originalLocation: Point,
    newLocation: Point,
  )
  
  /**
   * Called when the [initializeDrag][ConstrainedDragHandler] method has been called.
   * @param [context] The input mode context.
   * @param [originalLocation] The original location.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstrainedDragHandler%23ConstrainedDragHandler-method-onInitialized">Online Documentation</a>
   */
  protected open fun onInitialized(
    context: IInputModeContext,
    originalLocation: Point,
  )
  
  /**
   * Called when the [handleMove][ConstrainedDragHandler] operation has been performed.
   * @param [context] The input mode context.
   * @param [originalLocation] The original location.
   * @param [newLocation] The new location.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstrainedDragHandler%23ConstrainedDragHandler-method-onMoved">Online Documentation</a>
   */
  protected open fun onMoved(
    context: IInputModeContext,
    originalLocation: Point,
    newLocation: Point,
  )
  
  companion object : ClassMetadata<ConstrainedDragHandler<*>> {
  }
}
