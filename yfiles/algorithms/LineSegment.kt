// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import yfiles.lang.ClassMetadata

/**
 * This class represents a line segment in the plane.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LineSegment">Online Documentation</a>
 * 
 * @constructor Returns a new [LineSegment].
 * @param [firstEndPoint] the first end point of the line segment.
 * @param [secondEndPoint] the second end point of the line segment.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LineSegment%23LineSegment-constructor-LineSegment">Online Documentation</a>
 * 
 * @property firstEndPoint
 * Gets the first end point of the line segment.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LineSegment%23firstEndPoint">Online Documentation</a>
 * 
 * @property secondEndPoint
 * Gets the second end point of the line segment.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LineSegment%23secondEndPoint">Online Documentation</a>
 */
external open class LineSegment  (
open val firstEndPoint: YPoint,
open val secondEndPoint: YPoint) : IPlaneObject {

/**
 * Gets the smallest Rectangle which contains the object.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LineSegment%23boundingBox">Online Documentation</a>
 */
override val boundingBox: YRectangle
/**
 * Gets the distance from start to end point in x-coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LineSegment%23deltaX">Online Documentation</a>
 */
open val deltaX: Double
/**
 * Gets the distance from start to end point in y-coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LineSegment%23deltaY">Online Documentation</a>
 */
open val deltaY: Double
/**
 * Gets if this segment is considered horizontal, that is, the y values of the end points differ by at most 1e-8.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LineSegment%23isHorizontal">Online Documentation</a>
 */
open val isHorizontal: Boolean
/**
 * Gets if this segment is considered vertical, that is, the x values of the end points differ by at most 1e-8.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LineSegment%23isVertical">Online Documentation</a>
 */
open val isVertical: Boolean
/**
 * Gets the slope of the line segment.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LineSegment%23slope">Online Documentation</a>
 */
open val slope: Double
/**
 * Gets the y value of the line on x coordinate 0.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LineSegment%23xOffset">Online Documentation</a>
 */
open val xOffset: Double
/**
 * Checks whether a given point lies on this line segment.
 * @param [point] an arbitrary point.
 * @return `true` if the line segments intersects the box, `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LineSegment%23LineSegment-method-contains">Online Documentation</a>
 */
 open  operator fun contains( point: YPoint ):Boolean
/**
 * Checks whether the line segment intersects a box.
 * @param [box] A rectangle.
 * @return `true` if the line segments intersects the box, `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LineSegment%23LineSegment-method-intersects(YRectangle)">Online Documentation</a>
 */
 open infix   fun intersects( box: YRectangle ):Boolean
/**
 * Checks whether the line segment intersects a point.
 * @param [p] a point
 * @return `true` if the line segments intersects the given point, `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LineSegment%23LineSegment-method-intersects(YPoint)">Online Documentation</a>
 */
 open infix   fun intersects( p: YPoint ):Boolean
/**
 * Returns if the projection on the X axis of the line segment covers a certain point on the X Axis.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LineSegment%23LineSegment-method-isInXIntervall">Online Documentation</a>
 */
 open   fun isInXIntervall( x: Double ):Boolean
/**
 * Returns if the projection on the Y axis of the line segment covers a certain point on the Y Axis.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LineSegment%23LineSegment-method-isInYIntervall">Online Documentation</a>
 */
 open   fun isInYIntervall( y: Double ):Boolean
/**
 * Returns the length of the line segment, this is the value of the Euclidean norm.
 * @return an value > 0.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LineSegment%23LineSegment-method-length">Online Documentation</a>
 */
 open   fun length():Double
/**
 * Returns the affine line defined by the end points of the line segment.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LineSegment%23LineSegment-method-toAffineLine">Online Documentation</a>
 */
 open   fun toAffineLine():AffineLine
/**
 * Returns the vector pointing from the first end point to the second end point of the line segment.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LineSegment%23LineSegment-method-toYVector">Online Documentation</a>
 */
 open   fun toYVector():YVector

companion object : ClassMetadata<LineSegment> {
/**
 * Checks whether a line segment intersects a box.
 * @param [box] A rectangle.
 * @param [s] first end point of the line segment.
 * @param [t] second end point of the line segment.
 * @return `true` if the line segments intersects the box, `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LineSegment%23LineSegment-method-boxIntersectsSegment(YRectangle,YPoint,YPoint)">Online Documentation</a>
 */
 final   fun boxIntersectsSegment( box: YRectangle ,
 s: YPoint ,
 t: YPoint ):Boolean
/**
 * Checks whether a line segment intersects a box.
 * @param [box] A rectangle
 * @param [x1] x-coordinate of the first end point of the line segment
 * @param [y1] y-coordinate of the first end point of the line segment
 * @param [x2] x-coordinate of the second end point of the line segment
 * @param [y2] y-coordinate of the second end point of the line segment
 * @return `true` if the line segment intersects the box, `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LineSegment%23LineSegment-method-boxIntersectsSegment(YRectangle,number,number,number,number)">Online Documentation</a>
 */
 final   fun boxIntersectsSegment( box: YRectangle ,
 x1: Double ,
 y1: Double ,
 x2: Double ,
 y2: Double ):Boolean
/**
 * Checks whether a line segment intersects a paraxial box.
 * @param [boxX1] x-coordinate of the upper left corner of the box
 * @param [boxY1] y-coordinate of the upper left corner of the box
 * @param [boxX2] x-coordinate of the lower right corner of the box
 * @param [boxY2] y-coordinate of the lower right corner of the box
 * @param [sX1] x-coordinate of the first end point of the line segment
 * @param [sY1] y-coordinate of the first end point of the line segment
 * @param [sX2] x-coordinate of the second end point of the line segment
 * @param [sY2] y-coordinate of the second end point of the line segment
 * @return `true` if the line segment intersects the box, `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LineSegment%23LineSegment-method-boxIntersectsSegment(number,number,number,number,number,number,number,number)">Online Documentation</a>
 */
 final   fun boxIntersectsSegment( boxX1: Double ,
 boxY1: Double ,
 boxX2: Double ,
 boxY2: Double ,
 sX1: Double ,
 sY1: Double ,
 sX2: Double ,
 sY2: Double ):Boolean
/**
 * Returns intersection point between the two line segments, if there is one or `null` if the two line segments do not intersect.
 * @param [s1] first line segment
 * @param [s2] second line segment
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LineSegment%23LineSegment-method-getIntersection">Online Documentation</a>
 */
 final   fun getIntersection( s1: LineSegment ,
 s2: LineSegment ):YPoint?
/**
 * Determines if the given points define a horizontal line segment.
 * @return `true` if the given points define a horizontal line segment; `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LineSegment%23LineSegment-method-isHorizontalSegment">Online Documentation</a>
 */
 final   fun isHorizontalSegment( p1: YPoint ,
 p2: YPoint ):Boolean
/**
 * Determines if the given points define a vertical line segment.
 * @return `true` if the given points define a vertical line segment; `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LineSegment%23LineSegment-method-isVerticalSegment">Online Documentation</a>
 */
 final   fun isVerticalSegment( p1: YPoint ,
 p2: YPoint ):Boolean
}
}
