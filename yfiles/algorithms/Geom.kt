// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

/**
 * This class provides useful geometric primitives and advanced geometric algorithms.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Geom">Online Documentation</a>
 */
external object Geom {
/**
 * Calculates the convex hull for a set of points.
 * @param [points] a list of [YPoint] objects
 * @return a list of [YPoint] objects that constitute the convex hull of the given points. The list contains points in counter clockwise order around the hull. The first point is the one with the smallest `x` coordinate. If two such points exist then of these points the one with the smallest `y` coordinate is chosen as the first one.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Geom%23Geom-method-calcConvexHull">Online Documentation</a>
 */
 final   fun calcConvexHull( points: YList<YPoint> ):YList<YPoint>
/**
 * Intersects the pair of specified source `Rectangle2D` objects and puts the result into the specified destination `Rectangle2D` object.
 * @param [r1] the first of a pair of `Rectangle2D` objects to be intersected with each other
 * @param [r2] the second of a pair of `Rectangle2D` objects to be intersected with each other
 * @param [dest] the `Rectangle2D` that holds the results of the intersection of `r1` and `r2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Geom%23Geom-method-calcIntersection(Rectangle2D,Rectangle2D,Rectangle2D)">Online Documentation</a>
 */
 final   fun calcIntersection( r1: Rectangle2D ,
 r2: Rectangle2D ,
 dest: Rectangle2D ):Rectangle2D?
/**
 * Calculates the intersection point of two affine lines.
 * @param [p1] origin point of the first line.
 * @param [d1] direction vector of the first line.
 * @param [p2] origin point of the second line.
 * @param [d2] direction vector of the second line.
 * @return the intersection point of the specified lines or `null` if there is no intersection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Geom%23Geom-method-calcIntersection(YPoint,YVector,YPoint,YVector)">Online Documentation</a>
 */
 final   fun calcIntersection( p1: YPoint ,
 d1: YVector ,
 p2: YPoint ,
 d2: YVector ):YPoint?
/**
 * Calculates the intersection point of two **affine** lines.
 * @param [p1] one point on the first line.
 * @param [p2] another point on the first line.
 * @param [p3] one point on the second line.
 * @param [p4] another point on the second line.
 * @return the intersection point of the specified lines or `null` if there is no intersection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Geom%23Geom-method-calcIntersection(YPoint,YPoint,YPoint,YPoint)">Online Documentation</a>
 */
 final   fun calcIntersection( p1: YPoint ,
 p2: YPoint ,
 p3: YPoint ,
 p4: YPoint ):YPoint?
/**
 * Calculates the intersection point of two **affine** lines.
 * @param [x1] x-coordinate of one point on the first line.
 * @param [y1] y-coordinate of one point on the first line.
 * @param [x2] x-coordinate of another point on the first line.
 * @param [y2] y-coordinate of another point on the first line.
 * @param [x3] x-coordinate of one point on the second line.
 * @param [y3] y-coordinate of one point on the second line.
 * @param [x4] x-coordinate of another point on the second line.
 * @param [y4] y-coordinate of another point on the second line.
 * @return the intersection point of the specified lines or `null` if there is no intersection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Geom%23Geom-method-calcIntersection(number,number,number,number,number,number,number,number)">Online Documentation</a>
 */
 final   fun calcIntersection( x1: Double ,
 y1: Double ,
 x2: Double ,
 y2: Double ,
 x3: Double ,
 y3: Double ,
 x4: Double ,
 y4: Double ):YPoint?
/**
 * Unions the pair of source `Rectangle2D` objects and puts the result into the specified destination `Rectangle2D` object.
 * @param [r1] the first of a pair of `Rectangle2D` objects to be combined with each other
 * @param [r2] the second of a pair of `Rectangle2D` objects to be combined with each other
 * @param [dest] the `Rectangle2D` that holds the results of the union of `r1` and `r2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Geom%23Geom-method-calcUnion">Online Documentation</a>
 */
 final   fun calcUnion( r1: Rectangle2D ,
 r2: Rectangle2D ,
 dest: Rectangle2D ):Rectangle2D
/**
 * Returns `true` iff the given points are collinear, that is, all three points lie on a common line.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Geom%23Geom-method-collinear">Online Documentation</a>
 */
 final   fun collinear( p: YPoint ,
 q: YPoint ,
 r: YPoint ):Boolean
/**
 * Determines the distance of the point `p` to the line segment `[l1, l2]`.
 * @param [pointX] the x coordinate of p
 * @param [pointY] the y coordinate of p
 * @param [lineX1] the x coordinate of l1
 * @param [lineY1] the y coordinate of l1
 * @param [lineX2] the x coordinate of l2
 * @param [lineY2] the y coordinate of l2
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Geom%23Geom-method-distanceToLineSegment">Online Documentation</a>
 */
 final   fun distanceToLineSegment( pointX: Double ,
 pointY: Double ,
 lineX1: Double ,
 lineY1: Double ,
 lineX2: Double ,
 lineY2: Double ):Double
/**
 * Same as [orientation(p,q,r) > 0][orientation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Geom%23Geom-method-leftTurn">Online Documentation</a>
 */
 final   fun leftTurn( p: YPoint ,
 q: YPoint ,
 r: YPoint ):Boolean
/**
 * Returns whether the two lines defined by the given coordinates intersect or not.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Geom%23Geom-method-linesIntersect">Online Documentation</a>
 */
 final   fun linesIntersect( x1: Double ,
 y1: Double ,
 x2: Double ,
 y2: Double ,
 x3: Double ,
 y3: Double ,
 x4: Double ,
 y4: Double ):Boolean
/**
 * Returns the orientation of point `r` relative to the directed line from point `p` to point `q`.
 * @return **+1** in the case of positive orientation, **-1** in the case of negative orientation and **0** in the case of zero orientation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Geom%23Geom-method-orientation(YPoint,YPoint,YPoint)">Online Documentation</a>
 */
 final   fun orientation( p: YPoint ,
 q: YPoint ,
 r: YPoint ):Int
/**
 * Same as [orientation] with double values as arguments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Geom%23Geom-method-orientation(number,number,number,number,number,number)">Online Documentation</a>
 */
 final   fun orientation( px: Double ,
 py: Double ,
 qx: Double ,
 qy: Double ,
 rx: Double ,
 ry: Double ):Int
/**
 * Determines the projection of the point `p` onto the line segment `[l1, l2]`.
 * @param [pointX] the x coordinate of p
 * @param [pointY] the y coordinate of p
 * @param [lineX1] the x coordinate of l1
 * @param [lineY1] the y coordinate of l1
 * @param [lineX2] the x coordinate of l2
 * @param [lineY2] the y coordinate of l2
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Geom%23Geom-method-projection">Online Documentation</a>
 */
 final   fun projection( pointX: Double ,
 pointY: Double ,
 lineX1: Double ,
 lineY1: Double ,
 lineX2: Double ,
 lineY2: Double ):YPoint
/**
 * Same as [orientation(p,q,r) < 0][orientation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Geom%23Geom-method-rightTurn">Online Documentation</a>
 */
 final   fun rightTurn( p: YPoint ,
 q: YPoint ,
 r: YPoint ):Boolean
/**
 * Returns +1 if point `d` lies left of the directed circle through points `a`, `b`, and `c`, 0 if `a,b,c` and `d` are cocircular, and -1 otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Geom%23Geom-method-sideOfCircle">Online Documentation</a>
 */
 final   fun sideOfCircle( a: YPoint ,
 b: YPoint ,
 c: YPoint ,
 d: YPoint ):Int
/**
 * Converts the given degree value from radian to angular
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Geom%23Geom-method-toDegrees">Online Documentation</a>
 */
 final   fun toDegrees( angrad: Double ):Double
/**
 * Converts the given degree value from angular to radian.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Geom%23Geom-method-toRadians">Online Documentation</a>
 */
 final   fun toRadians( angdeg: Double ):Double
}
