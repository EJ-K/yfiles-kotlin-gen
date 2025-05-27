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
 * The different possible styles supported by [GridRenderer]'s [gridStyle][GridRenderer] property.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridStyle">Online Documentation</a>
 */

sealed external class GridStyle {
  /**
   * For each grid point, there is a small dot rendered.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridStyle%23DOTS">Online Documentation</a>
   */
  object DOTS: GridStyle
  
  /**
   * For each grid point, there is a small cross rendered.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridStyle%23CROSSES">Online Documentation</a>
   */
  object CROSSES: GridStyle
  
  /**
   * Draws horizontal and vertical lines through the grid points.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridStyle%23LINES">Online Documentation</a>
   */
  object LINES: GridStyle
  
  /**
   * Only horizontal lines are rendered.
   * 
   * Value - `3`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridStyle%23HORIZONTAL_LINES">Online Documentation</a>
   */
  object HORIZONTAL_LINES: GridStyle
  
  /**
   * Only vertical lines are rendered.
   * 
   * Value - `4`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridStyle%23VERTICAL_LINES">Online Documentation</a>
   */
  object VERTICAL_LINES: GridStyle
}
