// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.IRectangle
import yfiles.geometry.Rect
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * Interface for an object that can be interactively reshaped in a [CanvasComponent][yfiles.view.CanvasComponent]
 * @see [IDragHandler]
 * @see [IPositionHandler]
 * @see [IHandle]
 * @see [IInputModeContext]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IReshapeHandler">Online Documentation</a>
 */
external interface IReshapeHandler : YObject {
/**
 * Gets a view of the bounds of the item.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IReshapeHandler%23bounds">Online Documentation</a>
 */
val bounds: IRectangle
/**
 * Called by clients to indicate that the reshaping has been canceled by the user.
 * @param [context] The context to retrieve information about the reshaping from.
 * @param [originalBounds] The value of the coordinate of the [bounds] property at the time of [initializeReshape].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IReshapeHandler%23IReshapeHandler-method-cancelReshape">Online Documentation</a>
 */
   fun cancelReshape( context: IInputModeContext ,
 originalBounds: Rect )
/**
 * Called by clients to indicate that the element has been dragged and its position should be updated.
 * @param [context] The context to retrieve information about the reshaping from.
 * @param [originalBounds] The value of the [bounds] property at the time of [initializeReshape].
 * @param [newBounds] The coordinates of the bounds in the world coordinate system that the client wants the shape to be at. Depending on the implementation the [bounds] may or may not be modified to reflect the new value.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IReshapeHandler%23IReshapeHandler-method-handleReshape">Online Documentation</a>
 */
   fun handleReshape( context: IInputModeContext ,
 originalBounds: Rect ,
 newBounds: Rect )
/**
 * Called by clients to indicate that the element is going to be reshaped.
 * @param [context] The context to retrieve information about the drag from.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IReshapeHandler%23IReshapeHandler-method-initializeReshape">Online Documentation</a>
 */
   fun initializeReshape( context: IInputModeContext )
/**
 * Called by clients to indicate that the reshaping has just been finished.
 * @param [context] The context to retrieve information about the drag from.
 * @param [originalBounds] The value of the coordinate of the [bounds] property at the time of [initializeReshape].
 * @param [newBounds] The coordinates of the bounds in the world coordinate system that the client wants the shape to be at. Depending on the implementation the [bounds] may or may not be modified to reflect the new value. This is the same value as delivered in the last invocation of [handleReshape]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IReshapeHandler%23IReshapeHandler-method-reshapeFinished">Online Documentation</a>
 */
   fun reshapeFinished( context: IInputModeContext ,
 originalBounds: Rect ,
 newBounds: Rect )

companion object : InterfaceMetadata<IReshapeHandler> {
}
}
