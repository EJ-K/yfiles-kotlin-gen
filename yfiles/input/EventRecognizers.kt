// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import js.array.ReadonlyArray
import yfiles.view.KeyEventType
import yfiles.view.ModifierKeys
import yfiles.view.PointerButtons
import yfiles.view.PointerEventType
import yfiles.view.PointerType

/**
 * Provides implementation singletons and utility methods for event recognizers.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers">Online Documentation</a>
 */

external object EventRecognizers {
  /**
   * An event recognizer for the key-down event of the Alt key.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23ALT_DOWN">Online Documentation</a>
   */
   val ALT_DOWN: EventRecognizer
  
  /**
   * An event recognizer that recognizes when the Alt modifier is active.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23ALT_IS_DOWN">Online Documentation</a>
   */
   val ALT_IS_DOWN: EventRecognizer
  
  /**
   * An event recognizer for the key-up event of the Alt key.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23ALT_UP">Online Documentation</a>
   */
   val ALT_UP: EventRecognizer
  
  /**
   * An event recognizer that will always return true;
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23ALWAYS">Online Documentation</a>
   */
   val ALWAYS: EventRecognizer
  
  /**
   * An event recognizer for the key-down event of the Control key.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23CTRL_DOWN">Online Documentation</a>
   */
   val CTRL_DOWN: EventRecognizer
  
  /**
   * An event recognizer that recognizes when the Ctrl modifier is active.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23CTRL_IS_DOWN">Online Documentation</a>
   */
   val CTRL_IS_DOWN: EventRecognizer
  
  /**
   * An event recognizer for the key-up event of the Control key.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23CTRL_UP">Online Documentation</a>
   */
   val CTRL_UP: EventRecognizer
  
  /**
   * An event recognizer for the key down event of the Escape key.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23ESCAPE_DOWN">Online Documentation</a>
   */
   val ESCAPE_DOWN: EventRecognizer
  
  /**
   * An event recognizer for the key-down event of the Meta key.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23META_DOWN">Online Documentation</a>
   */
   val META_DOWN: EventRecognizer
  
  /**
   * An event recognizer that recognizes when the Meta modifier is active.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23META_IS_DOWN">Online Documentation</a>
   */
   val META_IS_DOWN: EventRecognizer
  
  /**
   * An event recognizer for the key-up event of the Meta key.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23META_UP">Online Documentation</a>
   */
   val META_UP: EventRecognizer
  
  /**
   * An event recognizer that identifies [MOUSE][PointerType] and [PEN][PointerType] down events.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23MOUSE_DOWN">Online Documentation</a>
   */
   val MOUSE_DOWN: EventRecognizer
  
  /**
   * An event recognizer that identifies [MOUSE][PointerType] and [PEN][PointerType] drags.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23MOUSE_DRAG">Online Documentation</a>
   */
   val MOUSE_DRAG: EventRecognizer
  
  /**
   * An event recognizer that identifies clicks with the left mouse button or the [PEN][PointerType].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23MOUSE_LEFT_CLICK">Online Documentation</a>
   */
   val MOUSE_LEFT_CLICK: EventRecognizer
  
  /**
   * An event recognizer that identifies double clicks with the left mouse button or the [PEN][PointerType].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23MOUSE_LEFT_DOUBLE_CLICK">Online Documentation</a>
   */
   val MOUSE_LEFT_DOUBLE_CLICK: EventRecognizer
  
  /**
   * An event recognizer that identifies down events of the left mouse button and of the [PEN_CONTACT][PointerButtons] of a [PEN][PointerType].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23MOUSE_LEFT_DOWN">Online Documentation</a>
   */
   val MOUSE_LEFT_DOWN: EventRecognizer
  
  /**
   * An event recognizer that identifies drag events with the left mouse button or the [PEN_CONTACT][PointerButtons] of a [PEN][PointerType].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23MOUSE_LEFT_DRAG">Online Documentation</a>
   */
   val MOUSE_LEFT_DRAG: EventRecognizer
  
  /**
   * An event recognizer that identifies up events of the left mouse button and of the [PEN_CONTACT][PointerButtons] of a [PEN][PointerType].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23MOUSE_LEFT_UP">Online Documentation</a>
   */
   val MOUSE_LEFT_UP: EventRecognizer
  
  /**
   * An event recognizer that identifies [MOUSE][PointerType] and [PEN][PointerType] movements that are not drags.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23MOUSE_MOVE">Online Documentation</a>
   */
   val MOUSE_MOVE: EventRecognizer
  
  /**
   * An event recognizer that identifies long presses of the primary touch pointer.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23MOUSE_OR_STYLUS_LONG_PRESS">Online Documentation</a>
   */
   val MOUSE_OR_STYLUS_LONG_PRESS: EventRecognizer
  
  /**
   * An event recognizer that identifies [MOUSE][PointerType] and [PEN][PointerType] up events.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23MOUSE_UP">Online Documentation</a>
   */
   val MOUSE_UP: EventRecognizer
  
  /**
   * An event recognizer that will always return false;
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23NEVER">Online Documentation</a>
   */
   val NEVER: EventRecognizer
  
  /**
   * An event recognizer for the key-down event of the Shift key.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23SHIFT_DOWN">Online Documentation</a>
   */
   val SHIFT_DOWN: EventRecognizer
  
  /**
   * An event recognizer that recognizes when the Shift modifier is active.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23SHIFT_IS_DOWN">Online Documentation</a>
   */
   val SHIFT_IS_DOWN: EventRecognizer
  
  /**
   * An event recognizer for the key-up event of the Shift key.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23SHIFT_UP">Online Documentation</a>
   */
   val SHIFT_UP: EventRecognizer
  
  /**
   * An event recognizer that identifies double-taps of the primary touch pointer.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23TOUCH_PRIMARY_DOUBLE_TAP">Online Documentation</a>
   */
   val TOUCH_PRIMARY_DOUBLE_TAP: EventRecognizer
  
  /**
   * An event recognizer that identifies down events of the primary touch pointer.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23TOUCH_PRIMARY_DOWN">Online Documentation</a>
   */
   val TOUCH_PRIMARY_DOWN: EventRecognizer
  
  /**
   * An event recognizer that identifies movements ([DRAG][PointerEventType]) of the primary touch point.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23TOUCH_PRIMARY_DRAG">Online Documentation</a>
   */
   val TOUCH_PRIMARY_DRAG: EventRecognizer
  
  /**
   * An event recognizer that identifies long presses of the primary touch pointer.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23TOUCH_PRIMARY_LONG_PRESS">Online Documentation</a>
   */
   val TOUCH_PRIMARY_LONG_PRESS: EventRecognizer
  
  /**
   * An event recognizer that identifies long rest events of the primary touch pointer.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23TOUCH_PRIMARY_LONG_REST">Online Documentation</a>
   */
   val TOUCH_PRIMARY_LONG_REST: EventRecognizer
  
  /**
   * An event recognizer that identifies taps of the primary touch pointer.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23TOUCH_PRIMARY_TAP">Online Documentation</a>
   */
   val TOUCH_PRIMARY_TAP: EventRecognizer
  
  /**
   * An event recognizer that identifies up events of the primary touch pointer.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23TOUCH_PRIMARY_UP">Online Documentation</a>
   */
   val TOUCH_PRIMARY_UP: EventRecognizer
  
  /**
   * Creates an event recognizer for a given key and type using a given set of modifiers.
   * @param [type] The type of the event.
   * @param [data] The key that is subject of the event.
   * @param [modifiers] The state of the modifiers that must be set. This is [NONE][ModifierKeys] if not set.
   * @return The new event recognizer.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23EventRecognizers-method-createKeyEventRecognizer">Online Documentation</a>
   */
  fun createKeyEventRecognizer(
    type: KeyEventType,
    data: String,
    modifiers: ModifierKeys  = definedExternally,
  ): EventRecognizer
  
  /**
   * Creates an event recognizer for the given arguments.
   * @param [pointerTypes] Any one of the [pointerType][yfiles.view.PointerEventArgs]s must be present in the event.
   * @param [eventTypes] Any one of the [eventType][yfiles.view.PointerEventArgs]s must be present in the event.
   * @param [buttons] All [buttons][yfiles.view.PointerEventArgs] that must be set in the event.
   * @param [changedButtons] All [changedButtons][yfiles.view.PointerEventArgs] that must be set in the event.
   * @param [clickCount] The [clickCount][yfiles.view.PointerEventArgs] of the event.
   * @param [modifiers] All [modifiers][yfiles.view.PointerEventArgs] that must be set in the event.
   * @param [changedModifiers] All [changedModifiers][yfiles.view.PointerEventArgs] that must be set in the event.
   * @return A recognizer that detects events with the given arguments.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23EventRecognizers-method-createPointerEventRecognizer">Online Documentation</a>
   */
  fun createPointerEventRecognizer(
    pointerTypes: ReadonlyArray<PointerType>?  = definedExternally,
    eventTypes: ReadonlyArray<PointerEventType>?  = definedExternally,
    buttons: PointerButtons?  = definedExternally,
    changedButtons: PointerButtons?  = definedExternally,
    clickCount: Int?  = definedExternally,
    modifiers: ModifierKeys?  = definedExternally,
    changedModifiers: ModifierKeys?  = definedExternally,
  ): EventRecognizer
  
  /**
   * Creates an event recognizer instance that yields the boolean inverse of the given event recognizer.
   * @param [recognizer] The recognizer to invert.
   * @return An implementation that performs the logical negation for the argument.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23EventRecognizers-defaultmethod-inverse">Online Documentation</a>
   */
  fun inverse(
    recognizer: EventRecognizer,
  ): EventRecognizer
}
