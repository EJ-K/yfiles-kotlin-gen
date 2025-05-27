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
import yfiles.view.ModifierKeys
import yfiles.view.PointerButtons
import yfiles.view.PointerEventArgs
import yfiles.view.PointerType

/**
 * Event arguments used by [clicked][ClickInputMode] and [handleClick][IHandle].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickEventArgs">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [ClickEventArgs] class.
 * @param [context] The context in which the click occurred.
 * @param [location] The location.
 * @param [buttons] The buttons.
 * @param [clickCount] The number of clicks associated with this event.
 * @param [event] The original pointer event args.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickEventArgs%23ClickEventArgs-constructor-ClickEventArgs">Online Documentation</a>
 * 
 * @property location
 * Gets the location of the click.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickEventArgs%23location">Online Documentation</a>
 * 
 * @property clickCount
 * Gets the number of clicks associated with this event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickEventArgs%23clickCount">Online Documentation</a>
 */
open external class ClickEventArgs (
context: IInputModeContext,
final val location: Point,
buttons: PointerButtons,
final val clickCount: Int,
event: PointerEventArgs) : InputModeEventArgs {
  /**
   * Gets a value indicating whether the alt modifier was pressed at the time of the click.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickEventArgs%23altKey">Online Documentation</a>
   */
  final val altKey: Boolean
  
  /**
   * Gets a value indicating whether the control modifier was pressed at the time of the click.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickEventArgs%23ctrlKey">Online Documentation</a>
   */
  final val ctrlKey: Boolean
  
  /**
   * Gets or sets a value indicating whether this instance has been handled.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickEventArgs%23handled">Online Documentation</a>
   */
  final var handled: Boolean
  
  /**
   * Gets a value indicating whether the meta modifier was pressed at the time of the click.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickEventArgs%23metaKey">Online Documentation</a>
   */
  final val metaKey: Boolean
  
  /**
   * Gets the state of the modifiers at the time of the click.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickEventArgs%23modifiers">Online Documentation</a>
   */
  final val modifiers: ModifierKeys
  
  /**
   * Gets the pointer event args that caused this event.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickEventArgs%23originalEventArgs">Online Documentation</a>
   */
  final val originalEventArgs: PointerEventArgs
  
  /**
   * Gets the [PointerButtons] that have changed for this event.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickEventArgs%23pointerButtons">Online Documentation</a>
   */
  final val pointerButtons: PointerButtons
  
  /**
   * Gets the type of the pointer that was the source of this event.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickEventArgs%23pointerType">Online Documentation</a>
   */
  final val pointerType: PointerType
  
  /**
   * Gets a value indicating whether the shift modifier was pressed at the time of the click.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClickEventArgs%23shiftKey">Online Documentation</a>
   */
  final val shiftKey: Boolean
  
  companion object : ClassMetadata<ClickEventArgs> {
  }
}
