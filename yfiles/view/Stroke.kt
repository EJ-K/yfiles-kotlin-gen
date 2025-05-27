// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import web.svg.SVGElement
import yfiles.lang.ClassMetadata
import yfiles.lang.ICloneable

/**
 * A utility class that holds all properties of a [Stroke].
 * 
 * The stroke that is defined by instances of this type can be applied to an SVG element using either the static helper [setStroke] or the instance method [applyTo].
 * This is a convertible type that can be used with the following notation(s) in parameter lists, parameter objects or setters.
 * The strings applying to this scheme are converted to [Stroke]s:
 * 
 * ```
 * '[thickness] [type] color'
 * 
 * thickness = thickness in px|thin|medium|thick
 * type = solid|dashed|dotted
 * color = CSS color strings
 * ```
 * Valid color strings are the same as for [Color]. Square brackets mark optional declarations.
 * Examples:
 * 
 * ```
 * '3px dashed blue'
 * 'thick blue'
 * 'dotted blue'
 * ```
 * @see [setStroke]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [Stroke] class using the given [fill] and thickness.
 * @param [fill] The [fill].
 * @param [thickness] The thickness.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23Stroke-constructor-Stroke(Fill,number)">Online Documentation</a>
 * 
 * @property fill
 * Gets or sets the [fill] for the [Stroke].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23fill">Online Documentation</a>
 * 
 * @property thickness
 * Gets or sets the thickness of the stroke.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23thickness">Online Documentation</a>
 */
external  class Stroke  (
final var fill: Fill? = definedExternally,
final var thickness: Double = definedExternally) : ICloneable<Stroke> {
/**
 * Initializes a new instance of the [Stroke] class using the given rgba values and thickness.
 * @param [r] The red value.
 * @param [g] The green value.
 * @param [b] The blue value.
 * @param [a] The alpha value, 255 by default.
 * @param [thickness] The thickness, 1 by default.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23Stroke-constructor-Stroke(number,number,number,number,number)">Online Documentation</a>
 */
 constructor( r: Int ,
 g: Int ,
 b: Int ,
 a: Int  = definedExternally,
 thickness: Double  = definedExternally)

/**
 * Gets or sets the dash style for the [Stroke].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23dashStyle">Online Documentation</a>
 */
final var dashStyle: DashStyle
/**
 * Gets or sets the dash cap.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23lineCap">Online Documentation</a>
 */
final var lineCap: LineCap
/**
 * Gets or sets the line join property.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23lineJoin">Online Documentation</a>
 */
final var lineJoin: LineJoin
/**
 * Gets or sets the miter limit.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23miterLimit">Online Documentation</a>
 */
final var miterLimit: Double
/**
 * Assigns the stroke defined by this instance to the given SVG `element`.
 * @param [element] The element whose fill should be set.
 * @param [context] The context.
 * @see [setStroke]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23Stroke-method-applyTo">Online Documentation</a>
 */
 final   fun applyTo( element: SVGElement ,
 context: ICanvasContext )
/**
 * Clones this instance by returning a [YObject.memberwiseClone][yfiles.lang.YObject.memberwiseClone] or this in case this instance is already [frozen][isFrozen].
 * @return An instance of the same type as this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23Stroke-method-clone">Online Documentation</a>
 */
 final override   fun clone():Stroke
/**
 * Clones the current value of this instance to a new unfrozen [Stroke].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23Stroke-method-cloneCurrentValue">Online Documentation</a>
 */
 final   fun cloneCurrentValue():Stroke
/**
 * Freezes and returns this instance.
 * @return This instance, made immutable.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23Stroke-method-freeze">Online Documentation</a>
 */
 final   fun freeze():Stroke
/**
 * Determines if this instance is frozen.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23Stroke-method-isFrozen">Online Documentation</a>
 */
 final   fun isFrozen():Boolean

companion object : ClassMetadata<Stroke> {
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.ALICE_BLUE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23ALICE_BLUE">Online Documentation</a>
 */
 val ALICE_BLUE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.ANTIQUE_WHITE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23ANTIQUE_WHITE">Online Documentation</a>
 */
 val ANTIQUE_WHITE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.AQUA] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23AQUA">Online Documentation</a>
 */
 val AQUA: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.AQUAMARINE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23AQUAMARINE">Online Documentation</a>
 */
 val AQUAMARINE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.AZURE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23AZURE">Online Documentation</a>
 */
 val AZURE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.BEIGE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23BEIGE">Online Documentation</a>
 */
 val BEIGE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.BISQUE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23BISQUE">Online Documentation</a>
 */
 val BISQUE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.BLACK] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23BLACK">Online Documentation</a>
 */
 val BLACK: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.BLANCHED_ALMOND] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23BLANCHED_ALMOND">Online Documentation</a>
 */
 val BLANCHED_ALMOND: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.BLUE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23BLUE">Online Documentation</a>
 */
 val BLUE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.BLUE_VIOLET] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23BLUE_VIOLET">Online Documentation</a>
 */
 val BLUE_VIOLET: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.BROWN] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23BROWN">Online Documentation</a>
 */
 val BROWN: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.BURLY_WOOD] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23BURLY_WOOD">Online Documentation</a>
 */
 val BURLY_WOOD: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.CADET_BLUE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23CADET_BLUE">Online Documentation</a>
 */
 val CADET_BLUE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.CHARTREUSE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23CHARTREUSE">Online Documentation</a>
 */
 val CHARTREUSE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.CHOCOLATE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23CHOCOLATE">Online Documentation</a>
 */
 val CHOCOLATE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.CORAL] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23CORAL">Online Documentation</a>
 */
 val CORAL: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.CORNFLOWER_BLUE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23CORNFLOWER_BLUE">Online Documentation</a>
 */
 val CORNFLOWER_BLUE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.CORNSILK] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23CORNSILK">Online Documentation</a>
 */
 val CORNSILK: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.CRIMSON] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23CRIMSON">Online Documentation</a>
 */
 val CRIMSON: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.CURRENT_COLOR] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23CURRENT_COLOR">Online Documentation</a>
 */
 val CURRENT_COLOR: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.CYAN] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23CYAN">Online Documentation</a>
 */
 val CYAN: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.DARK_BLUE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DARK_BLUE">Online Documentation</a>
 */
 val DARK_BLUE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.DARK_CYAN] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DARK_CYAN">Online Documentation</a>
 */
 val DARK_CYAN: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.DARK_GOLDENROD] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DARK_GOLDENROD">Online Documentation</a>
 */
 val DARK_GOLDENROD: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.DARK_GRAY] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DARK_GRAY">Online Documentation</a>
 */
 val DARK_GRAY: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.DARK_GREEN] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DARK_GREEN">Online Documentation</a>
 */
 val DARK_GREEN: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.DARK_KHAKI] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DARK_KHAKI">Online Documentation</a>
 */
 val DARK_KHAKI: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.DARK_MAGENTA] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DARK_MAGENTA">Online Documentation</a>
 */
 val DARK_MAGENTA: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.DARK_OLIVE_GREEN] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DARK_OLIVE_GREEN">Online Documentation</a>
 */
 val DARK_OLIVE_GREEN: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.DARK_ORANGE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DARK_ORANGE">Online Documentation</a>
 */
 val DARK_ORANGE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.DARK_ORCHID] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DARK_ORCHID">Online Documentation</a>
 */
 val DARK_ORCHID: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.DARK_RED] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DARK_RED">Online Documentation</a>
 */
 val DARK_RED: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.DARK_SALMON] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DARK_SALMON">Online Documentation</a>
 */
 val DARK_SALMON: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.DARK_SEA_GREEN] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DARK_SEA_GREEN">Online Documentation</a>
 */
 val DARK_SEA_GREEN: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.DARK_SLATE_BLUE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DARK_SLATE_BLUE">Online Documentation</a>
 */
 val DARK_SLATE_BLUE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.DARK_SLATE_GRAY] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DARK_SLATE_GRAY">Online Documentation</a>
 */
 val DARK_SLATE_GRAY: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.DARK_TURQUOISE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DARK_TURQUOISE">Online Documentation</a>
 */
 val DARK_TURQUOISE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.DARK_VIOLET] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DARK_VIOLET">Online Documentation</a>
 */
 val DARK_VIOLET: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.DEEP_PINK] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DEEP_PINK">Online Documentation</a>
 */
 val DEEP_PINK: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.DEEP_SKY_BLUE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DEEP_SKY_BLUE">Online Documentation</a>
 */
 val DEEP_SKY_BLUE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.DIM_GRAY] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DIM_GRAY">Online Documentation</a>
 */
 val DIM_GRAY: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.DODGER_BLUE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DODGER_BLUE">Online Documentation</a>
 */
 val DODGER_BLUE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.FIREBRICK] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23FIREBRICK">Online Documentation</a>
 */
 val FIREBRICK: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.FLORAL_WHITE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23FLORAL_WHITE">Online Documentation</a>
 */
 val FLORAL_WHITE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.FOREST_GREEN] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23FOREST_GREEN">Online Documentation</a>
 */
 val FOREST_GREEN: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.FUCHSIA] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23FUCHSIA">Online Documentation</a>
 */
 val FUCHSIA: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.GAINSBORO] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23GAINSBORO">Online Documentation</a>
 */
 val GAINSBORO: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.GHOST_WHITE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23GHOST_WHITE">Online Documentation</a>
 */
 val GHOST_WHITE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.GOLD] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23GOLD">Online Documentation</a>
 */
 val GOLD: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.GOLDENROD] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23GOLDENROD">Online Documentation</a>
 */
 val GOLDENROD: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.GRAY] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23GRAY">Online Documentation</a>
 */
 val GRAY: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.GREEN] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23GREEN">Online Documentation</a>
 */
 val GREEN: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.GREEN_YELLOW] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23GREEN_YELLOW">Online Documentation</a>
 */
 val GREEN_YELLOW: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.HONEYDEW] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23HONEYDEW">Online Documentation</a>
 */
 val HONEYDEW: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.HOT_PINK] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23HOT_PINK">Online Documentation</a>
 */
 val HOT_PINK: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.INDIAN_RED] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23INDIAN_RED">Online Documentation</a>
 */
 val INDIAN_RED: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.INDIGO] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23INDIGO">Online Documentation</a>
 */
 val INDIGO: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.IVORY] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23IVORY">Online Documentation</a>
 */
 val IVORY: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.KHAKI] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23KHAKI">Online Documentation</a>
 */
 val KHAKI: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.LAVENDER] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LAVENDER">Online Documentation</a>
 */
 val LAVENDER: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.LAVENDER_BLUSH] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LAVENDER_BLUSH">Online Documentation</a>
 */
 val LAVENDER_BLUSH: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.LAWN_GREEN] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LAWN_GREEN">Online Documentation</a>
 */
 val LAWN_GREEN: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.LEMON_CHIFFON] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LEMON_CHIFFON">Online Documentation</a>
 */
 val LEMON_CHIFFON: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.LIGHT_BLUE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LIGHT_BLUE">Online Documentation</a>
 */
 val LIGHT_BLUE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.LIGHT_CORAL] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LIGHT_CORAL">Online Documentation</a>
 */
 val LIGHT_CORAL: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.LIGHT_CYAN] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LIGHT_CYAN">Online Documentation</a>
 */
 val LIGHT_CYAN: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.LIGHT_GOLDENROD_YELLOW] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LIGHT_GOLDENROD_YELLOW">Online Documentation</a>
 */
 val LIGHT_GOLDENROD_YELLOW: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.LIGHT_GRAY] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LIGHT_GRAY">Online Documentation</a>
 */
 val LIGHT_GRAY: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.LIGHT_GREEN] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LIGHT_GREEN">Online Documentation</a>
 */
 val LIGHT_GREEN: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.LIGHT_PINK] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LIGHT_PINK">Online Documentation</a>
 */
 val LIGHT_PINK: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.LIGHT_SALMON] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LIGHT_SALMON">Online Documentation</a>
 */
 val LIGHT_SALMON: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.LIGHT_SEA_GREEN] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LIGHT_SEA_GREEN">Online Documentation</a>
 */
 val LIGHT_SEA_GREEN: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.LIGHT_SKY_BLUE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LIGHT_SKY_BLUE">Online Documentation</a>
 */
 val LIGHT_SKY_BLUE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.LIGHT_SLATE_GRAY] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LIGHT_SLATE_GRAY">Online Documentation</a>
 */
 val LIGHT_SLATE_GRAY: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.LIGHT_STEEL_BLUE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LIGHT_STEEL_BLUE">Online Documentation</a>
 */
 val LIGHT_STEEL_BLUE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.LIGHT_YELLOW] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LIGHT_YELLOW">Online Documentation</a>
 */
 val LIGHT_YELLOW: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.LIME] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LIME">Online Documentation</a>
 */
 val LIME: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.LIME_GREEN] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LIME_GREEN">Online Documentation</a>
 */
 val LIME_GREEN: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.LINEN] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LINEN">Online Documentation</a>
 */
 val LINEN: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.MAGENTA] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23MAGENTA">Online Documentation</a>
 */
 val MAGENTA: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.MAROON] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23MAROON">Online Documentation</a>
 */
 val MAROON: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.MEDIUM_AQUAMARINE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23MEDIUM_AQUAMARINE">Online Documentation</a>
 */
 val MEDIUM_AQUAMARINE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.MEDIUM_BLUE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23MEDIUM_BLUE">Online Documentation</a>
 */
 val MEDIUM_BLUE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.MEDIUM_ORCHID] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23MEDIUM_ORCHID">Online Documentation</a>
 */
 val MEDIUM_ORCHID: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.MEDIUM_PURPLE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23MEDIUM_PURPLE">Online Documentation</a>
 */
 val MEDIUM_PURPLE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.MEDIUM_SEA_GREEN] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23MEDIUM_SEA_GREEN">Online Documentation</a>
 */
 val MEDIUM_SEA_GREEN: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.MEDIUM_SLATE_BLUE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23MEDIUM_SLATE_BLUE">Online Documentation</a>
 */
 val MEDIUM_SLATE_BLUE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.MEDIUM_SPRING_GREEN] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23MEDIUM_SPRING_GREEN">Online Documentation</a>
 */
 val MEDIUM_SPRING_GREEN: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.MEDIUM_TURQUOISE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23MEDIUM_TURQUOISE">Online Documentation</a>
 */
 val MEDIUM_TURQUOISE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.MEDIUM_VIOLET_RED] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23MEDIUM_VIOLET_RED">Online Documentation</a>
 */
 val MEDIUM_VIOLET_RED: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.MIDNIGHT_BLUE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23MIDNIGHT_BLUE">Online Documentation</a>
 */
 val MIDNIGHT_BLUE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.MINT_CREAM] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23MINT_CREAM">Online Documentation</a>
 */
 val MINT_CREAM: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.MISTY_ROSE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23MISTY_ROSE">Online Documentation</a>
 */
 val MISTY_ROSE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.MOCCASIN] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23MOCCASIN">Online Documentation</a>
 */
 val MOCCASIN: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.NAVAJO_WHITE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23NAVAJO_WHITE">Online Documentation</a>
 */
 val NAVAJO_WHITE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.NAVY] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23NAVY">Online Documentation</a>
 */
 val NAVY: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.OLD_LACE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23OLD_LACE">Online Documentation</a>
 */
 val OLD_LACE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.OLIVE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23OLIVE">Online Documentation</a>
 */
 val OLIVE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.OLIVE_DRAB] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23OLIVE_DRAB">Online Documentation</a>
 */
 val OLIVE_DRAB: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.ORANGE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23ORANGE">Online Documentation</a>
 */
 val ORANGE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.ORANGE_RED] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23ORANGE_RED">Online Documentation</a>
 */
 val ORANGE_RED: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.ORCHID] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23ORCHID">Online Documentation</a>
 */
 val ORCHID: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.PALE_GOLDENROD] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23PALE_GOLDENROD">Online Documentation</a>
 */
 val PALE_GOLDENROD: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.PALE_GREEN] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23PALE_GREEN">Online Documentation</a>
 */
 val PALE_GREEN: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.PALE_TURQUOISE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23PALE_TURQUOISE">Online Documentation</a>
 */
 val PALE_TURQUOISE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.PALE_VIOLET_RED] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23PALE_VIOLET_RED">Online Documentation</a>
 */
 val PALE_VIOLET_RED: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.PAPAYA_WHIP] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23PAPAYA_WHIP">Online Documentation</a>
 */
 val PAPAYA_WHIP: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.PEACH_PUFF] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23PEACH_PUFF">Online Documentation</a>
 */
 val PEACH_PUFF: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.PERU] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23PERU">Online Documentation</a>
 */
 val PERU: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.PINK] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23PINK">Online Documentation</a>
 */
 val PINK: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.PLUM] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23PLUM">Online Documentation</a>
 */
 val PLUM: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.POWDER_BLUE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23POWDER_BLUE">Online Documentation</a>
 */
 val POWDER_BLUE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.PURPLE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23PURPLE">Online Documentation</a>
 */
 val PURPLE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.RED] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23RED">Online Documentation</a>
 */
 val RED: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.ROSY_BROWN] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23ROSY_BROWN">Online Documentation</a>
 */
 val ROSY_BROWN: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.ROYAL_BLUE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23ROYAL_BLUE">Online Documentation</a>
 */
 val ROYAL_BLUE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.SADDLE_BROWN] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23SADDLE_BROWN">Online Documentation</a>
 */
 val SADDLE_BROWN: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.SALMON] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23SALMON">Online Documentation</a>
 */
 val SALMON: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.SANDY_BROWN] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23SANDY_BROWN">Online Documentation</a>
 */
 val SANDY_BROWN: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.SEA_GREEN] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23SEA_GREEN">Online Documentation</a>
 */
 val SEA_GREEN: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.SEA_SHELL] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23SEA_SHELL">Online Documentation</a>
 */
 val SEA_SHELL: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.SIENNA] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23SIENNA">Online Documentation</a>
 */
 val SIENNA: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.SILVER] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23SILVER">Online Documentation</a>
 */
 val SILVER: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.SKY_BLUE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23SKY_BLUE">Online Documentation</a>
 */
 val SKY_BLUE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.SLATE_BLUE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23SLATE_BLUE">Online Documentation</a>
 */
 val SLATE_BLUE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.SLATE_GRAY] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23SLATE_GRAY">Online Documentation</a>
 */
 val SLATE_GRAY: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.SNOW] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23SNOW">Online Documentation</a>
 */
 val SNOW: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.SPRING_GREEN] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23SPRING_GREEN">Online Documentation</a>
 */
 val SPRING_GREEN: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.STEEL_BLUE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23STEEL_BLUE">Online Documentation</a>
 */
 val STEEL_BLUE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.TAN] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23TAN">Online Documentation</a>
 */
 val TAN: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.TEAL] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23TEAL">Online Documentation</a>
 */
 val TEAL: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.THISTLE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23THISTLE">Online Documentation</a>
 */
 val THISTLE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.TOMATO] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23TOMATO">Online Documentation</a>
 */
 val TOMATO: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.TRANSPARENT] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23TRANSPARENT">Online Documentation</a>
 */
 val TRANSPARENT: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.TURQUOISE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23TURQUOISE">Online Documentation</a>
 */
 val TURQUOISE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.VIOLET] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23VIOLET">Online Documentation</a>
 */
 val VIOLET: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.WHEAT] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23WHEAT">Online Documentation</a>
 */
 val WHEAT: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.WHITE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23WHITE">Online Documentation</a>
 */
 val WHITE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.WHITE_SMOKE] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23WHITE_SMOKE">Online Documentation</a>
 */
 val WHITE_SMOKE: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.YELLOW] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23YELLOW">Online Documentation</a>
 */
 val YELLOW: Stroke
/**
 * Gets a [frozen][isFrozen] [Stroke] that uses [Fill.YELLOW_GREEN] as its [fill] and has a [thickness] of `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23YELLOW_GREEN">Online Documentation</a>
 */
 val YELLOW_GREEN: Stroke
/**
 * Creates a [Stroke] instance from the given stroke-like object by performing automatic type conversion.
 * @param [strokeLike] The object to convert to a [Stroke].
 * @return The given `strokeLike` if it is already a [Stroke], or a new instance initialized to the values found in `strokeLike`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23Stroke-method-from">Online Documentation</a>
 */
@JsName("from")
 final  operator fun invoke( strokeLike: String ):Stroke
/**
 * Sets the [Stroke] on a given SVG element as the stroke.
 * @receiver The stroke that should be applied. If `null`, the element's stroke is removed.
 * @param [element] The element whose stroke should be set.
 * @param [context] The context to use for managing possible `defs` entries.
 * @see [applyTo]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23Stroke-method-setStroke">Online Documentation</a>
 */
@JsName("setStroke")
 final   fun Stroke?.applyTo( element: SVGElement ,
 context: ICanvasContext )
}
}

inline fun Stroke(
    block: Stroke.() -> Unit
): Stroke {
    return Stroke()
        .apply(block)
}
