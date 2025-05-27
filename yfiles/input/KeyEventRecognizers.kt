// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.view.Key
import yfiles.view.KeyEventType
import yfiles.view.ModifierKeys

/**
 * Provides commonly used predefined event recognizers that work on [KeyEventArgs].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyEventRecognizers">Online Documentation</a>
 */
external object KeyEventRecognizers {
/**
 * An event recognizer that recognizes when the Alt modifier is active.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyEventRecognizers%23ALT_IS_DOWN">Online Documentation</a>
 */
 val ALT_IS_DOWN: EventRecognizer
/**
 * An event recognizer that recognizes when the Ctrl modifier is being pressed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyEventRecognizers%23CTRL_DOWN">Online Documentation</a>
 */
 val CTRL_DOWN: EventRecognizer
/**
 * An event recognizer that recognizes when the Ctrl modifier is active.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyEventRecognizers%23CTRL_IS_DOWN">Online Documentation</a>
 */
 val CTRL_IS_DOWN: EventRecognizer
/**
 * An event recognizer that recognizes when the Ctrl modifier is being released.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyEventRecognizers%23CTRL_UP">Online Documentation</a>
 */
 val CTRL_UP: EventRecognizer
/**
 * An event recognizer that identifies `keydown` of the Delete key.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyEventRecognizers%23DELETE_DOWN">Online Documentation</a>
 */
 val DELETE_DOWN: EventRecognizer
/**
 * An event recognizer that identifies `keydown` of the Escape key.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyEventRecognizers%23ESCAPE_DOWN">Online Documentation</a>
 */
 val ESCAPE_DOWN: EventRecognizer
/**
 * An event recognizer that identifies `keypress` of the Escape key.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyEventRecognizers%23ESCAPE_PRESS">Online Documentation</a>
 */
 val ESCAPE_PRESS: EventRecognizer
/**
 * An event recognizer that identifies `keyup` of the Escape key.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyEventRecognizers%23ESCAPE_UP">Online Documentation</a>
 */
 val ESCAPE_UP: EventRecognizer
/**
 * An event recognizer that identifies `keydown` of any key.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyEventRecognizers%23KEY_DOWN">Online Documentation</a>
 */
 val KEY_DOWN: EventRecognizer
/**
 * An event recognizer that identifies `keypress` of any key.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyEventRecognizers%23KEY_PRESS">Online Documentation</a>
 */
 val KEY_PRESS: EventRecognizer
/**
 * An event recognizer that identifies `keyup` of any key.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyEventRecognizers%23KEY_UP">Online Documentation</a>
 */
 val KEY_UP: EventRecognizer
/**
 * An event recognizer that recognizes when the Meta modifier is active.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyEventRecognizers%23META_IS_DOWN">Online Documentation</a>
 */
 val META_IS_DOWN: EventRecognizer
/**
 * An event recognizer that recognizes when the Shift modifier is being pressed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyEventRecognizers%23SHIFT_DOWN">Online Documentation</a>
 */
 val SHIFT_DOWN: EventRecognizer
/**
 * An event recognizer that recognizes when the Shift modifier is active.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyEventRecognizers%23SHIFT_IS_DOWN">Online Documentation</a>
 */
 val SHIFT_IS_DOWN: EventRecognizer
/**
 * An event recognizer that recognizes when the Shift modifier is being released.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyEventRecognizers%23SHIFT_UP">Online Documentation</a>
 */
 val SHIFT_UP: EventRecognizer
/**
 * Creates an event recognizer for a given key and type using a given set of modifiers.
 * @param [type] The type of the event.
 * @param [value] The key that is subject of the event.
 * @param [modifiers] The state of the modifiers that must be set. This is [ModifierKeys.NONE] if not set.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyEventRecognizers%23KeyEventRecognizers-method-create">Online Documentation</a>
 */
 final   fun create( type: KeyEventType ,
 value: Key ,
 modifiers: ModifierKeys  = definedExternally):EventRecognizer
/**
 * Creates an event recognizer that matches if the specified keys are currently down.
 * @param [key] The key to create the recognizer for.
 * @param [modifiers] The modifier keys that should be down for the recognizer.
 * @return An event recognizer that uses the gesture.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyEventRecognizers%23KeyEventRecognizers-method-createIsDown">Online Documentation</a>
 */
 final   fun createIsDown( key: Key ,
 modifiers: ModifierKeys  = definedExternally):EventRecognizer
}
