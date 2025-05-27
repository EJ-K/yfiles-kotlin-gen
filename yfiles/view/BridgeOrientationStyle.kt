// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

/**
 * Specifies constants that define the direction in which bridges are drawn.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeOrientationStyle">Online Documentation</a>
 */

sealed external class BridgeOrientationStyle {
  /**
   * The bridge is drawn to the right of the flow of the path.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeOrientationStyle%23FLOW_RIGHT">Online Documentation</a>
   */
  object FLOW_RIGHT: BridgeOrientationStyle
  
  /**
   * The bridge is drawn to the left of the flow of the path.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeOrientationStyle%23FLOW_LEFT">Online Documentation</a>
   */
  object FLOW_LEFT: BridgeOrientationStyle
  
  /**
   * The bridge is drawn in the direction of the positive axes.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeOrientationStyle%23POSITIVE">Online Documentation</a>
   */
  object POSITIVE: BridgeOrientationStyle
  
  /**
   * The bridge is drawn in the direction of the negative axes.
   * 
   * Value - `3`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeOrientationStyle%23NEGATIVE">Online Documentation</a>
   */
  object NEGATIVE: BridgeOrientationStyle
  
  /**
   * The bridge points to the right.
   * 
   * Value - `4`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeOrientationStyle%23LEFT">Online Documentation</a>
   */
  object LEFT: BridgeOrientationStyle
  
  /**
   * The bridge points to the left.
   * 
   * Value - `5`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeOrientationStyle%23RIGHT">Online Documentation</a>
   */
  object RIGHT: BridgeOrientationStyle
  
  /**
   * The bridge points upwards.
   * 
   * Value - `6`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeOrientationStyle%23UP">Online Documentation</a>
   */
  object UP: BridgeOrientationStyle
  
  /**
   * The bridge points downwards.
   * 
   * Value - `7`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeOrientationStyle%23DOWN">Online Documentation</a>
   */
  object DOWN: BridgeOrientationStyle
}
