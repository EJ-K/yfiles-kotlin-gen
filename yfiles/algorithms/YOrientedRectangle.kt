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
import yfiles.geometry.IOrientedRectangle
import yfiles.lang.ClassMetadata

/**
 * An oriented rectangle in 2D coordinate space with double precision coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YOrientedRectangle">Online Documentation</a>
 * 
 * @constructor Creates a new instance using the provided values to initialize anchor, size, and up vector.
 * @param [anchorX] The x coordinate of the anchor of the oriented rectangle.
 * @param [anchorY] The y coordinate of the anchor of the oriented rectangle.
 * @param [width] The width of the rectangle.
 * @param [height] The height of the rectangle.
 * @param [upX] The x component of the up vector.
 * @param [upY] The y component of the up vector.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YOrientedRectangle%23YOrientedRectangle-constructor-YOrientedRectangle(number,number,number,number,number,number)">Online Documentation</a>
 * 
 * @property anchorX
 * Gets the x-coordinate of this rectangle's anchor point.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YOrientedRectangle%23anchorX">Online Documentation</a>
 * 
 * @property anchorY
 * Gets the y-coordinate of this rectangle's anchor point.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YOrientedRectangle%23anchorY">Online Documentation</a>
 * 
 * @property width
 * Gets the width of this rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YOrientedRectangle%23width">Online Documentation</a>
 * 
 * @property height
 * Gets the height of this rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YOrientedRectangle%23height">Online Documentation</a>
 * 
 * @property upX
 * Gets the x-component of this rectangle's up vector.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YOrientedRectangle%23upX">Online Documentation</a>
 * 
 * @property upY
 * Gets the y-component of this rectangle's up vector.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YOrientedRectangle%23upY">Online Documentation</a>
 */
external open class YOrientedRectangle  (
open val anchorX: Double,
open val anchorY: Double,
open val width: Double,
open val height: Double,
open val upX: Double,
open val upY: Double) : IPlaneObject {
/**
 * Creates a new instance using the provided rectangle's values to initialize anchor and size.
 * @param [rect] the provided rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YOrientedRectangle%23YOrientedRectangle-constructor-YOrientedRectangle(YRectangle)">Online Documentation</a>
 */
 constructor( rect: YRectangle )
/**
 * Creates a new instance using the provided rectangle's values to initialize anchor, size, and up vector.
 * @param [rect] the provided rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YOrientedRectangle%23YOrientedRectangle-constructor-YOrientedRectangle(YOrientedRectangle)">Online Documentation</a>
 */
 constructor( rect: YOrientedRectangle )
/**
 * Creates a new instance using the provided values to initialize the anchor and size.
 * @param [anchor] The provider for the dynamic anchor of this instance.
 * @param [size] The provider for the dynamic size of this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YOrientedRectangle%23YOrientedRectangle-constructor-YOrientedRectangle(YPoint,YDimension)">Online Documentation</a>
 */
 constructor( anchor: YPoint ,
 size: YDimension )
/**
 * Creates a new instance using the provided values to initialize anchor, size, and up vector.
 * @param [position] The provider for the dynamic anchor of this instance.
 * @param [size] The provider for the dynamic size of this instance.
 * @param [upVector] The up vector.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YOrientedRectangle%23YOrientedRectangle-constructor-YOrientedRectangle(YPoint,YDimension,YVector)">Online Documentation</a>
 */
 constructor( position: YPoint ,
 size: YDimension ,
 upVector: YVector )
/**
 * Creates a new instance using the provided values to initialize anchor and size.
 * @param [anchorX] The x coordinate of the anchor of the oriented rectangle.
 * @param [anchorY] The y coordinate of the anchor of the oriented rectangle.
 * @param [width] The width of the rectangle.
 * @param [height] The height of the rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YOrientedRectangle%23YOrientedRectangle-constructor-YOrientedRectangle(number,number,number,number)">Online Documentation</a>
 */
 constructor( anchorX: Double ,
 anchorY: Double ,
 width: Double ,
 height: Double )

/**
 * Gets or sets the anchor of this oriented rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YOrientedRectangle%23anchor">Online Documentation</a>
 */
open var anchor: YPoint
/**
 * Gets or sets the angle (measured in radians) of this rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YOrientedRectangle%23angle">Online Documentation</a>
 */
open var angle: Double
/**
 * Calculates the paraxial bounding box of this oriented rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YOrientedRectangle%23boundingBox">Online Documentation</a>
 */
override val boundingBox: YRectangle
/**
 * Gets or sets the current center of this oriented rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YOrientedRectangle%23center">Online Documentation</a>
 */
open var center: YPoint
/**
 * Gets whether this instance has negative width or height.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YOrientedRectangle%23empty">Online Documentation</a>
 */
open val empty: Boolean
/**
 * Gets or sets the size of this rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YOrientedRectangle%23size">Online Documentation</a>
 */
open var size: YDimension
/**
 * Copies the actual values from the given `OrientedRectangle` to this instance.
 * @param [other] the `OrientedRectangle` to retrieve the values from
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YOrientedRectangle%23YOrientedRectangle-method-adoptValues">Online Documentation</a>
 */
 open   fun adoptValues( other: YOrientedRectangle )
/**
 * Determines whether or not the specified point lies inside this oriented rectangle.
 * @param [x] the x-coordinate of the point to check.
 * @param [y] the y-coordinate of the point to check.
 * @param [closed] if `true`, all points on the border of the rectangle are considered to be *contained*.
 * @return `true` iff the specified point lies inside; `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YOrientedRectangle%23YOrientedRectangle-method-contains">Online Documentation</a>
 */
 open   fun contains( x: Double ,
 y: Double ,
 closed: Boolean  = definedExternally):Boolean
/**
 * Creates a new `OrientedRectangle` instance whose anchor point is moved by the specified distance values, but has the same width, height, and up vector as this rectangle.
 * @param [dx] the distance to move the anchor point in x-direction. A positive value means "move" to the right, a negative value means "move" to the left.
 * @param [dy] the distance to move the anchor point in y-direction. A positive value means "move" downwards, a negative value means "move" upwards.
 * @return a new `OrientedRectangle` instance whose anchor point is moved by the specified distance values.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YOrientedRectangle%23YOrientedRectangle-method-getMovedInstance">Online Documentation</a>
 */
 open   fun getMovedInstance( dx: Double ,
 dy: Double ):YOrientedRectangle
/**
 * Creates a new `OrientedRectangle` instance that has the specified width and height, but has the same anchor point and up vector as this rectangle.
 * @param [width] the width of the new rectangle.
 * @param [height] the height of the new rectangle.
 * @return a new `OrientedRectangle` instance that has the specified width and height.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YOrientedRectangle%23YOrientedRectangle-method-getResizedInstance">Online Documentation</a>
 */
 open   fun getResizedInstance( width: Double ,
 height: Double ):YOrientedRectangle
/**
 * Moves this rectangle by applying the offset to the anchor.
 * @param [dx] The x offset to move the rectangle's position by.
 * @param [dy] The y offset to move the rectangle's position by.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YOrientedRectangle%23YOrientedRectangle-method-moveBy">Online Documentation</a>
 */
 open   fun moveBy( dx: Double ,
 dy: Double )
/**
 * Sets the anchor of this rectangle.
 * @param [x] the new x-coordinate of the anchor point.
 * @param [y] the new y-coordinate of the anchor point.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YOrientedRectangle%23YOrientedRectangle-method-setAnchor">Online Documentation</a>
 */
 open   fun setAnchor( x: Double ,
 y: Double )
/**
 * Sets the anchor of this oriented rectangle so that the center of the rectangle coincides with the given coordinate pair.
 * @param [cx] The x coordinate of the center.
 * @param [cy] The y coordinate of the center.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YOrientedRectangle%23YOrientedRectangle-method-setCenter">Online Documentation</a>
 */
 open   fun setCenter( cx: Double ,
 cy: Double )
/**
 * Sets the size of this rectangle.
 * @param [width] the new width.
 * @param [height] the new height.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YOrientedRectangle%23YOrientedRectangle-method-setSize">Online Documentation</a>
 */
 open   fun setSize( width: Double ,
 height: Double )
/**
 * Sets the components of the up vector to the new values.
 * @param [upX] The x component of the normalized up vector.
 * @param [upY] The y component of the normalized up vector.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YOrientedRectangle%23YOrientedRectangle-method-setUpVector">Online Documentation</a>
 */
 open   fun setUpVector( upX: Double ,
 upY: Double )
/**
 * Creates an immutable [IOrientedRectangle] from a given [YOrientedRectangle].
 * @return The [IOrientedRectangle].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YOrientedRectangle%23YOrientedRectangle-defaultmethod-toImmutableOrientedRectangle">Online Documentation</a>
 */
   fun toImmutableOrientedRectangle():IOrientedRectangle

/**
 * @return [anchorX]
 */    
@JsName("__ygen_anchorX_negy__")
final operator fun component1(): Double
/**
 * @return [anchorY]
 */    
@JsName("__ygen_anchorY_negy__")
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
/**
 * @return [upX]
 */    
@JsName("__ygen_upX_negy__")
final operator fun component5(): Double
/**
 * @return [upY]
 */    
@JsName("__ygen_upY_negy__")
final operator fun component6(): Double

companion object : ClassMetadata<YOrientedRectangle> {
/**
 * Determines the four corner points of an oriented rectangle.
 * @receiver The rectangle to determine the bounds.
 * @return the array of corner points.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YOrientedRectangle%23YOrientedRectangle-method-calcPoints">Online Documentation</a>
 */
 final   fun YOrientedRectangle.calcPoints():ReadonlyArray<YPoint>
/**
 * Determines the coordinates of the four corners of an oriented rectangle.
 * @receiver The rectangle to determine the bounds.
 * @return the array of coordinates of the corner points in which each even index has the x-coordinate and each odd index the y-coordinate
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YOrientedRectangle%23YOrientedRectangle-method-calcPointsInDouble">Online Documentation</a>
 */
 final   fun YOrientedRectangle.calcPointsInDouble():ReadonlyArray<Double>
/**
 * Determines whether the given oriented rectangle contains the provided point, using an epsilon value.
 * @receiver The rectangle.
 * @param [p] The point to test.
 * @param [eps] fuzziness range. A positive value allows for fuzzy hit testing. If a point lies outside the given rectangle, but its distance is less than or equal to that value, it will be considered a hit.
 * @return `true` if the point lies inside the rectangle; `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YOrientedRectangle%23YOrientedRectangle-method-contains(YOrientedRectangle,YPoint,number)">Online Documentation</a>
 */
 final   fun YOrientedRectangle.contains( p: YPoint ,
 eps: Double ):Boolean
/**
 * Determines whether the given rectangle r1 contains rectangle r2, using an epsilon value.
 * @receiver The first rectangle.
 * @param [r2] The second rectangle.
 * @param [eps] A positive value allows for fuzzy hit testing. If the point lies outside the given object but it's distance is less than or equal to that value, it will be considered a hit.
 * @return true iff the r1 contains r2.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YOrientedRectangle%23YOrientedRectangle-method-contains(YOrientedRectangle,YOrientedRectangle,number)">Online Documentation</a>
 */
 final   fun YOrientedRectangle.contains( r2: YOrientedRectangle ,
 eps: Double ):Boolean
/**
 * Determines whether the given oriented rectangle contains the provided point, using an epsilon value.
 * @param [rect] The rectangle.
 * @param [x] x-coordinate of the point to test.
 * @param [y] y-coordinate of the point to test.
 * @param [eps] fuzziness range. A positive value allows for fuzzy hit testing. If a point lies outside the given rectangle, but its distance is less than or equal to that value, it will be considered a hit.
 * @return `true` if the point lies inside the rectangle; `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YOrientedRectangle%23YOrientedRectangle-method-contains(YOrientedRectangle,number,number,number)">Online Documentation</a>
 */
 final   fun contains( rect: YOrientedRectangle ,
 x: Double ,
 y: Double ,
 eps: Double ):Boolean
/**
 * Determines an intersection point of the specified oriented rectangle and the specified line segment.
 * @return an intersection point of the specified oriented rectangle and the specified line segment or `null` if the rectangle and the segment do not intersect.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YOrientedRectangle%23YOrientedRectangle-method-intersectionPoint">Online Documentation</a>
 */
 final   fun YOrientedRectangle.intersectionPoint( line: LineSegment ,
 eps: Double ):YPoint?
/**
 * Determines whether an [YOrientedRectangle] intersects another one.
 * @receiver The first oriented rectangle to test.
 * @param [rect2] The second oriented rectangle to test.
 * @param [eps] A positive value allows for fuzzy hit testing. If the point lies outside the given object but its distance is less than or equal to that value, it will be considered a hit.
 * @return `true` if the rectangles intersect and `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YOrientedRectangle%23YOrientedRectangle-method-intersects(YOrientedRectangle,YOrientedRectangle,number)">Online Documentation</a>
 */
 final   fun YOrientedRectangle.intersects( rect2: YOrientedRectangle ,
 eps: Double ):Boolean
/**
 * Determines whether a rectangle intersects an oriented rectangle, given an epsilon.
 * @receiver The oriented rectangle to test.
 * @param [rectangle] The rectangle to test.
 * @param [eps] A positive value allows for fuzzy hit testing. If the point lies outside the given object but its distance is less than or equal to that value, it will be considered a hit.
 * @return Whether they have a non-empty intersection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YOrientedRectangle%23YOrientedRectangle-method-intersects(YOrientedRectangle,YRectangle,number)">Online Documentation</a>
 */
 final   fun YOrientedRectangle.intersects( rectangle: YRectangle ,
 eps: Double ):Boolean
/**
 * Determines whether or not the specified oriented rectangle and the specified line segment intersect.
 * @return `true` if the rectangle and the segment intersect and `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YOrientedRectangle%23YOrientedRectangle-method-intersects(YOrientedRectangle,LineSegment,number)">Online Documentation</a>
 */
 final   fun YOrientedRectangle.intersects( line: LineSegment ,
 eps: Double ):Boolean
/**
 * Determines whether or not the specified oriented rectangle and the line segment defined by the two specified points intersect.
 * @return `true` if the rectangle and the segment intersect and `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YOrientedRectangle%23YOrientedRectangle-method-intersects(YOrientedRectangle,YPoint,YPoint,number)">Online Documentation</a>
 */
 final   fun intersects( rect: YOrientedRectangle ,
 lineP1: YPoint ,
 lineP2: YPoint ,
 eps: Double ):Boolean
}
}

inline val  YOrientedRectangle.notEmpty: Boolean
    get() = !empty
