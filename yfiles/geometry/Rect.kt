// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.geometry

import yfiles.collections.IEnumerable
import yfiles.lang.ClassMetadata

/**
 * Represents an axis-aligned rectangle in two-dimensional Cartesian coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect">Online Documentation</a>
 * 
 * @constructor Creates a new instance for the given values.
 * @param [x] The [x][Rect] coordinate of the top left corner.
 * @param [y] The [y][Rect] coordinate of the top left corner.
 * @param [width] The [width][Rect] of the rectangle.
 * @param [height] The [height][Rect] of the rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-constructor-Rect(number,number,number,number)">Online Documentation</a>
 * 
 * @property x
 * Gets the x-coordinate of the upper left corner of the rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23x">Online Documentation</a>
 * 
 * @property y
 * Gets the y-coordinate of the upper left corner of the rectangle.
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
external class Rect (
final override val x: Double,
final override val y: Double,
final override val width: Double,
final override val height: Double) : IRectangle {
  /**
   * Creates a new instance from two points which define the bounds.
   * @param [p1] The first point to determine the bounds.
   * @param [p2] The second point to determine the bounds.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-constructor-Rect(Point,Point)">Online Documentation</a>
   */ constructor(
    p1: Point,
    p2: Point,
  )
  /**
   * Creates a new instance using the given location as [x][Rect] and [y][Rect], and the given size as [width][Rect] and [height][Rect].
   * @param [location] The top left corner.
   * @param [size] The size to use.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-constructor-Rect(Point,Size)">Online Documentation</a>
   */ constructor(
    location: Point,
    size: Size,
  )
  /**
   * Gets the area of this instance which is the product of [width][Rect] and [height][Rect].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23area">Online Documentation</a>
   */
  final val area: Double
  
  /**
   * Gets a value indicating whether this instance is finite.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23isFinite">Online Documentation</a>
   */
  final val isFinite: Boolean
  
  /**
   * Returns the union of this rectangle and the given point.
   * @param [point] The point to include in the rectangle's bounds.
   * @return The enlarged rectangle.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-method-add">Online Documentation</a>
   */
  fun add(
    point: Point,
  ): Rect
  
  /**
   * Returns the union of this rectangle and the given point.
   * @param [point] The point to include in the rectangle's bounds.
   * @return The enlarged rectangle.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-method-add">Online Documentation</a>
   */
  @JsName("add")
  final operator fun plus(
    point: Point,
  ): Rect
  
  /**
   * Returns the Euclidean distance between this rectangle and a given point.
   * @param [point] The point to calculate the distance to.
   * @return The Euclidean distance between this rectangle and the given point.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-method-distanceTo(Point)">Online Documentation</a>
   */
  infix fun distanceTo(
    point: Point,
  ): Double
  
  /**
   * Returns the Euclidean distance between this rectangle and a given rectangle.
   * @param [rect] The rectangle to calculate the distance to.
   * @return The Euclidean distance between this rectangle and the given rectangle.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-method-distanceTo(Rect)">Online Documentation</a>
   */
  infix fun distanceTo(
    rect: Rect,
  ): Double
  
  /**
   * Finds the intersection between a rectangle and a line.
   * @param [inner] The coordinates of a point lying inside the rectangle.
   * @param [outer] The coordinates of a point lying outside the rectangle.
   * @return The intersection point, if the inner point lies inside the rectangle and the outer point lies outside the rectangle and thus an intersection point has been found, or `null` otherwise.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-method-findLineIntersection">Online Documentation</a>
   */
  fun findLineIntersection(
    inner: Point,
    outer: Point,
  ): Point?
  
  /**
   * Creates an instance enlarged by the specified insets.
   * @param [insets] The insets used to enlarge this instance
   * @return An enlarged rectangle.
   * @see [getReduced]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-method-getEnlarged">Online Documentation</a>
   */
  fun getEnlarged(
    insets: Insets,
  ): Rect
  
  /**
   * Creates an instance enlarged by the specified insets.
   * @param [insets] The insets used to enlarge this instance
   * @return An enlarged rectangle.
   * @see [getReduced]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-method-getEnlarged">Online Documentation</a>
   */
  @JsName("getEnlarged")
  final operator fun plus(
    insets: Insets,
  ): Rect
  
  /**
   * Creates an instance reduced by the specified insets.
   * @param [insets] The insets used to reduce this instance.
   * @return A reduced rectangle.
   * @see [getEnlarged]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-method-getReduced">Online Documentation</a>
   */
  fun getReduced(
    insets: Insets,
  ): Rect
  
  /**
   * Creates an instance reduced by the specified insets.
   * @param [insets] The insets used to reduce this instance.
   * @return A reduced rectangle.
   * @see [getEnlarged]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-method-getReduced">Online Documentation</a>
   */
  @JsName("getReduced")
  final operator fun minus(
    insets: Insets,
  ): Rect
  
  /**
   * Returns a translated instance of this instance which has modified [x][Rect] and [y][Rect] by the given amount.
   * @param [delta] The delta to add to [x][Rect] and [y][Rect].
   * @return A translated instance of this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-method-getTranslated">Online Documentation</a>
   */
  fun getTranslated(
    delta: Point,
  ): Rect
  
  /**
   * Determines whether the bounds of this rectangle intersect with the bounds of the specified rectangle.
   * @param [rectangle] The rectangle to check.
   * @return Whether both instances are non-empty and have an intersection with positive area.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-method-intersects(Rect)">Online Documentation</a>
   */
  infix fun intersects(
    rectangle: Rect,
  ): Boolean
  
  /**
   * Determines whether this rectangle intersects an [IOrientedRectangle], given an epsilon.
   * @param [rectangle] The [IOrientedRectangle] to test.
   * @param [eps] A positive value allows for fuzzy hit testing. If the point lies outside the given object but its distance is less than or equal to that value, it will be considered a hit.
   * @return Whether they have a non-empty intersection.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-method-intersects(IOrientedRectangle,number)">Online Documentation</a>
   */
  fun intersects(
    rectangle: IOrientedRectangle,
    eps: Double  = definedExternally,
  ): Boolean
  
  /**
   * Determines whether this rectangle intersects a line.
   * @param [start] The first endpoint of the line.
   * @param [end] The second endpoint of the line.
   * @return Whether the line intersects the rectangle.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-method-intersectsLine">Online Documentation</a>
   */
  fun intersectsLine(
    start: Point,
    end: Point,
  ): Boolean
  
  /**
   * Determines whether this rectangle intersects the polygonal line defined by the given points.
   * @param [points] The list of points that is interpreted as a number of line segments.
   * @return `true` if this rectangle intersects at least one segment of the line.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-method-intersectsPolyline">Online Documentation</a>
   */
  fun intersectsPolyline(
    points: IEnumerable<IPoint>,
  ): Boolean
  
  /**
   * Creates a [MutableRectangle] using the values from this instance.
   * @return An instance that has been initialized from the values of this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-method-toMutableRectangle">Online Documentation</a>
   */
  fun toMutableRectangle(): MutableRectangle
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
     * An [empty][ISize] rectangle.
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
    final operator fun Rect.plus(
      secondRectangle: Rect,
    ): Rect
    
    /**
     * Creates a new instance given the center of the rectangle and its size.
     * @param [center] The center to use.
     * @param [size] The size to assign.
     * @return An instance whose center is set to `center` and size is `size`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Rect%23Rect-method-fromCenter">Online Documentation</a>
     */
    fun fromCenter(
      center: IPoint,
      size: ISize,
    ): Rect
  }
}
