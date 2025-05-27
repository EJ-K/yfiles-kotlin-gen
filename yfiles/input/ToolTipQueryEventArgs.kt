// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import js.promise.Promise
import js.promise.PromiseResult
import yfiles.geometry.Point
import yfiles.lang.ClassMetadata

/**
 * Event argument that can be used to query the text to display when the mouse hovers over the given point in world coordinate space.
 * @see [MouseHoverInputMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ToolTipQueryEventArgs">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [ToolTipQueryEventArgs] class.
 * @param [context] The context of the query.
 * @param [queryLocation] The query location.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ToolTipQueryEventArgs%23ToolTipQueryEventArgs-constructor-ToolTipQueryEventArgs">Online Documentation</a>
 * 
 * @property queryLocation
 * Gets the query location in world coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ToolTipQueryEventArgs%23queryLocation">Online Documentation</a>
 */
external open class ToolTipQueryEventArgs  (
 context: IInputModeContext ,
final val queryLocation: Point) : InputModeEventArgs {

/**
 * Gets or sets a value indicating whether this [ToolTipQueryEventArgs] has been handled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ToolTipQueryEventArgs%23handled">Online Documentation</a>
 */
final var handled: Boolean
/**
 * Gets or sets the tooltip content to use.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ToolTipQueryEventArgs%23toolTip">Online Documentation</a>
 */
final var toolTip: PromiseResult<Any /* string | HTMLElement */> /* string | HTMLElement | Promise<string | HTMLElement> */?

companion object : ClassMetadata<ToolTipQueryEventArgs> {
}
}
