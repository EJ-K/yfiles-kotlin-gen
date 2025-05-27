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
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyle">Online Documentation</a>
 * 
 * @constructor Creates a new instance using the given render template id and a custom renderer instance.
 * @param [styleResourceKey] The id of the SVG snippet that will be used for the component.
 * @param [renderer] The custom renderer for this style instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyle%23TemplateLabelStyle-constructor-TemplateLabelStyle">Online Documentation</a>
 * 
 * @property styleResourceKey
 * Gets or sets the [String] that will be used to look up the template that is applied to the component.
 * 
 * The default value is `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyle%23styleResourceKey">Online Documentation</a>
 */
external open class TemplateLabelStyle  (
final var styleResourceKey: String? = definedExternally,
 renderer: TemplateLabelStyleRenderer  = definedExternally) : TemplateLabelStyleBase {

companion object : ClassMetadata<TemplateLabelStyle> {
}
}

inline fun TemplateLabelStyle(
    block: TemplateLabelStyle.() -> Unit
): TemplateLabelStyle {
    return TemplateLabelStyle()
        .apply(block)
}
