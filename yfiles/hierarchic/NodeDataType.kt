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
 * @see [IItemFactory.createGroupBorderNode]
 * @see [INodeData.type]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDataType">Online Documentation</a>
 */
external sealed class NodeDataType: YEnum<NodeDataType> {
   companion object: EnumMetadata<NodeDataType> {
       /**
 * A constant describing a normal [Node][yfiles.algorithms.Node].
 * 
 * Value - `0`
 * @see [INodeData.type]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDataType%23NORMAL">Online Documentation</a>
 */
val NORMAL: NodeDataType

/**
 * A constant describing a bend [Node][yfiles.algorithms.Node].
 * 
 * Value - `1`
 * @see [INodeData.type]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDataType%23BEND">Online Documentation</a>
 */
val BEND: NodeDataType

/**
 * A constant describing a side proxy [Node][yfiles.algorithms.Node].
 * 
 * Value - `2`
 * @see [INodeData.type]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDataType%23SIDE_PROXY">Online Documentation</a>
 */
val SIDE_PROXY: NodeDataType

/**
 * A constant describing a side proxy [Node][yfiles.algorithms.Node] for drawing same-layer edges.
 * 
 * Value - `3`
 * @see [INodeData.type]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDataType%23SAME_LAYER_SIDE_PROXY">Online Documentation</a>
 */
val SAME_LAYER_SIDE_PROXY: NodeDataType

/**
 * A constant describing a label [Node][yfiles.algorithms.Node].
 * 
 * Value - `4`
 * @see [INodeData.type]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDataType%23LABEL">Online Documentation</a>
 */
val LABEL: NodeDataType

/**
 * A constant describing a group [Node][yfiles.algorithms.Node] for nested graph layouts.
 * 
 * Value - `5`
 * @see [INodeData.type]
 * @see [INodeData.groupLayers]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDataType%23GROUP">Online Documentation</a>
 */
val GROUP: NodeDataType

/**
 * A constant describing a source group [Node][yfiles.algorithms.Node] for bus edges.
 * 
 * Value - `6`
 * @see [INodeData.type]
 * @see [INodeData.groupId]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDataType%23SOURCE_GROUP_NODE">Online Documentation</a>
 */
val SOURCE_GROUP_NODE: NodeDataType

/**
 * A constant describing a target group [Node][yfiles.algorithms.Node] for bus edges.
 * 
 * Value - `7`
 * @see [INodeData.type]
 * @see [INodeData.groupId]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDataType%23TARGET_GROUP_NODE">Online Documentation</a>
 */
val TARGET_GROUP_NODE: NodeDataType

/**
 * A constant describing a back-loop proxy that belongs to the source of an edge.
 * 
 * Value - `8`
 * @see [INodeData.type]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDataType%23SOURCE_BACK_LOOP_PROXY">Online Documentation</a>
 */
val SOURCE_BACK_LOOP_PROXY: NodeDataType

/**
 * A constant describing a back-loop proxy that belongs to the target of an edge.
 * 
 * Value - `9`
 * @see [INodeData.type]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDataType%23TARGET_BACK_LOOP_PROXY">Online Documentation</a>
 */
val TARGET_BACK_LOOP_PROXY: NodeDataType

/**
 * A constant describing a same-layer edge crossing dummy [Node][yfiles.algorithms.Node].
 * 
 * Value - `10`
 * @see [INodeData.type]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDataType%23SAME_LAYER_CENTER_NODE">Online Documentation</a>
 */
val SAME_LAYER_CENTER_NODE: NodeDataType

/**
 * A constant describing a [Node][yfiles.algorithms.Node] used for the drawing phase to keep the distance between two nodes.
 * 
 * Value - `11`
 * @see [INodeData.type]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDataType%23DISTANCE_NODE">Online Documentation</a>
 */
val DISTANCE_NODE: NodeDataType

/**
 * A constant describing a [Node][yfiles.algorithms.Node] used during the drawing phase for marking the beginning of a node group interval.
 * 
 * Value - `12`
 * @see [INodeData.type]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDataType%23GROUP_BEGIN">Online Documentation</a>
 */
val GROUP_BEGIN: NodeDataType

/**
 * A constant describing a [Node][yfiles.algorithms.Node] used during the drawing phase for marking the ending of a node group interval.
 * 
 * Value - `13`
 * @see [INodeData.type]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDataType%23GROUP_END">Online Documentation</a>
 */
val GROUP_END: NodeDataType

/**
 * A constant describing a [Node][yfiles.algorithms.Node] used during the sequencing and drawing phase for marking a dummy node inserted to guarantee that a group is non-empty on the layer on which it is defined.
 * 
 * Value - `14`
 * @see [INodeData.type]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDataType%23GROUP_LAYER_DUMMY">Online Documentation</a>
 */
val GROUP_LAYER_DUMMY: NodeDataType

/**
 * A constant describing a [Node][yfiles.algorithms.Node] used during the sequencing and drawing phase for marking a dummy node inserted as a legal endpoint of an edge connecting to a group node.
 * 
 * Value - `15`
 * @see [INodeData.type]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDataType%23PROXY_FOR_EDGE_AT_GROUP">Online Documentation</a>
 */
val PROXY_FOR_EDGE_AT_GROUP: NodeDataType

/**
 * A constant describing a [Node][yfiles.algorithms.Node] used during the sequencing and drawing phase for marking a dummy node inserted as a legal endpoint of an edge connecting a descendant node to a group node.
 * 
 * Value - `16`
 * @see [EdgeLayoutDescriptor.directGroupContentEdgeRouting]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDataType%23PROXY_FOR_CONTENT_EDGE_AT_GROUP">Online Documentation</a>
 */
val PROXY_FOR_CONTENT_EDGE_AT_GROUP: NodeDataType

/**
 * A constant describing a [Node][yfiles.algorithms.Node] used during sequencing and drawing phase for routing an [Edge][yfiles.algorithms.Edge] recursively.
 * 
 * Value - `17`
 * @see [INodeData.type]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDataType%23RECURSIVE_EDGE_DUMMY">Online Documentation</a>
 */
val RECURSIVE_EDGE_DUMMY: NodeDataType

/**
 * A constant describing a [Node][yfiles.algorithms.Node] that is used during the sequencing and drawing phase for the bus-style routing of bus edges at a certain root node.
 * 
 * Value - `18`
 * @see [INodeData.type]
 * @see [HierarchicLayout.BUS_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDataType%23BUS_STRUCTURE_DUMMY">Online Documentation</a>
 */
val BUS_STRUCTURE_DUMMY: NodeDataType
   }
}
