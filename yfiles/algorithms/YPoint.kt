// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import yfiles.geometry.Point
import yfiles.lang.ClassMetadata
import yfiles.lang.IComparable

/**
 * This class represents a point in the plane with double coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YPoint">Online Documentation</a>
 * 
 * @constructor Creates a new [YPoint] object for a given position.
 * @param [x] the x coordinate of the point.
 * @param [y] the y coordinate of the point.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YPoint%23YPoint-constructor-YPoint(number,number)">Online Documentation</a>
 * 
 * @property x
 * Gets the x-coordinate of the point object.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YPoint%23x">Online Documentation</a>
 * 
 * @property y
 * Gets the y-coordinate of the point object.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YPoint%23y">Online Documentation</a>
 */
external  class YPoint  (
final val x: Double,
final val y: Double) : IComparable<YPoint> {
/**
 * Creates a new [YPoint] at location (0,0)
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YPoint%23YPoint-constructor-YPoint()">Online Documentation</a>
 */
 constructor()

/**
 * Comparable implementation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YPoint%23YPoint-method-compareTo">Online Documentation</a>
 */
 final override  operator fun compareTo( other: YPoint ):Int
/**
 * Returns the euclidean distance between this point and a given point.
 * @param [p] an arbitrary point
 * @return the Euclidean distance between this point and p.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YPoint%23YPoint-method-distanceTo(YPoint)">Online Documentation</a>
 */
 final infix   fun distanceTo( p: YPoint ):Double
/**
 * Returns the euclidean distance between this point and a given point.
 * @param [x] the x coordinate of an arbitrary point
 * @param [y] the y coordinate of an arbitrary point
 * @return the Euclidean distance between this point and the point (x,y).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YPoint%23YPoint-method-distanceTo(number,number)">Online Documentation</a>
 */
 final   fun distanceTo( x: Double ,
 y: Double ):Double
/**
 * Returns the point, got by moving this point to another position.
 * @param [x] the value which is added on the x-coordinate of the point.
 * @param [y] the value which is added on the y-coordinate of the point.
 * @return a new instance of YPoint which is the result of the moving operation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YPoint%23YPoint-method-moveBy">Online Documentation</a>
 */
 final   fun moveBy( x: Double ,
 y: Double ):YPoint
/**
 * Creates a [Point] from a given [YPoint].
 * @return The [Point].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YPoint%23YPoint-defaultmethod-toPoint">Online Documentation</a>
 */
   fun toPoint():Point

/**
 * @return [x]
 */    
@JsName("__ygen_x_negy__")
final operator fun component1(): Double
/**
 * @return [y]
 */    
@JsName("__ygen_y_negy__")
final operator fun component2(): Double

companion object : ClassMetadata<YPoint> {
/**
 * A [YPoint] constant with coordinates (0,0).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YPoint%23ORIGIN">Online Documentation</a>
 */
 val ORIGIN: YPoint
/**
 * Adds two points and returns the result.
 * @receiver an arbitrary instance of YPoint.
 * @param [p2] an arbitrary instance of YPoint.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YPoint%23YPoint-method-add">Online Documentation</a>
 */
@JsName("add")
  final operator fun YPoint.plus( p2: YPoint ):YPoint
/**
 * Returns the euclidean distance between two points.
 * @receiver an arbitrary point
 * @param [p2] an arbitrary point
 * @return the Euclidean distance between p1 and p2.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YPoint%23YPoint-method-distance(YPoint,YPoint)">Online Documentation</a>
 */
 final   fun YPoint.distance( p2: YPoint ):Double
/**
 * Returns the euclidean distance between two points.
 * @param [x1] x-coordinate of first point
 * @param [y1] y-coordinate of first point
 * @param [x2] x-coordinate of second point
 * @param [y2] y-coordinate of second point
 * @return the euclidean distance between first and second point
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YPoint%23YPoint-method-distance(number,number,number,number)">Online Documentation</a>
 */
 final   fun distance( x1: Double ,
 y1: Double ,
 x2: Double ,
 y2: Double ):Double
/**
 * Returns a point that geometrically lies in in the middle of the line formed by the given points.
 * @receiver an arbitrary instance of YPoint.
 * @param [p2] an arbitrary instance of YPoint.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YPoint%23YPoint-method-midPoint">Online Documentation</a>
 */
 final   fun YPoint.midPoint( p2: YPoint ):YPoint
/**
 * Subtracts two points (p1 - p2) and returns the result.
 * @receiver an arbitrary instance of YPoint.
 * @param [p2] an arbitrary instance of YPoint.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YPoint%23YPoint-method-subtract">Online Documentation</a>
 */
@JsName("subtract")
  final operator fun YPoint.minus( p2: YPoint ):YPoint
/**
 * Returns a copy of the given point with exchanged x- and y-coordinates.
 * @receiver an arbitrary instance of YPoint.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YPoint%23YPoint-method-swap">Online Documentation</a>
 */
 final   fun YPoint.swap():YPoint
}
}
