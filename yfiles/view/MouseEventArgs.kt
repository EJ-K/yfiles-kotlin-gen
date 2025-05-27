// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import web.events.Event
import yfiles.geometry.Point
import yfiles.lang.ClassMetadata
import yfiles.lang.EventArgs

/**
 * Complex event arguments that is used by the [CanvasComponent] to indicate mouse events in world coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventArgs">Online Documentation</a>
 * 
 * @constructor Constructs a new mouse event argument.
 * @param [originalEvent] The original DOM event.
 * @param [eventType] The type of the event
 * @param [location] the position of the mouse in world coordinates at the time of the event
 * @param [changedButtons] the mouse buttons that have changed state if the type of event is [MouseEventTypes.DOWN] or [MouseEventTypes.UP]
 * @param [changedModifiers] the modifier Keys that have been changed
 * @param [buttons] the current state of the MouseButtons
 * @param [modifiers] the current state of the modifier Keys
 * @param [clickCount] the number of clicks this event represents, 2 for a double click
 * @param [wheelDelta] the signed number of vertical mouse wheel turn units
 * @param [wheelDeltaX] the signed number of horizontal mouse wheel turn units
 * @param [scrollAmount] The number of lines to scroll, if `scrollType` is [MouseWheelDeltaMode.LINES].
 * @param [deltaMode] The type of scrolling performed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventArgs%23MouseEventArgs-constructor-MouseEventArgs">Online Documentation</a>
 * 
 * @property originalEvent
 * Gets the original DOM event associated with this event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventArgs%23originalEvent">Online Documentation</a>
 * 
 * @property eventType
 * Gets the type of this event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventArgs%23eventType">Online Documentation</a>
 * 
 * @property location
 * Gets the coordinates in the world coordinate space associated with this event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventArgs%23location">Online Documentation</a>
 * 
 * @property changedButtons
 * Gets the mouse buttons that have changed for this event.
 * @see [buttons]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventArgs%23changedButtons">Online Documentation</a>
 * 
 * @property changedModifiers
 * Gets the modifier keys that have changed for this event.
 * @see [modifiers]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventArgs%23changedModifiers">Online Documentation</a>
 * 
 * @property buttons
 * Gets the state of the mouse buttons at the time of the event creation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventArgs%23buttons">Online Documentation</a>
 * 
 * @property modifiers
 * Gets the state of the modifier keys at the time of the event creation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventArgs%23modifiers">Online Documentation</a>
 * 
 * @property clickCount
 * Gets the number of clicks the current event represents if it is of type [MouseEventTypes.CLICK].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventArgs%23clickCount">Online Documentation</a>
 * 
 * @property wheelDelta
 * Gets the signed number of vertical mouse wheel turn units.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventArgs%23wheelDelta">Online Documentation</a>
 * 
 * @property wheelDeltaX
 * Gets the signed number of horizontal mouse wheel turn units.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventArgs%23wheelDeltaX">Online Documentation</a>
 * 
 * @property scrollAmount
 * Gets the distance to scroll at once when [deltaMode] is [MouseWheelDeltaMode.LINES].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventArgs%23scrollAmount">Online Documentation</a>
 * 
 * @property deltaMode
 * Gets the scrolling behavior.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventArgs%23deltaMode">Online Documentation</a>
 */
external open class MouseEventArgs  (
final val originalEvent: Event?,
final val eventType: MouseEventTypes,
final val location: Point,
final val changedButtons: MouseButtons = definedExternally,
final val changedModifiers: ModifierKeys = definedExternally,
final val buttons: MouseButtons = definedExternally,
final val modifiers: ModifierKeys = definedExternally,
final val clickCount: Int = definedExternally,
final val wheelDelta: Double = definedExternally,
final val wheelDeltaX: Double = definedExternally,
final val scrollAmount: Int = definedExternally,
final val deltaMode: MouseWheelDeltaMode = definedExternally) : EventArgs {

/**
 * Gets a value indicating whether the default behaviors for this event have been prevented by a previous call to [preventDefault].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventArgs%23defaultPrevented">Online Documentation</a>
 */
final val defaultPrevented: Boolean
/**
 * Sets this event's [defaultPrevented] property to `true` signaling that the event has been properly handled and any default behaviors should be prevented.
 * @see [defaultPrevented]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventArgs%23MouseEventArgs-method-preventDefault">Online Documentation</a>
 */
 final   fun preventDefault()

companion object : ClassMetadata<MouseEventArgs> {
}
}
