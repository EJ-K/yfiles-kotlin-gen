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
 * Enumeration used by [NavigationInputMode] to determine the direction of the search for items to navigate to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveFocusDirection">Online Documentation</a>
 */

sealed external class MoveFocusDirection {
  /**
   * No direction.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveFocusDirection%23NONE">Online Documentation</a>
   */
  object NONE: MoveFocusDirection
  
  /**
   * In the direction of the negative x-axis.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveFocusDirection%23LEFT">Online Documentation</a>
   */
  object LEFT: MoveFocusDirection
  
  /**
   * In the direction of the positive x-axis.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveFocusDirection%23RIGHT">Online Documentation</a>
   */
  object RIGHT: MoveFocusDirection
  
  /**
   * In the direction of the negative y-axis.
   * 
   * Value - `3`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveFocusDirection%23UP">Online Documentation</a>
   */
  object UP: MoveFocusDirection
  
  /**
   * In the direction of the positive y-axis.
   * 
   * Value - `4`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveFocusDirection%23DOWN">Online Documentation</a>
   */
  object DOWN: MoveFocusDirection
  
  /**
   * In the direction of the [parent][yfiles.graph.IGraph] in the grouped graph.
   * 
   * Value - `5`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveFocusDirection%23PARENT">Online Documentation</a>
   */
  object PARENT: MoveFocusDirection
  
  /**
   * In the direction of the [children][yfiles.graph.IGraph] in the grouped graph.
   * 
   * Value - `6`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveFocusDirection%23CHILD">Online Documentation</a>
   */
  object CHILD: MoveFocusDirection
}
