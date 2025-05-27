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
 * [IEdgeLabelLayout] defines the properties of one edge label from the perspective of a labeling algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeLabelLayout">Online Documentation</a>
 */
external interface IEdgeLabelLayout : ILabelLayout {
/**
 * Gets the label model that describes the valid locations for this label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeLabelLayout%23labelModel">Online Documentation</a>
 */
val labelModel: IEdgeLabelLayoutModel
/**
 * Gets the preferred placement for this edge label, which can be considered by [layout algorithms][ILayoutAlgorithm].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeLabelLayout%23preferredPlacementDescriptor">Online Documentation</a>
 */
val preferredPlacementDescriptor: PreferredPlacementDescriptor

companion object : InterfaceMetadata<IEdgeLabelLayout> {
}
}
