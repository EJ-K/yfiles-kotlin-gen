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
 * The possible shape types for the background of the collapse/expand icon of a [GroupNodeStyle] instance.
 * @see [GroupNodeStyle.iconBackgroundShape]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleIconBackgroundShape">Online Documentation</a>
 */

sealed external class GroupNodeStyleIconBackgroundShape {
  /**
   * Indicates no background at all.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleIconBackgroundShape%23NONE">Online Documentation</a>
   */
  object NONE: GroupNodeStyleIconBackgroundShape
  
  /**
   * Indicates a circular frame.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleIconBackgroundShape%23CIRCLE">Online Documentation</a>
   */
  object CIRCLE: GroupNodeStyleIconBackgroundShape
  
  /**
   * Indicates a filled circle.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleIconBackgroundShape%23CIRCLE_SOLID">Online Documentation</a>
   */
  object CIRCLE_SOLID: GroupNodeStyleIconBackgroundShape
  
  /**
   * Indicates a square frame.
   * 
   * Value - `3`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleIconBackgroundShape%23SQUARE">Online Documentation</a>
   */
  object SQUARE: GroupNodeStyleIconBackgroundShape
  
  /**
   * Indicates a filled square.
   * 
   * Value - `4`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleIconBackgroundShape%23SQUARE_SOLID">Online Documentation</a>
   */
  object SQUARE_SOLID: GroupNodeStyleIconBackgroundShape
  
  /**
   * Indicates a rounded rectangular frame.
   * 
   * Value - `5`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleIconBackgroundShape%23ROUND_RECTANGLE">Online Documentation</a>
   */
  object ROUND_RECTANGLE: GroupNodeStyleIconBackgroundShape
  
  /**
   * Indicates a filled rounded rectangle.
   * 
   * Value - `6`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleIconBackgroundShape%23ROUND_RECTANGLE_SOLID">Online Documentation</a>
   */
  object ROUND_RECTANGLE_SOLID: GroupNodeStyleIconBackgroundShape
}
