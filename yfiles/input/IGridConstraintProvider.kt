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
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * Interface for classes that can snap coordinates of items of a specific type to a grid.
 * @param [T] The type of the items this class can snap
 * @see [GridConstraintProvider]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGridConstraintProvider">Online Documentation</a>
 */
external interface IGridConstraintProvider<T : IModelItem> : YObject {
/**
 * Gets the canonical origin of the grid.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGridConstraintProvider%23gridOrigin">Online Documentation</a>
 */
val gridOrigin: Point
/**
 * Gets the canonical grid width in horizontal direction.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGridConstraintProvider%23horizontalGridWidth">Online Documentation</a>
 */
val horizontalGridWidth: Double
/**
 * Gets the canonical grid width in vertical direction.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGridConstraintProvider%23verticalGridWidth">Online Documentation</a>
 */
val verticalGridWidth: Double
/**
 * Performs the actual snapping to grid coordinates.
 * @param [context] The context in which the snapping should occur.
 * @param [item] The item of which the coordinates should be snapped.
 * @param [location] The coordinates to snap.
 * @param [xSnapPolicy] The policy for the x coordinate.
 * @param [ySnapPolicy] The policy for the y coordinate.
 * @return Whether the point has been snapped.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGridConstraintProvider%23IGridConstraintProvider-method-snapToGrid">Online Documentation</a>
 */
   fun snapToGrid( context: IInputModeContext ,
 item: T ,
 location: IMutablePoint ,
 xSnapPolicy: SnapPolicy ,
 ySnapPolicy: SnapPolicy ):Boolean

companion object : InterfaceMetadata<IGridConstraintProvider<*>> {
}
}
