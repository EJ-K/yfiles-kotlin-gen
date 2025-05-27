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
 * A label style that interprets the label's [ILabel.text][yfiles.graph.ILabel.text] as markup and renders the label using rich text features.
 * @see [MarkupLabelStyleRenderer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarkupLabelStyle">Online Documentation</a>
 * 
 * @constructor Creates a new instance using the provided renderer.
 * @param [renderer] The custom renderer for this style instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarkupLabelStyle%23MarkupLabelStyle-constructor-MarkupLabelStyle(ILabelStyleRenderer)">Online Documentation</a>
 */
external open class MarkupLabelStyle  ( renderer: ILabelStyleRenderer  = definedExternally) : DefaultLabelStyle {

companion object : ClassMetadata<MarkupLabelStyle> {
}
}

inline fun MarkupLabelStyle(
    block: MarkupLabelStyle.() -> Unit
): MarkupLabelStyle {
    return MarkupLabelStyle()
        .apply(block)
}
