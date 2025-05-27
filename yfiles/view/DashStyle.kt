// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import js.array.ReadonlyArray
import yfiles.collections.List
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * The style of dashing a [Stroke] defined by its [dashes] and [offset].
 * 
 * All of these values are in terms of multiples of the thickness of a [Stroke]. This is different from the corresponding properties of a SVG stroke.
 * This is a convertible type that can be used with the following notation(s) in parameter lists, parameter objects or setters.
 * CSS border-style strings are converted to [DashStyle]s. For example:
 * 
 * ```
 * 'solid'
 * 'dash'
 * 'dot'
 * 'dash-dot'
 * 'dash-dot-dot'
 * '5 10'
 * '5, 10'
 * ```
 * It is also possible to specify an [Array] or [Number] to define the pattern of dashes:
 * 
 * ```
 * [5, 10]
 * 10
 * ```
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DashStyle">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [DashStyle] class using an empty pattern for the [dashes] and an [offset] value of `0.0`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DashStyle%23DashStyle-constructor-DashStyle()">Online Documentation</a>
 */
external open class DashStyle  () : YObject {
/**
 * Initializes a new instance of the [DashStyle] class using the provided dash pattern and offset.
 * @param [dashes] The pattern of dashes and gaps.
 * @param [offset] The offset.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DashStyle%23DashStyle-constructor-DashStyle(number[],number)">Online Documentation</a>
 */
 constructor( dashes: ReadonlyArray<Double>? ,
 offset: Double  = definedExternally)

/**
 * Gets or sets the pattern of dashes and gaps.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DashStyle%23dashes">Online Documentation</a>
 */
final var dashes: List<Double>?
/**
 * Gets or sets the offset where the dash pattern starts.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DashStyle%23offset">Online Documentation</a>
 */
final var offset: Double
/**
 * Clones this instance by returning a [YObject.memberwiseClone] or this in case this instance is already [frozen][isFrozen].
 * @return An instance of the same type as this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DashStyle%23DashStyle-method-clone">Online Documentation</a>
 */
 final   fun clone():DashStyle
/**
 * Freezes and returns this instance.
 * @return This instance, made immutable.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DashStyle%23DashStyle-method-freeze">Online Documentation</a>
 */
 open   fun freeze():DashStyle
/**
 * Determines if this instance is frozen.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DashStyle%23DashStyle-method-isFrozen">Online Documentation</a>
 */
 final   fun isFrozen():Boolean

companion object : ClassMetadata<DashStyle> {
/**
 * Gets the dash style with a single dash.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DashStyle%23DASH">Online Documentation</a>
 */
 val DASH: DashStyle
/**
 * Gets the dash style with a single dash and dot.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DashStyle%23DASH_DOT">Online Documentation</a>
 */
 val DASH_DOT: DashStyle
/**
 * Gets the dash style with a single dash and two dots.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DashStyle%23DASH_DOT_DOT">Online Documentation</a>
 */
 val DASH_DOT_DOT: DashStyle
/**
 * Gets the dash style with a single dot.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DashStyle%23DOT">Online Documentation</a>
 */
 val DOT: DashStyle
/**
 * Gets the solid dash style with no [dashes].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DashStyle%23SOLID">Online Documentation</a>
 */
 val SOLID: DashStyle
/**
 * Creates a [DashStyle] instance from the given dash-like object by performing automatic type conversion.
 * @param [dashLike] The object to convert to a [DashStyle].
 * @return The given `dashLike` if it is already a [DashStyle], or a new instance initialized to the values found in `dashLike`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DashStyle%23DashStyle-method-from">Online Documentation</a>
 */
@JsName("from")
 final  operator fun invoke( dashLike: String ):DashStyle
}
}

inline fun DashStyle(
    block: DashStyle.() -> Unit
): DashStyle {
    return DashStyle()
        .apply(block)
}
