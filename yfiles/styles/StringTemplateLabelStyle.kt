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
 * An [ILabelStyle] that uses an SVG snippet as template for the visualization of [ILabel][yfiles.graph.ILabel]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StringTemplateLabelStyle">Online Documentation</a>
 * 
 * @constructor Creates a new instance using the provided renderer.
 * @param [svgContent] The SVG snippet to use as template.
 * @param [renderer] The custom renderer for this style instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StringTemplateLabelStyle%23StringTemplateLabelStyle-constructor-StringTemplateLabelStyle">Online Documentation</a>
 * 
 * @property svgContent
 * Gets or sets the SVG content that is the template for the label visualization.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StringTemplateLabelStyle%23svgContent">Online Documentation</a>
 */
external open class StringTemplateLabelStyle  (
final var svgContent: String? = definedExternally,
 renderer: TemplateLabelStyleRenderer  = definedExternally) : TemplateLabelStyleBase {

companion object : ClassMetadata<StringTemplateLabelStyle> {
}
}

inline fun StringTemplateLabelStyle(
    block: StringTemplateLabelStyle.() -> Unit
): StringTemplateLabelStyle {
    return StringTemplateLabelStyle()
        .apply(block)
}
