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
 * Represents any object which fills an area.
 * 
 * The fill that is defined by instances of this type can be applied to an SVG element using either the static helper [setFill] or the instance method [applyTo].
 * This is a convertible type that can be used with the following notation(s) in parameter lists, parameter objects or setters.
 * CSS color strings are converted to [SolidColorFill]s. For example:
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
 * @see [setFill]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill">Online Documentation</a>
 */
external abstract class Fill  : ICloneable<Fill> {

/**
 * Assigns the fill defined by this instance to the given SVG `element`.
 * @param [element] The element whose fill should be set.
 * @param [context] The context.
 * @see [setFill]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23Fill-method-applyTo">Online Documentation</a>
 */
 final   fun applyTo( element: SVGElement ,
 context: ICanvasContext )
/**
 * Clones this instance by returning a [YObject.memberwiseClone][yfiles.lang.YObject.memberwiseClone] or this in case this instance is already [frozen][isFrozen].
 * @return An instance of the same type as this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23Fill-method-clone">Online Documentation</a>
 */
 override   fun clone():Fill
/**
 * Freezes and returns this instance.
 * @return This instance, made immutable.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23Fill-method-freeze">Online Documentation</a>
 */
 open   fun freeze():Fill
/**
 * Determines whether this [Fill] is equal to the specified object.
 * @param [fill] The other [Fill] instance to compare.
 * @return `true`, if this [SolidColorFill] is equal to the other object; `false`, otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23Fill-method-hasSameValue">Online Documentation</a>
 */
 abstract infix   fun hasSameValue( fill: Fill? ):Boolean
/**
 * Determines if this instance is frozen.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23Fill-method-isFrozen">Online Documentation</a>
 */
 final   fun isFrozen():Boolean

companion object : ClassMetadata<Fill> {
/**
 * Gets a [SolidColorFill] for the color AliceBlue.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23ALICE_BLUE">Online Documentation</a>
 */
 val ALICE_BLUE: Fill
/**
 * Gets a [SolidColorFill] for the color AntiqueWhite.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23ANTIQUE_WHITE">Online Documentation</a>
 */
 val ANTIQUE_WHITE: Fill
/**
 * Gets a [SolidColorFill] for the color Aqua.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23AQUA">Online Documentation</a>
 */
 val AQUA: Fill
/**
 * Gets a [SolidColorFill] for the color Aquamarine.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23AQUAMARINE">Online Documentation</a>
 */
 val AQUAMARINE: Fill
/**
 * Gets a [SolidColorFill] for the color Azure.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23AZURE">Online Documentation</a>
 */
 val AZURE: Fill
/**
 * Gets a [SolidColorFill] for the color Beige.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23BEIGE">Online Documentation</a>
 */
 val BEIGE: Fill
/**
 * Gets a [SolidColorFill] for the color Bisque.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23BISQUE">Online Documentation</a>
 */
 val BISQUE: Fill
/**
 * Gets a [SolidColorFill] for the color Black.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23BLACK">Online Documentation</a>
 */
 val BLACK: Fill
/**
 * Gets a [SolidColorFill] for the color BlanchedAlmond.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23BLANCHED_ALMOND">Online Documentation</a>
 */
 val BLANCHED_ALMOND: Fill
/**
 * Gets a [SolidColorFill] for the color Blue.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23BLUE">Online Documentation</a>
 */
 val BLUE: Fill
/**
 * Gets a [SolidColorFill] for the color BlueViolet.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23BLUE_VIOLET">Online Documentation</a>
 */
 val BLUE_VIOLET: Fill
/**
 * Gets a [SolidColorFill] for the color Brown.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23BROWN">Online Documentation</a>
 */
 val BROWN: Fill
/**
 * Gets a [SolidColorFill] for the color BurlyWood.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23BURLY_WOOD">Online Documentation</a>
 */
 val BURLY_WOOD: Fill
/**
 * Gets a [SolidColorFill] for the color CadetBlue.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23CADET_BLUE">Online Documentation</a>
 */
 val CADET_BLUE: Fill
/**
 * Gets a [SolidColorFill] for the color Chartreuse.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23CHARTREUSE">Online Documentation</a>
 */
 val CHARTREUSE: Fill
/**
 * Gets a [SolidColorFill] for the color Chocolate.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23CHOCOLATE">Online Documentation</a>
 */
 val CHOCOLATE: Fill
/**
 * Gets a [SolidColorFill] for the color Coral.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23CORAL">Online Documentation</a>
 */
 val CORAL: Fill
/**
 * Gets a [SolidColorFill] for the color CornflowerBlue.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23CORNFLOWER_BLUE">Online Documentation</a>
 */
 val CORNFLOWER_BLUE: Fill
/**
 * Gets a [SolidColorFill] for the color Cornsilk.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23CORNSILK">Online Documentation</a>
 */
 val CORNSILK: Fill
/**
 * Gets a [SolidColorFill] for the color Crimson.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23CRIMSON">Online Documentation</a>
 */
 val CRIMSON: Fill
/**
 * Gets a [Fill] for the `currentColor` constant.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23CURRENT_COLOR">Online Documentation</a>
 */
 val CURRENT_COLOR: Fill
/**
 * Gets a [SolidColorFill] for the color Cyan.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23CYAN">Online Documentation</a>
 */
 val CYAN: Fill
/**
 * Gets a [SolidColorFill] for the color DarkBlue.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23DARK_BLUE">Online Documentation</a>
 */
 val DARK_BLUE: Fill
/**
 * Gets a [SolidColorFill] for the color DarkCyan.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23DARK_CYAN">Online Documentation</a>
 */
 val DARK_CYAN: Fill
/**
 * Gets a [SolidColorFill] for the color DarkGoldenrod.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23DARK_GOLDENROD">Online Documentation</a>
 */
 val DARK_GOLDENROD: Fill
/**
 * Gets a [SolidColorFill] for the color DarkGray.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23DARK_GRAY">Online Documentation</a>
 */
 val DARK_GRAY: Fill
/**
 * Gets a [SolidColorFill] for the color DarkGreen.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23DARK_GREEN">Online Documentation</a>
 */
 val DARK_GREEN: Fill
/**
 * Gets a [SolidColorFill] for the color DarkKhaki.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23DARK_KHAKI">Online Documentation</a>
 */
 val DARK_KHAKI: Fill
/**
 * Gets a [SolidColorFill] for the color DarkMagenta.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23DARK_MAGENTA">Online Documentation</a>
 */
 val DARK_MAGENTA: Fill
/**
 * Gets a [SolidColorFill] for the color DarkOliveGreen.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23DARK_OLIVE_GREEN">Online Documentation</a>
 */
 val DARK_OLIVE_GREEN: Fill
/**
 * Gets a [SolidColorFill] for the color DarkOrange.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23DARK_ORANGE">Online Documentation</a>
 */
 val DARK_ORANGE: Fill
/**
 * Gets a [SolidColorFill] for the color DarkOrchid.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23DARK_ORCHID">Online Documentation</a>
 */
 val DARK_ORCHID: Fill
/**
 * Gets a [SolidColorFill] for the color DarkRed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23DARK_RED">Online Documentation</a>
 */
 val DARK_RED: Fill
/**
 * Gets a [SolidColorFill] for the color DarkSalmon.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23DARK_SALMON">Online Documentation</a>
 */
 val DARK_SALMON: Fill
/**
 * Gets a [SolidColorFill] for the color DarkSeaGreen.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23DARK_SEA_GREEN">Online Documentation</a>
 */
 val DARK_SEA_GREEN: Fill
/**
 * Gets a [SolidColorFill] for the color DarkSlateBlue.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23DARK_SLATE_BLUE">Online Documentation</a>
 */
 val DARK_SLATE_BLUE: Fill
/**
 * Gets a [SolidColorFill] for the color DarkSlateGray.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23DARK_SLATE_GRAY">Online Documentation</a>
 */
 val DARK_SLATE_GRAY: Fill
/**
 * Gets a [SolidColorFill] for the color DarkTurquoise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23DARK_TURQUOISE">Online Documentation</a>
 */
 val DARK_TURQUOISE: Fill
/**
 * Gets a [SolidColorFill] for the color DarkViolet.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23DARK_VIOLET">Online Documentation</a>
 */
 val DARK_VIOLET: Fill
/**
 * Gets a [SolidColorFill] for the color DeepPink.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23DEEP_PINK">Online Documentation</a>
 */
 val DEEP_PINK: Fill
/**
 * Gets a [SolidColorFill] for the color DeepSkyBlue.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23DEEP_SKY_BLUE">Online Documentation</a>
 */
 val DEEP_SKY_BLUE: Fill
/**
 * Gets a [SolidColorFill] for the color DimGray.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23DIM_GRAY">Online Documentation</a>
 */
 val DIM_GRAY: Fill
/**
 * Gets a [SolidColorFill] for the color DodgerBlue.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23DODGER_BLUE">Online Documentation</a>
 */
 val DODGER_BLUE: Fill
/**
 * Gets a [SolidColorFill] for the color Firebrick.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23FIREBRICK">Online Documentation</a>
 */
 val FIREBRICK: Fill
/**
 * Gets a [SolidColorFill] for the color FloralWhite.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23FLORAL_WHITE">Online Documentation</a>
 */
 val FLORAL_WHITE: Fill
/**
 * Gets a [SolidColorFill] for the color ForestGreen.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23FOREST_GREEN">Online Documentation</a>
 */
 val FOREST_GREEN: Fill
/**
 * Gets a [SolidColorFill] for the color Fuchsia.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23FUCHSIA">Online Documentation</a>
 */
 val FUCHSIA: Fill
/**
 * Gets a [SolidColorFill] for the color Gainsboro.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23GAINSBORO">Online Documentation</a>
 */
 val GAINSBORO: Fill
/**
 * Gets a [SolidColorFill] for the color GhostWhite.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23GHOST_WHITE">Online Documentation</a>
 */
 val GHOST_WHITE: Fill
/**
 * Gets a [SolidColorFill] for the color Gold.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23GOLD">Online Documentation</a>
 */
 val GOLD: Fill
/**
 * Gets a [SolidColorFill] for the color Goldenrod.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23GOLDENROD">Online Documentation</a>
 */
 val GOLDENROD: Fill
/**
 * Gets a [SolidColorFill] for the color Gray.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23GRAY">Online Documentation</a>
 */
 val GRAY: Fill
/**
 * Gets a [SolidColorFill] for the color Green.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23GREEN">Online Documentation</a>
 */
 val GREEN: Fill
/**
 * Gets a [SolidColorFill] for the color GreenYellow.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23GREEN_YELLOW">Online Documentation</a>
 */
 val GREEN_YELLOW: Fill
/**
 * Gets a [SolidColorFill] for the color Honeydew.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23HONEYDEW">Online Documentation</a>
 */
 val HONEYDEW: Fill
/**
 * Gets a [SolidColorFill] for the color HotPink.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23HOT_PINK">Online Documentation</a>
 */
 val HOT_PINK: Fill
/**
 * Gets a [SolidColorFill] for the color IndianRed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23INDIAN_RED">Online Documentation</a>
 */
 val INDIAN_RED: Fill
/**
 * Gets a [SolidColorFill] for the color Indigo.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23INDIGO">Online Documentation</a>
 */
 val INDIGO: Fill
/**
 * Gets a [SolidColorFill] for the color Ivory.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23IVORY">Online Documentation</a>
 */
 val IVORY: Fill
/**
 * Gets a [SolidColorFill] for the color Khaki.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23KHAKI">Online Documentation</a>
 */
 val KHAKI: Fill
/**
 * Gets a [SolidColorFill] for the color Lavender.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23LAVENDER">Online Documentation</a>
 */
 val LAVENDER: Fill
/**
 * Gets a [SolidColorFill] for the color LavenderBlush.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23LAVENDER_BLUSH">Online Documentation</a>
 */
 val LAVENDER_BLUSH: Fill
/**
 * Gets a [SolidColorFill] for the color LawnGreen.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23LAWN_GREEN">Online Documentation</a>
 */
 val LAWN_GREEN: Fill
/**
 * Gets a [SolidColorFill] for the color LemonChiffon.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23LEMON_CHIFFON">Online Documentation</a>
 */
 val LEMON_CHIFFON: Fill
/**
 * Gets a [SolidColorFill] for the color LightBlue.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23LIGHT_BLUE">Online Documentation</a>
 */
 val LIGHT_BLUE: Fill
/**
 * Gets a [SolidColorFill] for the color LightCoral.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23LIGHT_CORAL">Online Documentation</a>
 */
 val LIGHT_CORAL: Fill
/**
 * Gets a [SolidColorFill] for the color LightCyan.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23LIGHT_CYAN">Online Documentation</a>
 */
 val LIGHT_CYAN: Fill
/**
 * Gets a [SolidColorFill] for the color LightGoldenrodYellow.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23LIGHT_GOLDENROD_YELLOW">Online Documentation</a>
 */
 val LIGHT_GOLDENROD_YELLOW: Fill
/**
 * Gets a [SolidColorFill] for the color LightGray.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23LIGHT_GRAY">Online Documentation</a>
 */
 val LIGHT_GRAY: Fill
/**
 * Gets a [SolidColorFill] for the color LightGreen.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23LIGHT_GREEN">Online Documentation</a>
 */
 val LIGHT_GREEN: Fill
/**
 * Gets a [SolidColorFill] for the color LightPink.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23LIGHT_PINK">Online Documentation</a>
 */
 val LIGHT_PINK: Fill
/**
 * Gets a [SolidColorFill] for the color LightSalmon.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23LIGHT_SALMON">Online Documentation</a>
 */
 val LIGHT_SALMON: Fill
/**
 * Gets a [SolidColorFill] for the color LightSeaGreen.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23LIGHT_SEA_GREEN">Online Documentation</a>
 */
 val LIGHT_SEA_GREEN: Fill
/**
 * Gets a [SolidColorFill] for the color LightSkyBlue.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23LIGHT_SKY_BLUE">Online Documentation</a>
 */
 val LIGHT_SKY_BLUE: Fill
/**
 * Gets a [SolidColorFill] for the color LightSlateGray.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23LIGHT_SLATE_GRAY">Online Documentation</a>
 */
 val LIGHT_SLATE_GRAY: Fill
/**
 * Gets a [SolidColorFill] for the color LightSteelBlue.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23LIGHT_STEEL_BLUE">Online Documentation</a>
 */
 val LIGHT_STEEL_BLUE: Fill
/**
 * Gets a [SolidColorFill] for the color LightYellow.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23LIGHT_YELLOW">Online Documentation</a>
 */
 val LIGHT_YELLOW: Fill
/**
 * Gets a [SolidColorFill] for the color Lime.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23LIME">Online Documentation</a>
 */
 val LIME: Fill
/**
 * Gets a [SolidColorFill] for the color LimeGreen.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23LIME_GREEN">Online Documentation</a>
 */
 val LIME_GREEN: Fill
/**
 * Gets a [SolidColorFill] for the color Linen.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23LINEN">Online Documentation</a>
 */
 val LINEN: Fill
/**
 * Gets a [SolidColorFill] for the color Magenta.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23MAGENTA">Online Documentation</a>
 */
 val MAGENTA: Fill
/**
 * Gets a [SolidColorFill] for the color Maroon.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23MAROON">Online Documentation</a>
 */
 val MAROON: Fill
/**
 * Gets a [SolidColorFill] for the color MediumAquamarine.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23MEDIUM_AQUAMARINE">Online Documentation</a>
 */
 val MEDIUM_AQUAMARINE: Fill
/**
 * Gets a [SolidColorFill] for the color MediumBlue.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23MEDIUM_BLUE">Online Documentation</a>
 */
 val MEDIUM_BLUE: Fill
/**
 * Gets a [SolidColorFill] for the color MediumOrchid.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23MEDIUM_ORCHID">Online Documentation</a>
 */
 val MEDIUM_ORCHID: Fill
/**
 * Gets a [SolidColorFill] for the color MediumPurple.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23MEDIUM_PURPLE">Online Documentation</a>
 */
 val MEDIUM_PURPLE: Fill
/**
 * Gets a [SolidColorFill] for the color MediumSeaGreen.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23MEDIUM_SEA_GREEN">Online Documentation</a>
 */
 val MEDIUM_SEA_GREEN: Fill
/**
 * Gets a [SolidColorFill] for the color MediumSlateBlue.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23MEDIUM_SLATE_BLUE">Online Documentation</a>
 */
 val MEDIUM_SLATE_BLUE: Fill
/**
 * Gets a [SolidColorFill] for the color MediumSpringGreen.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23MEDIUM_SPRING_GREEN">Online Documentation</a>
 */
 val MEDIUM_SPRING_GREEN: Fill
/**
 * Gets a [SolidColorFill] for the color MediumTurquoise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23MEDIUM_TURQUOISE">Online Documentation</a>
 */
 val MEDIUM_TURQUOISE: Fill
/**
 * Gets a [SolidColorFill] for the color MediumVioletRed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23MEDIUM_VIOLET_RED">Online Documentation</a>
 */
 val MEDIUM_VIOLET_RED: Fill
/**
 * Gets a [SolidColorFill] for the color MidnightBlue.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23MIDNIGHT_BLUE">Online Documentation</a>
 */
 val MIDNIGHT_BLUE: Fill
/**
 * Gets a [SolidColorFill] for the color MintCream.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23MINT_CREAM">Online Documentation</a>
 */
 val MINT_CREAM: Fill
/**
 * Gets a [SolidColorFill] for the color MistyRose.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23MISTY_ROSE">Online Documentation</a>
 */
 val MISTY_ROSE: Fill
/**
 * Gets a [SolidColorFill] for the color Moccasin.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23MOCCASIN">Online Documentation</a>
 */
 val MOCCASIN: Fill
/**
 * Gets a [SolidColorFill] for the color NavajoWhite.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23NAVAJO_WHITE">Online Documentation</a>
 */
 val NAVAJO_WHITE: Fill
/**
 * Gets a [SolidColorFill] for the color Navy.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23NAVY">Online Documentation</a>
 */
 val NAVY: Fill
/**
 * Gets a [SolidColorFill] for the color OldLace.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23OLD_LACE">Online Documentation</a>
 */
 val OLD_LACE: Fill
/**
 * Gets a [SolidColorFill] for the color Olive.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23OLIVE">Online Documentation</a>
 */
 val OLIVE: Fill
/**
 * Gets a [SolidColorFill] for the color OliveDrab.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23OLIVE_DRAB">Online Documentation</a>
 */
 val OLIVE_DRAB: Fill
/**
 * Gets a [SolidColorFill] for the color Orange.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23ORANGE">Online Documentation</a>
 */
 val ORANGE: Fill
/**
 * Gets a [SolidColorFill] for the color OrangeRed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23ORANGE_RED">Online Documentation</a>
 */
 val ORANGE_RED: Fill
/**
 * Gets a [SolidColorFill] for the color Orchid.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23ORCHID">Online Documentation</a>
 */
 val ORCHID: Fill
/**
 * Gets a [SolidColorFill] for the color PaleGoldenrod.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23PALE_GOLDENROD">Online Documentation</a>
 */
 val PALE_GOLDENROD: Fill
/**
 * Gets a [SolidColorFill] for the color PaleGreen.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23PALE_GREEN">Online Documentation</a>
 */
 val PALE_GREEN: Fill
/**
 * Gets a [SolidColorFill] for the color PaleTurquoise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23PALE_TURQUOISE">Online Documentation</a>
 */
 val PALE_TURQUOISE: Fill
/**
 * Gets a [SolidColorFill] for the color PaleVioletRed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23PALE_VIOLET_RED">Online Documentation</a>
 */
 val PALE_VIOLET_RED: Fill
/**
 * Gets a [SolidColorFill] for the color PapayaWhip.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23PAPAYA_WHIP">Online Documentation</a>
 */
 val PAPAYA_WHIP: Fill
/**
 * Gets a [SolidColorFill] for the color PeachPuff.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23PEACH_PUFF">Online Documentation</a>
 */
 val PEACH_PUFF: Fill
/**
 * Gets a [SolidColorFill] for the color Peru.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23PERU">Online Documentation</a>
 */
 val PERU: Fill
/**
 * Gets a [SolidColorFill] for the color Pink.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23PINK">Online Documentation</a>
 */
 val PINK: Fill
/**
 * Gets a [SolidColorFill] for the color Plum.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23PLUM">Online Documentation</a>
 */
 val PLUM: Fill
/**
 * Gets a [SolidColorFill] for the color PowderBlue.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23POWDER_BLUE">Online Documentation</a>
 */
 val POWDER_BLUE: Fill
/**
 * Gets a [SolidColorFill] for the color Purple.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23PURPLE">Online Documentation</a>
 */
 val PURPLE: Fill
/**
 * Gets a [SolidColorFill] for the color Red.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23RED">Online Documentation</a>
 */
 val RED: Fill
/**
 * Gets a [SolidColorFill] for the color RosyBrown.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23ROSY_BROWN">Online Documentation</a>
 */
 val ROSY_BROWN: Fill
/**
 * Gets a [SolidColorFill] for the color RoyalBlue.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23ROYAL_BLUE">Online Documentation</a>
 */
 val ROYAL_BLUE: Fill
/**
 * Gets a [SolidColorFill] for the color SaddleBrown.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23SADDLE_BROWN">Online Documentation</a>
 */
 val SADDLE_BROWN: Fill
/**
 * Gets a [SolidColorFill] for the color Salmon.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23SALMON">Online Documentation</a>
 */
 val SALMON: Fill
/**
 * Gets a [SolidColorFill] for the color SandyBrown.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23SANDY_BROWN">Online Documentation</a>
 */
 val SANDY_BROWN: Fill
/**
 * Gets a [SolidColorFill] for the color SeaGreen.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23SEA_GREEN">Online Documentation</a>
 */
 val SEA_GREEN: Fill
/**
 * Gets a [SolidColorFill] for the color SeaShell.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23SEA_SHELL">Online Documentation</a>
 */
 val SEA_SHELL: Fill
/**
 * Gets a [SolidColorFill] for the color Sienna.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23SIENNA">Online Documentation</a>
 */
 val SIENNA: Fill
/**
 * Gets a [SolidColorFill] for the color Silver.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23SILVER">Online Documentation</a>
 */
 val SILVER: Fill
/**
 * Gets a [SolidColorFill] for the color SkyBlue.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23SKY_BLUE">Online Documentation</a>
 */
 val SKY_BLUE: Fill
/**
 * Gets a [SolidColorFill] for the color SlateBlue.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23SLATE_BLUE">Online Documentation</a>
 */
 val SLATE_BLUE: Fill
/**
 * Gets a [SolidColorFill] for the color SlateGray.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23SLATE_GRAY">Online Documentation</a>
 */
 val SLATE_GRAY: Fill
/**
 * Gets a [SolidColorFill] for the color Snow.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23SNOW">Online Documentation</a>
 */
 val SNOW: Fill
/**
 * Gets a [SolidColorFill] for the color SpringGreen.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23SPRING_GREEN">Online Documentation</a>
 */
 val SPRING_GREEN: Fill
/**
 * Gets a [SolidColorFill] for the color SteelBlue.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23STEEL_BLUE">Online Documentation</a>
 */
 val STEEL_BLUE: Fill
/**
 * Gets a [SolidColorFill] for the color Tan.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23TAN">Online Documentation</a>
 */
 val TAN: Fill
/**
 * Gets a [SolidColorFill] for the color Teal.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23TEAL">Online Documentation</a>
 */
 val TEAL: Fill
/**
 * Gets a [SolidColorFill] for the color Thistle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23THISTLE">Online Documentation</a>
 */
 val THISTLE: Fill
/**
 * Gets a [SolidColorFill] for the color Tomato.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23TOMATO">Online Documentation</a>
 */
 val TOMATO: Fill
/**
 * Gets a [SolidColorFill] for the color Transparent.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23TRANSPARENT">Online Documentation</a>
 */
 val TRANSPARENT: Fill
/**
 * Gets a [SolidColorFill] for the color Turquoise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23TURQUOISE">Online Documentation</a>
 */
 val TURQUOISE: Fill
/**
 * Gets a [SolidColorFill] for the color Violet.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23VIOLET">Online Documentation</a>
 */
 val VIOLET: Fill
/**
 * Gets a [SolidColorFill] for the color Wheat.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23WHEAT">Online Documentation</a>
 */
 val WHEAT: Fill
/**
 * Gets a [SolidColorFill] for the color White.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23WHITE">Online Documentation</a>
 */
 val WHITE: Fill
/**
 * Gets a [SolidColorFill] for the color WhiteSmoke.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23WHITE_SMOKE">Online Documentation</a>
 */
 val WHITE_SMOKE: Fill
/**
 * Gets a [SolidColorFill] for the color Yellow.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23YELLOW">Online Documentation</a>
 */
 val YELLOW: Fill
/**
 * Gets a [SolidColorFill] for the color YellowGreen.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23YELLOW_GREEN">Online Documentation</a>
 */
 val YELLOW_GREEN: Fill
/**
 * Creates a [Fill] instance from the given fill-like object by performing automatic type conversion.
 * @param [fillLike] The object to convert to a [Fill].
 * @return The given `fillLike` if it is already a [Fill], or a new instance initialized to the values found in `fillLike`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23Fill-method-from">Online Documentation</a>
 */
@JsName("from")
 final  operator fun invoke( fillLike: String ):Fill
/**
 * Sets the [Fill] on a given SVG element as the fill.
 * @receiver The fill that should be applied. If `null`, the element's fill is set to `none`.
 * @param [element] The SVG element whose fill should be set.
 * @param [context] The context to use for managing possible `defs` entries.
 * @see [applyTo]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23Fill-method-setFill">Online Documentation</a>
 */
@JsName("setFill")
 final   fun Fill?.applyTo( element: SVGElement ,
 context: ICanvasContext )
}
}
