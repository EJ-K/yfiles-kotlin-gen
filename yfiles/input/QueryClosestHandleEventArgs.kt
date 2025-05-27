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
 * Event argument that can be used to query the [IHandle] that is closest to the given location in world coordinate space.
 * @see [HandleInputMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryClosestHandleEventArgs">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [QueryClosestHandleEventArgs] class.
 * @param [context] The context of the query.
 * @param [queryLocation] The query location.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryClosestHandleEventArgs%23QueryClosestHandleEventArgs-constructor-QueryClosestHandleEventArgs">Online Documentation</a>
 * 
 * @property queryLocation
 * Gets the query location in world coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryClosestHandleEventArgs%23queryLocation">Online Documentation</a>
 */
external open class QueryClosestHandleEventArgs  (
 context: IInputModeContext ,
final val queryLocation: Point) : InputModeEventArgs {

/**
 * Gets or sets the handle to use.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryClosestHandleEventArgs%23handle">Online Documentation</a>
 */
final var handle: IHandle?
/**
 * Gets or sets a value indicating whether this [QueryClosestHandleEventArgs] instance has been handled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryClosestHandleEventArgs%23handled">Online Documentation</a>
 */
final var handled: Boolean

companion object : ClassMetadata<QueryClosestHandleEventArgs> {
}
}
