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
import yfiles.lang.ClassMetadata

/**
 * Event argument that is used to query the [IPositionHandler] that is used to move the items while dragging via [MoveInputMode].
 * @see [MoveInputMode]
 * @see [MoveInputMode.addQueryPositionHandlerListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryPositionHandlerEventArgs">Online Documentation</a>
 * 
 * @constructor Instantiates a new [QueryPositionHandlerEventArgs]
 * @param [context] The [IInputModeContext] of the operation.
 * @param [queryLocation] The initial location of the movement.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryPositionHandlerEventArgs%23QueryPositionHandlerEventArgs-constructor-QueryPositionHandlerEventArgs">Online Documentation</a>
 * 
 * @property queryLocation
 * Gets the location of the movement (where the drag has started).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryPositionHandlerEventArgs%23queryLocation">Online Documentation</a>
 */
external open class QueryPositionHandlerEventArgs  (
 context: IInputModeContext ,
final val queryLocation: Point) : InputModeEventArgs {

/**
 * Gets or sets a value indicating whether this [QueryPositionHandlerEventArgs] has been handled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryPositionHandlerEventArgs%23handled">Online Documentation</a>
 */
final var handled: Boolean
/**
 * Gets or sets the [IPositionHandler] to use for the movement of the items that are affected by the [MoveInputMode].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryPositionHandlerEventArgs%23positionHandler">Online Documentation</a>
 */
final var positionHandler: IPositionHandler?

companion object : ClassMetadata<QueryPositionHandlerEventArgs> {
}
}
