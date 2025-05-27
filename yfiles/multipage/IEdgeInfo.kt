// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.multipage

import yfiles.algorithms.Edge
import yfiles.lang.Id
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * A class that holds all information associated with an edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeInfo">Online Documentation</a>
 */
external interface IEdgeInfo : YObject {
/**
 * Gets the unique ID of the associated edge.
 * @see [MultiPageLayoutResult.getEdgeInfo]
 * @see [IElementInfoManager.getEdgeInfo]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeInfo%23id">Online Documentation</a>
 */
val id: Id?
/**
 * Gets the original edge associated with this [IEdgeInfo].
 * @see [EdgeType.CONNECTOR]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeInfo%23representedEdge">Online Documentation</a>
 */
val representedEdge: Edge?
/**
 * Gets the type of the associated edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeInfo%23type">Online Documentation</a>
 */
val type: EdgeType

companion object : InterfaceMetadata<IEdgeInfo> {
}
}
