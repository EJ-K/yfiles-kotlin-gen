// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import web.svg.SVGElement
import yfiles.geometry.GeneralPath
import yfiles.geometry.Size
import yfiles.view.Font
import yfiles.view.TextWrapping

/**
 * A utility class that provides [text size measurement][measureText] and [text placement][addText] functionality, for instance, for [label rendering][DefaultLabelStyleRenderer.addTextElements] and [measurement][DefaultLabelStyleRenderer.measureText].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextRenderSupport">Online Documentation</a>
 */
external object TextRenderSupport {
/**
 * Add the text content to the provided SVG `text` element.
 * @param [targetElement] An SVG element to add the provided text to. When using `rightToLeft`, it is expected as `SVGGElement` otherwise as `SVGTextElement`.
 * @param [text] The text content to add to the provided text element (may contain newline characters).
 * @param [font] The [Font] that defines the font properties to apply to the added text.
 * @param [maximumSize] The bounds that shouldn't be exceeded when placing the text. This only has an effect when a `measurePolicy` other than [TextWrapping.NONE] is provided. Note that if the height is too small for a single line, no text will be drawn at all. When omitted, the default is an unlimited size.
 * @param [wrapping] The [TextWrapping] policy to apply when the text exceeds the provided `maximumSize`. When omitted, the default is [TextWrapping.NONE].
 * @param [measurePolicy] The measure policy to use for measuring the size of the text. When omitted, the default is [TextMeasurePolicy.AUTOMATIC].
 * @param [rightToLeft] Whether to use right-to-left text direction.
 * @param [shape] A convex shape where the text lines shall be placed in. The shape is translated to (0/0) and may be cut if its bounds exceed the `maximumSize`.
 * @return The text that was actually placed in the `targetElement`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextRenderSupport%23TextRenderSupport-method-addText">Online Documentation</a>
 */
 final   fun addText( targetElement: SVGElement /* SVGGElement | SVGTextElement */ ,
 text: String ,
 font: Font ,
 maximumSize: Size?  = definedExternally,
 wrapping: TextWrapping  = definedExternally,
 measurePolicy: TextMeasurePolicy  = definedExternally,
 rightToLeft: Boolean  = definedExternally,
 shape: GeneralPath?  = definedExternally):String
/**
 * Resets the cache that stores for a [Font] which actual [TextMeasurePolicy] is used if [TextMeasurePolicy.AUTOMATIC] is set.
 * @param [specificTypeface] The specific [Font] to invalidate the cache for, or null in case the cache should be invalidated for all [Font]s.
 * @see [measureText]
 * @see [addText]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextRenderSupport%23TextRenderSupport-method-invalidateTextMeasurementCache">Online Documentation</a>
 */
 final   fun invalidateTextMeasurementCache( specificTypeface: Font?  = definedExternally)
/**
 * Calculates the width and height required to render the provided text using the provided [Font], taking text-wrapping into account.
 * @param [text] The text that should be measured.
 * @param [font] The [Font] to apply to the text before measuring.
 * @param [maximumSize] The bounds that shouldn't be exceeded when placing the text. When omitted, the default is an unlimited size.
 * @param [wrapping] The [TextWrapping] policy to apply when the text exceeds the provided `maximumSize`. When omitted, the default is [TextWrapping.NONE].
 * @param [measurePolicy] The measure policy to use for measuring the size of the text; [TextMeasurePolicy.AUTOMATIC] per default.
 * @return The size of the measured text.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextRenderSupport%23TextRenderSupport-method-measureText">Online Documentation</a>
 */
 final   fun measureText( text: String ,
 font: Font ,
 maximumSize: Size?  = definedExternally,
 wrapping: TextWrapping  = definedExternally,
 measurePolicy: TextMeasurePolicy  = definedExternally):Size
}
