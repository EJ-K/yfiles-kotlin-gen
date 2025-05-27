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
import yfiles.geometry.IRectangle
import yfiles.geometry.ISize
import yfiles.geometry.Point
import yfiles.graph.Tag
import yfiles.lang.ClassMetadata
import yfiles.view.Cursor

/**
 * A more sophisticated [IHandle] implementation that delegates to a [IReshapeHandler].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeHandlerHandle">Online Documentation</a>
 * 
 * @constructor Subclass constructor that creates a handle for the given position using the location instance as the [location][IDragHandler] for the handle.
 * @param [position] The position of the handle.
 * @param [reshapeHandler] The reshapeable to write the changes to.
 * @param [minimumSize] The minimum size allowed for the rectangle.
 * @param [maximumSize] The maximum size allowed for the rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeHandlerHandle%23ReshapeHandlerHandle-constructor-ReshapeHandlerHandle">Online Documentation</a>
 * 
 * @property position
 * Gets the position of the handle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeHandlerHandle%23position">Online Documentation</a>
 * 
 * @property reshapeHandler
 * Gets the [IReshapeHandler] instance to write the changes to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeHandlerHandle%23reshapeHandler">Online Documentation</a>
 * 
 * @property minimumSize
 * Gets or sets the minimum size allowed for the reshapeable.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeHandlerHandle%23minimumSize">Online Documentation</a>
 * 
 * @property maximumSize
 * Gets or sets the maximum size allowed for the reshapeable.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeHandlerHandle%23maximumSize">Online Documentation</a>
 */
open external class ReshapeHandlerHandle (
final val position: HandlePositions,
final val reshapeHandler: IReshapeHandler,
open var minimumSize: ISize = definedExternally,
open var maximumSize: ISize = definedExternally) : IHandle {
  /**
   * Gets or sets the event recognizer that determines if the center of the reshapeable is kept during the reshape gesture.
   * 
   * The default detects the current platform and delegates either to [META_IS_DOWN][EventRecognizers] (macOS) or [CTRL_IS_DOWN][EventRecognizers] (other platforms).
   * @see [ratioReshapeRecognizer]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeHandlerHandle%23centerReshapeRecognizer">Online Documentation</a>
   */
  final var centerReshapeRecognizer: EventRecognizer
  
  /**
   * Gets or sets the cursor to display when the mouse hovers over or drags this handle.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeHandlerHandle%23cursor">Online Documentation</a>
   */
  final override var cursor: Cursor
  
  /**
   * Gets a view of the center of the handle.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeHandlerHandle%23location">Online Documentation</a>
   */
  final override val location: IPoint
  
  /**
   * Gets or sets the maximal bounds this reshapeable may fill.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeHandlerHandle%23maximumBoundingArea">Online Documentation</a>
   */
  final var maximumBoundingArea: IRectangle
  
  /**
   * Gets or sets the minimum enclosed area that needs to be encompassed by this reshapeable.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeHandlerHandle%23minimumEnclosedArea">Online Documentation</a>
   */
  open var minimumEnclosedArea: IRectangle
  
  /**
   * Gets or sets the event recognizer that determines if the width/height ratio of the reshapeable is kept during the reshape gesture.
   * 
   * The default value is `null` and if no value is set, [handleMove][ReshapeHandlerHandle] instead tries to find the [HandleInputMode] that manages this handle and calls its [isDirectionalConstrained][HandleInputMode] method.
   * @see [centerReshapeRecognizer]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeHandlerHandle%23ratioReshapeRecognizer">Online Documentation</a>
   */
  final var ratioReshapeRecognizer: EventRecognizer?
  
  /**
   * Gets or sets the policy that determines how the mouse location is interpreted when the reshape gesture shall keep the aspect ratio.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeHandlerHandle%23reshapePolicy">Online Documentation</a>
   */
  final var reshapePolicy: ReshapePolicy
  
  /**
   * Gets or sets the optional tag object associated with the handle.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeHandlerHandle%23tag">Online Documentation</a>
   */
  final override var tag: Tag?
  
  /**
   * Gets or sets the type of the handle that can be used by the rendering engine to render types differently.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeHandlerHandle%23type">Online Documentation</a>
   */
  final override var type: HandleType
  
  /**
   * Delegates the cancel request to the [IReshapeHandler].
   * @param [context] The context to retrieve information about the drag from.
   * @param [originalLocation] The value of the coordinate of the [location][ReshapeHandlerHandle] property at the time of [initializeDrag][ReshapeHandlerHandle].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeHandlerHandle%23ReshapeHandlerHandle-method-cancelDrag">Online Documentation</a>
   */
  override fun cancelDrag(
    context: IInputModeContext,
    originalLocation: Point,
  )
  
  /**
   * Delegates the finish request to the [IReshapeHandler] using the last bounds calculated by [handleMove][ReshapeHandlerHandle].
   * @param [context] The context to retrieve information about the drag from.
   * @param [originalLocation] The value of the [location][ReshapeHandlerHandle] property at the time of [initializeDrag][ReshapeHandlerHandle].
   * @param [newLocation] The coordinates in the world coordinate system that the client wants the handle to be at. Depending on the implementation the [location][ReshapeHandlerHandle] may or may not be modified to reflect the new value. This is the same value as delivered in the last invocation of [handleMove][ReshapeHandlerHandle].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeHandlerHandle%23ReshapeHandlerHandle-method-dragFinished">Online Documentation</a>
   */
  override fun dragFinished(
    context: IInputModeContext,
    originalLocation: Point,
    newLocation: Point,
  )
  
  /**
   * Ignore clicks.
   * @param [event] Arguments describing the click.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeHandlerHandle%23ReshapeHandlerHandle-method-handleClick">Online Documentation</a>
   */
  override fun handleClick(
    event: ClickEventArgs,
  )
  
  /**
   * Translates the move request into new bounds and delegates applying the new bounds to the [handleReshape][IReshapeHandler] method.
   * @param [context] The context to retrieve information about the drag from.
   * @param [originalLocation] The value of the [location][ReshapeHandlerHandle] property at the time of [initializeDrag][ReshapeHandlerHandle].
   * @param [newLocation] The coordinates in the world coordinate system that the client wants the handle to be at. Depending on the implementation the [location][ReshapeHandlerHandle] may or may not be modified to reflect the new value.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeHandlerHandle%23ReshapeHandlerHandle-method-handleMove">Online Documentation</a>
   */
  override fun handleMove(
    context: IInputModeContext,
    originalLocation: Point,
    newLocation: Point,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeHandlerHandle%23ReshapeHandlerHandle-method-initializeDrag">Online Documentation</a>
   */
  override fun initializeDrag(
    context: IInputModeContext,
  )
  
  /**
   * Returns if the [reshapeHandler][ReshapeHandlerHandle] should keep the aspect ratio.
   * @param [context] The context to retrieve information about the drag from.
   * @return Whether the [reshapeHandler][ReshapeHandlerHandle] should keep the aspect ratio.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ReshapeHandlerHandle%23ReshapeHandlerHandle-method-keepRatio">Online Documentation</a>
   */
  protected fun keepRatio(
    context: IInputModeContext,
  ): Boolean
  
  companion object : ClassMetadata<ReshapeHandlerHandle> {
  }
}
