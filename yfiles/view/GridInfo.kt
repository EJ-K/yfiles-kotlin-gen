// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.geometry.Point
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * This class describes a grid by providing the grid's origin as well as the horizontal and vertical spacing between the grid points.
 * @see [IGridConstraintProvider][yfiles.input.IGridConstraintProvider]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridInfo">Online Documentation</a>
 * 
 * @constructor Creates a new instance using the given horizontal and vertical grid spacing as well as the given origin.
 * @param [horizontalSpacing] The horizontal spacing between the grid points.
 * @param [verticalSpacing] The vertical spacing between the grid points.
 * @param [origin] The canonical origin of the grid.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridInfo%23GridInfo-constructor-GridInfo(number,number,Point)">Online Documentation</a>
 * 
 * @property horizontalSpacing
 * Gets or sets the horizontal spacing between grid points in the world coordinate system.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridInfo%23horizontalSpacing">Online Documentation</a>
 * 
 * @property verticalSpacing
 * Gets or sets the vertical spacing between grid points in the world coordinate system.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridInfo%23verticalSpacing">Online Documentation</a>
 * 
 * @property origin
 * Gets or sets the canonical origin of the grid.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridInfo%23origin">Online Documentation</a>
 */
external open class GridInfo  (
final var horizontalSpacing: Double,
final var verticalSpacing: Double,
final var origin: Point) : YObject {
/**
 * Creates a new instance using "25" as the grid spacing.
 * @param [spacing] The horizontal and vertical spacing between the grid points.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridInfo%23GridInfo-constructor-GridInfo(number)">Online Documentation</a>
 */
 constructor( spacing: Double  = definedExternally)

companion object : ClassMetadata<GridInfo> {
}
}
