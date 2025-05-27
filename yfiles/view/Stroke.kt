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
 * The stroke that is defined by instances of this type can be applied to an SVG element using either the static helper [setStroke][Stroke] or the instance method [applyTo][Stroke].
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
 * @constructor Initializes a new instance of the [Stroke] class using the given [fill][Stroke] and thickness.
 * @param [fill] The [fill][Stroke].
 * @param [thickness] The thickness.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23Stroke-constructor-Stroke(Fill,number)">Online Documentation</a>
 */
external class Stroke (
  fill: Fill  = definedExternally,
  thickness: Double  = definedExternally,
) : ICloneable<Stroke> {
  /**
   * Initializes a new instance of the [Stroke] class using the given rgba values and thickness.
   * @param [r] The red value.
   * @param [g] The green value.
   * @param [b] The blue value.
   * @param [a] The alpha value, 255 by default.
   * @param [thickness] The thickness, 1 by default.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23Stroke-constructor-Stroke(number,number,number,number,number)">Online Documentation</a>
   */ constructor(
    r: Int,
    g: Int,
    b: Int,
    a: Int  = definedExternally,
    thickness: Double  = definedExternally,
  )
  /**
   * Gets or sets the dash style for the [Stroke].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23dashStyle">Online Documentation</a>
   */
  final var dashStyle: DashStyle
  
  /**
   * Gets or sets the [fill][Stroke] for the [Stroke].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23fill">Online Documentation</a>
   */
  final var fill: Fill?
  
  /**
   * Gets or sets the dash cap.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23lineCap">Online Documentation</a>
   */
  final var lineCap: LineCap
  
  /**
   * Gets or sets the line-join property.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23lineJoin">Online Documentation</a>
   */
  final var lineJoin: LineJoin
  
  /**
   * Gets or sets the miter limit.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23miterLimit">Online Documentation</a>
   */
  final var miterLimit: Double
  
  /**
   * Gets or sets the thickness of the stroke.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23thickness">Online Documentation</a>
   */
  final var thickness: Double
  
  /**
   * Assigns the stroke defined by this instance to the given SVG `element`.
   * @param [element] The element whose fill should be set.
   * @param [context] The context.
   * @see [setStroke]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23Stroke-method-applyTo">Online Documentation</a>
   */
  fun applyTo(
    element: SVGElement,
    context: ICanvasContext,
  )
  
  /**
   * Clones this instance by returning a memberwise clone, or by returning `this` if this instance is [frozen][Stroke].
   * @return An instance of the same type as this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23Stroke-method-clone">Online Documentation</a>
   */
  override fun clone(): Stroke
  
  /**
   * Clones the current value of this instance to a new unfrozen [Stroke].
   * @return A new unfrozen [Stroke] instance with the value of the current instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23Stroke-method-cloneCurrentValue">Online Documentation</a>
   */
  fun cloneCurrentValue(): Stroke
  
  /**
   * Freezes and returns this instance.
   * @return This instance, made immutable.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23Stroke-method-freeze">Online Documentation</a>
   */
  fun freeze(): Stroke
  
  /**
   * Determines if this instance is frozen.
   * @return `true` if this instance is frozen; otherwise, `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23Stroke-method-isFrozen">Online Documentation</a>
   */
  fun isFrozen(): Boolean
  
  companion object : ClassMetadata<Stroke> {
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [ALICE_BLUE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23ALICE_BLUE">Online Documentation</a>
     */
     val ALICE_BLUE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [ANTIQUE_WHITE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23ANTIQUE_WHITE">Online Documentation</a>
     */
     val ANTIQUE_WHITE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [AQUA][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23AQUA">Online Documentation</a>
     */
     val AQUA: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [AQUAMARINE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23AQUAMARINE">Online Documentation</a>
     */
     val AQUAMARINE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [AZURE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23AZURE">Online Documentation</a>
     */
     val AZURE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [BEIGE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23BEIGE">Online Documentation</a>
     */
     val BEIGE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [BISQUE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23BISQUE">Online Documentation</a>
     */
     val BISQUE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [BLACK][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23BLACK">Online Documentation</a>
     */
     val BLACK: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [BLANCHED_ALMOND][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23BLANCHED_ALMOND">Online Documentation</a>
     */
     val BLANCHED_ALMOND: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [BLUE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23BLUE">Online Documentation</a>
     */
     val BLUE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [BLUE_VIOLET][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23BLUE_VIOLET">Online Documentation</a>
     */
     val BLUE_VIOLET: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [BROWN][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23BROWN">Online Documentation</a>
     */
     val BROWN: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [BURLY_WOOD][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23BURLY_WOOD">Online Documentation</a>
     */
     val BURLY_WOOD: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [CADET_BLUE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23CADET_BLUE">Online Documentation</a>
     */
     val CADET_BLUE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [CHARTREUSE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23CHARTREUSE">Online Documentation</a>
     */
     val CHARTREUSE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [CHOCOLATE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23CHOCOLATE">Online Documentation</a>
     */
     val CHOCOLATE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [CORAL][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23CORAL">Online Documentation</a>
     */
     val CORAL: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [CORNFLOWER_BLUE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23CORNFLOWER_BLUE">Online Documentation</a>
     */
     val CORNFLOWER_BLUE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [CORNSILK][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23CORNSILK">Online Documentation</a>
     */
     val CORNSILK: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [CRIMSON][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23CRIMSON">Online Documentation</a>
     */
     val CRIMSON: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [CURRENT_COLOR][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23CURRENT_COLOR">Online Documentation</a>
     */
     val CURRENT_COLOR: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [CYAN][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23CYAN">Online Documentation</a>
     */
     val CYAN: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [DARK_BLUE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DARK_BLUE">Online Documentation</a>
     */
     val DARK_BLUE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [DARK_CYAN][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DARK_CYAN">Online Documentation</a>
     */
     val DARK_CYAN: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [DARK_GOLDENROD][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DARK_GOLDENROD">Online Documentation</a>
     */
     val DARK_GOLDENROD: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [DARK_GRAY][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DARK_GRAY">Online Documentation</a>
     */
     val DARK_GRAY: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [DARK_GREEN][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DARK_GREEN">Online Documentation</a>
     */
     val DARK_GREEN: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [DARK_KHAKI][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DARK_KHAKI">Online Documentation</a>
     */
     val DARK_KHAKI: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [DARK_MAGENTA][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DARK_MAGENTA">Online Documentation</a>
     */
     val DARK_MAGENTA: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [DARK_OLIVE_GREEN][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DARK_OLIVE_GREEN">Online Documentation</a>
     */
     val DARK_OLIVE_GREEN: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [DARK_ORANGE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DARK_ORANGE">Online Documentation</a>
     */
     val DARK_ORANGE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [DARK_ORCHID][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DARK_ORCHID">Online Documentation</a>
     */
     val DARK_ORCHID: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [DARK_RED][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DARK_RED">Online Documentation</a>
     */
     val DARK_RED: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [DARK_SALMON][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DARK_SALMON">Online Documentation</a>
     */
     val DARK_SALMON: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [DARK_SEA_GREEN][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DARK_SEA_GREEN">Online Documentation</a>
     */
     val DARK_SEA_GREEN: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [DARK_SLATE_BLUE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DARK_SLATE_BLUE">Online Documentation</a>
     */
     val DARK_SLATE_BLUE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [DARK_SLATE_GRAY][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DARK_SLATE_GRAY">Online Documentation</a>
     */
     val DARK_SLATE_GRAY: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [DARK_TURQUOISE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DARK_TURQUOISE">Online Documentation</a>
     */
     val DARK_TURQUOISE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [DARK_VIOLET][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DARK_VIOLET">Online Documentation</a>
     */
     val DARK_VIOLET: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [DEEP_PINK][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DEEP_PINK">Online Documentation</a>
     */
     val DEEP_PINK: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [DEEP_SKY_BLUE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DEEP_SKY_BLUE">Online Documentation</a>
     */
     val DEEP_SKY_BLUE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [DIM_GRAY][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DIM_GRAY">Online Documentation</a>
     */
     val DIM_GRAY: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [DODGER_BLUE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23DODGER_BLUE">Online Documentation</a>
     */
     val DODGER_BLUE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [FIREBRICK][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23FIREBRICK">Online Documentation</a>
     */
     val FIREBRICK: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [FLORAL_WHITE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23FLORAL_WHITE">Online Documentation</a>
     */
     val FLORAL_WHITE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [FOREST_GREEN][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23FOREST_GREEN">Online Documentation</a>
     */
     val FOREST_GREEN: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [FUCHSIA][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23FUCHSIA">Online Documentation</a>
     */
     val FUCHSIA: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [GAINSBORO][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23GAINSBORO">Online Documentation</a>
     */
     val GAINSBORO: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [GHOST_WHITE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23GHOST_WHITE">Online Documentation</a>
     */
     val GHOST_WHITE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [GOLD][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23GOLD">Online Documentation</a>
     */
     val GOLD: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [GOLDENROD][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23GOLDENROD">Online Documentation</a>
     */
     val GOLDENROD: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [GRAY][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23GRAY">Online Documentation</a>
     */
     val GRAY: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [GREEN][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23GREEN">Online Documentation</a>
     */
     val GREEN: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [GREEN_YELLOW][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23GREEN_YELLOW">Online Documentation</a>
     */
     val GREEN_YELLOW: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [HONEYDEW][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23HONEYDEW">Online Documentation</a>
     */
     val HONEYDEW: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [HOT_PINK][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23HOT_PINK">Online Documentation</a>
     */
     val HOT_PINK: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [INDIAN_RED][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23INDIAN_RED">Online Documentation</a>
     */
     val INDIAN_RED: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [INDIGO][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23INDIGO">Online Documentation</a>
     */
     val INDIGO: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [IVORY][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23IVORY">Online Documentation</a>
     */
     val IVORY: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [KHAKI][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23KHAKI">Online Documentation</a>
     */
     val KHAKI: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [LAVENDER][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LAVENDER">Online Documentation</a>
     */
     val LAVENDER: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [LAVENDER_BLUSH][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LAVENDER_BLUSH">Online Documentation</a>
     */
     val LAVENDER_BLUSH: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [LAWN_GREEN][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LAWN_GREEN">Online Documentation</a>
     */
     val LAWN_GREEN: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [LEMON_CHIFFON][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LEMON_CHIFFON">Online Documentation</a>
     */
     val LEMON_CHIFFON: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [LIGHT_BLUE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LIGHT_BLUE">Online Documentation</a>
     */
     val LIGHT_BLUE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [LIGHT_CORAL][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LIGHT_CORAL">Online Documentation</a>
     */
     val LIGHT_CORAL: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [LIGHT_CYAN][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LIGHT_CYAN">Online Documentation</a>
     */
     val LIGHT_CYAN: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [LIGHT_GOLDENROD_YELLOW][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LIGHT_GOLDENROD_YELLOW">Online Documentation</a>
     */
     val LIGHT_GOLDENROD_YELLOW: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [LIGHT_GRAY][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LIGHT_GRAY">Online Documentation</a>
     */
     val LIGHT_GRAY: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [LIGHT_GREEN][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LIGHT_GREEN">Online Documentation</a>
     */
     val LIGHT_GREEN: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [LIGHT_PINK][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LIGHT_PINK">Online Documentation</a>
     */
     val LIGHT_PINK: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [LIGHT_SALMON][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LIGHT_SALMON">Online Documentation</a>
     */
     val LIGHT_SALMON: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [LIGHT_SEA_GREEN][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LIGHT_SEA_GREEN">Online Documentation</a>
     */
     val LIGHT_SEA_GREEN: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [LIGHT_SKY_BLUE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LIGHT_SKY_BLUE">Online Documentation</a>
     */
     val LIGHT_SKY_BLUE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [LIGHT_SLATE_GRAY][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LIGHT_SLATE_GRAY">Online Documentation</a>
     */
     val LIGHT_SLATE_GRAY: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [LIGHT_STEEL_BLUE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LIGHT_STEEL_BLUE">Online Documentation</a>
     */
     val LIGHT_STEEL_BLUE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [LIGHT_YELLOW][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LIGHT_YELLOW">Online Documentation</a>
     */
     val LIGHT_YELLOW: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [LIME][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LIME">Online Documentation</a>
     */
     val LIME: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [LIME_GREEN][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LIME_GREEN">Online Documentation</a>
     */
     val LIME_GREEN: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [LINEN][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23LINEN">Online Documentation</a>
     */
     val LINEN: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [MAGENTA][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23MAGENTA">Online Documentation</a>
     */
     val MAGENTA: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [MAROON][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23MAROON">Online Documentation</a>
     */
     val MAROON: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [MEDIUM_AQUAMARINE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23MEDIUM_AQUAMARINE">Online Documentation</a>
     */
     val MEDIUM_AQUAMARINE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [MEDIUM_BLUE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23MEDIUM_BLUE">Online Documentation</a>
     */
     val MEDIUM_BLUE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [MEDIUM_ORCHID][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23MEDIUM_ORCHID">Online Documentation</a>
     */
     val MEDIUM_ORCHID: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [MEDIUM_PURPLE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23MEDIUM_PURPLE">Online Documentation</a>
     */
     val MEDIUM_PURPLE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [MEDIUM_SEA_GREEN][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23MEDIUM_SEA_GREEN">Online Documentation</a>
     */
     val MEDIUM_SEA_GREEN: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [MEDIUM_SLATE_BLUE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23MEDIUM_SLATE_BLUE">Online Documentation</a>
     */
     val MEDIUM_SLATE_BLUE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [MEDIUM_SPRING_GREEN][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23MEDIUM_SPRING_GREEN">Online Documentation</a>
     */
     val MEDIUM_SPRING_GREEN: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [MEDIUM_TURQUOISE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23MEDIUM_TURQUOISE">Online Documentation</a>
     */
     val MEDIUM_TURQUOISE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [MEDIUM_VIOLET_RED][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23MEDIUM_VIOLET_RED">Online Documentation</a>
     */
     val MEDIUM_VIOLET_RED: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [MIDNIGHT_BLUE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23MIDNIGHT_BLUE">Online Documentation</a>
     */
     val MIDNIGHT_BLUE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [MINT_CREAM][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23MINT_CREAM">Online Documentation</a>
     */
     val MINT_CREAM: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [MISTY_ROSE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23MISTY_ROSE">Online Documentation</a>
     */
     val MISTY_ROSE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [MOCCASIN][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23MOCCASIN">Online Documentation</a>
     */
     val MOCCASIN: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [NAVAJO_WHITE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23NAVAJO_WHITE">Online Documentation</a>
     */
     val NAVAJO_WHITE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [NAVY][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23NAVY">Online Documentation</a>
     */
     val NAVY: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [OLD_LACE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23OLD_LACE">Online Documentation</a>
     */
     val OLD_LACE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [OLIVE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23OLIVE">Online Documentation</a>
     */
     val OLIVE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [OLIVE_DRAB][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23OLIVE_DRAB">Online Documentation</a>
     */
     val OLIVE_DRAB: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [ORANGE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23ORANGE">Online Documentation</a>
     */
     val ORANGE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [ORANGE_RED][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23ORANGE_RED">Online Documentation</a>
     */
     val ORANGE_RED: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [ORCHID][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23ORCHID">Online Documentation</a>
     */
     val ORCHID: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [PALE_GOLDENROD][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23PALE_GOLDENROD">Online Documentation</a>
     */
     val PALE_GOLDENROD: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [PALE_GREEN][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23PALE_GREEN">Online Documentation</a>
     */
     val PALE_GREEN: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [PALE_TURQUOISE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23PALE_TURQUOISE">Online Documentation</a>
     */
     val PALE_TURQUOISE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [PALE_VIOLET_RED][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23PALE_VIOLET_RED">Online Documentation</a>
     */
     val PALE_VIOLET_RED: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [PAPAYA_WHIP][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23PAPAYA_WHIP">Online Documentation</a>
     */
     val PAPAYA_WHIP: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [PEACH_PUFF][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23PEACH_PUFF">Online Documentation</a>
     */
     val PEACH_PUFF: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [PERU][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23PERU">Online Documentation</a>
     */
     val PERU: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [PINK][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23PINK">Online Documentation</a>
     */
     val PINK: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [PLUM][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23PLUM">Online Documentation</a>
     */
     val PLUM: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [POWDER_BLUE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23POWDER_BLUE">Online Documentation</a>
     */
     val POWDER_BLUE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [PURPLE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23PURPLE">Online Documentation</a>
     */
     val PURPLE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [RED][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23RED">Online Documentation</a>
     */
     val RED: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [ROSY_BROWN][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23ROSY_BROWN">Online Documentation</a>
     */
     val ROSY_BROWN: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [ROYAL_BLUE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23ROYAL_BLUE">Online Documentation</a>
     */
     val ROYAL_BLUE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [SADDLE_BROWN][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23SADDLE_BROWN">Online Documentation</a>
     */
     val SADDLE_BROWN: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [SALMON][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23SALMON">Online Documentation</a>
     */
     val SALMON: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [SANDY_BROWN][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23SANDY_BROWN">Online Documentation</a>
     */
     val SANDY_BROWN: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [SEA_GREEN][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23SEA_GREEN">Online Documentation</a>
     */
     val SEA_GREEN: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [SEA_SHELL][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23SEA_SHELL">Online Documentation</a>
     */
     val SEA_SHELL: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [SIENNA][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23SIENNA">Online Documentation</a>
     */
     val SIENNA: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [SILVER][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23SILVER">Online Documentation</a>
     */
     val SILVER: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [SKY_BLUE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23SKY_BLUE">Online Documentation</a>
     */
     val SKY_BLUE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [SLATE_BLUE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23SLATE_BLUE">Online Documentation</a>
     */
     val SLATE_BLUE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [SLATE_GRAY][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23SLATE_GRAY">Online Documentation</a>
     */
     val SLATE_GRAY: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [SNOW][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23SNOW">Online Documentation</a>
     */
     val SNOW: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [SPRING_GREEN][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23SPRING_GREEN">Online Documentation</a>
     */
     val SPRING_GREEN: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [STEEL_BLUE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23STEEL_BLUE">Online Documentation</a>
     */
     val STEEL_BLUE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [TAN][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23TAN">Online Documentation</a>
     */
     val TAN: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [TEAL][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23TEAL">Online Documentation</a>
     */
     val TEAL: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [THISTLE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23THISTLE">Online Documentation</a>
     */
     val THISTLE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [TOMATO][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23TOMATO">Online Documentation</a>
     */
     val TOMATO: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [TRANSPARENT][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23TRANSPARENT">Online Documentation</a>
     */
     val TRANSPARENT: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [TURQUOISE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23TURQUOISE">Online Documentation</a>
     */
     val TURQUOISE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [VIOLET][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23VIOLET">Online Documentation</a>
     */
     val VIOLET: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [WHEAT][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23WHEAT">Online Documentation</a>
     */
     val WHEAT: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [WHITE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23WHITE">Online Documentation</a>
     */
     val WHITE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [WHITE_SMOKE][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23WHITE_SMOKE">Online Documentation</a>
     */
     val WHITE_SMOKE: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [YELLOW][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23YELLOW">Online Documentation</a>
     */
     val YELLOW: Stroke
    
    /**
     * Gets a [frozen][Stroke] [Stroke] that uses [YELLOW_GREEN][Color] as its [fill][Stroke] and has a [thickness][Stroke] of `1`.
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
    operator fun invoke(
      strokeLike: String,
    ): Stroke
    
    /**
     * Sets the [Stroke] on a given SVG element as the stroke.
     * @receiver The stroke that should be applied. If `null`, the element's stroke is removed.
     * @param [element] The element whose stroke should be set.
     * @param [context] The context to use for managing possible `defs` entries.
     * @see [applyTo]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Stroke%23Stroke-method-setStroke">Online Documentation</a>
     */
    @JsName("setStroke")
    fun Stroke?.applyTo(
      element: SVGElement,
      context: ICanvasContext,
    )
  }
}

inline fun Stroke(
    block: Stroke.() -> Unit
): Stroke {
    return Stroke()
        .apply(block)
}
