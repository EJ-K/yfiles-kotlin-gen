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
 * An [IPortStyle] that uses an SVG snippet as template for the visualization of [IPort][yfiles.graph.IPort]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StringTemplatePortStyle">Online Documentation</a>
 * 
 * @constructor Creates a new instance using the provided renderer.
 * @param [svgContent] The SVG snippet to use as template.
 * @param [renderer] The custom renderer for this style instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StringTemplatePortStyle%23StringTemplatePortStyle-constructor-StringTemplatePortStyle">Online Documentation</a>
 * 
 * @property svgContent
 * Gets or sets the SVG content that is the template for the port visualization.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StringTemplatePortStyle%23svgContent">Online Documentation</a>
 */
external open class StringTemplatePortStyle  (
final var svgContent: String? = definedExternally,
 renderer: TemplatePortStyleRenderer  = definedExternally) : TemplatePortStyleBase {

companion object : ClassMetadata<StringTemplatePortStyle> {
}
}

inline fun StringTemplatePortStyle(
    block: StringTemplatePortStyle.() -> Unit
): StringTemplatePortStyle {
    return StringTemplatePortStyle()
        .apply(block)
}
