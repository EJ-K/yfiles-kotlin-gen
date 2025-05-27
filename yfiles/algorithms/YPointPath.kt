// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import js.array.ReadonlyArray
import yfiles.collections.IList
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * This class represents an ordered list of points in the plane.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YPointPath">Online Documentation</a>
 * 
 * @constructor Creates a new empty path.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YPointPath%23YPointPath-constructor-YPointPath()">Online Documentation</a>
 */
external  class YPointPath  () : YObject {
/**
 * Creates a new path from a list of points.
 * @param [l] a list of [YPoint] instances.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YPointPath%23YPointPath-constructor-YPointPath(IList)">Online Documentation</a>
 */
 constructor( l: IList<out YPoint> )
/**
 * Creates a new path from an array of points.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YPointPath%23YPointPath-constructor-YPointPath(YPoint[])">Online Documentation</a>
 */
 constructor( path: ReadonlyArray<YPoint> )

/**
 * Gets the first point in the path.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YPointPath%23first">Online Documentation</a>
 */
final val first: YPoint?
/**
 * Gets the last point in the path.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YPointPath%23last">Online Documentation</a>
 */
final val last: YPoint?
/**
 * Gets the number of line segments in the path.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YPointPath%23lineSegmentCount">Online Documentation</a>
 */
final val lineSegmentCount: Int
/**
 * Calculate the (geometric) length of the path.
 * @return the (geometric) length of the path
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YPointPath%23YPointPath-method-calculateLength">Online Documentation</a>
 */
 final   fun calculateLength():Double
/**
 * Create a point path with reverse ordering of the points.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YPointPath%23YPointPath-method-createReverse">Online Documentation</a>
 */
 final   fun createReverse():YPointPath
/**
 * Get the points in the path.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YPointPath%23YPointPath-method-cursor">Online Documentation</a>
 */
 final   fun cursor():ICursor<YPoint>
/**
 * Returns a line segment in the path.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YPointPath%23YPointPath-method-getLineSegment">Online Documentation</a>
 */
 final   fun getLineSegment( i: Int ):LineSegment?
/**
 * Get the number of points in the path.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YPointPath%23YPointPath-method-length">Online Documentation</a>
 */
 final   fun length():Int
/**
 * Get the points in the path.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YPointPath%23YPointPath-method-lineSegments">Online Documentation</a>
 */
 final   fun lineSegments():ILineSegmentCursor
/**
 * Get the points in the path.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YPointPath%23YPointPath-method-points">Online Documentation</a>
 */
 final   fun points():IPointCursor
/**
 * Get the points in the list as array.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YPointPath%23YPointPath-method-toArray">Online Documentation</a>
 */
 final   fun toArray():ReadonlyArray<YPoint>
/**
 * Get the points in the path as list.
 * @return a list of [YPoint] instances.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YPointPath%23YPointPath-method-toList">Online Documentation</a>
 */
 final   fun toList():IList<out YPoint>

companion object : ClassMetadata<YPointPath> {
/**
 * Defines a path with no points.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YPointPath%23EMPTY_PATH">Online Documentation</a>
 */
 val EMPTY_PATH: YPointPath
}
}
