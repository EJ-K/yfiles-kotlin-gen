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
import yfiles.lang.YObject

/**
 * This class represents a vector in the 2-dimensional real vector space.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YVector">Online Documentation</a>
 * 
 * @constructor Creates a new vector which is a copy of another vector.
 * @param [v] the vector, whose values are copied.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YVector%23YVector-constructor-YVector(YVector)">Online Documentation</a>
 */
external open class YVector  ( v: YVector ) : YObject {
/**
 * Creates a new vector with given direction.
 * @param [dx] the first coordinate
 * @param [dy] the second coordinate
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YVector%23YVector-constructor-YVector(number,number)">Online Documentation</a>
 */
 constructor( dx: Double ,
 dy: Double )
/**
 * Creates a new vector, whose direction is given by two points.
 * @param [to] vector end point.
 * @param [from] vector start point. If no point is specified, `(0,0)` is used instead.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YVector%23YVector-constructor-YVector(YPoint,YPoint)">Online Documentation</a>
 */
 constructor( to: YPoint ,
 from: YPoint?  = definedExternally)
/**
 * Creates a new vector, whose direction is given by two points.
 * @param [x1] the X-coordinate of the first point.
 * @param [y1] the Y-coordinate of the first point.
 * @param [x2] the X-coordinate of the second point.
 * @param [y2] the Y-coordinate of the second point.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YVector%23YVector-constructor-YVector(number,number,number,number)">Online Documentation</a>
 */
 constructor( x1: Double ,
 y1: Double ,
 x2: Double ,
 y2: Double )

/**
 * Gets the first coordinate of the vector.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YVector%23x">Online Documentation</a>
 */
open val x: Double
/**
 * Gets the second coordinate of the vector.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YVector%23y">Online Documentation</a>
 */
open val y: Double
/**
 * Adds a vector to this vector.
 * @param [v] the vector to add.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YVector%23YVector-method-add">Online Documentation</a>
 */
 open   fun add( v: YVector )

/**
 * Adds a vector to this vector.
 * @param [v] the vector to add.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YVector%23YVector-method-add">Online Documentation</a>
 */
@JsName("add")
  final operator fun plusAssign( v: YVector )
/**
 * Returns the length of the vector, this is the value of the euclidean norm.
 * @return a value > 0.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YVector%23YVector-method-length">Online Documentation</a>
 */
 open   fun length():Double
/**
 * Assigns unit length to the vector.
 * ### Postconditions
 * - length() == 1.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YVector%23YVector-method-norm">Online Documentation</a>
 */
 open   fun norm()
/**
 * Returns a new `YVector` instance that is obtained by rotating this vector by the given angle (measured in radians) in clockwise direction (with regards to screen coordinates).
 * @param [angle] the angle of rotation in radians.
 * @return the rotated vector.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YVector%23YVector-method-rotate">Online Documentation</a>
 */
 open   fun rotate( angle: Double ):YVector
/**
 * Scales the vector by an factor.
 * @param [factor] the scale factor, with which the length is multiplied.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YVector%23YVector-method-scale">Online Documentation</a>
 */
 open   fun scale( factor: Double )
/**
 * Creates a [Point] from a given [YVector].
 * @return The [Point].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YVector%23YVector-defaultmethod-toPoint">Online Documentation</a>
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

companion object : ClassMetadata<YVector> {
/**
 * Adds two vectors and returns the result.
 * @receiver first vector to sum.
 * @param [w] second vector to sum.
 * @return v+w
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YVector%23YVector-method-add(YVector,YVector)">Online Documentation</a>
 */
@JsName("add")
  final operator fun YVector.plus( w: YVector ):YVector
/**
 * Adds the vector to a point and returns the resulting point.
 * @param [p] a point.
 * @param [v] the vector to add to the point.
 * @return p+v
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YVector%23YVector-method-add(YPoint,YVector)">Online Documentation</a>
 */
 final   fun add( p: YPoint ,
 v: YVector ):YPoint
/**
 * Returns the result of the addition of two angles between `0` and `2*Pi`.
 * @param [a1] a value in `[0,2Pi)`.
 * @param [a2] a value in `[0,2Pi)`.
 * @return The sum of a1 and a2 modulo `2*Pi`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YVector%23YVector-method-addAngle">Online Documentation</a>
 */
 final   fun addAngle( a1: Double ,
 a2: Double ):Double
/**
 * Returns the angle (measured in radians) between two vectors in clockwise order (with regards to screen coordinates) from v1 to v2.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YVector%23YVector-method-angle">Online Documentation</a>
 */
 final   fun angle( v1: YVector ,
 v2: YVector ):Double
/**
 * Returns this vector with unit length.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YVector%23YVector-method-getNormal">Online Documentation</a>
 */
 final   fun getNormal( v: YVector ):YVector
/**
 * Returns the vector which is orthogonal to the given one and has unit length.
 * @param [v] a vector.
 * @return a vector which is orthogonal to v with unit length.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YVector%23YVector-method-orthoNormal">Online Documentation</a>
 */
 final   fun orthoNormal( v: YVector ):YVector
/**
 * Returns true if vector v1 is on the right side of v2.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YVector%23YVector-method-rightOf">Online Documentation</a>
 */
 final   fun rightOf( v1: YVector ,
 v2: YVector ):Boolean
/**
 * Returns the value of the scalar product of two vectors.
 * @param [v1] the first vector.
 * @param [v2] the second vector.
 * @return `v1.x * v2.x + v1.y * v2.y`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/YVector%23YVector-method-scalarProduct">Online Documentation</a>
 */
 final   fun scalarProduct( v1: YVector ,
 v2: YVector ):Double
}
}
