// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.geometry.Point
import yfiles.graph.IEdge
import yfiles.lang.ClassMetadata
import yfiles.lang.ICloneable
import yfiles.view.Color
import yfiles.view.Fill
import yfiles.view.IBoundsProvider
import yfiles.view.IVisualCreator
import yfiles.view.Stroke

/**
 * A default implementation of the [IArrow] interface that can render [ArrowType]s.
 * 
 * This is a convertible type that can be used with the following notation(s) in parameter lists, parameter objects or setters.
 * The strings applying to this scheme are converted to [Arrow]s:
 * 
 * ```
 * '[color] [scale] type'
 * 
 * color = CSS color strings
 * scale = xx-small|x-small|small|medium|large|x-large|xx-large
 * type = normal|none|default|simple|short|diamond|cross|circle|ball|triangle
 * ```
 * Valid color strings are the same as for [Color]. Square brackets mark optional declarations.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Arrow">Online Documentation</a>
 * 
 * @constructor Creates a new arrow with the given color to use for [stroke] and brush.
 * @param [color] The color to use for [stroke] and brush.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Arrow%23Arrow-constructor-Arrow(Color)">Online Documentation</a>
 */
external  class Arrow  ( color: Color  = definedExternally) : IArrow, ICloneable<Arrow> {

/**
 * Gets or sets the cropping length associated with this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Arrow%23cropLength">Online Documentation</a>
 */
final override var cropLength: Double
/**
 * Gets or sets the [fill] of the fill of this arrow.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Arrow%23fill">Online Documentation</a>
 */
final var fill: Fill?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Arrow%23length">Online Documentation</a>
 */
final override val length: Double
/**
 * Gets or sets the scale factor of this arrow.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Arrow%23scale">Online Documentation</a>
 */
final var scale: Double
/**
 * Gets or sets the [stroke] of the outline of this arrow.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Arrow%23stroke">Online Documentation</a>
 */
final var stroke: Stroke?
/**
 * Gets or sets the type of this arrow.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Arrow%23type">Online Documentation</a>
 */
final var type: ArrowType
/**
 * Returns an immutable [IArrow] instance that uses the current properties.
 * @return An immutable instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Arrow%23Arrow-method-asFrozen">Online Documentation</a>
 */
 final   fun asFrozen():IArrow
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Arrow%23Arrow-method-clone">Online Documentation</a>
 */
 final override   fun clone():Arrow
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Arrow%23Arrow-method-getBoundsProvider">Online Documentation</a>
 */
 final override   fun getBoundsProvider( edge: IEdge ,
 atSource: Boolean ,
 anchor: Point ,
 directionVector: Point ):IBoundsProvider
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Arrow%23Arrow-method-getVisualCreator">Online Documentation</a>
 */
 final override   fun getVisualCreator( edge: IEdge ,
 atSource: Boolean ,
 anchor: Point ,
 direction: Point ):IVisualCreator

companion object : ClassMetadata<Arrow> {
}
}

inline fun Arrow(
    block: Arrow.() -> Unit
): Arrow {
    return Arrow()
        .apply(block)
}
