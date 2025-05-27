// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import yfiles.geometry.Rect
import yfiles.lang.ClassMetadata

/**
 * This class defines a rectangle and provides utility methods for it.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YRectangle">Online Documentation</a>
 * 
 * @constructor Creates a new rectangle with given upper left corner and size.
 * @param [x] x-coordinate of upper left corner of the rectangle.
 * @param [y] y-coordinate of upper left corner of the rectangle.
 * @param [width] width of the rectangle.
 * @param [height] height of the rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YRectangle%23YRectangle-constructor-YRectangle(number,number,number,number)">Online Documentation</a>
 * 
 * @property x
 * Gets x-coordinate of upper left corner.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YRectangle%23x">Online Documentation</a>
 * 
 * @property y
 * Gets y-coordinate of upper left corner.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YRectangle%23y">Online Documentation</a>
 */
external open class YRectangle  (
final val x: Double,
final val y: Double,
 width: Double ,
 height: Double ) : YDimension, IPlaneObject {
/**
 * Creates a new rectangle with upper left corner (0,0) and size (0,0).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YRectangle%23YRectangle-constructor-YRectangle()">Online Documentation</a>
 */
 constructor()
/**
 * Creates a new rectangle with given upper left corner and size.
 * @param [pos] upper left corner of the rectangle.
 * @param [size] size of the rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YRectangle%23YRectangle-constructor-YRectangle(YPoint,YDimension)">Online Documentation</a>
 */
 constructor( pos: YPoint ,
 size: YDimension )

/**
 * Gets this object.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YRectangle%23boundingBox">Online Documentation</a>
 */
override val boundingBox: YRectangle
/**
 * Gets coordinates of upper left corner.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YRectangle%23location">Online Documentation</a>
 */
final val location: YPoint
/**
 * Checks whether or not this `YRectangle` contains the given point.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YRectangle%23YRectangle-method-contains(YPoint)">Online Documentation</a>
 */
 open  operator fun contains( p: YPoint ):Boolean
/**
 * Checks whether or not this `YRectangle` contains the given rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YRectangle%23YRectangle-method-contains(YRectangle)">Online Documentation</a>
 */
 open  operator fun contains( p: YRectangle ):Boolean
/**
 * Checks whether or not this `YRectangle` contains the given point.
 * @param [x] the x-coordinate of the point to check.
 * @param [y] the x-coordinate of the point to check.
 * @return `true` if the point lies inside the rectangle; `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YRectangle%23YRectangle-method-contains(number,number)">Online Documentation</a>
 */
 open   fun contains( x: Double ,
 y: Double ):Boolean
/**
 * Checks whether or not this `YRectangle` contains the rectangle defined by the given frame.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YRectangle%23YRectangle-method-contains(number,number,number,number)">Online Documentation</a>
 */
 open   fun contains( x: Double ,
 y: Double ,
 width: Double ,
 height: Double ):Boolean
/**
 * Returns the Euclidean distance to the passed rectangle.
 * @param [other] the second rectangle.
 * @return the distance to the given rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YRectangle%23YRectangle-method-getEuclideanDistance">Online Documentation</a>
 */
 open   fun getEuclideanDistance( other: YRectangle ):Double
/**
 * Returns the Manhattan distance to the passed rectangle.
 * @param [other] the second rectangle.
 * @return the distance to the given rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YRectangle%23YRectangle-method-getManhattanDistance">Online Documentation</a>
 */
 open   fun getManhattanDistance( other: YRectangle ):Double
/**
 * Creates a [Rect] from a given [YRectangle].
 * @return The [Rect].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YRectangle%23YRectangle-defaultmethod-toRect">Online Documentation</a>
 */
   fun toRect():Rect

companion object : ClassMetadata<YRectangle> {
/**
 * Determines whether the specified rectangle contains the specified point.
 * @param [rx] the x-coordinate of the upper left corner of the rectangle.
 * @param [ry] the y-coordinate of the upper left corner of the rectangle.
 * @param [rw] the width of the rectangle.
 * @param [rh] the height of the rectangle.
 * @param [x] the x-coordinate of the point to check.
 * @param [y] the x-coordinate of the point to check.
 * @param [closed] if `true`, all points on the border of the rectangle are considered to be *contained*, otherwise, points on the top and left borders are considered to be *contained* while points on the bottom and right borders are not (this behavior matches [Rectangle2D.contains]).
 * @return `true` if the point lies inside the rectangle; `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YRectangle%23YRectangle-method-contains">Online Documentation</a>
 */
 final   fun contains( rx: Double ,
 ry: Double ,
 rw: Double ,
 rh: Double ,
 x: Double ,
 y: Double ,
 closed: Boolean  = definedExternally):Boolean
/**
 * Returns whether or not the given rectangles intersect.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YRectangle%23YRectangle-method-intersects">Online Documentation</a>
 */
 final   fun YRectangle.intersects( r2: YRectangle ):Boolean
}
}
