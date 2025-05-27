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
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject
import yfiles.view.IBoundsProvider
import yfiles.view.IVisualCreator

/**
 * The interface for the visual representation of an arrow that is normally used to decorate the visual representation of an [IEdge].
 * 
 * Instances of this class are used by [IEdgeStyle] implementations.
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
 * Valid color strings are the same as for [Color][yfiles.view.Color]. Square brackets mark optional declarations.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IArrow">Online Documentation</a>
 */
external interface IArrow : YObject {
/**
 * Gets the cropping length associated with this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IArrow%23cropLength">Online Documentation</a>
 */
val cropLength: Double
/**
 * Gets the length of the arrow (the distance from the arrow's tip to the position where the visual representation of the edge's path should begin).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IArrow%23length">Online Documentation</a>
 */
val length: Double
/**
 * Gets an [IBoundsProvider] implementation that can yield this arrow's bounds if painted at the given location using the given direction for the given edge.
 * @param [edge] the edge this arrow belongs to
 * @param [atSource] whether this will be the source arrow
 * @param [anchor] the anchor point for the tip of the arrow
 * @param [directionVector] the direction the arrow is pointing in
 * @return an implementation of the [IBoundsProvider] interface that can subsequently be used to query the bounds. Clients will always call this method before using the implementation and may not cache the instance returned. This allows for applying the flyweight design pattern to implementations.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IArrow%23IArrow-method-getBoundsProvider">Online Documentation</a>
 */
   fun getBoundsProvider( edge: IEdge ,
 atSource: Boolean ,
 anchor: Point ,
 directionVector: Point ):IBoundsProvider
/**
 * Gets an [IVisualCreator] implementation that will paint this arrow at the given location using the given direction for the given edge.
 * @param [edge] the edge this arrow belongs to
 * @param [atSource] whether this will be the source arrow
 * @param [anchor] the anchor point for the tip of the arrow
 * @param [direction] the direction the arrow is pointing in
 * @return an implementation of the [IVisualCreator] interface that can subsequently be used to perform the actual painting. Clients will always call this method before using the implementation and may not cache the instance returned. This allows for applying the flyweight design pattern to implementations.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IArrow%23IArrow-method-getVisualCreator">Online Documentation</a>
 */
   fun getVisualCreator( edge: IEdge ,
 atSource: Boolean ,
 anchor: Point ,
 direction: Point ):IVisualCreator

companion object : InterfaceMetadata<IArrow> {
/**
 * A singleton [IArrow] instance that paints a circle-shaped black arrow.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IArrow%23CIRCLE">Online Documentation</a>
 */
 val CIRCLE: IArrow
/**
 * A singleton [IArrow] instance that paints a cross-shaped black arrow.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IArrow%23CROSS">Online Documentation</a>
 */
 val CROSS: IArrow
/**
 * A singleton [IArrow] instance that paints a black arrow.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IArrow%23DEFAULT">Online Documentation</a>
 */
 val DEFAULT: IArrow
/**
 * A singleton [IArrow] instance that paints a diamond-shaped black arrow.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IArrow%23DIAMOND">Online Documentation</a>
 */
 val DIAMOND: IArrow
/**
 * A singleton [IArrow] instance that paints no arrow at all.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IArrow%23NONE">Online Documentation</a>
 */
 val NONE: IArrow
/**
 * A singleton [IArrow] instance that paints a short black arrow.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IArrow%23SHORT">Online Documentation</a>
 */
 val SHORT: IArrow
/**
 * A singleton [IArrow] instance that paints a simple black arrow.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IArrow%23SIMPLE">Online Documentation</a>
 */
 val SIMPLE: IArrow
/**
 * A singleton [IArrow] instance that paints a triangle-shaped black arrow.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IArrow%23TRIANGLE">Online Documentation</a>
 */
 val TRIANGLE: IArrow
/**
 * Creates an [Arrow] instance from the given arrow-like object by performing automatic type conversion.
 * @param [arrowLike] The object to convert to an [Arrow].
 * @return Either `arrowLike` if it is already an [Arrow] or a new instance, initialized to the values found in `arrowLike`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IArrow%23IArrow-defaultmethod-from">Online Documentation</a>
 */
@JsName("from")
  operator fun invoke( arrowLike: String ):Arrow
}
}
