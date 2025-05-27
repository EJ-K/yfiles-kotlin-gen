// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.IMutablePoint
import yfiles.geometry.Point
import yfiles.graph.IModelItem
import yfiles.lang.ClassMetadata
import yfiles.view.GridInfo

/**
 * A simple integer based implementation of [IGridConstraintProvider].
 * @param [T] The type of the items.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridConstraintProvider">Online Documentation</a>
 * 
 * @constructor Creates a new instance using the given grid distances.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridConstraintProvider%23GridConstraintProvider-constructor-GridConstraintProvider(number)">Online Documentation</a>
 */
external open class GridConstraintProvider<T : IModelItem>  ( gridSize: Double ) : IGridConstraintProvider<T> {
/**
 * Creates a new instance using the given grid info.
 * @param [gridInfo] The grid info object.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridConstraintProvider%23GridConstraintProvider-constructor-GridConstraintProvider(GridInfo)">Online Documentation</a>
 */
 constructor( gridInfo: GridInfo )
/**
 * Creates a new instance using the given grid specification.
 * @param [gridWidth] Width of the grid.
 * @param [gridHeight] Height of the grid.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridConstraintProvider%23GridConstraintProvider-constructor-GridConstraintProvider(number,number)">Online Documentation</a>
 */
 constructor( gridWidth: Double ,
 gridHeight: Double )

/**
 * Gets or sets the grid info that describes the geometry of the grid.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridConstraintProvider%23gridInfo">Online Documentation</a>
 */
final var gridInfo: GridInfo
/**
 * Gets the grid origin.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridConstraintProvider%23gridOrigin">Online Documentation</a>
 */
final override val gridOrigin: Point
/**
 * Gets the grid height.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridConstraintProvider%23horizontalGridWidth">Online Documentation</a>
 */
final override val horizontalGridWidth: Double
/**
 * Gets the grid width.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridConstraintProvider%23verticalGridWidth">Online Documentation</a>
 */
final override val verticalGridWidth: Double
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GridConstraintProvider%23GridConstraintProvider-method-snapToGrid">Online Documentation</a>
 */
 override   fun snapToGrid( context: IInputModeContext ,
 item: T ,
 location: IMutablePoint ,
 xSnapPolicy: SnapPolicy ,
 ySnapPolicy: SnapPolicy ):Boolean

companion object : ClassMetadata<GridConstraintProvider<*>> {
}
}
