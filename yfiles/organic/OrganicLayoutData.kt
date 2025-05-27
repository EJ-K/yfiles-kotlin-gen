// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.organic

import yfiles.algorithms.AbortHandler
import yfiles.algorithms.EdgeDirectedness
import yfiles.collections.IMapper
import yfiles.graph.IEdge
import yfiles.graph.ILabel
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.Id
import yfiles.layout.INodeType
import yfiles.layout.ItemCollection
import yfiles.layout.ItemMapping
import yfiles.layout.LayoutData
import yfiles.layout.NodeHalo
import yfiles.layout.PartitionGridData
import yfiles.layout.PreferredPlacementDescriptor

/**
 * Specifies custom data for the [OrganicLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [OrganicLayoutData] which helps configuring [OrganicLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23OrganicLayoutData-constructor-OrganicLayoutData">Online Documentation</a>
 */
external open class OrganicLayoutData  () : LayoutData {

/**
 * Gets or sets the [AbortHandler] used during the layout.
 * @see [LayoutExecutor.abortHandler][yfiles.layout.LayoutExecutor.abortHandler]
 * @see [AbortHandler.ABORT_HANDLER_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23abortHandler">Online Documentation</a>
 */
final var abortHandler: AbortHandler?
/**
 * Gets or sets the subset of nodes that is moved by the layout algorithm.
 * @see [OrganicLayout.AFFECTED_NODES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23affectedNodes">Online Documentation</a>
 */
final var affectedNodes: ItemCollection<INode>
/**
 * Gets or sets the mapping from nodes to [user-defined][OrganicLayoutClusteringPolicy.USER_DEFINED] cluster IDs.
 * @see [OrganicLayout.clusteringPolicy]
 * @see [OrganicLayoutClusteringPolicy.USER_DEFINED]
 * @see [OrganicLayout.CLUSTER_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23clusterIds">Online Documentation</a>
 */
final var clusterIds: ItemMapping<INode, Id>
/**
 * Gets or sets the [OrganicConstraintData] that allows to define additional constraints on the nodes of a graph that will be applied by the [OrganicLayout] during the layout calculation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23constraints">Online Documentation</a>
 */
final var constraints: OrganicConstraintData
/**
 * Gets or sets the mapping from edges to their directedness.
 * @see [OrganicLayout.EDGE_DIRECTEDNESS_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23edgeDirectedness">Online Documentation</a>
 */
final var edgeDirectedness: ItemMapping<IEdge, EdgeDirectedness>
/**
 * Gets or sets the mapping that provides a [PreferredPlacementDescriptor] instance for edge [ILabel]s.
 * @see [PreferredPlacementDescriptor]
 * @see [LayoutGraphAdapter.EDGE_LABEL_LAYOUT_PREFERRED_PLACEMENT_DESCRIPTOR_DP_KEY][yfiles.layout.LayoutGraphAdapter.EDGE_LABEL_LAYOUT_PREFERRED_PLACEMENT_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23edgeLabelPreferredPlacement">Online Documentation</a>
 */
final var edgeLabelPreferredPlacement: ItemMapping<ILabel, PreferredPlacementDescriptor>
/**
 * Gets or sets a mapping from edges to their orientation in the layout.
 * @see [OrganicLayout.EDGE_ORIENTATION_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23edgeOrientations">Online Documentation</a>
 */
final var edgeOrientations: ItemMapping<IEdge, Double>
/**
 * Gets or sets the mapping from group nodes to a mode constant describing how to handle the group node.
 * @see [OrganicLayout.GROUP_NODE_MODE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23groupNodeModes">Online Documentation</a>
 */
final var groupNodeModes: ItemMapping<INode, GroupNodeMode>
/**
 * Gets or sets a mapping from edges to their minimum lengths.
 * @see [OrganicLayout.MINIMUM_EDGE_LENGTH_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23minimumEdgeLengths">Online Documentation</a>
 */
final var minimumEdgeLengths: ItemMapping<IEdge, Double>
/**
 * Gets or sets a mapping from nodes to their minimum distances to other nodes around them.
 * @see [ShuffleLayout.MINIMUM_DISTANCE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23minimumNodeDistances">Online Documentation</a>
 */
final var minimumNodeDistances: ItemMapping<INode, Double>
/**
 * Gets or sets the mapping from nodes to their [NodeHalo].
 * @see [NodeHalo.NODE_HALO_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23nodeHalos">Online Documentation</a>
 */
final var nodeHalos: ItemMapping<INode, NodeHalo>
/**
 * Gets or sets the mapping from non-group nodes to their inertia.
 * @see [OrganicLayout.NODE_INERTIA_DP_KEY]
 * @see [nodeStress]
 * @see [OrganicLayout.scope]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23nodeInertia">Online Documentation</a>
 */
final var nodeInertia: ItemMapping<INode, Double>
/**
 * Gets or sets the mapping from non-group nodes to their stress value.
 * @see [OrganicLayout.NODE_STRESS_DP_KEY]
 * @see [nodeInertia]
 * @see [OrganicLayout.scope]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23nodeStress">Online Documentation</a>
 */
final var nodeStress: ItemMapping<INode, Double>
/**
 * Gets or sets the mapping from nodes to an object defining the node type, which is considered for the detection of star, parallel, chain and cycle substructures.
 * @see [LayoutKeys.NODE_TYPE_DP_KEY][yfiles.layout.LayoutKeys.NODE_TYPE_DP_KEY]
 * @see [OrganicLayout.parallelSubstructureTypeSeparation]
 * @see [OrganicLayout.starSubstructureTypeSeparation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23nodeTypes">Online Documentation</a>
 */
final var nodeTypes: ItemMapping<INode, INodeType>
/**
 * Gets or sets the collection of nodes that are allowed to overlap with other nodes.
 * @see [OrganicLayout.nodeOverlapsAllowed]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23overlappingNodes">Online Documentation</a>
 */
final var overlappingNodes: ItemCollection<INode>
/**
 * Gets or sets the [partition grid][partitionGridData] layout data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23partitionGridData">Online Documentation</a>
 */
final var partitionGridData: PartitionGridData
/**
 * Gets or sets a mapping from edges to their preferred lengths.
 * @see [OrganicLayout.PREFERRED_EDGE_LENGTH_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23preferredEdgeLengths">Online Documentation</a>
 */
final var preferredEdgeLengths: ItemMapping<IEdge, Double>
/**
 * Gets or sets a mapping from edges to an object representing their source edge group.
 * @see [targetGroupIds]
 * @see [PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY][yfiles.layout.PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23sourceGroupIds">Online Documentation</a>
 */
final var sourceGroupIds: ItemMapping<IEdge, Id>
/**
 * Gets or sets a mapping from edges to an object representing their target edge group.
 * @see [sourceGroupIds]
 * @see [PortConstraintKeys.TARGET_GROUP_ID_DP_KEY][yfiles.layout.PortConstraintKeys.TARGET_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23targetGroupIds">Online Documentation</a>
 */
final var targetGroupIds: ItemMapping<IEdge, Id>
/**
 * Gets or sets a mapper from non-group nodes to the computed center z-coordinate in case that a [3D layout][OrganicLayout.create3DLayout] was created.
 * @see [OrganicLayout.Z_COORDINATE_DP_KEY]
 * @see [OrganicLayout.create3DLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23zCoordinates">Online Documentation</a>
 */
final var zCoordinates: IMapper<INode, Double>?

companion object : ClassMetadata<OrganicLayoutData> {
}
}

inline fun OrganicLayoutData(
    block: OrganicLayoutData.() -> Unit
): OrganicLayoutData {
    return OrganicLayoutData()
        .apply(block)
}
