// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import web.uievents.KeyboardEvent
import yfiles.lang.ClassMetadata
import yfiles.lang.EventArgs

/**
 * A wrapper for the native keyboard event which abstracts away incompatibilities in browser implementations.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyEventArgs">Online Documentation</a>
 * 
 * @constructor Creates a new instance of this class from a native keyboard event.
 * @param [event] The native keyboard event.
 * @param [eventType] The type of the event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyEventArgs%23KeyEventArgs-constructor-KeyEventArgs">Online Documentation</a>
 * 
 * @property eventType
 * Gets the type of the event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyEventArgs%23eventType">Online Documentation</a>
 */
external class KeyEventArgs (
event: KeyboardEvent,
final val eventType: KeyEventType) : EventArgs {
  /**
   * Gets a value indicating whether the alt modifier is pressed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyEventArgs%23altKey">Online Documentation</a>
   */
  final val altKey: Boolean
  
  /**
   * Gets a value indicating whether the control modifier is pressed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyEventArgs%23ctrlKey">Online Documentation</a>
   */
  final val ctrlKey: Boolean
  
  /**
   * Gets a value indicating whether the default behaviors for this event have been prevented by a previous call to [preventDefault][KeyEventArgs].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyEventArgs%23defaultPrevented">Online Documentation</a>
   */
  final val defaultPrevented: Boolean
  
  /**
   * Gets the key.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyEventArgs%23key">Online Documentation</a>
   */
  final val key: String
  
  /**
   * Gets a value indicating whether the meta modifier is pressed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyEventArgs%23metaKey">Online Documentation</a>
   */
  final val metaKey: Boolean
  
  /**
   * Gets the modifiers.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyEventArgs%23modifiers">Online Documentation</a>
   */
  final val modifiers: ModifierKeys
  
  /**
   * Gets the original DOM event associated with this event.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyEventArgs%23originalEvent">Online Documentation</a>
   */
  final val originalEvent: KeyboardEvent
  
  /**
   * Gets a value indicating whether the shift modifier is pressed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyEventArgs%23shiftKey">Online Documentation</a>
   */
  final val shiftKey: Boolean
  
  /**
   * Sets this event's [defaultPrevented][KeyEventArgs] property to `true` signalling that the event has been properly handled and any default behaviors should be prevented.
   * @see [defaultPrevented]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyEventArgs%23KeyEventArgs-method-preventDefault">Online Documentation</a>
   */
  fun preventDefault()
  
  companion object : ClassMetadata<KeyEventArgs> {
  }
}
