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
 * @see [IEdgeInfo.type]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeType">Online Documentation</a>
 */
external sealed class EdgeType: YEnum<EdgeType> {
   companion object: EnumMetadata<EdgeType> {
       /**
 * An edge type that specifies a normal edge.
 * 
 * Value - `0`
 * @see [IEdgeInfo.type]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeType%23NORMAL">Online Documentation</a>
 */
val NORMAL: EdgeType

/**
 * An edge type that specifies a connector edge.
 * 
 * Value - `1`
 * @see [IEdgeInfo.representedEdge]
 * @see [IEdgeInfo.type]
 * @see [NodeType.CONNECTOR]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeType%23CONNECTOR">Online Documentation</a>
 */
val CONNECTOR: EdgeType

/**
 * An edge type that specifies a proxy reference edge.
 * 
 * Value - `2`
 * @see [IEdgeInfo.type]
 * @see [NodeType.PROXY_REFERENCE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeType%23PROXY_REFERENCE">Online Documentation</a>
 */
val PROXY_REFERENCE: EdgeType

/**
 * An edge type that specifies a proxy edge.
 * 
 * Value - `3`
 * @see [IEdgeInfo.type]
 * @see [NodeType.PROXY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeType%23PROXY">Online Documentation</a>
 */
val PROXY: EdgeType
   }
}
