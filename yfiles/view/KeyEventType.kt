// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

/**
 * The type of a [KeyEventArgs].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyEventType">Online Documentation</a>
 */

sealed external class KeyEventType {
  /**
   * Neither Down, nor Up.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyEventType%23NONE">Online Documentation</a>
   */
  object NONE: KeyEventType
  
  /**
   * The `keydown` event.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyEventType%23DOWN">Online Documentation</a>
   */
  object DOWN: KeyEventType
  
  /**
   * The `keyup` event.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/KeyEventType%23UP">Online Documentation</a>
   */
  object UP: KeyEventType
}
