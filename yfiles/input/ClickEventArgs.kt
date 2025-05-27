// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import web.events.Event
import yfiles.geometry.Point
import yfiles.lang.ClassMetadata
import yfiles.view.ModifierKeys
import yfiles.view.MouseButtons

/**
 * Event arguments used by [ClickInputMode.Clicked] and [IHandle.handleClick].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickEventArgs">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [ClickEventArgs] class.
 * @param [context] The context in which the click occurred.
 * @param [location] The location.
 * @param [modifiers] State of the modifiers.
 * @param [mouseButtons] The mouse button(s) that have changed.
 * @param [clickCount] The number of clicks associated with this event.
 * @param [originalEvent] The original event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickEventArgs%23ClickEventArgs-constructor-ClickEventArgs">Online Documentation</a>
 * 
 * @property location
 * Gets the location of the click.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickEventArgs%23location">Online Documentation</a>
 * 
 * @property modifiers
 * Gets the state of the modifiers at the time of the click.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickEventArgs%23modifiers">Online Documentation</a>
 * 
 * @property mouseButtons
 * Gets the [mouseButtons] that have changed for this event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickEventArgs%23mouseButtons">Online Documentation</a>
 * 
 * @property clickCount
 * Gets the number of clicks associated with this event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickEventArgs%23clickCount">Online Documentation</a>
 * 
 * @property originalEvent
 * Gets the last input event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickEventArgs%23originalEvent">Online Documentation</a>
 */
external open class ClickEventArgs  (
 context: IInputModeContext ,
final val location: Point,
final val modifiers: ModifierKeys,
final val mouseButtons: MouseButtons,
final val clickCount: Int,
final val originalEvent: Event? = definedExternally) : InputModeEventArgs {

/**
 * Gets or sets a value indicating whether this [ClickEventArgs] have been handled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickEventArgs%23handled">Online Documentation</a>
 */
final var handled: Boolean

companion object : ClassMetadata<ClickEventArgs> {
}
}
