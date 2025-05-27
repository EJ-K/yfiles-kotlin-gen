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
 * Provides constants for the shapes rendered by [ArrowNodeStyle] and [ArrowEdgeStyle].
 * @see [ArrowNodeStyle.shape]
 * @see [ArrowEdgeStyle.shape]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowStyleShape">Online Documentation</a>
 */

sealed external class ArrowStyleShape {
  /**
   * An arrow with an arrow tip and a rectangular shaft.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowStyleShape%23ARROW">Online Documentation</a>
   */
  object ARROW: ArrowStyleShape
  
  /**
   * A double arrow with two arrow tips pointing in opposite directions and a rectangular shaft in between.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowStyleShape%23DOUBLE_ARROW">Online Documentation</a>
   */
  object DOUBLE_ARROW: ArrowStyleShape
  
  /**
   * An arrow with an arrow tip and a rectangular shaft that has a notch at the opposite side.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowStyleShape%23NOTCHED_ARROW">Online Documentation</a>
   */
  object NOTCHED_ARROW: ArrowStyleShape
  
  /**
   * An isosceles trapezoid.
   * 
   * Value - `3`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowStyleShape%23TRAPEZOID">Online Documentation</a>
   */
  object TRAPEZOID: ArrowStyleShape
  
  /**
   * A parallelogram.
   * 
   * Value - `4`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowStyleShape%23PARALLELOGRAM">Online Documentation</a>
   */
  object PARALLELOGRAM: ArrowStyleShape
}
