// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.IOrientedRectangle
import yfiles.geometry.IPoint
import yfiles.geometry.IRectangle

/**
 * Provides implementations of [ILassoTestable].
 * @see [ALWAYS]
 * @see [NEVER]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoTestables">Online Documentation</a>
 */
external object LassoTestables {
/**
 * An implementation that always yields `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoTestables%23ALWAYS">Online Documentation</a>
 */
 val ALWAYS: ILassoTestable
/**
 * An implementation that always yields `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoTestables%23NEVER">Online Documentation</a>
 */
 val NEVER: ILassoTestable
/**
 * Creates an implementation of the [ILassoTestable] interface that tests if the `orientedRectangle` intersects the area of the lasso path.
 * @param [orientedRectangle] The oriented rectangle to check.
 * @return An implementation of [ILassoTestable] for the oriented rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoTestables%23LassoTestables-method-fromOrientedRectangle">Online Documentation</a>
 */
 final   fun fromOrientedRectangle( orientedRectangle: IOrientedRectangle ):ILassoTestable
/**
 * Creates an implementation of the [ILassoTestable] interface that tests if the `point` is [contained][yfiles.geometry.GeneralPath.areaContains] in the lasso path.
 * @param [point] The point to check.
 * @return An implementation of [ILassoTestable] for the point.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoTestables%23LassoTestables-method-fromPoint">Online Documentation</a>
 */
 final   fun fromPoint( point: IPoint ):ILassoTestable
/**
 * Creates an implementation of the [ILassoTestable] interface that tests if the `rectangle` intersects the area of the lasso path.
 * @param [rectangle] The rectangle to check.
 * @return An implementation of [ILassoTestable] for the rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoTestables%23LassoTestables-method-fromRectangle">Online Documentation</a>
 */
 final   fun fromRectangle( rectangle: IRectangle ):ILassoTestable
}
