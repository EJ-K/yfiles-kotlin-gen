// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * The type of a [KeyEventArgs].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyEventType">Online Documentation</a>
 */
external sealed class KeyEventType: YEnum<KeyEventType> {
   companion object: EnumMetadata<KeyEventType> {
       /**
 * Neither Pressed, nor Typed, nor Released.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyEventType%23NONE">Online Documentation</a>
 */
val NONE: KeyEventType

/**
 * The `keydown` event.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyEventType%23DOWN">Online Documentation</a>
 */
val DOWN: KeyEventType

/**
 * The `keypress` event.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyEventType%23PRESS">Online Documentation</a>
 */
val PRESS: KeyEventType

/**
 * The `keyup` event.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyEventType%23UP">Online Documentation</a>
 */
val UP: KeyEventType
   }
}
