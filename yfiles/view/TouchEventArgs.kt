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
 * Complex event arguments that is used by the [CanvasComponent] to indicate touch events in world coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TouchEventArgs">Online Documentation</a>
 * 
 * @constructor Constructs a new touch event argument.
 * @param [originalEvent] The original JavaScript event, if available.
 * @param [eventType] The type of the event
 * @param [location] The position of the touch device in world coordinates at the time of the event
 * @param [device] The device the event was triggered by
 * @param [modifiers] The current state of the modifier keys
 * @param [changedModifiers] The modifier keys that have been changed
 * @param [tapCount] the number of taps this event represents, 2 for a double tap
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TouchEventArgs%23TouchEventArgs-constructor-TouchEventArgs(Event,TouchEventTypes,Point,TouchDevice,ModifierKeys,ModifierKeys,number)">Online Documentation</a>
 * 
 * @property originalEvent
 * Gets the original DOM event associated with this event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TouchEventArgs%23originalEvent">Online Documentation</a>
 * 
 * @property eventType
 * Gets the type of this event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TouchEventArgs%23eventType">Online Documentation</a>
 * 
 * @property location
 * Returns the location represented by this event in world coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TouchEventArgs%23location">Online Documentation</a>
 * 
 * @property device
 * Returns the touch device associated with this event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TouchEventArgs%23device">Online Documentation</a>
 * 
 * @property modifiers
 * Gets the state of the modifier keys at the time of the event creation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TouchEventArgs%23modifiers">Online Documentation</a>
 * 
 * @property changedModifiers
 * Gets the modifier keys that have changed for this event.
 * @see [modifiers]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TouchEventArgs%23changedModifiers">Online Documentation</a>
 * 
 * @property tapCount
 * Returns the number of taps the current event represents if it is of type [TouchEventTypes.TAP].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TouchEventArgs%23tapCount">Online Documentation</a>
 */
external open class TouchEventArgs  (
final val originalEvent: Event?,
final val eventType: TouchEventTypes,
final val location: Point,
final val device: TouchDevice,
final val modifiers: ModifierKeys,
final val changedModifiers: ModifierKeys,
final val tapCount: Int = definedExternally) : EventArgs {

/**
 * Gets a value indicating whether the default behaviors for this event have been prevented by a previous call to [preventDefault].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TouchEventArgs%23defaultPrevented">Online Documentation</a>
 */
final val defaultPrevented: Boolean
/**
 * Sets this event's [defaultPrevented] property to `true` signalling that the event has been properly handled and any default behaviors should be prevented.
 * @see [defaultPrevented]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TouchEventArgs%23TouchEventArgs-method-preventDefault">Online Documentation</a>
 */
 final   fun preventDefault()

companion object : ClassMetadata<TouchEventArgs> {
}
}
