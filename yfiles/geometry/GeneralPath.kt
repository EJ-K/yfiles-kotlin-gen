// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.geometry

import js.array.ReadonlyArray
import web.svg.SVGPathElement
import yfiles.lang.ClassMetadata
import yfiles.lang.ICloneable

/**
 * Models a path that consists of lines and Bézier curves.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath">Online Documentation</a>
 * 
 * @constructor Creates a new instance with the given initial capacity.
 * @param [capacity] The number of elements for which storage will be allocated initially.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-constructor-GeneralPath">Online Documentation</a>
 */
external class GeneralPath (
  capacity: Int  = definedExternally,
) : ICloneable<GeneralPath> {
  /**
   * Gets a value indicating whether the path contains visible parts.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23isVisible">Online Documentation</a>
   */
  final val isVisible: Boolean
  
  /**
   * Gets the last coordinates of the last path element.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23lastCoordinate">Online Documentation</a>
   */
  final val lastCoordinate: Point
  
  /**
   * Gets the last x-coordinate of the last path element.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23lastX">Online Documentation</a>
   */
  final val lastX: Double
  
  /**
   * Gets the last y coordinate of the last path element.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23lastY">Online Documentation</a>
   */
  final val lastY: Double
  
  /**
   * Gets the number of [PathType] operations stored in this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23size">Online Documentation</a>
   */
  final val size: Int
  
  /**
   * Appends the contents of the given path to this path.
   * @param [other] The path to append to this path.
   * @param [connect] Whether to connect the path to the end of this path.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-append(GeneralPath,boolean)">Online Documentation</a>
   */
  fun append(
    other: GeneralPath,
    connect: Boolean,
  )
  
  /**
   * Appends parts of the contents of the given path to this path.
   * @param [other] The path to append to this path.
   * @param [beginIndex] The first element to be copied from `other`, inclusively.
   * @param [endIndex] The last element to be copied from `other`, exclusively.
   * @param [connect] Whether to connect the path to the end of this path.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-append(GeneralPath,number,number,boolean)">Online Documentation</a>
   */
  fun append(
    other: GeneralPath,
    beginIndex: Int,
    endIndex: Int,
    connect: Boolean,
  )
  
  /**
   * Appends an ellipse using the given bounds to this instance.
   * @param [bounds] The bounds of the ellipse.
   * @param [connect] Whether to initially [lineTo][GeneralPath] the ellipse's lowest point.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-appendEllipse">Online Documentation</a>
   */
  fun appendEllipse(
    bounds: IRectangle,
    connect: Boolean,
  )
  
  /**
   * Appends an [IOrientedRectangle] to this path instance.
   * @param [rectangle] The [IOrientedRectangle] to get the coordinates from.
   * @param [connect] Whether to use a [lineTo][GeneralPath] to the anchor corner.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-appendOrientedRectangle">Online Documentation</a>
   */
  fun appendOrientedRectangle(
    rectangle: IOrientedRectangle,
    connect: Boolean,
  )
  
  /**
   * Appends a rectangle to this path instance.
   * @param [rectangle] The rectangle to get the coordinates from.
   * @param [connect] Whether to use a [lineTo][GeneralPath] to the upper left corner.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-appendRectangle">Online Documentation</a>
   */
  fun appendRectangle(
    rectangle: IRectangle,
    connect: Boolean,
  )
  
  /**
   * Checks whether the point lies inside the area that is described by this path instance.
   * @param [point] The coordinates of the point to test.
   * @param [flatteningTolerance] The value for the accuracy when flattening Bézier curves during the test. The default is `0.5`.
   * @return Whether the point lies within the area described by this path.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-areaContains">Online Documentation</a>
   */
  fun areaContains(
    point: IPoint,
    flatteningTolerance: Double  = definedExternally,
  ): Boolean
  
  /**
   * Determines whether the area formed by this instance intersects with the area formed by the given path instance.
   * @param [other] The other instance to check against.
   * @param [flatteningTolerance] The epsilon value that is used for the accuracy with which the implementation should test Bézier curves within the path for intersections. The default value is `0.5`.
   * @return Whether the filled area of this path intersects with the stroke or filled area of the given path.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-areaIntersects">Online Documentation</a>
   */
  fun areaIntersects(
    other: GeneralPath,
    flatteningTolerance: Double  = definedExternally,
  ): Boolean
  
  /**
   * Checks whether the point lies inside the area described by this path instance.
   * @param [point] The coordinates of the point to test.
   * @param [eps] The allowed distance from the point to the path that is considered a hit.
   * @return Whether the point lies within the area described by this path.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-areaOrPathContains">Online Documentation</a>
   */
  fun areaOrPathContains(
    point: IPoint,
    eps: Double,
  ): Boolean
  
  /**
   * Resets this path to be an empty path.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-clear">Online Documentation</a>
   */
  fun clear()
  
  /**
   * Creates a clone of this instance, copying the path information to the new instance.
   * @return An exact clone of this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-clone">Online Documentation</a>
   */
  override fun clone(): GeneralPath
  
  /**
   * Appends a [CLOSE][PathType] operation to the path elements, creating a line to the last [MOVE_TO][PathType] position.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-close">Online Documentation</a>
   */
  fun close()
  
  /**
   * Compresses the internal data structures so that the amount of memory used by this instance is minimal with respect to the information stored in it.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-compress">Online Documentation</a>
   */
  fun compress()
  
  /**
   * Creates a cursor for iterating over the elements of this path.
   * @return A cursor to iterate over this path.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-createCursor">Online Documentation</a>
   */
  fun createCursor(): GeneralPathCursor
  
  /**
   * Creates a new path based on this one where corners are smoothed with a quadratic Bézier arc starting at `smoothingLength` away from the corner.
   * @param [smoothingLength] Distance from the corner where the arc begins.
   * @param [smoothingPolicy] A [SmoothingPolicy] value specifying how corners should be smoothed.
   * @param [straightEnds] A value indicating whether the first and last segment of a path figure should end with a straight line segment, or whether the adjacent corner can be smoothed up to the very end of the path (if `smoothingLength` is large enough).
   * @return A new path, with its corners smoothed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-createSmoothedPath">Online Documentation</a>
   */
  fun createSmoothedPath(
    smoothingLength: Double,
    smoothingPolicy: SmoothingPolicy  = definedExternally,
    straightEnds: Boolean  = definedExternally,
  ): GeneralPath
  
  /**
   * Creates an SVG `path` element using the provided parameters.
   * @param [transform] The matrix to apply to the path data.
   * @return A [path][SVGPathElement] that displays this instance using the provided attributes.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-createSvgPath">Online Documentation</a>
   */
  fun createSvgPath(
    transform: Matrix  = definedExternally,
  ): SVGPathElement
  
  /**
   * Creates the data for a SVG `path` element that corresponds to this instance with the provided transform.
   * @param [transform] The transform to apply to the created data.
   * @return The path data for an SVG `path` element that corresponds to this instance with the provided transform.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-createSvgPathData">Online Documentation</a>
   */
  fun createSvgPathData(
    transform: Matrix  = definedExternally,
  ): String
  
  /**
   * Creates a new [GeneralPath] that is a copy of this path with all geometry transformed using the supplied matrix.
   * @param [transform] The matrix to multiply the geometry with.
   * @return A new path.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-createTransformedPath">Online Documentation</a>
   */
  fun createTransformedPath(
    transform: Matrix,
  ): GeneralPath
  
  /**
   * Crops the path after the position indicated by the cursor.
   * @param [cursor] The cursor that depicts a position in this path.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-cropAfter">Online Documentation</a>
   */
  fun cropAfter(
    cursor: GeneralPathCursor,
  )
  
  /**
   * Crops the path before the position indicated by the cursor.
   * @param [cursor] The cursor that depicts a position in this path.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-cropBefore">Online Documentation</a>
   */
  fun cropBefore(
    cursor: GeneralPathCursor,
  )
  
  /**
   * Appends a [cubic Bézier curve][PathType] to the path elements.
   * @param [c1] The coordinates of the first Bézier control point.
   * @param [c2] The coordinates of the second Bézier control point.
   * @param [end] The coordinates of the curve's end point.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-cubicTo(IPoint,IPoint,IPoint)">Online Documentation</a>
   */
  fun cubicTo(
    c1: IPoint,
    c2: IPoint,
    end: IPoint,
  )
  
  /**
   * Appends a [cubic Bézier curve][PathType] to the path elements.
   * @param [c1x] The x coordinate of the first Bézier control point.
   * @param [c1y] The y coordinate of the first Bézier control point.
   * @param [c2x] The x coordinate of the second Bézier control point.
   * @param [c2y] The y coordinate of the second Bézier control point.
   * @param [x] The x coordinate of the curve's end point.
   * @param [y] The y coordinate of the curve's end point.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-cubicTo(number,number,number,number,number,number)">Online Documentation</a>
   */
  fun cubicTo(
    c1x: Double,
    c1y: Double,
    c2x: Double,
    c2y: Double,
    x: Double,
    y: Double,
  )
  
  /**
   * Finds an intersection point between a line and this [GeneralPath].
   * @param [start] The coordinates of the first point of the line.
   * @param [end] The coordinates of the second point of the line.
   * @param [eps] The value to use for interpolating Bézier curves.
   * @return The factor to calculate the intersection point or `double.PositiveInfinity`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-findLineIntersection">Online Documentation</a>
   */
  fun findLineIntersection(
    start: IPoint,
    end: IPoint,
    eps: Double  = definedExternally,
  ): Double
  
  /**
   * Finds the first intersection of a ray with this [GeneralPath] using a given epsilon for flattening Bézier curves contained in the path.
   * @param [anchor] The coordinates of the anchor point of the ray.
   * @param [direction] The coordinates of the direction vector of the ray.
   * @param [flatteningTolerance] The epsilon value that is used for the accuracy with which the implementation should test Bézier curves within the path for intersections. By default this is `0.5`.
   * @return The factor to calculate the intersection point or `double.PositiveInfinity`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-findRayIntersection">Online Documentation</a>
   */
  fun findRayIntersection(
    anchor: IPoint,
    direction: IPoint,
    flatteningTolerance: Double  = definedExternally,
  ): Double
  
  /**
   * Creates a new path from this instance flattening all Bézier curves using the given tolerance.
   * @param [flatteningTolerance] The maximum value the flattened path may diverge from the original path for the Bézier curve line interpolations. The default is `0.5`.
   * @return A new path that does not contain Bézier curve segments.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-flatten">Online Documentation</a>
   */
  fun flatten(
    flatteningTolerance: Double  = definedExternally,
  ): GeneralPath
  
  /**
   * Calculates approximate bounds of this path.
   * @return The approximate bounds of the path.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-getApproximateBounds">Online Documentation</a>
   */
  fun getApproximateBounds(): Rect
  
  /**
   * Calculates the exact bounds of the path.
   * @param [flatteningTolerance] The maximum value the flattened path may diverge from the original path for the Bézier curve line interpolations. The default is `0.5`. If the given epsilon is `0.0`, the path's B ézier curve segments are not flattened. Instead, this method calculates exact tight bounds for Bézier curve segments.
   * @return The exact bounds of the path.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-getBounds">Online Documentation</a>
   */
  fun getBounds(
    flatteningTolerance: Double  = definedExternally,
  ): Rect
  
  /**
   * Returns the geometric length of this path.
   * @return The length of this path.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-getLength">Online Documentation</a>
   */
  fun getLength(): Double
  
  /**
   * Gets a point on this path instance at the given ratio.
   * @param [ratio] A value between 0 and 1 inclusively that indicates a ratio from the beginning to the end of this path.
   * @return The coordinates of the point.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-getPoint">Online Documentation</a>
   */
  fun getPoint(
    ratio: Double,
  ): Point
  
  /**
   * Gets the projection of `point` onto the segment `segmentIndex`.
   * @param [point] The point which should be projected onto the segment.
   * @param [segmentIndex] The segment index. Note that only linear, cubic, or close segments are considered.
   * @return A ratio describing the projection onto the segment, or `null` if no such projection exists in the interval [0,1].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-getProjection">Online Documentation</a>
   */
  fun getProjection(
    point: IPoint,
    segmentIndex: Int,
  ): Double?
  
  /**
   * Gets the number of segments in this path, that is the number of [LINE_TO][PathType] and [CLOSE][PathType] operations.
   * @return The number of segments.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-getSegmentCount">Online Documentation</a>
   */
  fun getSegmentCount(): Int
  
  /**
   * Gets the tangent on this path instance at the given ratio.
   * @param [ratio] A value between 0 and 1 inclusively that indicates a ratio from the beginning to the end of this path.
   * @return The tangent, if any exists; `null` otherwise. The tangent vector may not be normalized.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-getTangent">Online Documentation</a>
   */
  fun getTangent(
    ratio: Double,
  ): Tangent?
  
  /**
   * Gets the tangent on this path instance at the segment and segment ratio.
   * @param [segmentIndex] The segment index to determine a point at.
   * @param [ratio] A value between 0 and 1 inclusively that indicates a ratio from the beginning to the end of the segment at segmentIndex for this path.
   * @return The tangent, if any exists; `null` otherwise. The tangent vector may not be normalized.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-getTangentForSegment">Online Documentation</a>
   */
  fun getTangentForSegment(
    segmentIndex: Int,
    ratio: Double,
  ): Tangent?
  
  /**
   * Determines whether a given [GeneralPath] instance can be considered equivalent to this one, that is, both represent the same path with the same sub-path types and coordinates.
   * @param [path] The other [GeneralPath] instance to compare.
   * @return `true` if `path` and this instance have the same sub-path types and coordinates, `false` if not.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-hasSameValue">Online Documentation</a>
   */
  infix fun hasSameValue(
    path: GeneralPath?,
  ): Boolean
  
  /**
   * Appends a [LINE_TO][PathType] operation to the path elements.
   * @param [point] The coordinates of the line's end point.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-lineTo(IPoint)">Online Documentation</a>
   */
  fun lineTo(
    point: IPoint,
  )
  
  /**
   * Appends a [LINE_TO][PathType] operation to the path elements.
   * @param [x] The x coordinate of the line's end point.
   * @param [y] The y coordinate of the line's end point.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-lineTo(number,number)">Online Documentation</a>
   */
  fun lineTo(
    x: Double,
    y: Double,
  )
  
  /**
   * Appends a [MOVE_TO][PathType] operation to the path elements.
   * @param [point] The next coordinate.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-moveTo(IPoint)">Online Documentation</a>
   */
  fun moveTo(
    point: IPoint,
  )
  
  /**
   * Appends a [MOVE_TO][PathType] operation to the path elements.
   * @param [x] The next x coordinate.
   * @param [y] The next y coordinate.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-moveTo(number,number)">Online Documentation</a>
   */
  fun moveTo(
    x: Double,
    y: Double,
  )
  
  /**
   * Tests whether the line of the path is hit at the given point using an epsilon for fuzzy hit testing.
   * @param [point] The coordinates of the point to test.
   * @param [eps] The allowed distance from the point to the path that is considered a hit.
   * @return Whether the point hits the path.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-pathContains">Online Documentation</a>
   */
  fun pathContains(
    point: IPoint,
    eps: Double,
  ): Boolean
  
  /**
   * Determines whether this path's stroked segments intersect with a given path.
   * @param [other] The other path to check against this path.
   * @param [flatteningTolerance] The epsilon value that is used for the accuracy of the Bézier curves with which the implementation should test Bézier curves within the path for intersections. The default is `0.5`.
   * @return True if this path's stroked segments intersect the other path's stroked segments.
   * @see [areaIntersects]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-pathIntersects(GeneralPath,number)">Online Documentation</a>
   */
  fun pathIntersects(
    other: GeneralPath,
    flatteningTolerance: Double  = definedExternally,
  ): Boolean
  
  /**
   * Checks whether this path intersects the given rectangle.
   * @param [rectangle] The rectangle to test.
   * @param [flatteningTolerance] The epsilon value that is used for the accuracy of the Bézier curves with which the implementation should test Bézier curves within the path for intersections. The default is `0.5`.
   * @return Whether the path described by this instance intersects the rectangle.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-pathIntersects(IRectangle,number)">Online Documentation</a>
   */
  fun pathIntersects(
    rectangle: IRectangle,
    flatteningTolerance: Double  = definedExternally,
  ): Boolean
  
  /**
   * Performs a quick test to decide whether this path might intersect the clipping rectangle, provided the path would be rendered using a stroke of the given width.
   * @param [clip] The clip to check for intersection.
   * @param [strokeWidth] The width of the stroke.
   * @return `false` if it is guaranteed that this instance would not intersect the given clip.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-pathMayIntersectClip">Online Documentation</a>
   */
  fun pathMayIntersectClip(
    clip: IRectangle,
    strokeWidth: Double,
  ): Boolean
  
  /**
   * Adds the contents of the given path to the beginning of this path.
   * @param [other] The path to append to this path.
   * @param [connect] Whether to connect the path to the end of this path.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-prepend">Online Documentation</a>
   */
  fun prepend(
    other: GeneralPath,
    connect: Boolean,
  )
  
  /**
   * Appends a [quadratic Bézier curve][PathType] to the path elements.
   * @param [center] The coordinates of the Bézier control point.
   * @param [point] The coordinates of the curve's end point.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-quadTo(IPoint,IPoint)">Online Documentation</a>
   */
  fun quadTo(
    center: IPoint,
    point: IPoint,
  )
  
  /**
   * Appends a [quadratic Bézier curve][PathType] to the path elements.
   * @param [cx] The x coordinate of the Bézier control point.
   * @param [cy] The y coordinate of the Bézier control point.
   * @param [x] The x coordinate of the curve's end point.
   * @param [y] The y coordinate of the curve's end point.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-quadTo(number,number,number,number)">Online Documentation</a>
   */
  fun quadTo(
    cx: Double,
    cy: Double,
    x: Double,
    y: Double,
  )
  
  /**
   * Transforms this [GeneralPath] in place using the given transform.
   * @param [transform] The matrix to multiply the geometry with.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-transform">Online Documentation</a>
   */
  fun transform(
    transform: Matrix,
  )
  
  companion object : ClassMetadata<GeneralPath> {
    /**
     * Determines new control points for splitting a cubic Bézier segment.
     * @param [cp0] The start point of the segment
     * @param [cp1] The first control point of the segment
     * @param [cp2] The second control point of the segment
     * @param [cp3] The control points of the cubic segment
     * @param [splitBefore] A value indicating whether the new control points for the segment before or after the cut should be returned
     * @param [t] The parameter for De Casteljau's algorithm to determine the splitting point in the interval [0..1].
     * @return An array of length 4 with the new start, end, and control points for the segment either preceding or following the desired split point.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GeneralPath%23GeneralPath-method-getCubicSplitPoints">Online Documentation</a>
     */
    fun getCubicSplitPoints(
      cp0: Point,
      cp1: Point,
      cp2: Point,
      cp3: Point,
      splitBefore: Boolean,
      t: Double,
    ): ReadonlyArray<Point>
  }
}

inline fun GeneralPath(
    block: GeneralPath.() -> Unit
): GeneralPath {
    return GeneralPath()
        .apply(block)
}
