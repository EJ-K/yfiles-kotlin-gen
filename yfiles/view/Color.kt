// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.lang.ClassMetadata

/**
 * Represents an ARGB (alpha, red, green, blue) encoded color object.
 * 
 * This is a convertible type that can be used with the following notation(s) in parameter lists, parameter objects or setters.
 * CSS color strings are converted to [Color]s. For example:
 * 
 * ```
 * 'blue'
 * '#369'
 * '#336699'
 * 'rgb(51, 102, 153)'
 * 'rgba(51, 102, 153, 0.5)'
 * 'hsl(225, 98%, 60%)'
 * 'hsla(225, 98%, 60%, 0.5)'
 * ```
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [Color] class.
 * @param [r] The red value; `0` by default.
 * @param [g] The green value; `0` by default
 * @param [b] The blue value; `0` by default.
 * @param [a] The alpha value; `255` by default.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23Color-constructor-Color">Online Documentation</a>
 * 
 * @property r
 * Gets the value of the red component of the color.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23r">Online Documentation</a>
 * 
 * @property g
 * Gets the value of the green component of the color.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23g">Online Documentation</a>
 * 
 * @property b
 * Gets the value of the blue component of the color.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23b">Online Documentation</a>
 * 
 * @property a
 * Gets the value of the alpha component of the color.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23a">Online Documentation</a>
 */
external class Color (
final val r: Int = definedExternally,
final val g: Int = definedExternally,
final val b: Int = definedExternally,
final val a: Int = definedExternally) : Fill {
  /**
   * Determines whether this [Color] is equal to the specified object.
   * @param [fill] The other [Fill] instance to compare.
   * @return `true`, if this [Color] is equal to the other object; `false`, otherwise.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23Color-method-hasSameValue">Online Documentation</a>
   */
  override fun hasSameValue(
    fill: Fill?,
  ): Boolean
  /**
   * @return [r]
   */    
  @JsName("__ygen_r_negy__")
  final operator fun component1(): Int
  /**
   * @return [g]
   */    
  @JsName("__ygen_g_negy__")
  final operator fun component2(): Int
  /**
   * @return [b]
   */    
  @JsName("__ygen_b_negy__")
  final operator fun component3(): Int
  /**
   * @return [a]
   */    
  @JsName("__ygen_a_negy__")
  final operator fun component4(): Int
  
  
  
  companion object : ClassMetadata<Color> {
    /**
     * Yields a new [Color] for the wellknown name AliceBlue.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23ALICE_BLUE">Online Documentation</a>
     */
     val ALICE_BLUE: Color
    
    /**
     * Yields a new [Color] for the wellknown name AntiqueWhite.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23ANTIQUE_WHITE">Online Documentation</a>
     */
     val ANTIQUE_WHITE: Color
    
    /**
     * Yields a new [Color] for the wellknown name Aqua.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23AQUA">Online Documentation</a>
     */
     val AQUA: Color
    
    /**
     * Yields a new [Color] for the wellknown name Aquamarine.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23AQUAMARINE">Online Documentation</a>
     */
     val AQUAMARINE: Color
    
    /**
     * Yields a new [Color] for the wellknown name Azure.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23AZURE">Online Documentation</a>
     */
     val AZURE: Color
    
    /**
     * Yields a new [Color] for the wellknown name Beige.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23BEIGE">Online Documentation</a>
     */
     val BEIGE: Color
    
    /**
     * Yields a new [Color] for the wellknown name Bisque.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23BISQUE">Online Documentation</a>
     */
     val BISQUE: Color
    
    /**
     * Yields a new [Color] for the wellknown name Black.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23BLACK">Online Documentation</a>
     */
     val BLACK: Color
    
    /**
     * Yields a new [Color] for the wellknown name BlanchedAlmond.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23BLANCHED_ALMOND">Online Documentation</a>
     */
     val BLANCHED_ALMOND: Color
    
    /**
     * Yields a new [Color] for the wellknown name Blue.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23BLUE">Online Documentation</a>
     */
     val BLUE: Color
    
    /**
     * Yields a new [Color] for the wellknown name BlueViolet.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23BLUE_VIOLET">Online Documentation</a>
     */
     val BLUE_VIOLET: Color
    
    /**
     * Yields a new [Color] for the wellknown name Brown.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23BROWN">Online Documentation</a>
     */
     val BROWN: Color
    
    /**
     * Yields a new [Color] for the wellknown name BurlyWood.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23BURLY_WOOD">Online Documentation</a>
     */
     val BURLY_WOOD: Color
    
    /**
     * Yields a new [Color] for the wellknown name CadetBlue.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23CADET_BLUE">Online Documentation</a>
     */
     val CADET_BLUE: Color
    
    /**
     * Yields a new [Color] for the wellknown name Chartreuse.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23CHARTREUSE">Online Documentation</a>
     */
     val CHARTREUSE: Color
    
    /**
     * Yields a new [Color] for the wellknown name Chocolate.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23CHOCOLATE">Online Documentation</a>
     */
     val CHOCOLATE: Color
    
    /**
     * Yields a new [Color] for the wellknown name Coral.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23CORAL">Online Documentation</a>
     */
     val CORAL: Color
    
    /**
     * Yields a new [Color] for the wellknown name CornflowerBlue.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23CORNFLOWER_BLUE">Online Documentation</a>
     */
     val CORNFLOWER_BLUE: Color
    
    /**
     * Yields a new [Color] for the wellknown name Cornsilk.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23CORNSILK">Online Documentation</a>
     */
     val CORNSILK: Color
    
    /**
     * Yields a new [Color] for the wellknown name Crimson.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23CRIMSON">Online Documentation</a>
     */
     val CRIMSON: Color
    
    /**
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23CURRENT_COLOR">Online Documentation</a>
     */
     val CURRENT_COLOR: Fill
    
    /**
     * Yields a new [Color] for the wellknown name Cyan.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23CYAN">Online Documentation</a>
     */
     val CYAN: Color
    
    /**
     * Yields a new [Color] for the wellknown name DarkBlue.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23DARK_BLUE">Online Documentation</a>
     */
     val DARK_BLUE: Color
    
    /**
     * Yields a new [Color] for the wellknown name DarkCyan.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23DARK_CYAN">Online Documentation</a>
     */
     val DARK_CYAN: Color
    
    /**
     * Yields a new [Color] for the wellknown name DarkGoldenrod.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23DARK_GOLDENROD">Online Documentation</a>
     */
     val DARK_GOLDENROD: Color
    
    /**
     * Yields a new [Color] for the wellknown name DarkGray.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23DARK_GRAY">Online Documentation</a>
     */
     val DARK_GRAY: Color
    
    /**
     * Yields a new [Color] for the wellknown name DarkGreen.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23DARK_GREEN">Online Documentation</a>
     */
     val DARK_GREEN: Color
    
    /**
     * Yields a new [Color] for the wellknown name DarkKhaki.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23DARK_KHAKI">Online Documentation</a>
     */
     val DARK_KHAKI: Color
    
    /**
     * Yields a new [Color] for the wellknown name DarkMagenta.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23DARK_MAGENTA">Online Documentation</a>
     */
     val DARK_MAGENTA: Color
    
    /**
     * Yields a new [Color] for the wellknown name DarkOliveGreen.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23DARK_OLIVE_GREEN">Online Documentation</a>
     */
     val DARK_OLIVE_GREEN: Color
    
    /**
     * Yields a new [Color] for the wellknown name DarkOrange.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23DARK_ORANGE">Online Documentation</a>
     */
     val DARK_ORANGE: Color
    
    /**
     * Yields a new [Color] for the wellknown name DarkOrchid.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23DARK_ORCHID">Online Documentation</a>
     */
     val DARK_ORCHID: Color
    
    /**
     * Yields a new [Color] for the wellknown name DarkRed.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23DARK_RED">Online Documentation</a>
     */
     val DARK_RED: Color
    
    /**
     * Yields a new [Color] for the wellknown name DarkSalmon.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23DARK_SALMON">Online Documentation</a>
     */
     val DARK_SALMON: Color
    
    /**
     * Yields a new [Color] for the wellknown name DarkSeaGreen.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23DARK_SEA_GREEN">Online Documentation</a>
     */
     val DARK_SEA_GREEN: Color
    
    /**
     * Yields a new [Color] for the wellknown name DarkSlateBlue.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23DARK_SLATE_BLUE">Online Documentation</a>
     */
     val DARK_SLATE_BLUE: Color
    
    /**
     * Yields a new [Color] for the wellknown name DarkSlateGray.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23DARK_SLATE_GRAY">Online Documentation</a>
     */
     val DARK_SLATE_GRAY: Color
    
    /**
     * Yields a new [Color] for the wellknown name DarkTurquoise.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23DARK_TURQUOISE">Online Documentation</a>
     */
     val DARK_TURQUOISE: Color
    
    /**
     * Yields a new [Color] for the wellknown name DarkViolet.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23DARK_VIOLET">Online Documentation</a>
     */
     val DARK_VIOLET: Color
    
    /**
     * Yields a new [Color] for the wellknown name DeepPink.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23DEEP_PINK">Online Documentation</a>
     */
     val DEEP_PINK: Color
    
    /**
     * Yields a new [Color] for the wellknown name DeepSkyBlue.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23DEEP_SKY_BLUE">Online Documentation</a>
     */
     val DEEP_SKY_BLUE: Color
    
    /**
     * Yields a new [Color] for the wellknown name DimGray.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23DIM_GRAY">Online Documentation</a>
     */
     val DIM_GRAY: Color
    
    /**
     * Yields a new [Color] for the wellknown name DodgerBlue.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23DODGER_BLUE">Online Documentation</a>
     */
     val DODGER_BLUE: Color
    
    /**
     * Yields a new [Color] for the wellknown name Firebrick.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23FIREBRICK">Online Documentation</a>
     */
     val FIREBRICK: Color
    
    /**
     * Yields a new [Color] for the wellknown name FloralWhite.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23FLORAL_WHITE">Online Documentation</a>
     */
     val FLORAL_WHITE: Color
    
    /**
     * Yields a new [Color] for the wellknown name ForestGreen.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23FOREST_GREEN">Online Documentation</a>
     */
     val FOREST_GREEN: Color
    
    /**
     * Yields a new [Color] for the wellknown name Fuchsia.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23FUCHSIA">Online Documentation</a>
     */
     val FUCHSIA: Color
    
    /**
     * Yields a new [Color] for the wellknown name Gainsboro.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23GAINSBORO">Online Documentation</a>
     */
     val GAINSBORO: Color
    
    /**
     * Yields a new [Color] for the wellknown name GhostWhite.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23GHOST_WHITE">Online Documentation</a>
     */
     val GHOST_WHITE: Color
    
    /**
     * Yields a new [Color] for the wellknown name Gold.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23GOLD">Online Documentation</a>
     */
     val GOLD: Color
    
    /**
     * Yields a new [Color] for the wellknown name Goldenrod.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23GOLDENROD">Online Documentation</a>
     */
     val GOLDENROD: Color
    
    /**
     * Yields a new [Color] for the wellknown name Gray.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23GRAY">Online Documentation</a>
     */
     val GRAY: Color
    
    /**
     * Yields a new [Color] for the wellknown name Green.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23GREEN">Online Documentation</a>
     */
     val GREEN: Color
    
    /**
     * Yields a new [Color] for the wellknown name GreenYellow.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23GREEN_YELLOW">Online Documentation</a>
     */
     val GREEN_YELLOW: Color
    
    /**
     * Yields a new [Color] for the wellknown name Honeydew.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23HONEYDEW">Online Documentation</a>
     */
     val HONEYDEW: Color
    
    /**
     * Yields a new [Color] for the wellknown name HotPink.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23HOT_PINK">Online Documentation</a>
     */
     val HOT_PINK: Color
    
    /**
     * Yields a new [Color] for the wellknown name IndianRed.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23INDIAN_RED">Online Documentation</a>
     */
     val INDIAN_RED: Color
    
    /**
     * Yields a new [Color] for the wellknown name Indigo.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23INDIGO">Online Documentation</a>
     */
     val INDIGO: Color
    
    /**
     * Yields a new [Color] for the wellknown name Ivory.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23IVORY">Online Documentation</a>
     */
     val IVORY: Color
    
    /**
     * Yields a new [Color] for the wellknown name Khaki.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23KHAKI">Online Documentation</a>
     */
     val KHAKI: Color
    
    /**
     * Yields a new [Color] for the wellknown name Lavender.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23LAVENDER">Online Documentation</a>
     */
     val LAVENDER: Color
    
    /**
     * Yields a new [Color] for the wellknown name LavenderBlush.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23LAVENDER_BLUSH">Online Documentation</a>
     */
     val LAVENDER_BLUSH: Color
    
    /**
     * Yields a new [Color] for the wellknown name LawnGreen.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23LAWN_GREEN">Online Documentation</a>
     */
     val LAWN_GREEN: Color
    
    /**
     * Yields a new [Color] for the wellknown name LemonChiffon.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23LEMON_CHIFFON">Online Documentation</a>
     */
     val LEMON_CHIFFON: Color
    
    /**
     * Yields a new [Color] for the wellknown name LightBlue.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23LIGHT_BLUE">Online Documentation</a>
     */
     val LIGHT_BLUE: Color
    
    /**
     * Yields a new [Color] for the wellknown name LightCoral.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23LIGHT_CORAL">Online Documentation</a>
     */
     val LIGHT_CORAL: Color
    
    /**
     * Yields a new [Color] for the wellknown name LightCyan.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23LIGHT_CYAN">Online Documentation</a>
     */
     val LIGHT_CYAN: Color
    
    /**
     * Yields a new [Color] for the wellknown name LightGoldenrodYellow.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23LIGHT_GOLDENROD_YELLOW">Online Documentation</a>
     */
     val LIGHT_GOLDENROD_YELLOW: Color
    
    /**
     * Yields a new [Color] for the wellknown name LightGray.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23LIGHT_GRAY">Online Documentation</a>
     */
     val LIGHT_GRAY: Color
    
    /**
     * Yields a new [Color] for the wellknown name LightGreen.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23LIGHT_GREEN">Online Documentation</a>
     */
     val LIGHT_GREEN: Color
    
    /**
     * Yields a new [Color] for the wellknown name LightPink.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23LIGHT_PINK">Online Documentation</a>
     */
     val LIGHT_PINK: Color
    
    /**
     * Yields a new [Color] for the wellknown name LightSalmon.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23LIGHT_SALMON">Online Documentation</a>
     */
     val LIGHT_SALMON: Color
    
    /**
     * Yields a new [Color] for the wellknown name LightSeaGreen.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23LIGHT_SEA_GREEN">Online Documentation</a>
     */
     val LIGHT_SEA_GREEN: Color
    
    /**
     * Yields a new [Color] for the wellknown name LightSkyBlue.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23LIGHT_SKY_BLUE">Online Documentation</a>
     */
     val LIGHT_SKY_BLUE: Color
    
    /**
     * Yields a new [Color] for the wellknown name LightSlateGray.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23LIGHT_SLATE_GRAY">Online Documentation</a>
     */
     val LIGHT_SLATE_GRAY: Color
    
    /**
     * Yields a new [Color] for the wellknown name LightSteelBlue.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23LIGHT_STEEL_BLUE">Online Documentation</a>
     */
     val LIGHT_STEEL_BLUE: Color
    
    /**
     * Yields a new [Color] for the wellknown name LightYellow.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23LIGHT_YELLOW">Online Documentation</a>
     */
     val LIGHT_YELLOW: Color
    
    /**
     * Yields a new [Color] for the wellknown name Lime.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23LIME">Online Documentation</a>
     */
     val LIME: Color
    
    /**
     * Yields a new [Color] for the wellknown name LimeGreen.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23LIME_GREEN">Online Documentation</a>
     */
     val LIME_GREEN: Color
    
    /**
     * Yields a new [Color] for the wellknown name Linen.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23LINEN">Online Documentation</a>
     */
     val LINEN: Color
    
    /**
     * Yields a new [Color] for the wellknown name Magenta.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23MAGENTA">Online Documentation</a>
     */
     val MAGENTA: Color
    
    /**
     * Yields a new [Color] for the wellknown name Maroon.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23MAROON">Online Documentation</a>
     */
     val MAROON: Color
    
    /**
     * Yields a new [Color] for the wellknown name MediumAquamarine.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23MEDIUM_AQUAMARINE">Online Documentation</a>
     */
     val MEDIUM_AQUAMARINE: Color
    
    /**
     * Yields a new [Color] for the wellknown name MediumBlue.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23MEDIUM_BLUE">Online Documentation</a>
     */
     val MEDIUM_BLUE: Color
    
    /**
     * Yields a new [Color] for the wellknown name MediumOrchid.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23MEDIUM_ORCHID">Online Documentation</a>
     */
     val MEDIUM_ORCHID: Color
    
    /**
     * Yields a new [Color] for the wellknown name MediumPurple.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23MEDIUM_PURPLE">Online Documentation</a>
     */
     val MEDIUM_PURPLE: Color
    
    /**
     * Yields a new [Color] for the wellknown name MediumSeaGreen.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23MEDIUM_SEA_GREEN">Online Documentation</a>
     */
     val MEDIUM_SEA_GREEN: Color
    
    /**
     * Yields a new [Color] for the wellknown name MediumSlateBlue.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23MEDIUM_SLATE_BLUE">Online Documentation</a>
     */
     val MEDIUM_SLATE_BLUE: Color
    
    /**
     * Yields a new [Color] for the wellknown name MediumSpringGreen.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23MEDIUM_SPRING_GREEN">Online Documentation</a>
     */
     val MEDIUM_SPRING_GREEN: Color
    
    /**
     * Yields a new [Color] for the wellknown name MediumTurquoise.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23MEDIUM_TURQUOISE">Online Documentation</a>
     */
     val MEDIUM_TURQUOISE: Color
    
    /**
     * Yields a new [Color] for the wellknown name MediumVioletRed.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23MEDIUM_VIOLET_RED">Online Documentation</a>
     */
     val MEDIUM_VIOLET_RED: Color
    
    /**
     * Yields a new [Color] for the wellknown name MidnightBlue.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23MIDNIGHT_BLUE">Online Documentation</a>
     */
     val MIDNIGHT_BLUE: Color
    
    /**
     * Yields a new [Color] for the wellknown name MintCream.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23MINT_CREAM">Online Documentation</a>
     */
     val MINT_CREAM: Color
    
    /**
     * Yields a new [Color] for the wellknown name MistyRose.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23MISTY_ROSE">Online Documentation</a>
     */
     val MISTY_ROSE: Color
    
    /**
     * Yields a new [Color] for the wellknown name Moccasin.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23MOCCASIN">Online Documentation</a>
     */
     val MOCCASIN: Color
    
    /**
     * Yields a new [Color] for the wellknown name NavajoWhite.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23NAVAJO_WHITE">Online Documentation</a>
     */
     val NAVAJO_WHITE: Color
    
    /**
     * Yields a new [Color] for the wellknown name Navy.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23NAVY">Online Documentation</a>
     */
     val NAVY: Color
    
    /**
     * Yields a new [Color] for the wellknown name OldLace.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23OLD_LACE">Online Documentation</a>
     */
     val OLD_LACE: Color
    
    /**
     * Yields a new [Color] for the wellknown name Olive.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23OLIVE">Online Documentation</a>
     */
     val OLIVE: Color
    
    /**
     * Yields a new [Color] for the wellknown name OliveDrab.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23OLIVE_DRAB">Online Documentation</a>
     */
     val OLIVE_DRAB: Color
    
    /**
     * Yields a new [Color] for the wellknown name Orange.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23ORANGE">Online Documentation</a>
     */
     val ORANGE: Color
    
    /**
     * Yields a new [Color] for the wellknown name OrangeRed.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23ORANGE_RED">Online Documentation</a>
     */
     val ORANGE_RED: Color
    
    /**
     * Yields a new [Color] for the wellknown name Orchid.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23ORCHID">Online Documentation</a>
     */
     val ORCHID: Color
    
    /**
     * Yields a new [Color] for the wellknown name PaleGoldenrod.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23PALE_GOLDENROD">Online Documentation</a>
     */
     val PALE_GOLDENROD: Color
    
    /**
     * Yields a new [Color] for the wellknown name PaleGreen.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23PALE_GREEN">Online Documentation</a>
     */
     val PALE_GREEN: Color
    
    /**
     * Yields a new [Color] for the wellknown name PaleTurquoise.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23PALE_TURQUOISE">Online Documentation</a>
     */
     val PALE_TURQUOISE: Color
    
    /**
     * Yields a new [Color] for the wellknown name PaleVioletRed.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23PALE_VIOLET_RED">Online Documentation</a>
     */
     val PALE_VIOLET_RED: Color
    
    /**
     * Yields a new [Color] for the wellknown name PapayaWhip.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23PAPAYA_WHIP">Online Documentation</a>
     */
     val PAPAYA_WHIP: Color
    
    /**
     * Yields a new [Color] for the wellknown name PeachPuff.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23PEACH_PUFF">Online Documentation</a>
     */
     val PEACH_PUFF: Color
    
    /**
     * Yields a new [Color] for the wellknown name Peru.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23PERU">Online Documentation</a>
     */
     val PERU: Color
    
    /**
     * Yields a new [Color] for the wellknown name Pink.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23PINK">Online Documentation</a>
     */
     val PINK: Color
    
    /**
     * Yields a new [Color] for the wellknown name Plum.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23PLUM">Online Documentation</a>
     */
     val PLUM: Color
    
    /**
     * Yields a new [Color] for the wellknown name PowderBlue.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23POWDER_BLUE">Online Documentation</a>
     */
     val POWDER_BLUE: Color
    
    /**
     * Yields a new [Color] for the wellknown name Purple.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23PURPLE">Online Documentation</a>
     */
     val PURPLE: Color
    
    /**
     * Yields a new [Color] for the wellknown name Red.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23RED">Online Documentation</a>
     */
     val RED: Color
    
    /**
     * Yields a new [Color] for the wellknown name RosyBrown.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23ROSY_BROWN">Online Documentation</a>
     */
     val ROSY_BROWN: Color
    
    /**
     * Yields a new [Color] for the wellknown name RoyalBlue.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23ROYAL_BLUE">Online Documentation</a>
     */
     val ROYAL_BLUE: Color
    
    /**
     * Yields a new [Color] for the wellknown name SaddleBrown.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23SADDLE_BROWN">Online Documentation</a>
     */
     val SADDLE_BROWN: Color
    
    /**
     * Yields a new [Color] for the wellknown name Salmon.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23SALMON">Online Documentation</a>
     */
     val SALMON: Color
    
    /**
     * Yields a new [Color] for the wellknown name SandyBrown.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23SANDY_BROWN">Online Documentation</a>
     */
     val SANDY_BROWN: Color
    
    /**
     * Yields a new [Color] for the wellknown name SeaGreen.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23SEA_GREEN">Online Documentation</a>
     */
     val SEA_GREEN: Color
    
    /**
     * Yields a new [Color] for the wellknown name SeaShell.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23SEA_SHELL">Online Documentation</a>
     */
     val SEA_SHELL: Color
    
    /**
     * Yields a new [Color] for the wellknown name Sienna.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23SIENNA">Online Documentation</a>
     */
     val SIENNA: Color
    
    /**
     * Yields a new [Color] for the wellknown name Silver.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23SILVER">Online Documentation</a>
     */
     val SILVER: Color
    
    /**
     * Yields a new [Color] for the wellknown name SkyBlue.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23SKY_BLUE">Online Documentation</a>
     */
     val SKY_BLUE: Color
    
    /**
     * Yields a new [Color] for the wellknown name SlateBlue.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23SLATE_BLUE">Online Documentation</a>
     */
     val SLATE_BLUE: Color
    
    /**
     * Yields a new [Color] for the wellknown name SlateGray.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23SLATE_GRAY">Online Documentation</a>
     */
     val SLATE_GRAY: Color
    
    /**
     * Yields a new [Color] for the wellknown name Snow.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23SNOW">Online Documentation</a>
     */
     val SNOW: Color
    
    /**
     * Yields a new [Color] for the wellknown name SpringGreen.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23SPRING_GREEN">Online Documentation</a>
     */
     val SPRING_GREEN: Color
    
    /**
     * Yields a new [Color] for the wellknown name SteelBlue.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23STEEL_BLUE">Online Documentation</a>
     */
     val STEEL_BLUE: Color
    
    /**
     * Yields a new [Color] for the wellknown name Tan.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23TAN">Online Documentation</a>
     */
     val TAN: Color
    
    /**
     * Yields a new [Color] for the wellknown name Teal.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23TEAL">Online Documentation</a>
     */
     val TEAL: Color
    
    /**
     * Yields a new [Color] for the wellknown name Thistle.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23THISTLE">Online Documentation</a>
     */
     val THISTLE: Color
    
    /**
     * Yields a new [Color] for the wellknown name Tomato.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23TOMATO">Online Documentation</a>
     */
     val TOMATO: Color
    
    /**
     * Yields a new [Color] for the wellknown name Transparent.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23TRANSPARENT">Online Documentation</a>
     */
     val TRANSPARENT: Color
    
    /**
     * Yields a new [Color] for the wellknown name Turquoise.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23TURQUOISE">Online Documentation</a>
     */
     val TURQUOISE: Color
    
    /**
     * Yields a new [Color] for the wellknown name Violet.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23VIOLET">Online Documentation</a>
     */
     val VIOLET: Color
    
    /**
     * Yields a new [Color] for the wellknown name Wheat.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23WHEAT">Online Documentation</a>
     */
     val WHEAT: Color
    
    /**
     * Yields a new [Color] for the wellknown name White.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23WHITE">Online Documentation</a>
     */
     val WHITE: Color
    
    /**
     * Yields a new [Color] for the wellknown name WhiteSmoke.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23WHITE_SMOKE">Online Documentation</a>
     */
     val WHITE_SMOKE: Color
    
    /**
     * Yields a new [Color] for the wellknown name Yellow.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23YELLOW">Online Documentation</a>
     */
     val YELLOW: Color
    
    /**
     * Yields a new [Color] for the wellknown name YellowGreen.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23YELLOW_GREEN">Online Documentation</a>
     */
     val YELLOW_GREEN: Color
    
    /**
     * Creates a [Color] instance from the given color-like object by performing automatic type conversion.
     * @param [colorLike] The object to convert to a [Color].
     * @return The given `colorLike` if it is already a [Color], or a new instance initialized to the values found in `colorLike`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23Color-method-from">Online Documentation</a>
     */
    @JsName("from")
    operator fun invoke(
      colorLike: String,
    ): Color
    
    /**
     * Creates a new color instance from HSL and A values.
     * @param [h] The hue value between 0 and 1.
     * @param [s] The saturation value between 0 and 1.
     * @param [l] The lightness value between 0 and 1.
     * @param [a] The alpha value between 0 and 1. 1 if omitted
     * @return A new color instance with the given values.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23Color-method-fromHSLA">Online Documentation</a>
     */
    fun fromHSLA(
      h: Double,
      s: Double,
      l: Double,
      a: Double  = definedExternally,
    ): Color
    
    /**
     * Creates a new color instance from RGB and A values.
     * @param [r] The red value between 0 and 255.
     * @param [g] The green value between 0 and 255.
     * @param [b] The blue value between 0 and 255.
     * @param [a] The alpha fractional value between 0 and 1. 1 if omitted
     * @return A new color instance with the given values.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Color%23Color-method-fromRGBA">Online Documentation</a>
     */
    fun fromRGBA(
      r: Int,
      g: Int,
      b: Int,
      a: Double  = definedExternally,
    ): Color
  }
}

inline fun Color(
    block: Color.() -> Unit
): Color {
    return Color()
        .apply(block)
}
