// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.multipage

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * @see [INodeInfo.type]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeType">Online Documentation</a>
 */
external sealed class NodeType: YEnum<NodeType> {
   companion object: EnumMetadata<NodeType> {
       /**
 * A node type that specifies a normal node.
 * 
 * Value - `0`
 * @see [INodeInfo.type]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeType%23NORMAL">Online Documentation</a>
 */
val NORMAL: NodeType

/**
 * A node type that specifies a group node.
 * 
 * Value - `1`
 * @see [INodeInfo.type]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeType%23GROUP">Online Documentation</a>
 */
val GROUP: NodeType

/**
 * A node type that specifies a proxy node.
 * 
 * Value - `2`
 * @see [INodeInfo.type]
 * @see [NORMAL]
 * @see [PROXY_REFERENCE]
 * @see [MultiPageLayout.createProxyReferenceNodes]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeType%23PROXY">Online Documentation</a>
 */
val PROXY: NodeType

/**
 * A node type that specifies a proxy reference node.
 * 
 * Value - `3`
 * @see [INodeInfo.type]
 * @see [PROXY]
 * @see [MultiPageLayout.createProxyReferenceNodes]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeType%23PROXY_REFERENCE">Online Documentation</a>
 */
val PROXY_REFERENCE: NodeType

/**
 * A node type that specifies a connector node.
 * 
 * Value - `4`
 * @see [INodeInfo.type]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeType%23CONNECTOR">Online Documentation</a>
 */
val CONNECTOR: NodeType
   }
}
