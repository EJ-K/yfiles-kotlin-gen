// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

/**
 * Defines the direction of an edge segment
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSegmentDirection">Online Documentation</a>
 */

sealed external class EdgeSegmentDirection {
  /**
   * The edge segment is going upwards.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSegmentDirection%23UP">Online Documentation</a>
   */
  object UP: EdgeSegmentDirection
  
  /**
   * The edge segment is going to the right.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSegmentDirection%23RIGHT">Online Documentation</a>
   */
  object RIGHT: EdgeSegmentDirection
  
  /**
   * The edge segment is going downwards.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSegmentDirection%23DOWN">Online Documentation</a>
   */
  object DOWN: EdgeSegmentDirection
  
  /**
   * The edge segment is going to the left.
   * 
   * Value - `3`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSegmentDirection%23LEFT">Online Documentation</a>
   */
  object LEFT: EdgeSegmentDirection
}
