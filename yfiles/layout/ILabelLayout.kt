// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.YOrientedRectangle
import yfiles.algorithms.YRectangle
import yfiles.graph.ILabelModelParameter
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * [ILabelLayout] defines the properties of a label from the perspective of a labeling algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelLayout">Online Documentation</a>
 */
external interface ILabelLayout : YObject {
/**
 * Gets the bounding box of the label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelLayout%23boundingBox">Online Documentation</a>
 */
val boundingBox: YRectangle
/**
 * Gets or sets the label model parameter that describes the position of this label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelLayout%23modelParameter">Online Documentation</a>
 */
var modelParameter: ILabelModelParameter
/**
 * Gets the box of the label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelLayout%23orientedBox">Online Documentation</a>
 */
val orientedBox: YOrientedRectangle

companion object : InterfaceMetadata<ILabelLayout> {
}
}
