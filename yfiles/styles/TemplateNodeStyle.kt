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
 * An [INodeStyle] that uses an SVG snippet as a template for the visualization of [INode][yfiles.graph.INode]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyle">Online Documentation</a>
 * 
 * @constructor Creates a new instance using the given render template id and a custom renderer instance.
 * @param [styleResourceKey] The id of the SVG snippet that will be used for the component.
 * @param [renderer] The custom renderer for this instance. If none is provided, the default implementation is used.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyle%23TemplateNodeStyle-constructor-TemplateNodeStyle">Online Documentation</a>
 * 
 * @property styleResourceKey
 * Gets or sets the [String] that will be used to look up the template that is applied to the component.
 * 
 * The default value is `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyle%23styleResourceKey">Online Documentation</a>
 */
external open class TemplateNodeStyle  (
final var styleResourceKey: String? = definedExternally,
 renderer: TemplateNodeStyleRenderer  = definedExternally) : TemplateNodeStyleBase {

companion object : ClassMetadata<TemplateNodeStyle> {
}
}

inline fun TemplateNodeStyle(
    block: TemplateNodeStyle.() -> Unit
): TemplateNodeStyle {
    return TemplateNodeStyle()
        .apply(block)
}
