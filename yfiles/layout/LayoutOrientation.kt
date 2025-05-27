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
 * Specifies the orientation of a graph layout.
 * @see [OrientationStage]
 * @see [OrientationStage.mirroredOrientations]
 * @see [OrientationStage.orientation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutOrientation">Online Documentation</a>
 */

sealed external class LayoutOrientation {
  /**
   * Orientation specifier which defines that the main layout orientation is from top to bottom.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutOrientation%23TOP_TO_BOTTOM">Online Documentation</a>
   */
  object TOP_TO_BOTTOM: LayoutOrientation
  
  /**
   * Orientation specifier which defines that the main layout orientation is from left to right.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutOrientation%23LEFT_TO_RIGHT">Online Documentation</a>
   */
  object LEFT_TO_RIGHT: LayoutOrientation
  
  /**
   * Orientation specifier which defines that the main layout orientation is from bottom to top.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutOrientation%23BOTTOM_TO_TOP">Online Documentation</a>
   */
  object BOTTOM_TO_TOP: LayoutOrientation
  
  /**
   * Orientation specifier which defines that the main layout orientation is from right to left.
   * 
   * Value - `3`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutOrientation%23RIGHT_TO_LEFT">Online Documentation</a>
   */
  object RIGHT_TO_LEFT: LayoutOrientation
}
