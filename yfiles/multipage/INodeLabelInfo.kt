// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.multipage

import yfiles.lang.Id
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * A class that holds all information related to a node label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeLabelInfo">Online Documentation</a>
 */
external interface INodeLabelInfo : YObject {
/**
 * Gets the unique ID of the associated node label.
 * @see [MultiPageLayoutResult.getNodeLabelInfo]
 * @see [IElementInfoManager.getNodeLabelInfo]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeLabelInfo%23id">Online Documentation</a>
 */
val id: Id?

companion object : InterfaceMetadata<INodeLabelInfo> {
}
}
