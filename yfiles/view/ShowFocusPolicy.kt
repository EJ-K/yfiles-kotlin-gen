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
 * The enumeration that describes the possible different policies for displaying the focus of items managed by the [FocusIndicatorManager]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShowFocusPolicy">Online Documentation</a>
 */

sealed external class ShowFocusPolicy {
  /**
   * Indicates that irrespective of the keyboard focus and usage, the focus indicator should always be rendered for the [focusedItem][FocusIndicatorManager].
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShowFocusPolicy%23ALWAYS">Online Documentation</a>
   */
  object ALWAYS: ShowFocusPolicy
  
  /**
   * Indicates that the focus indicator should be shown depending on the value of [focused][FocusIndicatorManager].
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShowFocusPolicy%23WHEN_FOCUSED">Online Documentation</a>
   */
  object WHEN_FOCUSED: ShowFocusPolicy
  
  /**
   * Indicates that the focus indicator will only be shown when triggered via keyboard gestures and will automatically hide again when a pointing device is used.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShowFocusPolicy%23WHEN_USING_KEYBOARD">Online Documentation</a>
   */
  object WHEN_USING_KEYBOARD: ShowFocusPolicy
}
