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
external open class RectangleHandle  (
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
 * Gets or sets the largest allowed size for the [rectangle].
 * 
 * The default is [Rect.INFINITE][yfiles.geometry.Rect.INFINITE], which does not restrict the area at all.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleHandle%23maximumBoundingArea">Online Documentation</a>
 */
final var maximumBoundingArea: IRectangle
/**
 * Gets or sets the maximum size allowed for the [rectangle].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleHandle%23maximumSize">Online Documentation</a>
 */
final var maximumSize: ISize
/**
 * Gets or sets the minimum enclosed area that needs to be encompassed by the [rectangle].
 * 
 * The default is [Rect.EMPTY][yfiles.geometry.Rect.EMPTY], which does not restrict the area at all.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleHandle%23minimumEnclosedArea">Online Documentation</a>
 */
final var minimumEnclosedArea: IRectangle
/**
 * Gets or sets the minimum size allowed for the [rectangle].
 * 
 * The default is [Size.ZERO][yfiles.geometry.Size.ZERO].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleHandle%23minimumSize">Online Documentation</a>
 */
final var minimumSize: ISize
/**
 * Gets or sets the type of the handle that can be used by the rendering engine to render types differently.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleHandle%23type">Online Documentation</a>
 */
final override var type: HandleTypes
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
 * Delegates the original values to [set]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleHandle%23RectangleHandle-method-cancelDrag">Online Documentation</a>
 */
 override   fun cancelDrag( context: IInputModeContext ,
 originalLocation: Point )
/**
 * This implementation does nothing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleHandle%23RectangleHandle-method-dragFinished">Online Documentation</a>
 */
 override   fun dragFinished( context: IInputModeContext ,
 originalLocation: Point ,
 newLocation: Point )
/**
 * Ignore clicking the handle.
 * @param [event] Arguments describing the click.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleHandle%23RectangleHandle-method-handleClick">Online Documentation</a>
 */
 override   fun handleClick( event: ClickEventArgs )
/**
 * Delegates to [set].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleHandle%23RectangleHandle-method-handleMove">Online Documentation</a>
 */
 override   fun handleMove( context: IInputModeContext ,
 originalLocation: Point ,
 newLocation: Point )
/**
 * This implementation does nothing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleHandle%23RectangleHandle-method-initializeDrag">Online Documentation</a>
 */
 override   fun initializeDrag( context: IInputModeContext )
/**
 * Modifies the [rectangle].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleHandle%23RectangleHandle-method-moveBy">Online Documentation</a>
 */
 open   fun moveBy( delta: Point )
/**
 * Delegates to [moveBy].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleHandle%23RectangleHandle-method-set">Online Documentation</a>
 */
 open   fun set( x: Double ,
 y: Double )

companion object : ClassMetadata<RectangleHandle> {
}
}
