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

/**
 * Event arguments used by [TapInputMode.Tapped].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapEventArgs">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [TapEventArgs] class.
 * @param [context] The context in which the tap occurred.
 * @param [location] The location.
 * @param [tapCount] The number of taps associated with this event.
 * @param [originalEvent] The original event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapEventArgs%23TapEventArgs-constructor-TapEventArgs">Online Documentation</a>
 * 
 * @property location
 * Gets the location of the tap.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapEventArgs%23location">Online Documentation</a>
 * 
 * @property tapCount
 * Gets the number of taps associated with this event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapEventArgs%23tapCount">Online Documentation</a>
 * 
 * @property originalEvent
 * Gets the last input event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapEventArgs%23originalEvent">Online Documentation</a>
 */
external open class TapEventArgs  (
 context: IInputModeContext ,
final val location: Point,
final val tapCount: Int = definedExternally,
final val originalEvent: Event? = definedExternally) : InputModeEventArgs {

/**
 * Gets or sets a value indicating whether this [TapEventArgs] have been handled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapEventArgs%23handled">Online Documentation</a>
 */
final var handled: Boolean

companion object : ClassMetadata<TapEventArgs> {
}
}
