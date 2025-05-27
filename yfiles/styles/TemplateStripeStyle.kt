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
 * An [IStripeStyle] implementation that uses an SVG snippet as a template for the visualization of [IStripe][yfiles.graph.IStripe]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateStripeStyle">Online Documentation</a>
 * 
 * @constructor Creates a new instance using the given resource key and a custom renderer instance.
 * @param [styleResourceKey] The key of the style resource that will be used for the component.
 * @param [renderer] The custom renderer for this style instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateStripeStyle%23TemplateStripeStyle-constructor-TemplateStripeStyle">Online Documentation</a>
 * 
 * @property styleResourceKey
 * Gets or sets the [String] that will be used to look up the template that is applied to the component.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateStripeStyle%23styleResourceKey">Online Documentation</a>
 */
external open class TemplateStripeStyle  (
final var styleResourceKey: String? = definedExternally,
 renderer: TemplateStripeStyleRenderer  = definedExternally) : TemplateStripeStyleBase {

companion object : ClassMetadata<TemplateStripeStyle> {
}
}

inline fun TemplateStripeStyle(
    block: TemplateStripeStyle.() -> Unit
): TemplateStripeStyle {
    return TemplateStripeStyle()
        .apply(block)
}
