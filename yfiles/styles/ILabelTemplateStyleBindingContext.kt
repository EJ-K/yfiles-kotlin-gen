// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.lang.InterfaceMetadata

/**
 * Exposes additional properties of a label to which a `TemplateBinding` in a label template can be bound.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelTemplateStyleBindingContext">Online Documentation</a>
 */
external interface ILabelTemplateStyleBindingContext : ITemplateStyleBindingContext {
/**
 * Gets a value indicating whether this instance has been flipped so that it points upwards.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelTemplateStyleBindingContext%23isFlipped">Online Documentation</a>
 */
val isFlipped: Boolean
/**
 * Gets a value indicating whether this instance is currently rendered upside down.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelTemplateStyleBindingContext%23isUpsideDown">Online Documentation</a>
 */
val isUpsideDown: Boolean
/**
 * Gets or sets the label text property that is populated using the [ILabel][yfiles.graph.ILabel]'s [ILabel.text][yfiles.graph.ILabel.text] property.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelTemplateStyleBindingContext%23labelText">Online Documentation</a>
 */
var labelText: String

companion object : InterfaceMetadata<ILabelTemplateStyleBindingContext> {
}
}
