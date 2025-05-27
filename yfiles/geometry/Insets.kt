// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.geometry

import yfiles.algorithms.YInsets
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * Represents insets (or outsets) for a rectangular area in two-dimensional Cartesian coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Insets">Online Documentation</a>
 * 
 * @constructor Initializes a new instance.
 * @param [left] The left inset.
 * @param [top] The top inset.
 * @param [right] The right inset.
 * @param [bottom] The bottom inset.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Insets%23Insets-constructor-Insets(number,number,number,number)">Online Documentation</a>
 * 
 * @property left
 * Gets the left inset.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Insets%23left">Online Documentation</a>
 * 
 * @property top
 * Gets the top inset.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Insets%23top">Online Documentation</a>
 * 
 * @property right
 * Gets the right inset.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Insets%23right">Online Documentation</a>
 * 
 * @property bottom
 * Gets the bottom inset.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Insets%23bottom">Online Documentation</a>
 */
external  class Insets  (
final val left: Double,
final val top: Double,
final val right: Double,
final val bottom: Double) : YObject {
/**
 * Initializes a new instance using the provided inset for all four sides.
 * @param [inset] The inset to use for all sides.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Insets%23Insets-constructor-Insets(number)">Online Documentation</a>
 */
 constructor( inset: Double )

/**
 * Gets the horizontal insets, which is the sum of [left] and [right].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Insets%23horizontalInsets">Online Documentation</a>
 */
final val horizontalInsets: Double
/**
 * Gets a value indicating whether this instance is empty, that is all insets are `0.0`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Insets%23isEmpty">Online Documentation</a>
 */
final val isEmpty: Boolean
/**
 * Gets the vertical insets, which is the sum of [top] and [bottom].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Insets%23verticalInsets">Online Documentation</a>
 */
final val verticalInsets: Double
/**
 * Calculates the union of this insets and the given inset which is done by performing [Math.max] on all four inset values.
 * @param [insets] The insets to max with these insets.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Insets%23Insets-method-createUnion">Online Documentation</a>
 */
 final   fun createUnion( insets: Insets ):Insets
/**
 * Creates an enlarged instance by adding the insets of the specified insets to this instance and returning the result.
 * @param [insets] The insets to add to this insets.
 * @see [getReduced]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Insets%23Insets-method-getEnlarged">Online Documentation</a>
 */
 final   fun getEnlarged( insets: Insets ):Insets

/**
 * Creates an enlarged instance by adding the insets of the specified insets to this instance and returning the result.
 * @param [insets] The insets to add to this insets.
 * @see [getReduced]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Insets%23Insets-method-getEnlarged">Online Documentation</a>
 */
@JsName("getEnlarged")
  final operator fun plus( insets: Insets ):Insets
/**
 * Creates a reduced instance by subtracting the insets of the specified insets to this instance and returning the result.
 * @param [insets] The insets to subtract from this struct.
 * @see [getEnlarged]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Insets%23Insets-method-getReduced">Online Documentation</a>
 */
 final   fun getReduced( insets: Insets ):Insets

/**
 * Creates a reduced instance by subtracting the insets of the specified insets to this instance and returning the result.
 * @param [insets] The insets to subtract from this struct.
 * @see [getEnlarged]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Insets%23Insets-method-getReduced">Online Documentation</a>
 */
@JsName("getReduced")
  final operator fun minus( insets: Insets ):Insets
/**
 * Creates a [YInsets] from a given [Insets].
 * @return The [Insets].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Insets%23Insets-defaultmethod-toInsets">Online Documentation</a>
 */
   fun toInsets():YInsets

/**
 * @return [left]
 */    
@JsName("__ygen_left_negy__")
final operator fun component1(): Double
/**
 * @return [top]
 */    
@JsName("__ygen_top_negy__")
final operator fun component2(): Double
/**
 * @return [right]
 */    
@JsName("__ygen_right_negy__")
final operator fun component3(): Double
/**
 * @return [bottom]
 */    
@JsName("__ygen_bottom_negy__")
final operator fun component4(): Double

companion object : ClassMetadata<Insets> {
/**
 * The "empty" insets that has all properties set to `0.0`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Insets%23EMPTY">Online Documentation</a>
 */
 val EMPTY: Insets
/**
 * Devides each side of the insets by the given factor.
 * @receiver The insets to scales down.
 * @param [factor] The factor to scales down by.
 * @return New insets scaled down by the factor.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Insets%23Insets-method-divide">Online Documentation</a>
 */
@JsName("divide")
  final operator fun Insets.div( factor: Double ):Insets
/**
 * Multiplies each side of the insets by the given factor and returns the result.
 * @receiver The insets.
 * @param [factor] The factor to scales up by.
 * @return New insets scaled up by the factor.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Insets%23Insets-method-multiply">Online Documentation</a>
 */
@JsName("multiply")
  final operator fun Insets.times( factor: Double ):Insets
}
}

inline val  Insets.isNotEmpty: Boolean
    get() = !isEmpty
