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
 * Defines the supported background shapes for [LabelStyle] instances.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelShape">Online Documentation</a>
 */

sealed external class LabelShape {
  /**
   * A rectangular shape.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelShape%23RECTANGLE">Online Documentation</a>
   */
  object RECTANGLE: LabelShape
  
  /**
   * A rectangular shape with rounded corners.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelShape%23ROUND_RECTANGLE">Online Documentation</a>
   */
  object ROUND_RECTANGLE: LabelShape
  
  /**
   * A rectangular shape with the shorter sides rounded.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelShape%23PILL">Online Documentation</a>
   */
  object PILL: LabelShape
  
  /**
   * A six-sided polygon with tips at the shorter sides.
   * 
   * Value - `3`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelShape%23HEXAGON">Online Documentation</a>
   */
  object HEXAGON: LabelShape
}
