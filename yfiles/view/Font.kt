// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import web.svg.SVGTextElement
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * Describes a font using with size, family, style, weight, and line spacing.
 * 
 * This is a convertible type that can be used with the following notation(s) in parameter lists, parameter objects or setters.
 * CSS font shorthand strings are converted to [Font]s. For example:
 * 
 * ```
 * 'bold 16px sans-serif'
 * 'italic Tahoma'
 * 'normal xx-large Arial'
 * ```
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Font">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [Font] class with size 10, "Arial" family, normal weight and style and line spacing `0.5`, or the given values.
 * @param [fontFamily] A comma separated list of font-family names.
 * @param [fontSize] The font size in px.
 * @param [fontStyle] The font style.
 * @param [fontWeight] The font weight.
 * @param [lineSpacing] The line spacing which is interpreted as additional spacing of the line height.
 * @param [textDecoration] The text decoration.
 * @see [createCopy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Font%23Font-constructor-Font">Online Documentation</a>
 * 
 * @property fontFamily
 * Gets the font family.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Font%23fontFamily">Online Documentation</a>
 * 
 * @property fontSize
 * Gets the size of the font.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Font%23fontSize">Online Documentation</a>
 * 
 * @property fontStyle
 * Gets the font style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Font%23fontStyle">Online Documentation</a>
 * 
 * @property fontWeight
 * Gets the font weight.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Font%23fontWeight">Online Documentation</a>
 * 
 * @property lineSpacing
 * Gets the line spacing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Font%23lineSpacing">Online Documentation</a>
 * 
 * @property textDecoration
 * Gets the text decoration.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Font%23textDecoration">Online Documentation</a>
 */
external  class Font  (
final val fontFamily: String = definedExternally,
final val fontSize: Double = definedExternally,
final val fontStyle: FontStyle = definedExternally,
final val fontWeight: FontWeight = definedExternally,
final val lineSpacing: Double = definedExternally,
final val textDecoration: TextDecoration = definedExternally) : YObject {

/**
 * Assigns the text properties of this instance to the given text element.
 * @param [textElement] The text element to assign set the [Font] on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Font%23Font-method-applyTo">Online Documentation</a>
 */
 final   fun applyTo( textElement: SVGTextElement )
/**
 * Creates a copy with the values of this instance or optionally the explicitly specified values.
 * @param [fontFamily] The font family to use for the copy.
 * @param [fontSize] The font size to use for the copy.
 * @param [fontStyle] The font style to use for the copy.
 * @param [fontWeight] The font weight to use for the copy.
 * @param [lineSpacing] The line spacing to use for the copy.
 * @param [textDecoration] The text decoration to use for the copy.
 * @return A new [Font] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Font%23Font-method-createCopy">Online Documentation</a>
 */
 final   fun createCopy( fontFamily: String  = definedExternally,
 fontSize: Double  = definedExternally,
 fontStyle: FontStyle  = definedExternally,
 fontWeight: FontWeight  = definedExternally,
 lineSpacing: Double  = definedExternally,
 textDecoration: TextDecoration  = definedExternally):Font

companion object : ClassMetadata<Font> {
/**
 * Creates a [Font] instance from the given font-like object by performing automatic type conversion.
 * @param [typefaceLike] The object to convert to a [Font].
 * @return The given `typefaceLike` if it is already a [Font], or a new instance initialized to the values found in `typefaceLike`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Font%23Font-method-from">Online Documentation</a>
 */
@JsName("from")
 final  operator fun invoke( typefaceLike: String ):Font
}
}
