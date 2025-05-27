// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

/**
 * Provides constants for the corner visualization style of the [RectangleNodeStyle].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleCornerStyle">Online Documentation</a>
 */

sealed external class RectangleCornerStyle {
  /**
   * Rounded corner style.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleCornerStyle%23ROUND">Online Documentation</a>
   */
  object ROUND: RectangleCornerStyle
  
  /**
   * Diagonally cut corner style.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleCornerStyle%23CUT">Online Documentation</a>
   */
  object CUT: RectangleCornerStyle
}
