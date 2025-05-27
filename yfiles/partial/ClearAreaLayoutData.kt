// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.partial

import yfiles.algorithms.AbortHandler
import yfiles.collections.ICollection
import yfiles.collections.IEnumerable
import yfiles.geometry.IPoint
import yfiles.geometry.IRectangle
import yfiles.graph.IEdge
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.Id
import yfiles.layout.ItemCollection
import yfiles.layout.ItemMapping
import yfiles.layout.LayoutData
import yfiles.layout.NodeHalo
import yfiles.layout.PartitionGridData
import yfiles.layout.PortCandidate
import yfiles.layout.PortConstraint
import yfiles.layout.SingleItem

/**
 * Specifies custom data for the [ClearAreaLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayoutData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [ClearAreaLayoutData].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayoutData%23ClearAreaLayoutData-constructor-ClearAreaLayoutData">Online Documentation</a>
 */
external open class ClearAreaLayoutData  () : LayoutData {

/**
 * Gets or sets the [AbortHandler] used during the layout.
 * @see [LayoutExecutor.abortHandler][yfiles.layout.LayoutExecutor.abortHandler]
 * @see [AbortHandler.ABORT_HANDLER_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayoutData%23abortHandler">Online Documentation</a>
 */
final var abortHandler: AbortHandler?
/**
 * Gets or sets the group node inside which the cleared area should be located.
 * @see [ClearAreaLayout.AREA_GROUP_NODE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayoutData%23areaGroupNode">Online Documentation</a>
 */
final var areaGroupNode: SingleItem<INode>
/**
 * Gets or sets the collection of nodes that define the area which must be cleared.
 * @see [ClearAreaLayout.AREA_NODES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayoutData%23areaNodes">Online Documentation</a>
 */
final var areaNodes: ItemCollection<INode>
/**
 * Gets or sets the mapping from nodes to an object defining their component id.
 * @see [ClearAreaLayout.COMPONENT_ID_DP_KEY]
 * @see [ComponentAssignmentStrategy.CUSTOMIZED]
 * @see [ClearAreaLayout.componentAssignmentStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayoutData%23componentIds">Online Documentation</a>
 */
final var componentIds: ItemMapping<INode, Id>
/**
 * Gets or sets the node that was expanded and, thus, defines the area that must be cleared.
 * @see [expandedNodeOriginalBounds]
 * @see [expandedNodeOriginalEdgePaths]
 * @see [ClearAreaLayout.EXPANDED_NODE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayoutData%23expandedNode">Online Documentation</a>
 */
final var expandedNode: SingleItem<INode>
/**
 * Gets or sets the original, non-expanded bounds of the [expandedNode].
 * @see [expandedNode]
 * @see [expandedNodeOriginalEdgePaths]
 * @see [ClearAreaLayout.EXPANDED_NODE_ORIGINAL_BOUNDS_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayoutData%23expandedNodeOriginalBounds">Online Documentation</a>
 */
final var expandedNodeOriginalBounds: IRectangle?
/**
 * Gets or sets the mapping from edges adjacent to the [expandedNode] to their original edges paths, that is, their paths before the node was expanded.
 * @see [expandedNode]
 * @see [expandedNodeOriginalBounds]
 * @see [ClearAreaLayout.EXPANDED_NODE_ORIGINAL_EDGE_PATH_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayoutData%23expandedNodeOriginalEdgePaths">Online Documentation</a>
 */
final var expandedNodeOriginalEdgePaths: ItemMapping<IEdge, IEnumerable<IPoint>>
/**
 * Gets or sets the mapping from nodes to their [NodeHalo].
 * @see [NodeHalo.NODE_HALO_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayoutData%23nodeHalos">Online Documentation</a>
 */
final var nodeHalos: ItemMapping<INode, NodeHalo>
/**
 * Gets or sets the [partition grid][yfiles.layout.PartitionGrid] layout data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayoutData%23partitionGridData">Online Documentation</a>
 */
final var partitionGridData: PartitionGridData
/**
 * Gets or sets a mapping from edges to an object representing their source edge group.
 * @see [PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayoutData%23sourceGroupIds">Online Documentation</a>
 */
final var sourceGroupIds: ItemMapping<IEdge, Id>
/**
 * Gets or sets a mapping from edges to a collection of their source [port candidates][PortCandidate].
 * @see [sourcePortConstraints]
 * @see [PortCandidate.SOURCE_PORT_CANDIDATE_COLLECTION_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayoutData%23sourcePortCandidates">Online Documentation</a>
 */
final var sourcePortCandidates: ItemMapping<IEdge, ICollection<out PortCandidate>>
/**
 * Gets or sets a mapping from edges to their source [PortConstraint].
 * @see [sourcePortCandidates]
 * @see [PortConstraintKeys.SOURCE_PORT_CONSTRAINT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayoutData%23sourcePortConstraints">Online Documentation</a>
 */
final var sourcePortConstraints: ItemMapping<IEdge, PortConstraint>
/**
 * Gets or sets a mapping from edges to an object representing their source port group.
 * @see [sourceGroupIds]
 * @see [PortConstraintKeys.SOURCE_PORT_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayoutData%23sourcePortGroupIds">Online Documentation</a>
 */
final var sourcePortGroupIds: ItemMapping<IEdge, Id>
/**
 * Gets or sets a mapping from edges to an object representing their target edge group.
 * @see [PortConstraintKeys.TARGET_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayoutData%23targetGroupIds">Online Documentation</a>
 */
final var targetGroupIds: ItemMapping<IEdge, Id>
/**
 * Gets or sets a mapping from edges to a collection of their target port [candidates][PortCandidate].
 * @see [targetPortConstraints]
 * @see [PortCandidate.TARGET_PORT_CANDIDATE_COLLECTION_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayoutData%23targetPortCandidates">Online Documentation</a>
 */
final var targetPortCandidates: ItemMapping<IEdge, ICollection<out PortCandidate>>
/**
 * Gets or sets a mapping from edges to their target [PortConstraint].
 * @see [targetPortCandidates]
 * @see [PortConstraintKeys.TARGET_PORT_CONSTRAINT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayoutData%23targetPortConstraints">Online Documentation</a>
 */
final var targetPortConstraints: ItemMapping<IEdge, PortConstraint>
/**
 * Gets or sets a mapping from edges to an object representing their target port group.
 * @see [targetGroupIds]
 * @see [PortConstraintKeys.TARGET_PORT_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClearAreaLayoutData%23targetPortGroupIds">Online Documentation</a>
 */
final var targetPortGroupIds: ItemMapping<IEdge, Id>

companion object : ClassMetadata<ClearAreaLayoutData> {
}
}

inline fun ClearAreaLayoutData(
    block: ClearAreaLayoutData.() -> Unit
): ClearAreaLayoutData {
    return ClearAreaLayoutData()
        .apply(block)
}
