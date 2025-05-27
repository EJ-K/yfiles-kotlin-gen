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
 * Interface for oriented rectangles in 2D coordinate space with double precision coordinates.
 * @see [ISize]
 * @see [IRectangle]
 * @see [OrientedRectangle]
 * @see [MutableRectangle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOrientedRectangle">Online Documentation</a>
 */
external interface IOrientedRectangle : ISize {
  /**
   * Gets the anchor location of the oriented rectangle as [Point].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOrientedRectangle%23anchor">Online Documentation</a>
   */
  final val anchor: Point
  
  /**
   * Gets the x-coordinate of the anchor of the oriented rectangle.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOrientedRectangle%23anchorX">Online Documentation</a>
   */
  val anchorX: Double
  
  /**
   * Gets the y-coordinate of the anchor of the oriented rectangle.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOrientedRectangle%23anchorY">Online Documentation</a>
   */
  val anchorY: Double
  
  /**
   * Determines the bounds of an oriented rectangle.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOrientedRectangle%23bounds">Online Documentation</a>
   */
  final val bounds: Rect
  
  /**
   * Gets the current center of the oriented rectangle as [Point].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOrientedRectangle%23center">Online Documentation</a>
   */
  final val center: Point
  
  /**
   * Gets the up vector of the oriented rectangle as [Point].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOrientedRectangle%23upVector">Online Documentation</a>
   */
  final val upVector: Point
  
  /**
   * Gets the x value of the up vector.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOrientedRectangle%23upX">Online Documentation</a>
   */
  val upX: Double
  
  /**
   * Gets the y value of the up vector.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOrientedRectangle%23upY">Online Documentation</a>
   */
  val upY: Double
  
  /**
   * Determines whether the given oriented rectangle contains the provided point, using an epsilon value.
   * @param [point] The coordinates of the point to test.
   * @param [eps] A positive value allows for fuzzy hit testing. If the point lies outside the given object but its distance is less than or equal to that value, it will be considered a hit.
   * @return `true` iff the point lies inside the rectangle.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOrientedRectangle%23IOrientedRectangle-defaultmethod-contains">Online Documentation</a>
   */
  final fun contains(
    point: IPoint,
    eps: Double,
  ): Boolean = definedExternally
  
  /**
   * Creates an enlarged instance that is the same as this one but enlarged by the specified padding.
   * @param [padding] The padding to use to add to the instance.
   * @return A new [OrientedRectangle] instance which is enlarged by the given `padding`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOrientedRectangle%23IOrientedRectangle-defaultmethod-getEnlarged">Online Documentation</a>
   */
  final fun getEnlarged(
    padding: Insets,
  ): OrientedRectangle = definedExternally
  
  /**
   * Creates an enlarged instance that is the same as this one but enlarged by the specified padding.
   * @param [padding] The padding to use to add to the instance.
   * @return A new [OrientedRectangle] instance which is enlarged by the given `padding`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOrientedRectangle%23IOrientedRectangle-defaultmethod-getEnlarged">Online Documentation</a>
   */
  @JsName("getEnlarged")
  final operator fun plus(
    padding: Insets,
  ): OrientedRectangle = definedExternally
  
  /**
   * Determines an intersection point of the given oriented rectangle and the line segment specified by the given endpoints.
   * @param [lineP1] The first endpoint of the line segment.
   * @param [lineP2] The second endpoint of the line segment.
   * @param [eps] A positive value allows for fuzzy hit testing. The rectangle will be enlarged by the given value (or reduced in size by a negative value), so that an intersection point that otherwise would not be found may be returned.
   * @return An intersection point of the given oriented rectangle and the specified line segment or `null` if the rectangle and the segment do not intersect.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOrientedRectangle%23IOrientedRectangle-defaultmethod-intersectionPoint">Online Documentation</a>
   */
  final fun intersectionPoint(
    lineP1: Point,
    lineP2: Point,
    eps: Double,
  ): Point? = definedExternally
  
  /**
   * Determines whether an [OrientedRectangle] intersects another one.
   * @param [rect2] The second oriented rectangle to test.
   * @param [eps] A positive value allows for fuzzy hit testing. If the point lies outside the given object but its distance is less than or equal to that value, it will be considered a hit.
   * @return `true` if the rectangles intersect and `false` otherwise.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOrientedRectangle%23IOrientedRectangle-defaultmethod-intersects(IOrientedRectangle,number)">Online Documentation</a>
   */
  final fun intersects(
    rect2: IOrientedRectangle,
    eps: Double,
  ): Boolean = definedExternally
  
  /**
   * Determines whether the given oriented rectangle and the line segment defined by the two given points intersect.
   * @param [lineP1] The first point defining the line segment.
   * @param [lineP2] The second point defining the line segment.
   * @param [eps] A positive value allows for fuzzy hit testing. If the point lies outside the given object but its distance is less than or equal to that value, it will be considered a hit.
   * @return `true` if the rectangle and the line segment intersect and `false` otherwise.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOrientedRectangle%23IOrientedRectangle-defaultmethod-intersects(Point,Point,number)">Online Documentation</a>
   */
  final fun intersects(
    lineP1: Point,
    lineP2: Point,
    eps: Double,
  ): Boolean = definedExternally
  
  /**
   * Creates an [OrientedRectangle] from a given [IOrientedRectangle].
   * @return The [OrientedRectangle].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOrientedRectangle%23IOrientedRectangle-defaultmethod-toOrientedRectangle">Online Documentation</a>
   */
  final fun toOrientedRectangle(): OrientedRectangle = definedExternally

  
  companion object : InterfaceMetadata<IOrientedRectangle> {
    /**
     * An immutable empty [IOrientedRectangle] with width and height of `-1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IOrientedRectangle%23EMPTY">Online Documentation</a>
     */
     val EMPTY: IOrientedRectangle
  }
}
