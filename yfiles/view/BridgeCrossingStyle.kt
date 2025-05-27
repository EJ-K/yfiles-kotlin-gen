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
 * Specifies constants that define the style of how bridges are drawn by [BridgeManager].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeCrossingStyle">Online Documentation</a>
 */

sealed external class BridgeCrossingStyle {
  /**
   * A gap in the path.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeCrossingStyle%23GAP">Online Documentation</a>
   */
  object GAP: BridgeCrossingStyle
  
  /**
   * A rectangular bridge will be inserted in the path.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeCrossingStyle%23RECTANGLE">Online Documentation</a>
   */
  object RECTANGLE: BridgeCrossingStyle
  
  /**
   * A rectangular bridge with a fixed aspect ratio will be inserted in the path.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeCrossingStyle%23RECTANGLE_SCALED">Online Documentation</a>
   */
  object RECTANGLE_SCALED: BridgeCrossingStyle
  
  /**
   * A triangular bridge will be inserted in the path.
   * 
   * Value - `3`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeCrossingStyle%23TWO_SIDES">Online Documentation</a>
   */
  object TWO_SIDES: BridgeCrossingStyle
  
  /**
   * A triangular bridge with a fixed aspect ratio will be inserted in the path.
   * 
   * Value - `4`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeCrossingStyle%23TWO_SIDES_SCALED">Online Documentation</a>
   */
  object TWO_SIDES_SCALED: BridgeCrossingStyle
  
  /**
   * A bridge, consisting of two quarter circle arcs connected by a straight line, will be inserted in the path.
   * 
   * Value - `5`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeCrossingStyle%23ARC">Online Documentation</a>
   */
  object ARC: BridgeCrossingStyle
  
  /**
   * A semi-circle bridge will be inserted in the path.
   * 
   * Value - `6`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeCrossingStyle%23ARC_SCALED">Online Documentation</a>
   */
  object ARC_SCALED: BridgeCrossingStyle
  
  /**
   * Inserts a custom bridge into the path.
   * 
   * Value - `7`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BridgeCrossingStyle%23CUSTOM">Online Documentation</a>
   */
  object CUSTOM: BridgeCrossingStyle
}
