// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * The different possible styles supported by [GridVisualCreator]'s [GridVisualCreator.gridStyle] property.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridStyle">Online Documentation</a>
 */
external sealed class GridStyle: YEnum<GridStyle> {
   companion object: EnumMetadata<GridStyle> {
       /**
 * For each grid point, there is a small dot rendered.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridStyle%23DOTS">Online Documentation</a>
 */
val DOTS: GridStyle

/**
 * For each grid point, there is a small cross rendered.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridStyle%23CROSSES">Online Documentation</a>
 */
val CROSSES: GridStyle

/**
 * Draws horizontal and vertical lines through the grid points.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridStyle%23LINES">Online Documentation</a>
 */
val LINES: GridStyle

/**
 * Only horizontal lines are rendered.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridStyle%23HORIZONTAL_LINES">Online Documentation</a>
 */
val HORIZONTAL_LINES: GridStyle

/**
 * Only vertical lines are rendered.
 * 
 * Value - `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridStyle%23VERTICAL_LINES">Online Documentation</a>
 */
val VERTICAL_LINES: GridStyle
   }
}
