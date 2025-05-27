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
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * Interface for an object that can be used to drag something displayed in a [CanvasComponent][yfiles.view.CanvasComponent]
 * @see [IPositionHandler]
 * @see [IHandle]
 * @see [IInputModeContext]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IDragHandler">Online Documentation</a>
 */
external interface IDragHandler : YObject {
/**
 * Gets a view of the location of the item.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IDragHandler%23location">Online Documentation</a>
 */
val location: IPoint
/**
 * Called by clients to indicate that the dragging has been canceled by the user.
 * @param [context] The context to retrieve information about the drag from.
 * @param [originalLocation] The value of the coordinate of the [location] property at the time of [initializeDrag].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IDragHandler%23IDragHandler-method-cancelDrag">Online Documentation</a>
 */
   fun cancelDrag( context: IInputModeContext ,
 originalLocation: Point )
/**
 * Called by clients to indicate that the repositioning has just been finished.
 * @param [context] The context to retrieve information about the drag from.
 * @param [originalLocation] The value of the [location] property at the time of [initializeDrag].
 * @param [newLocation] The coordinates in the world coordinate system that the client wants the handle to be at. Depending on the implementation the [location] may or may not be modified to reflect the new value. This is the same value as delivered in the last invocation of [handleMove]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IDragHandler%23IDragHandler-method-dragFinished">Online Documentation</a>
 */
   fun dragFinished( context: IInputModeContext ,
 originalLocation: Point ,
 newLocation: Point )
/**
 * Called by clients to indicate that the element has been dragged and its position should be updated.
 * @param [context] The context to retrieve information about the drag from.
 * @param [originalLocation] The value of the [location] property at the time of [initializeDrag].
 * @param [newLocation] The coordinates in the world coordinate system that the client wants the handle to be at. Depending on the implementation the [location] may or may not be modified to reflect the new value.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IDragHandler%23IDragHandler-method-handleMove">Online Documentation</a>
 */
   fun handleMove( context: IInputModeContext ,
 originalLocation: Point ,
 newLocation: Point )
/**
 * Called by clients to indicate that the element is going to be dragged.
 * @param [context] The context to retrieve information about the drag from.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IDragHandler%23IDragHandler-method-initializeDrag">Online Documentation</a>
 */
   fun initializeDrag( context: IInputModeContext )

companion object : InterfaceMetadata<IDragHandler> {
}
}
