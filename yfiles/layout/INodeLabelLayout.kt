// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.InterfaceMetadata

/**
 * [INodeLabelLayout] defines the properties of one node label from the perspective of a labeling algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeLabelLayout">Online Documentation</a>
 */
external interface INodeLabelLayout : ILabelLayout {
/**
 * Gets the label model that describes the valid locations for this label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeLabelLayout%23labelModel">Online Documentation</a>
 */
val labelModel: INodeLabelLayoutModel

companion object : InterfaceMetadata<INodeLabelLayout> {
}
}
