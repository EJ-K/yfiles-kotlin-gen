// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.multipage

import yfiles.algorithms.Node
import yfiles.lang.Id
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * This interface offers access to information associated with a node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeInfo">Online Documentation</a>
 */
external interface INodeInfo : YObject {
/**
 * Gets the unique ID of the node associated with this [info object][INodeInfo].
 * @see [MultiPageLayout.NODE_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeInfo%23id">Online Documentation</a>
 */
val id: Id?
/**
 * Gets the page number of the [page graph][MultiPageLayoutResult.getPage] that contains the node associated with this [info object][INodeInfo].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeInfo%23pageNo">Online Documentation</a>
 */
val pageNo: Int
/**
 * Gets the node that refers to the one associated with this [info object][INodeInfo].
 * @see [NodeType.CONNECTOR]
 * @see [NodeType.PROXY]
 * @see [NodeType.PROXY_REFERENCE]
 * @see [MultiPageLayout.createProxyReferenceNodes]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeInfo%23referencingNode">Online Documentation</a>
 */
val referencingNode: Node?
/**
 * Gets the node of the input graph that is represented by the node associated with this [info object][INodeInfo].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeInfo%23representedNode">Online Documentation</a>
 */
val representedNode: Node?
/**
 * Gets the type of the node associated with this [info object][INodeInfo].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeInfo%23type">Online Documentation</a>
 */
val type: NodeType

companion object : InterfaceMetadata<INodeInfo> {
}
}
