// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.geometry

import yfiles.algorithms.Rectangle2D
import yfiles.algorithms.YRectangle
import yfiles.collections.IEnumerable
import yfiles.lang.ClassMetadata

/**
 * Represents an axis-aligned rectangle in two-dimensional Cartesian coordinates with [double precision][Number].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect">Online Documentation</a>
 * 
 * @constructor Initializes a new instance.
 * @param [x] The [x] coordinate of the top left corner.
 * @param [y] The [y] coordinate of the top left corner.
 * @param [width] The [width] of the rectangle.
 * @param [height] The [height] of the rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-constructor-Rect(number,number,number,number)">Online Documentation</a>
 * 
 * @property x
 * Gets the X coordinate of the upper left corner of the rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23x">Online Documentation</a>
 * 
 * @property y
 * Gets the Y coordinate of the upper left corner of the rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23y">Online Documentation</a>
 * 
 * @property width
 * Gets the width of the rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23width">Online Documentation</a>
 * 
 * @property height
 * Gets the height of the rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23height">Online Documentation</a>
 */
external  class Rect  (
final override val x: Double,
final override val y: Double,
final override val width: Double,
final override val height: Double) : IRectangle {
/**
 * Initializes a new instance of the [Rect] class with the initial values obtained from the given rectangle.
 * @param [rectangle] The rectangle to retrieve the initial values from.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-constructor-Rect(IRectangle)">Online Documentation</a>
 */
 constructor( rectangle: IRectangle )
/**
 * Initializes a new instance using two point to define the bounds
 * @param [p1] The first point to determine the bounds.
 * @param [p2] The second point to determine the bounds.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-constructor-Rect(Point,Point)">Online Documentation</a>
 */
 constructor( p1: Point ,
 p2: Point )
/**
 * Initializes a new instance using the [topLeft] corner and the [size].
 * @param [location] The top left corner.
 * @param [size] The size to use.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-constructor-Rect(Point,Size)">Online Documentation</a>
 */
 constructor( location: Point ,
 size: Size )

/**
 * Gets the area of this instance which is the product of [width] and [height].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23area">Online Documentation</a>
 */
final val area: Double
/**
 * Gets the center X coordinate of the rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23centerX">Online Documentation</a>
 */
final val centerX: Double
/**
 * Gets the center Y coordinate of the rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23centerY">Online Documentation</a>
 */
final val centerY: Double
/**
 * Gets a value indicating whether this instance is finite.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23isFinite">Online Documentation</a>
 */
final val isFinite: Boolean
/**
 * Gets the X coordinates of the left side of this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23minX">Online Documentation</a>
 */
final val minX: Double
/**
 * Gets the Y coordinates of the top side of this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23minY">Online Documentation</a>
 */
final val minY: Double
/**
 * Gets the size of this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23size">Online Documentation</a>
 */
final val size: Size
/**
 * Returns the union of this rectangle and the given point.
 * @param [point] The point to include in the rectangle's bounds.
 * @return The enlarged rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-method-add">Online Documentation</a>
 */
 final   fun add( point: Point ):Rect

/**
 * Returns the union of this rectangle and the given point.
 * @param [point] The point to include in the rectangle's bounds.
 * @return The enlarged rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-method-add">Online Documentation</a>
 */
@JsName("add")
  final operator fun plus( point: Point ):Rect
/**
 * Determines whether this rectangle contains the specified point with respect to a given epsilon.
 * @param [point] The point to test.
 * @param [eps] The positive epsilon distance that the point may lie outside the rectangle and still be considered contained.
 * @return `true` if this rectangle contains the specified point; `false` otherwise. An [empty][isEmpty] instance never contains any point. A point is considered to be contained in the rectangle when the coordinates are not smaller than [minX] and [minY] minus `eps` nor greater than [maxX] and [maxY] plus `eps`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-method-containsWithEps">Online Documentation</a>
 */
 final   fun containsWithEps( point: Point ,
 eps: Double  = definedExternally):Boolean
/**
 * Finds the intersection between a rectangle and a line.
 * @param [inner] The coordinates of a point lying inside the rectangle.
 * @param [outer] The coordinates of a point lying outside the rectangle.
 * @return The intersection point if the inner point lies inside the rectangle, the outer point lies outside the rectangle and thus an intersection point has been found, or `null` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-method-findLineIntersection">Online Documentation</a>
 */
 final   fun findLineIntersection( inner: Point ,
 outer: Point ):Point?
/**
 * Creates an enlarged instance that is the same as this one but enlarged by the specified insets.
 * @param [insets] The insets to use to add to the instance.
 * @see [getReduced]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-method-getEnlarged">Online Documentation</a>
 */
 final   fun getEnlarged( insets: Insets ):Rect

/**
 * Creates an enlarged instance that is the same as this one but enlarged by the specified insets.
 * @param [insets] The insets to use to add to the instance.
 * @see [getReduced]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-method-getEnlarged">Online Documentation</a>
 */
@JsName("getEnlarged")
  final operator fun plus( insets: Insets ):Rect
/**
 * Creates a reduced instance that is the same as this one but reduced by the specified insets.
 * @param [insets] The insets to use to subtract from the instance.
 * @see [getEnlarged]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-method-getReduced">Online Documentation</a>
 */
 final   fun getReduced( insets: Insets ):Rect

/**
 * Creates a reduced instance that is the same as this one but reduced by the specified insets.
 * @param [insets] The insets to use to subtract from the instance.
 * @see [getEnlarged]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-method-getReduced">Online Documentation</a>
 */
@JsName("getReduced")
  final operator fun minus( insets: Insets ):Rect
/**
 * Applies the given transformation matrix to the four corner points and returns the new bounding box that includes all of them.
 * @param [transform] The transform matrix to apply.
 * @return A new [Rect] that represents the bounding box around the four transformed corner points.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-method-getTransformed">Online Documentation</a>
 */
 final   fun getTransformed( transform: Matrix ):Rect
/**
 * Returns a translated instance of this which has modified [x] and [y] by the given amount.
 * @param [delta] The delta to add to [x] and [y].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-method-getTranslated">Online Documentation</a>
 */
 final   fun getTranslated( delta: Point ):Rect
/**
 * Determines whether the bounds of this rectangle intersect with the bounds of the specified rectangle.
 * @param [rectangle] The rectangle to check.
 * @return Whether both instances are non-empty and have an intersection with positive [area].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-method-intersects(Rect)">Online Documentation</a>
 */
 final infix   fun intersects( rectangle: Rect ):Boolean
/**
 * Determines whether this rectangle intersects an [IOrientedRectangle], given an epsilon.
 * @param [rectangle] The [IOrientedRectangle] to test.
 * @param [eps] A positive value allows for fuzzy hit testing. If the point lies outside the given object but it's distance is less than or equal to that value, it will be considered a hit.
 * @return Whether they have a non-empty intersection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-method-intersects(IOrientedRectangle,number)">Online Documentation</a>
 */
 final   fun intersects( rectangle: IOrientedRectangle ,
 eps: Double  = definedExternally):Boolean
/**
 * Determines whether this rectangle intersects a line.
 * @param [start] The first end point of the line.
 * @param [end] The second end point of the line.
 * @return Whether the line intersects the rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-method-intersectsLine">Online Documentation</a>
 */
 final   fun intersectsLine( start: Point ,
 end: Point ):Boolean
/**
 * Determines whether a rectangle intersects a polygonal line.
 * @param [points] The list of points that is interpreted as a number of line segments.
 * @return `true` if the rectangle intersects at least one segment of the line.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-method-intersectsPolyline">Online Documentation</a>
 */
 final   fun intersectsPolyline( points: IEnumerable<IPoint> ):Boolean
/**
 * Creates a [MutableRectangle] using the values from this instance.
 * @return An instance that has been initialized from the values of this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-method-toMutableRectangle">Online Documentation</a>
 */
 final   fun toMutableRectangle():MutableRectangle
/**
 * Creates a [Rectangle2D] from a given [Rect].
 * @return The [Rectangle2D].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-defaultmethod-toRectangle2D">Online Documentation</a>
 */
   fun toRectangle2D():Rectangle2D
/**
 * Creates a [YRectangle] from a given [Rect].
 * @return The [YRectangle].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-defaultmethod-toYRectangle">Online Documentation</a>
 */
   fun toYRectangle():YRectangle

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

companion object : ClassMetadata<Rect> {
/**
 * An [empty][isEmpty] rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23EMPTY">Online Documentation</a>
 */
 val EMPTY: Rect
/**
 * An infinite rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23INFINITE">Online Documentation</a>
 */
 val INFINITE: Rect
/**
 * Returns the union of the given rectangles.
 * @receiver The first rectangle to use for the union.
 * @param [secondRectangle] The second rectangle to use for the union.
 * @return A rectangle that encompasses the area of the two given rectangles.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-method-add">Online Documentation</a>
 */
@JsName("add")
  final operator fun Rect.plus( secondRectangle: Rect ):Rect
/**
 * Performs an explicit conversion from [MutableRectangle] to [Rect].
 * @param [rectangle] The rectangle to convert.
 * @return The result of the conversion.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-method-convertFrom">Online Documentation</a>
 */
@JsName("convertFrom")
  operator fun invoke( rectangle: MutableRectangle ):Rect
/**
 * Performs an explicit conversion from [Rect] to [MutableRectangle].
 * @param [rectangle] The rectangle to convert.
 * @return The result of the conversion.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-method-convertToMutableRectangle">Online Documentation</a>
 */
   fun convertToMutableRectangle( rectangle: Rect ):MutableRectangle
/**
 * Creates a new instance given the center of the rectangle and its size.
 * @param [center] The center to use.
 * @param [size] The size to assign.
 * @return An instance whose center is set to `center` and size is `size`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-method-fromCenter">Online Documentation</a>
 */
 final   fun fromCenter( center: IPoint ,
 size: ISize ):Rect
}
}
