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
 * Enumeration of the possible positions of the [StretchStripeLabelModel].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StretchStripeLabelModelPosition">Online Documentation</a>
 */

sealed external class StretchStripeLabelModelPosition {
  /**
   * Encodes a position at the top header of a table column.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StretchStripeLabelModelPosition%23TOP">Online Documentation</a>
   */
  object TOP: StretchStripeLabelModelPosition
  
  /**
   * Encodes a position at the right header of a table row.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StretchStripeLabelModelPosition%23RIGHT">Online Documentation</a>
   */
  object RIGHT: StretchStripeLabelModelPosition
  
  /**
   * Encodes a position at the bottom header of a table column.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StretchStripeLabelModelPosition%23BOTTOM">Online Documentation</a>
   */
  object BOTTOM: StretchStripeLabelModelPosition
  
  /**
   * Encodes a position at the left header of a table row.
   * 
   * Value - `3`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StretchStripeLabelModelPosition%23LEFT">Online Documentation</a>
   */
  object LEFT: StretchStripeLabelModelPosition
}
