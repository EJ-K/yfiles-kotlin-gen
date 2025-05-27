// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.IMutablePoint
import yfiles.geometry.IMutableRectangle
import yfiles.geometry.IPoint
import yfiles.geometry.IRectangle
import yfiles.geometry.ISize
import yfiles.geometry.Point
import yfiles.graph.Tag
import yfiles.lang.ClassMetadata
import yfiles.view.Cursor

/**
 * A more sophisticated [IHandle] implementation that modifies a rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleHandle">Online Documentation</a>
 * 
 * @constructor Creates a handle for the given `rectangle` at the given `position`.
 * @param [position] The position of the handle.
 * @param [rectangle] The rectangle to change.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleHandle%23RectangleHandle-constructor-RectangleHandle">Online Documentation</a>
 * 
 * @property position
 * Gets the position of the handle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleHandle%23position">Online Documentation</a>
 * 
 * @property rectangle
 * Gets the rectangle instance to modify.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleHandle%23rectangle">Online Documentation</a>
 */
open external class RectangleHandle (
protected final val position: HandlePositions,
protected final val rectangle: IMutableRectangle) : IMutablePoint, IHandle {
  /**
   * Gets or sets the cursor to display when the mouse hovers over or drags this handle.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleHandle%23cursor">Online Documentation</a>
   */
  final override var cursor: Cursor
  
  /**
   * Gets a view of the center of the handle.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleHandle%23location">Online Documentation</a>
   */
  final override val location: IPoint
  
  /**
   * Gets or sets the largest allowed size for the [rectangle][RectangleHandle].
   * 
   * The default is [INFINITE][yfiles.geometry.Rect], which does not restrict the area at all.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleHandle%23maximumBoundingArea">Online Documentation</a>
   */
  final var maximumBoundingArea: IRectangle
  
  /**
   * Gets or sets the maximum size allowed for the [rectangle][RectangleHandle].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleHandle%23maximumSize">Online Documentation</a>
   */
  final var maximumSize: ISize
  
  /**
   * Gets or sets the minimum enclosed area that needs to be encompassed by the [rectangle][RectangleHandle].
   * 
   * The default is [EMPTY][yfiles.geometry.Rect], which does not restrict the area at all.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleHandle%23minimumEnclosedArea">Online Documentation</a>
   */
  final var minimumEnclosedArea: IRectangle
  
  /**
   * Gets or sets the minimum size allowed for the [rectangle][RectangleHandle].
   * 
   * The default is [ZERO][yfiles.geometry.Size].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleHandle%23minimumSize">Online Documentation</a>
   */
  final var minimumSize: ISize
  
  /**
   * Gets or sets the optional tag object associated with the handle.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleHandle%23tag">Online Documentation</a>
   */
  final override var tag: Tag?
  
  /**
   * Gets or sets the type of the handle that can be used by the rendering engine to render types differently.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleHandle%23type">Online Documentation</a>
   */
  final override var type: HandleType
  
  /**
   * Gets or sets the x coordinate.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleHandle%23x">Online Documentation</a>
   */
  final override var x: Double
  
  /**
   * Gets or sets the y coordinate.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleHandle%23y">Online Documentation</a>
   */
  final override var y: Double
  
  /**
   * Delegates the original values to [set][RectangleHandle].
   * @param [context] The context to retrieve information about the drag from.
   * @param [originalLocation] The value of the coordinate of the [location][RectangleHandle] property at the time of [initializeDrag][RectangleHandle].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleHandle%23RectangleHandle-method-cancelDrag">Online Documentation</a>
   */
  override fun cancelDrag(
    context: IInputModeContext,
    originalLocation: Point,
  )
  
  /**
   * This implementation does nothing.
   * @param [context] The context to retrieve information about the drag from.
   * @param [originalLocation] The value of the [location][RectangleHandle] property at the time of [initializeDrag][RectangleHandle].
   * @param [newLocation] The coordinates in the world coordinate system that the client wants the handle to be at. Depending on the implementation the [location][RectangleHandle] may or may not be modified to reflect the new value. This is the same value as delivered in the last invocation of [handleMove][RectangleHandle]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleHandle%23RectangleHandle-method-dragFinished">Online Documentation</a>
   */
  override fun dragFinished(
    context: IInputModeContext,
    originalLocation: Point,
    newLocation: Point,
  )
  
  /**
   * Ignore clicking the handle.
   * @param [event] Arguments describing the click.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleHandle%23RectangleHandle-method-handleClick">Online Documentation</a>
   */
  override fun handleClick(
    event: ClickEventArgs,
  )
  
  /**
   * Delegates to [set][RectangleHandle].
   * @param [context] The context to retrieve information about the drag from.
   * @param [originalLocation] The value of the [location][RectangleHandle] property at the time of [initializeDrag][RectangleHandle].
   * @param [newLocation] The coordinates in the world coordinate system that the client wants the handle to be at. Depending on the implementation the [location][RectangleHandle] may or may not be modified to reflect the new value.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleHandle%23RectangleHandle-method-handleMove">Online Documentation</a>
   */
  override fun handleMove(
    context: IInputModeContext,
    originalLocation: Point,
    newLocation: Point,
  )
  
  /**
   * This implementation does nothing.
   * @param [context] The context to retrieve information about the drag from.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleHandle%23RectangleHandle-method-initializeDrag">Online Documentation</a>
   */
  override fun initializeDrag(
    context: IInputModeContext,
  )
  
  /**
   * Modifies the [rectangle][RectangleHandle].
   * @param [delta] The [Point] representing the x- and y-direction by which to move the rectangle.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleHandle%23RectangleHandle-method-moveBy">Online Documentation</a>
   */
  open fun moveBy(
    delta: Point,
  )
  
  /**
   * Delegates to [moveBy][RectangleHandle].
   * @param [x] The amount to move in x-direction.
   * @param [y] The amount to move in y-direction.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleHandle%23RectangleHandle-method-set">Online Documentation</a>
   */
  open fun set(
    x: Double,
    y: Double,
  )
  
  companion object : ClassMetadata<RectangleHandle> {
  }
}
