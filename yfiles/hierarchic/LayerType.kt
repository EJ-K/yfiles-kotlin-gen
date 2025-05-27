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
 * @see [ILayer.type]
 * @see [ILayers.insert]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayerType">Online Documentation</a>
 */
external sealed class LayerType: YEnum<LayerType> {
   companion object: EnumMetadata<LayerType> {
       /**
 * A constant describing a normal layer consisting mainly of normal nodes.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayerType%23NORMAL">Online Documentation</a>
 */
val NORMAL: LayerType

/**
 * A constant describing a layer consisting mainly of label nodes or dummy nodes.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayerType%23LABEL">Online Documentation</a>
 */
val LABEL: LayerType

/**
 * A constant describing a layer consisting of source group nodes and dummy nodes.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayerType%23SOURCE_GROUP_NODES">Online Documentation</a>
 */
val SOURCE_GROUP_NODES: LayerType

/**
 * A constant describing a layer consisting of target group nodes and dummy nodes.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayerType%23TARGET_GROUP_NODES">Online Documentation</a>
 */
val TARGET_GROUP_NODES: LayerType

/**
 * Describes a layer above a group to store the connector proxies where edges connect to groups.
 * 
 * Value - `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayerType%23UPPER_GROUP_CONNECTOR_NODES">Online Documentation</a>
 */
val UPPER_GROUP_CONNECTOR_NODES: LayerType

/**
 * Describes a layer below a group to store the connector proxies where edges connect to groups.
 * 
 * Value - `5`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayerType%23LOWER_GROUP_CONNECTOR_NODES">Online Documentation</a>
 */
val LOWER_GROUP_CONNECTOR_NODES: LayerType
   }
}
