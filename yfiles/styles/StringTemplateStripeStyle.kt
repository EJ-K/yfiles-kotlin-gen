// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.lang.ClassMetadata

/**
 * A [IStripeStyle] that uses an SVG snippet as template for the visualization of [IStripe][yfiles.graph.IStripe]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StringTemplateStripeStyle">Online Documentation</a>
 * 
 * @constructor Creates a new instance using the given SVG template and a custom renderer instance.
 * @param [svgContent] The SVG snippet that will be used as a template for the component.
 * @param [renderer] The custom renderer for this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StringTemplateStripeStyle%23StringTemplateStripeStyle-constructor-StringTemplateStripeStyle">Online Documentation</a>
 * 
 * @property svgContent
 * Gets or sets the SVG content that is the template for the stripe visualization.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StringTemplateStripeStyle%23svgContent">Online Documentation</a>
 */
external open class StringTemplateStripeStyle  (
final var svgContent: String? = definedExternally,
 renderer: TemplateStripeStyleRenderer  = definedExternally) : TemplateStripeStyleBase {

companion object : ClassMetadata<StringTemplateStripeStyle> {
}
}

inline fun StringTemplateStripeStyle(
    block: StringTemplateStripeStyle.() -> Unit
): StringTemplateStripeStyle {
    return StringTemplateStripeStyle()
        .apply(block)
}
