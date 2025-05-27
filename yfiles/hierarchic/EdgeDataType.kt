// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * @see [IEdgeData.type]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDataType">Online Documentation</a>
 */
external sealed class EdgeDataType: YEnum<EdgeDataType> {
   companion object: EnumMetadata<EdgeDataType> {
       /**
 * A constant describing a normal edge.
 * 
 * Value - `0`
 * @see [IEdgeData.type]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDataType%23NORMAL">Online Documentation</a>
 */
val NORMAL: EdgeDataType

/**
 * A constant describing an edge that connects to a source group node.
 * 
 * Value - `1`
 * @see [IEdgeData.type]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDataType%23SOURCE_GROUP_NODE_CONNECTOR">Online Documentation</a>
 */
val SOURCE_GROUP_NODE_CONNECTOR: EdgeDataType

/**
 * A constant describing an edge that connects to a target group node.
 * 
 * Value - `2`
 * @see [IEdgeData.type]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDataType%23TARGET_GROUP_NODE_CONNECTOR">Online Documentation</a>
 */
val TARGET_GROUP_NODE_CONNECTOR: EdgeDataType

/**
 * A constant describing an edge that connects two group nodes.
 * 
 * Value - `3`
 * @see [IEdgeData.type]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDataType%23GROUP_NODE_INTERCONNECTOR">Online Documentation</a>
 */
val GROUP_NODE_INTERCONNECTOR: EdgeDataType

/**
 * A constant describing a same-layer edge that connects directly two neighboring nodes.
 * 
 * Value - `4`
 * @see [IEdgeData.type]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDataType%23DIRECT_SAME_LAYER_EDGE">Online Documentation</a>
 */
val DIRECT_SAME_LAYER_EDGE: EdgeDataType

/**
 * A constant describing a same-layer edge that does not connect directly two neighboring nodes.
 * 
 * Value - `5`
 * @see [IEdgeData.type]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDataType%23NON_DIRECT_SAME_LAYER_EDGE">Online Documentation</a>
 */
val NON_DIRECT_SAME_LAYER_EDGE: EdgeDataType

/**
 * A constant describing an edge that connects group border nodes in adjacent layers.
 * 
 * Value - `6`
 * @see [IEdgeData.type]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDataType%23BORDER_EDGE">Online Documentation</a>
 */
val BORDER_EDGE: EdgeDataType

/**
 * A constant describing an edge that has been added temporarily to replace an edge connected to a group node.
 * 
 * Value - `7`
 * @see [IEdgeData.type]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeDataType%23REDIRECTED_GROUP_EDGE">Online Documentation</a>
 */
val REDIRECTED_GROUP_EDGE: EdgeDataType
   }
}
