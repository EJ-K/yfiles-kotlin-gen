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
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyle">Online Documentation</a>
 * 
 * @constructor Creates a new instance using the given render template id and a custom renderer instance.
 * @param [styleResourceKey] The id of the SVG snippet that will be used for the component.
 * @param [renderer] The custom renderer for this style instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyle%23TemplatePortStyle-constructor-TemplatePortStyle">Online Documentation</a>
 * 
 * @property styleResourceKey
 * Gets or sets the [String] that will be used to look up the template that is applied to the component.
 * 
 * The default value is `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyle%23styleResourceKey">Online Documentation</a>
 */
external open class TemplatePortStyle  (
final var styleResourceKey: String? = definedExternally,
 renderer: TemplatePortStyleRenderer  = definedExternally) : TemplatePortStyleBase {

companion object : ClassMetadata<TemplatePortStyle> {
}
}

inline fun TemplatePortStyle(
    block: TemplatePortStyle.() -> Unit
): TemplatePortStyle {
    return TemplatePortStyle()
        .apply(block)
}
