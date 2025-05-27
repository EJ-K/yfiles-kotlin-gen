// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

/**
 * Defines four cardinal directions: Up, Right, Down, and Left.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Direction">Online Documentation</a>
 */

sealed external class Direction {
  /**
   * Represents the upward direction.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Direction%23UP">Online Documentation</a>
   */
  object UP: Direction
  
  /**
   * Represents the rightward direction.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Direction%23RIGHT">Online Documentation</a>
   */
  object RIGHT: Direction
  
  /**
   * Represents the downward direction.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Direction%23DOWN">Online Documentation</a>
   */
  object DOWN: Direction
  
  /**
   * Represents the leftward direction.
   * 
   * Value - `3`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Direction%23LEFT">Online Documentation</a>
   */
  object LEFT: Direction
}
