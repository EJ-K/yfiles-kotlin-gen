// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.lang.YFlags

/**
 * The values of this enum describe to which grid elements an object shall snap.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridSnapTypes">Online Documentation</a>
 */

external class GridSnapTypes private constructor(): YFlags<GridSnapTypes> {
  companion object {
    /**
     * There is no grid snapping at all.
     * 
     * Value - `0`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridSnapTypes%23NONE">Online Documentation</a>
     */
    val NONE: GridSnapTypes
    
    /**
     * Elements shall be snapped to horizontal grid lines.
     * 
     * Value - `1`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridSnapTypes%23HORIZONTAL_LINES">Online Documentation</a>
     */
    val HORIZONTAL_LINES: GridSnapTypes
    
    /**
     * Elements shall be snapped to vertical grid lines.
     * 
     * Value - `2`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridSnapTypes%23VERTICAL_LINES">Online Documentation</a>
     */
    val VERTICAL_LINES: GridSnapTypes
    
    /**
     * Elements shall be snapped to horizontal and vertical grid lines.
     * 
     * Value - `3`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridSnapTypes%23LINES">Online Documentation</a>
     */
    val LINES: GridSnapTypes
    
    /**
     * Elements shall be snapped to grid points.
     * 
     * Value - `4`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridSnapTypes%23GRID_POINTS">Online Documentation</a>
     */
    val GRID_POINTS: GridSnapTypes
    
    /**
     * Elements shall be snapped to horizontal and vertical grid lines as well as to grid points.
     * 
     * Value - `7`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridSnapTypes%23ALL">Online Documentation</a>
     */
    val ALL: GridSnapTypes
  }
}
