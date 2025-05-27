// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.geometry.GeneralPath
import yfiles.geometry.Point
import yfiles.lang.InterfaceMetadata

/**
 * Interface that describes the geometry of a shape which has an interior and an exterior.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IShapeGeometry">Online Documentation</a>
 */
external interface IShapeGeometry  {
  /**
   * Returns the intersection for the given line with this shape's geometry.
   * @param [inner] The first point of the line that is inside the shape.
   * @param [outer] The second point of the line that is outside the shape.
   * @return The coordinates of the intersection point, if an intersection was found.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IShapeGeometry%23IShapeGeometry-method-getIntersection">Online Documentation</a>
   */
  fun getIntersection(
    inner: Point,
    outer: Point,
  ): Point?
  
  /**
   * Returns the outline of the shape or `null`.
   * @return The outline or `null` if no outline can be provided.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IShapeGeometry%23IShapeGeometry-method-getOutline">Online Documentation</a>
   */
  fun getOutline(): GeneralPath?
  
  /**
   * Checks whether the given coordinate is deemed to lie within the shape's geometric bounds.
   * @param [location] The point to test.
   * @return `true` if the point lies within the shape.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IShapeGeometry%23IShapeGeometry-method-isInside">Online Documentation</a>
   */
  fun isInside(
    location: Point,
  ): Boolean

  
  companion object : InterfaceMetadata<IShapeGeometry> {
    /**
     * A void implementation of the [IShapeGeometry] interface that does nothing and behaves like an empty geometry.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IShapeGeometry%23VOID_SHAPE_GEOMETRY">Online Documentation</a>
     */
     val VOID_SHAPE_GEOMETRY: IShapeGeometry
  }
}
