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
import yfiles.lang.ICloneable

/**
 * Represents a two-dimensional rectangle of size `(width x height)`, located at the point `(x, y)`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rectangle2D">Online Documentation</a>
 * 
 * @constructor Creates a new rectangle of the specified size at the specified location.
 * @param [x] the x-coordinate of the upper left corner of the created rectangle.
 * @param [y] the y-coordinate of the upper left corner of the created rectangle.
 * @param [width] the width of the created rectangle.
 * @param [height] the height of the created rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rectangle2D%23Rectangle2D-constructor-Rectangle2D(number,number,number,number)">Online Documentation</a>
 * 
 * @property x
 * Gets the x coordinate of the upper left corner.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rectangle2D%23x">Online Documentation</a>
 * 
 * @property y
 * Gets the y coordinate of the upper left corner.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rectangle2D%23y">Online Documentation</a>
 * 
 * @property width
 * Gets the width of this rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rectangle2D%23width">Online Documentation</a>
 * 
 * @property height
 * Gets the height of this rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rectangle2D%23height">Online Documentation</a>
 */
external open class Rectangle2D  (
open val x: Double,
open val y: Double,
open val width: Double,
open val height: Double) : ICloneable<Rectangle2D> {
/**
 * Creates a new rectangle of size `(0 x 0)` at the location `(0, 0)`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rectangle2D%23Rectangle2D-constructor-Rectangle2D()">Online Documentation</a>
 */
 constructor()

/**
 * Gets the bounds of this instance in double precision.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rectangle2D%23bounds2D">Online Documentation</a>
 */
open val bounds2D: Rectangle2D
/**
 * Gets the x coordinate of the center point of this rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rectangle2D%23centerX">Online Documentation</a>
 */
open val centerX: Double
/**
 * Gets the y coordinate of the center point of this rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rectangle2D%23centerY">Online Documentation</a>
 */
open val centerY: Double
/**
 * Gets whether this instance is empty, that is, covers no area.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rectangle2D%23empty">Online Documentation</a>
 */
open val empty: Boolean
/**
 * Gets or sets the outer bounds of this rectangle in double coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rectangle2D%23frame">Online Documentation</a>
 */
open var frame: Rectangle2D
/**
 * Gets the largest x coordinate of this rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rectangle2D%23maxX">Online Documentation</a>
 */
open val maxX: Double
/**
 * Gets the largest y coordinate of this rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rectangle2D%23maxY">Online Documentation</a>
 */
open val maxY: Double
/**
 * Gets the smallest x coordinate of this rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rectangle2D%23minX">Online Documentation</a>
 */
open val minX: Double
/**
 * Gets the smallest y coordinate of this rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rectangle2D%23minY">Online Documentation</a>
 */
open val minY: Double
/**
 * Sets the location and size of this rectangle to be similar to the specified rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rectangle2D%23rect">Online Documentation</a>
 */
open var rect: Rectangle2D
@Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
get
/**
 * Adds a rectangle to this rectangle.
 * @param [r] the rectangle to add
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rectangle2D%23Rectangle2D-method-add(Rectangle2D)">Online Documentation</a>
 */
 open   fun add( r: Rectangle2D )

/**
 * Adds a rectangle to this rectangle.
 * @param [r] the rectangle to add
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rectangle2D%23Rectangle2D-method-add(Rectangle2D)">Online Documentation</a>
 */
@JsName("add")
  final operator fun plusAssign( r: Rectangle2D )
/**
 * Adds a point, specified by its coordinates, to this rectangle.
 * @param [px] the x coordinate of the point to add
 * @param [py] the y coordinate of the point to add
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rectangle2D%23Rectangle2D-method-add(number,number)">Online Documentation</a>
 */
 open   fun add( px: Double ,
 py: Double )
/**
 * Creates a new instance of this class that has the same values as this objects.
 * @return a new instance of this class that has the same values as this objects.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rectangle2D%23Rectangle2D-method-clone">Online Documentation</a>
 */
 override   fun clone():Rectangle2D
/**
 * Checks whether this rectangle completely contains the second specified rectangle.
 * @param [rect] the rectangle to check for containment
 * @return `true` if this rectangle contains the second one
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rectangle2D%23Rectangle2D-method-contains(Rectangle2D)">Online Documentation</a>
 */
 open  operator fun contains( rect: Rectangle2D ):Boolean
/**
 * Checks if the point specified by the given coordinates is contained in this rectangle.
 * @param [x] the x-coordinate of the point.
 * @param [y] the y-coordinate of the point.
 * @return `true` if the specified point is contained in this rectangle; `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rectangle2D%23Rectangle2D-method-contains(number,number)">Online Documentation</a>
 */
 open   fun contains( x: Double ,
 y: Double ):Boolean
/**
 * Checks whether this rectangle completely contains the second specified rectangle.
 * @param [x] the x coordinate of the second rectangle.
 * @param [y] the y coordinate of the second rectangle.
 * @param [width] the width coordinate of the second rectangle.
 * @param [height] the height coordinate of the second rectangle.
 * @return `true` if this rectangle contains the second one
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rectangle2D%23Rectangle2D-method-contains(number,number,number,number)">Online Documentation</a>
 */
 open   fun contains( x: Double ,
 y: Double ,
 width: Double ,
 height: Double ):Boolean
/**
 * Calculates the intersection of this rectangle with the given rectangle and returns the result as new rectangle.
 * @param [r] a rectangle to intersect with this rectangle.
 * @return a new rectangle that represents the calculated intersection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rectangle2D%23Rectangle2D-method-createIntersection">Online Documentation</a>
 */
 open   fun createIntersection( r: Rectangle2D ):Rectangle2D
/**
 * Calculates the union of this rectangle with the given rectangle and returns the result as new rectangle.
 * @param [r] a rectangle to union with this rectangle.
 * @return a new rectangle that represents the calculated union.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rectangle2D%23Rectangle2D-method-createUnion">Online Documentation</a>
 */
 open   fun createUnion( r: Rectangle2D ):Rectangle2D
/**
 * Checks whether this rectangle and the second specified rectangle intersect.
 * @param [rect] the rectangle to check for intersection
 * @return `true` if both rectangles intersect
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rectangle2D%23Rectangle2D-method-intersects(Rectangle2D)">Online Documentation</a>
 */
 open infix   fun intersects( rect: Rectangle2D ):Boolean
/**
 * Checks whether this rectangle and the second specified rectangle intersect.
 * @param [x] the x coordinate of the second rectangle.
 * @param [y] the y coordinate of the second rectangle.
 * @param [width] the width coordinate of the second rectangle.
 * @param [height] the height coordinate of the second rectangle.
 * @return `true` if both rectangles intersect
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rectangle2D%23Rectangle2D-method-intersects(number,number,number,number)">Online Documentation</a>
 */
 open   fun intersects( x: Double ,
 y: Double ,
 width: Double ,
 height: Double ):Boolean
/**
 * Checks if the line segment specified by the given coordinates intersects this rectangle.
 * @param [x1] the x-coordinate of the first end point of the line.
 * @param [y1] the y-coordinate of the first end point of the line.
 * @param [x2] the x-coordinate of the other end point of the line.
 * @param [y2] the y-coordinate of the other end point of the line.
 * @return `true` if the specified line intersects this rectangle; `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rectangle2D%23Rectangle2D-method-intersectsLine">Online Documentation</a>
 */
 open   fun intersectsLine( x1: Double ,
 y1: Double ,
 x2: Double ,
 y2: Double ):Boolean
/**
 * Sets the outer bounds of this rectangle based on the specified location and size.
 * @param [x] the new x-coordinate of the upper left corner.
 * @param [y] the new y-coordinate of the upper left corner.
 * @param [width] the new width.
 * @param [height] the new height.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rectangle2D%23Rectangle2D-method-setFrame">Online Documentation</a>
 */
 open   fun setFrame( x: Double ,
 y: Double ,
 width: Double ,
 height: Double )
/**
 * Sets the outer bounds of this rectangle based on the specified new center and corner.
 * @param [center] the new center of this rectangle.
 * @param [corner] any new corner of this rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rectangle2D%23Rectangle2D-method-setFrameFromCenter(Point2D,Point2D)">Online Documentation</a>
 */
 open   fun setFrameFromCenter( center: Point2D ,
 corner: Point2D )
/**
 * Sets the outer bounds of this rectangle based on the specified new center and corner.
 * @param [centerX] the x-coordinate of the new center of this rectangle.
 * @param [centerY] the y-coordinate of the new center of this rectangle.
 * @param [cornerX] the x-coordinate of any new corner of this rectangle.
 * @param [cornerY] the y-coordinate of any new corner of this rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rectangle2D%23Rectangle2D-method-setFrameFromCenter(number,number,number,number)">Online Documentation</a>
 */
 open   fun setFrameFromCenter( centerX: Double ,
 centerY: Double ,
 cornerX: Double ,
 cornerY: Double )
/**
 * Sets the outer bounds of this rectangle based on the end points of one of its diagonals.
 * @param [p1] the first end point of a diagonal.
 * @param [p2] the other end point of a diagonal.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rectangle2D%23Rectangle2D-method-setFrameFromDiagonal(Point2D,Point2D)">Online Documentation</a>
 */
 open   fun setFrameFromDiagonal( p1: Point2D ,
 p2: Point2D )
/**
 * Sets the outer bounds of this rectangle based on the end points of one of its diagonals.
 * @param [x1] the x-coordinate of the first end point of a diagonal.
 * @param [y1] the y-coordinate of the first end point of a diagonal.
 * @param [x2] the x-coordinate of the other end point of a diagonal.
 * @param [y2] the y-coordinate of the other end point of a diagonal.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rectangle2D%23Rectangle2D-method-setFrameFromDiagonal(number,number,number,number)">Online Documentation</a>
 */
 open   fun setFrameFromDiagonal( x1: Double ,
 y1: Double ,
 x2: Double ,
 y2: Double )
/**
 * Sets the location and size of this rectangle to the specified values.
 * @param [x] the new x-coordinate of the upper left corner.
 * @param [y] the new y-coordinate of the upper left corner.
 * @param [width] the new width.
 * @param [height] the new height.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rectangle2D%23Rectangle2D-method-setRect">Online Documentation</a>
 */
 open   fun setRect( x: Double ,
 y: Double ,
 width: Double ,
 height: Double )
/**
 * Creates a [Rect] from a given [Rectangle2D].
 * @return The [Rect].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rectangle2D%23Rectangle2D-defaultmethod-toRect">Online Documentation</a>
 */
   fun toRect():Rect

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
/**
 * @return [width]
 */    
@JsName("__ygen_width_negy__")
final operator fun component3(): Double
/**
 * @return [height]
 */    
@JsName("__ygen_height_negy__")
final operator fun component4(): Double

companion object : ClassMetadata<Rectangle2D> {
/**
 * Calculates the intersection of the first and second specified rectangle and sets the resulting location and size to the third rectangle.
 * @param [src1] the first rectangle to intersect.
 * @param [src2] the second rectangle to intersect.
 * @param [dst] the rectangle to which the result is set.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rectangle2D%23Rectangle2D-method-intersect">Online Documentation</a>
 */
 final   fun intersect( src1: Rectangle2D ,
 src2: Rectangle2D ,
 dst: Rectangle2D )
/**
 * Calculates the union of the first and second specified rectangle and sets the resulting location and size to the third rectangle.
 * @param [src1] the first rectangle to union.
 * @param [src2] the second rectangle to union.
 * @param [dst] the rectangle to which the result is set.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rectangle2D%23Rectangle2D-method-union">Online Documentation</a>
 */
 final   fun union( src1: Rectangle2D ,
 src2: Rectangle2D ,
 dst: Rectangle2D )
}
}

inline val  Rectangle2D.notEmpty: Boolean
    get() = !empty
