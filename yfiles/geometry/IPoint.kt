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

/**
 * Interface for a point in 2D coordinate space with double precision coordinates.
 * @see [IMutablePoint]
 * @see [MutablePoint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPoint">Online Documentation</a>
 */
external interface IPoint  {
  /**
   * Gets the current x-coordinate of this point.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPoint%23x">Online Documentation</a>
   */
  val x: Double
  
  /**
   * Gets the current y-coordinate of this point.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPoint%23y">Online Documentation</a>
   */
  val y: Double
  
  /**
   * Calculates the Euclidean distance between two points.
   * @param [point2] The second point.
   * @return The distance between the two points.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPoint%23IPoint-defaultmethod-distanceTo(IPoint)">Online Documentation</a>
   */
  final fun distanceTo(
    point2: IPoint,
  ): Double = definedExternally
  
  /**
   * Returns the euclidean distance between this point and a given point.
   * @param [x] the x coordinate of the second point
   * @param [y] the y coordinate of the second point
   * @return the Euclidean distance between this point and the point (x,y).
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPoint%23IPoint-defaultmethod-distanceTo(number,number)">Online Documentation</a>
   */
  final fun distanceTo(
    x: Double,
    y: Double,
  ): Double = definedExternally
  
  /**
   * Creates a new [Point] instance with the same coordinates as this point.
   * @return The current values of the coordinates of the point.
   * @see [Point.toMutablePoint]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPoint%23IPoint-defaultmethod-toPoint">Online Documentation</a>
   */
  final fun toPoint(): Point = definedExternally

  
  companion object : InterfaceMetadata<IPoint> {
  }
}
