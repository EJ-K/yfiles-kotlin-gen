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
 * An [INodeStyle] that uses an SVG snippet as template for the visualization of [INode][yfiles.graph.INode]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StringTemplateNodeStyle">Online Documentation</a>
 * 
 * @constructor Creates a new instance using the given SVG template and a custom renderer instance.
 * @param [svgContent] The SVG snippet that will be used as a template for the component.
 * @param [renderer] The custom renderer for this instance. If none is provided, the default implementation is used.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StringTemplateNodeStyle%23StringTemplateNodeStyle-constructor-StringTemplateNodeStyle">Online Documentation</a>
 * 
 * @property svgContent
 * Gets or sets the SVG content that is the template for the node visualization.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StringTemplateNodeStyle%23svgContent">Online Documentation</a>
 */
external open class StringTemplateNodeStyle  (
final var svgContent: String? = definedExternally,
 renderer: TemplateNodeStyleRenderer  = definedExternally) : TemplateNodeStyleBase {

companion object : ClassMetadata<StringTemplateNodeStyle> {
}
}

inline fun StringTemplateNodeStyle(
    block: StringTemplateNodeStyle.() -> Unit
): StringTemplateNodeStyle {
    return StringTemplateNodeStyle()
        .apply(block)
}
