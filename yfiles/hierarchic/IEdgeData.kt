// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.algorithms.Edge
import yfiles.algorithms.Node
import yfiles.collections.ICollection
import yfiles.lang.Id
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject
import yfiles.layout.PortCandidate
import yfiles.layout.PortConstraint

/**
 * This interface provides layout information about the edges of the graph during the layout.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeData">Online Documentation</a>
 */
external interface IEdgeData : YObject {
/**
 * Gets the [Edge] associated with this [IEdgeData] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeData%23associatedEdge">Online Documentation</a>
 */
val associatedEdge: Edge
/**
 * Gets the [Node] associated with this [IEdgeData] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeData%23associatedNode">Online Documentation</a>
 */
val associatedNode: Node
/**
 * Gets the critical edge priority of the [Edge] associated with this [IEdgeData] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeData%23criticalEdgePriority">Online Documentation</a>
 */
val criticalEdgePriority: Double
/**
 * Gets the crossing cost of the [Edge] associated with this [IEdgeData] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeData%23crossingCost">Online Documentation</a>
 */
val crossingCost: Double
/**
 * Gets the [EdgeLayoutDescriptor] instance bound to the [Edge] associated with this [IEdgeData] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeData%23edgeLayoutDescriptor">Online Documentation</a>
 */
val edgeLayoutDescriptor: EdgeLayoutDescriptor
/**
 * Gets or sets whether or not the [Edge] associated with this [IEdgeData] instance should be an upper same-layer edge (if it is a same-layer edge).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeData%23fallbackUpperSameLayerEdge">Online Documentation</a>
 */
var fallbackUpperSameLayerEdge: Boolean
/**
 * Gets the group that is represented by the [Edge] associated with this [IEdgeData] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeData%23group">Online Documentation</a>
 */
val group: Id
/**
 * Gets whether or not the [Edge] associated with this [IEdgeData] instance has been reversed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeData%23reversed">Online Documentation</a>
 */
val reversed: Boolean
/**
 * Gets the ID of the edge group at the source node to which the [Edge] associated with this [IEdgeData] instance belongs (if any).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeData%23sourceGroup">Online Documentation</a>
 */
val sourceGroup: Id
/**
 * Gets the [collection][ICollection] of [PortCandidate]s for the source port of the [Edge] associated with this [IEdgeData] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeData%23sourcePortCandidates">Online Documentation</a>
 */
val sourcePortCandidates: ICollection<out PortCandidate>
/**
 * Gets the [port constraints][PortConstraint] for the source port of the [Edge] associated with this [IEdgeData] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeData%23sourcePortConstraint">Online Documentation</a>
 */
val sourcePortConstraint: PortConstraint
/**
 * Gets the ID of the edge port group at the source node to which the [Edge] associated with this [IEdgeData] instance belongs (if any).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeData%23sourcePortGroup">Online Documentation</a>
 */
val sourcePortGroup: Id
/**
 * Gets the ID of the edge group at the target node to which the [Edge] associated with this [IEdgeData] instance belongs (if any).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeData%23targetGroup">Online Documentation</a>
 */
val targetGroup: Id
/**
 * Gets the [collection][ICollection] of [PortCandidate]s for the target port of the [Edge] associated with this [IEdgeData] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeData%23targetPortCandidates">Online Documentation</a>
 */
val targetPortCandidates: ICollection<out PortCandidate>
/**
 * Gets the [port constraints][PortConstraint] for the target port of the [Edge] associated with this [IEdgeData] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeData%23targetPortConstraint">Online Documentation</a>
 */
val targetPortConstraint: PortConstraint
/**
 * Gets the ID of the edge port group at the target node to which the [Edge] associated with this [IEdgeData] instance belongs (if any).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeData%23targetPortGroup">Online Documentation</a>
 */
val targetPortGroup: Id
/**
 * Gets the thickness of the [Edge] associated with this [IEdgeData] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeData%23thickness">Online Documentation</a>
 */
val thickness: Double
/**
 * Gets the type of the [Edge] associated with this [IEdgeData] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeData%23type">Online Documentation</a>
 */
val type: EdgeDataType
/**
 * Gets whether or not the [Edge] associated with this [IEdgeData] instance is an upper same-layer edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeData%23upperSameLayerEdge">Online Documentation</a>
 */
val upperSameLayerEdge: Boolean

companion object : InterfaceMetadata<IEdgeData> {
}
}
