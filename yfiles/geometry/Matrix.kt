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
import web.canvas.CanvasRenderingContext2D
import web.html.HTMLElement
import web.svg.SVGElement
import yfiles.lang.ClassMetadata
import yfiles.lang.ICloneable

/**
 * An implementation of a matrix that represents an affine transformation and works with [Point].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Matrix">Online Documentation</a>
 * 
 * @constructor Creates an identity matrix.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Matrix%23Matrix-constructor-Matrix()">Online Documentation</a>
 */
external class Matrix () : ICloneable<Matrix> {
  /**
   * Creates a matrix using the provided matrix entries.
   * @param [m11] The value in the first row and first column of the matrix, representing the x scaling factor.
   * @param [m12] The value in the first row and second column of the matrix, representing the x shear factor.
   * @param [m21] The value in the second row and first column of the matrix, representing the y shear factor.
   * @param [m22] The value in the second row and second column of the matrix, representing the y scaling factor.
   * @param [dx] The value in the first row and third column of the matrix, representing the x translation (offset).
   * @param [dy] The value in the second row and third column of the matrix, representing the y translation (offset).
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Matrix%23Matrix-constructor-Matrix(number,number,number,number,number,number)">Online Documentation</a>
   */ constructor(
    m11: Double,
    m12: Double,
    m21: Double,
    m22: Double,
    dx: Double,
    dy: Double,
  )
  /**
   * Gets a new double[] of the elements describing the matrix.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Matrix%23elements">Online Documentation</a>
   */
  final val elements: ReadonlyArray<Double>
  
  /**
   * Applies this matrix to the given HTML canvas rendering context.
   * @param [ctx] The context to transform.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Matrix%23Matrix-method-applyTo(CanvasRenderingContext2D)">Online Documentation</a>
   */
  fun applyTo(
    ctx: CanvasRenderingContext2D,
  )
  
  /**
   * Applies this matrix to the given SVG element.
   * @param [element] The element to transform.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Matrix%23Matrix-method-applyTo(SVGElement)">Online Documentation</a>
   */
  fun applyTo(
    element: SVGElement,
  )
  
  /**
   * Applies this matrix to the given HTML element.
   * @param [element] The element to transform.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Matrix%23Matrix-method-applyTo(HTMLElement)">Online Documentation</a>
   */
  fun applyTo(
    element: HTMLElement,
  )
  
  /**
   * Transforms the four corner points of the given rectangle and returns the bounds of the transformed points.
   * @param [rectangle] The rectangle instance.
   * @return A new [Rect] that represents the bounds around the four transformed corner points.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Matrix%23Matrix-method-calculateTransformedBounds">Online Documentation</a>
   */
  fun calculateTransformedBounds(
    rectangle: Rect,
  ): Rect
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Matrix%23Matrix-method-clone">Online Documentation</a>
   */
  override fun clone(): Matrix
  
  /**
   * Determines whether `this` has the same values like `other`.
   * @param [other] The object to compare `this` to. Must be of the same type.
   * @return `true` if `this` has the same values like the other object.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Matrix%23Matrix-method-hasSameValue">Online Documentation</a>
   */
  infix fun hasSameValue(
    other: Matrix?,
  ): Boolean
  
  /**
   * Inverts this instance in place.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Matrix%23Matrix-method-invert">Online Documentation</a>
   */
  fun invert()
  
  /**
   * Multiplies this matrix instance by the given instance using the given order.
   * @param [matrix] The matrix to multiply with this one.
   * @param [order] The order of the multiplication. [PREPEND][MatrixOrder] if not specified.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Matrix%23Matrix-method-multiply">Online Documentation</a>
   */
  fun multiply(
    matrix: Matrix,
    order: MatrixOrder  = definedExternally,
  )
  
  /**
   * Resets this instance to the identity.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Matrix%23Matrix-method-reset">Online Documentation</a>
   */
  fun reset()
  
  /**
   * Prepends or appends a rotation operation to this matrix around the origin.
   * @param [theta] The rotation angle in radians
   * @param [order] Whether to append or prepend the rotation matrix.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Matrix%23Matrix-method-rotate(number,MatrixOrder)">Online Documentation</a>
   */
  fun rotate(
    theta: Double,
    order: MatrixOrder  = definedExternally,
  )
  
  /**
   * Prepends or appends a rotation operation to this matrix around the specified rotation center.
   * @param [theta] The rotation angle in radians
   * @param [center] The center of the rotation.
   * @param [order] Whether to append or prepend the rotation matrix.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Matrix%23Matrix-method-rotate(number,Point,MatrixOrder)">Online Documentation</a>
   */
  fun rotate(
    theta: Double,
    center: Point,
    order: MatrixOrder  = definedExternally,
  )
  
  /**
   * Appends or prepends a scale operation to this instance.
   * @param [x] The x-axis scaling factor.
   * @param [y] The y-axis scaling factor.
   * @param [order] The order in which the scaling should be applied. The default is [PREPEND][MatrixOrder].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Matrix%23Matrix-method-scale">Online Documentation</a>
   */
  fun scale(
    x: Double,
    y: Double,
    order: MatrixOrder  = definedExternally,
  )
  
  /**
   * Sets the values of the given `matrix` to this instance.
   * @param [matrix] The matrix to get the values from.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Matrix%23Matrix-method-set(Matrix)">Online Documentation</a>
   */
  fun set(
    matrix: Matrix,
  )
  
  /**
   * Sets all elements of this instance.
   * @param [m0] The value for M11.
   * @param [m1] The value for M12.
   * @param [m2] The value for M21.
   * @param [m3] The value for M22.
   * @param [dx] Translation in x-direction.
   * @param [dy] Translation in y-direction.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Matrix%23Matrix-method-set(number,number,number,number,number,number)">Online Documentation</a>
   */
  fun set(
    m0: Double,
    m1: Double,
    m2: Double,
    m3: Double,
    dx: Double,
    dy: Double,
  )
  
  /**
   * Converts the [Matrix] object to a CSS transform.
   * @return The transform string
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Matrix%23Matrix-method-toCssTransform">Online Documentation</a>
   */
  fun toCssTransform(): String
  
  /**
   * Converts the [Matrix] object to an SVG transform string.
   * @return The transform string
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Matrix%23Matrix-method-toSvgTransform">Online Documentation</a>
   */
  fun toSvgTransform(): String
  
  /**
   * Transforms the given coordinate.
   * @param [point] The coordinate to transform.
   * @return The transformed coordinates.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Matrix%23Matrix-method-transform(Point)">Online Documentation</a>
   */
  fun transform(
    point: Point,
  ): Point
  
  /**
   * Transforms the given point in place.
   * @param [point] The point to transform and return.
   * @return `point`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Matrix%23Matrix-method-transform(IMutablePoint)">Online Documentation</a>
   */
  fun transform(
    point: IMutablePoint,
  ): IMutablePoint
  
  /**
   * Appends or Prepends a translation to this instance.
   * @param [delta] The translation delta.
   * @param [order] The order in which the translation should be applied. The default is [PREPEND][MatrixOrder].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Matrix%23Matrix-method-translate">Online Documentation</a>
   */
  fun translate(
    delta: Point,
    order: MatrixOrder  = definedExternally,
  )
  
  companion object : ClassMetadata<Matrix> {
    /**
     * Gets an unmodifiable identity matrix.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Matrix%23IDENTITY">Online Documentation</a>
     */
     val IDENTITY: Matrix
    
    /**
     * Gets an unmodifiable projection matrix that makes the graph look isometric.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Matrix%23ISOMETRIC">Online Documentation</a>
     */
     val ISOMETRIC: Matrix
    
    /**
     * Creates a matrix rotation instance around the origin.
     * @param [theta] The rotation angle in radians.
     * @return A new matrix.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Matrix%23Matrix-method-createRotateInstance">Online Documentation</a>
     */
    fun createRotateInstance(
      theta: Double,
    ): Matrix
    
    /**
     * Creates a transformation matrix that can be used to transform points that are in the local coordinate system of the oriented rectangle if the top-left corner is the origin.
     * @param [rectangle] The oriented rectangle to use for defining the coordinate space.
     * @return A matrix that can be used to transform from oriented rectangle coordinates to world coordinates.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Matrix%23Matrix-method-createTransform">Online Documentation</a>
     */
    fun createTransform(
      rectangle: IOrientedRectangle,
    ): Matrix
    
    /**
     * Implements the vector transformation by calling [transform][Matrix].
     * @param [matrix] The matrix to use for the transformation.
     * @param [vector] The vector to transform.
     * @return The result of the transformation.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Matrix%23Matrix-method-multiply">Online Documentation</a>
     */
    fun multiply(
      matrix: Matrix,
      vector: Point,
    ): Point
  }
}

inline fun Matrix(
    block: Matrix.() -> Unit
): Matrix {
    return Matrix()
        .apply(block)
}
