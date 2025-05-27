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
 * A class that holds all information related to an edge label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeLabelInfo">Online Documentation</a>
 */
external interface IEdgeLabelInfo : YObject {
/**
 * Gets the unique ID of the associated edge label.
 * @see [MultiPageLayoutResult.getEdgeLabelInfo]
 * @see [IElementInfoManager.getEdgeLabelInfo]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeLabelInfo%23id">Online Documentation</a>
 */
val id: Id?

companion object : InterfaceMetadata<IEdgeLabelInfo> {
}
}
