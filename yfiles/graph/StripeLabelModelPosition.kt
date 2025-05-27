// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

/**
 * Enumeration of the possible positions of the [StripeLabelModel].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelModelPosition">Online Documentation</a>
 */

sealed external class StripeLabelModelPosition {
  /**
   * Encodes a position at the top header of a table column.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelModelPosition%23TOP">Online Documentation</a>
   */
  object TOP: StripeLabelModelPosition
  
  /**
   * Encodes a position at the right header of a table row.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelModelPosition%23RIGHT">Online Documentation</a>
   */
  object RIGHT: StripeLabelModelPosition
  
  /**
   * Encodes a position at the bottom header of a table column.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelModelPosition%23BOTTOM">Online Documentation</a>
   */
  object BOTTOM: StripeLabelModelPosition
  
  /**
   * Encodes a position at the left header of a table row.
   * 
   * Value - `3`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeLabelModelPosition%23LEFT">Online Documentation</a>
   */
  object LEFT: StripeLabelModelPosition
}
