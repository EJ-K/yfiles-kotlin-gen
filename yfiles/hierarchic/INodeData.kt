// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.algorithms.BorderLine
import yfiles.algorithms.Edge
import yfiles.algorithms.ListCell
import yfiles.algorithms.Node
import yfiles.lang.Id
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject
import yfiles.layout.INodeLayout

/**
 * This interface provides layout information about the nodes of the graph during the layout.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeData">Online Documentation</a>
 */
external interface INodeData : YObject {
/**
 * Gets the associated [Edge] of the [Node] of this [INodeData] instance (in case of e.g.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeData%23associatedEdge">Online Documentation</a>
 */
val associatedEdge: Edge
/**
 * Gets the associated [Node] of this [INodeData] instance (in case of e.g.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeData%23associatedNode">Online Documentation</a>
 */
val associatedNode: Node
/**
 * Gets the first same-layer edge [ListCell] of all same-layer edges or `null` if there exists no same-layer edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeData%23firstSameLayerEdgeCell">Online Documentation</a>
 */
val firstSameLayerEdgeCell: ListCell<Edge>?
/**
 * Gets the group ID of the [Node] of this [INodeData] instance if it is a bus-group node.
 * @see [NodeDataType.SOURCE_GROUP_NODE]
 * @see [NodeDataType.TARGET_GROUP_NODE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeData%23groupId">Online Documentation</a>
 */
val groupId: Id
/**
 * Gets the inner layers of the group [Node] of this [INodeData] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeData%23groupLayers">Online Documentation</a>
 */
val groupLayers: ILayers
/**
 * Gets the group node this node belongs to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeData%23groupNode">Online Documentation</a>
 */
val groupNode: Node
/**
 * Gets the hint of the incremental mode of the [Node] of this [INodeData] instance if this node is of type [NodeDataType.NORMAL].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeData%23incrementalHint">Online Documentation</a>
 */
val incrementalHint: IncrementalHint
/**
 * Gets the index of the [ILayer] instance to which the [Node] of this [INodeData] instance belongs.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeData%23layer">Online Documentation</a>
 */
val layer: Int
/**
 * Gets the [NodeLayoutDescriptor] instance initially bound to the [Node] of this [INodeData] instance or `null` if no [NodeLayoutDescriptor] has been registered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeData%23nodeLayoutDescriptor">Online Documentation</a>
 */
val nodeLayoutDescriptor: NodeLayoutDescriptor?
/**
 * Gets the parent group node of the [Node] of this [INodeData] instance (if any).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeData%23parentGroupNode">Online Documentation</a>
 */
val parentGroupNode: Node
/**
 * Gets the current position of the [Node] of this [INodeData] instance within its layer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeData%23position">Online Documentation</a>
 */
val position: Int
/**
 * Gets the [SwimlaneDescriptor] instance initially bound to the [Node] of this [INodeData] instance or `null` if no [SwimlaneDescriptor] has been registered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeData%23swimLaneDescriptor">Online Documentation</a>
 */
val swimLaneDescriptor: SwimlaneDescriptor?
/**
 * Gets the type constant for the [Node] of this [INodeData] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeData%23type">Online Documentation</a>
 */
val type: NodeDataType
/**
 * Creates, stores and returns a [BorderLine] for the given side or returns the current [BorderLine] instance if it already exists.
 * @param [side] an integer value from `[0,3]` interval
 * @param [nodeLayout] the [INodeLayout] of the current node
 * @return a [BorderLine] instance
 * @throws NotSupportedError if this [type] of node does not support node borders
 * @see [getNormalizedBorderLine]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeData%23INodeData-method-createBorderLine">Online Documentation</a>
 */
   fun createBorderLine( side: Int ,
 nodeLayout: INodeLayout ):BorderLine
/**
 * Returns a [BorderLine] for the given side which is treated as if the position of the node is at (0,0).
 * @param [side] an integer value from `[0,3]` interval
 * @return a [BorderLine] instance or `null`
 * @see [createBorderLine]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeData%23INodeData-method-getNormalizedBorderLine">Online Documentation</a>
 */
   fun getNormalizedBorderLine( side: Int ):BorderLine?
/**
 * Returns the number of same-layer edges associated with the [Node] of this [INodeData] instance.
 * @return the number of same-layer edges associated with the node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeData%23INodeData-method-sameLayerEdgeCount">Online Documentation</a>
 */
   fun sameLayerEdgeCount():Int

companion object : InterfaceMetadata<INodeData> {
}
}
