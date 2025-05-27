// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.geometry

import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * Interface for a point in 2D coordinate space with double precision coordinates.
 * @see [IMutablePoint]
 * @see [MutablePoint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPoint">Online Documentation</a>
 */
external interface IPoint : YObject {
/**
 * Gets the current x coordinate of this point.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPoint%23x">Online Documentation</a>
 */
val x: Double
/**
 * Gets the current y coordinate of this point.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPoint%23y">Online Documentation</a>
 */
val y: Double
/**
 * Calculates the Euclidean distance between two points.
 * @param [point2] The second point.
 * @return The distance between the two points.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPoint%23IPoint-defaultmethod-distanceTo">Online Documentation</a>
 */
  final  fun distanceTo( point2: IPoint ):Double = definedExternally
/**
 * Copies the current values of the coordinates of the point to a [Point] struct.
 * @return The current values of the coordinates of the point.
 * @see [Point.toMutablePoint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPoint%23IPoint-defaultmethod-toPoint">Online Documentation</a>
 */
  final  fun toPoint():Point = definedExternally

companion object : InterfaceMetadata<IPoint> {
}
}
