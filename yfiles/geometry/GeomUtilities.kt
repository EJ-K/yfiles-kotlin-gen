// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.geometry

/**
 * Provides methods for geometric operations.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeomUtilities">Online Documentation</a>
 */
external object GeomUtilities {
/**
 * Checks whether an ellipse contains the given point.
 * @receiver The coordinates of the bounds of the ellipse's enclosing rectangle.
 * @param [point] The coordinates of the point to test.
 * @param [eps] A positive value allows for fuzzy hit testing. If the point lies outside the given object but it's distance is less than or equal to that value, it will be considered a hit.
 * @return Whether the point lies within the ellipse
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeomUtilities%23GeomUtilities-method-ellipseContains">Online Documentation</a>
 */
 final   fun Rect.ellipseContains( point: Point ,
 eps: Double ):Boolean
/**
 * Returns the ellipse/line intersection point for the given point pair.
 * @receiver The coordinates of the bounds of the ellipse's enclosing rectangle.
 * @param [inner] The coordinates of a point lying inside the ellipse.
 * @param [outer] The coordinates of a point lying outside the ellipse.
 * @return The intersection point iff the inner point lies inside the ellipse and an intersection point has been found, otherwise `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeomUtilities%23GeomUtilities-method-findEllipseLineIntersection">Online Documentation</a>
 */
 final   fun Rect.findEllipseLineIntersection( inner: Point ,
 outer: Point ):Point?
/**
 * Finds the intersection between a line segment and an infinite ray.
 * @param [start] The coordinates of the first end point of the line segment.
 * @param [end] The coordinates of the second end point of the line segment.
 * @param [anchor] The coordinates of the starting point of the ray.
 * @param [rayDirection] The direction vector of the ray.
 * @return The distance factor or [Double.POSITIVE_INFINITY] if the ray does not intersect the line.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeomUtilities%23GeomUtilities-method-findRayIntersection">Online Documentation</a>
 */
 final   fun findRayIntersection( start: Point ,
 end: Point ,
 anchor: Point ,
 rayDirection: Point ):Double
}
