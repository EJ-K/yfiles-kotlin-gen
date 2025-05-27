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
 * The possible icon types for the collapse/expand icon of a [GroupNodeStyle] instance.
 * @see [GroupNodeStyle.groupIcon]
 * @see [GroupNodeStyle.folderIcon]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleIconType">Online Documentation</a>
 */

sealed external class GroupNodeStyleIconType {
  /**
   * Indicates no icon at all.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleIconType%23NONE">Online Documentation</a>
   */
  object NONE: GroupNodeStyleIconType
  
  /**
   * Indicates a chevron that points upwards.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleIconType%23CHEVRON_UP">Online Documentation</a>
   */
  object CHEVRON_UP: GroupNodeStyleIconType
  
  /**
   * Indicates a chevron that points downwards.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleIconType%23CHEVRON_DOWN">Online Documentation</a>
   */
  object CHEVRON_DOWN: GroupNodeStyleIconType
  
  /**
   * Indicates a chevron that points to the left.
   * 
   * Value - `3`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleIconType%23CHEVRON_LEFT">Online Documentation</a>
   */
  object CHEVRON_LEFT: GroupNodeStyleIconType
  
  /**
   * Indicates a chevron that points to the right.
   * 
   * Value - `4`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleIconType%23CHEVRON_RIGHT">Online Documentation</a>
   */
  object CHEVRON_RIGHT: GroupNodeStyleIconType
  
  /**
   * Indicates a triangle that points upwards.
   * 
   * Value - `5`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleIconType%23TRIANGLE_UP">Online Documentation</a>
   */
  object TRIANGLE_UP: GroupNodeStyleIconType
  
  /**
   * Indicates a triangle that points downwards.
   * 
   * Value - `6`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleIconType%23TRIANGLE_DOWN">Online Documentation</a>
   */
  object TRIANGLE_DOWN: GroupNodeStyleIconType
  
  /**
   * Indicates a triangle that points to the left.
   * 
   * Value - `7`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleIconType%23TRIANGLE_LEFT">Online Documentation</a>
   */
  object TRIANGLE_LEFT: GroupNodeStyleIconType
  
  /**
   * Indicates a triangle that points to the right.
   * 
   * Value - `8`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleIconType%23TRIANGLE_RIGHT">Online Documentation</a>
   */
  object TRIANGLE_RIGHT: GroupNodeStyleIconType
  
  /**
   * Indicates a plus sign.
   * 
   * Value - `9`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleIconType%23PLUS">Online Documentation</a>
   */
  object PLUS: GroupNodeStyleIconType
  
  /**
   * Indicates a minus sign.
   * 
   * Value - `10`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleIconType%23MINUS">Online Documentation</a>
   */
  object MINUS: GroupNodeStyleIconType
}
