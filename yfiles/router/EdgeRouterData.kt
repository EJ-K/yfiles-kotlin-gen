// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.algorithms.AbortHandler
import yfiles.collections.ICollection
import yfiles.graph.IEdge
import yfiles.graph.ILabel
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.Id
import yfiles.layout.DpKeyItemCollection
import yfiles.layout.ItemCollection
import yfiles.layout.ItemCollectionMapping
import yfiles.layout.ItemMapping
import yfiles.layout.LayoutData
import yfiles.layout.NodeHalo
import yfiles.layout.PartitionGridData
import yfiles.layout.PortCandidate
import yfiles.layout.PortCandidateSet
import yfiles.layout.PortConstraint
import yfiles.layout.PreferredPlacementDescriptor

/**
 * Specifies custom data for the [EdgeRouter].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [EdgeRouterData] which helps configuring [EdgeRouter].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterData%23EdgeRouterData-constructor-EdgeRouterData">Online Documentation</a>
 */
external open class EdgeRouterData  () : LayoutData {

/**
 * Gets or sets the [AbortHandler] used during the layout.
 * @see [LayoutExecutor.abortHandler][yfiles.layout.LayoutExecutor.abortHandler]
 * @see [AbortHandler.ABORT_HANDLER_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterData%23abortHandler">Online Documentation</a>
 */
final var abortHandler: AbortHandler?
/**
 * Gets or sets the collection of affected edges.
 * @see [EdgeRouter.affectedEdgesDpKey]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterData%23affectedEdges">Online Documentation</a>
 */
final var affectedEdges: DpKeyItemCollection<IEdge>
/**
 * Gets or sets the collection of affected nodes.
 * @see [EdgeRouter.affectedNodesDpKey]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterData%23affectedNodes">Online Documentation</a>
 */
final var affectedNodes: DpKeyItemCollection<INode>
/**
 * Gets or sets the mapping from edges to their [bus descriptor][EdgeRouterBusDescriptor].
 * @see [EdgeRouter.BUS_DESCRIPTOR_DP_KEY]
 * @see [EdgeRouterBusDescriptor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterData%23buses">Online Documentation</a>
 */
final var buses: ItemCollectionMapping<IEdge, EdgeRouterBusDescriptor>
/**
 * Gets or sets the mapping that provides a [PreferredPlacementDescriptor] instance for edge [ILabel]s.
 * @see [PreferredPlacementDescriptor]
 * @see [LayoutGraphAdapter.EDGE_LABEL_LAYOUT_PREFERRED_PLACEMENT_DESCRIPTOR_DP_KEY][yfiles.layout.LayoutGraphAdapter.EDGE_LABEL_LAYOUT_PREFERRED_PLACEMENT_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterData%23edgeLabelPreferredPlacement">Online Documentation</a>
 */
final var edgeLabelPreferredPlacement: ItemMapping<ILabel, PreferredPlacementDescriptor>
/**
 * Gets or sets the mapping of edges to their [EdgeLayoutDescriptor]
 * @see [EdgeRouter.EDGE_LAYOUT_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterData%23edgeLayoutDescriptors">Online Documentation</a>
 */
final var edgeLayoutDescriptors: ItemMapping<IEdge, EdgeLayoutDescriptor>
/**
 * Gets or sets the collection of labels of nodes or fixed edges that are ignored by the router.
 * @see [LabelLayoutKeys.IGNORED_LABELS_DP_KEY][yfiles.layout.LabelLayoutKeys.IGNORED_LABELS_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterData%23ignoredLabels">Online Documentation</a>
 */
final var ignoredLabels: ItemCollection<ILabel>
/**
 * Gets or sets a mapping from labels to a crossing penalty factor.
 * @see [PenaltySettings.edgeLabelCrossingPenalty]
 * @see [PenaltySettings.nodeLabelCrossingPenalty]
 * @see [EdgeRouter.LABEL_CROSSING_PENALTY_FACTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterData%23labelCrossingPenaltyFactors">Online Documentation</a>
 */
final var labelCrossingPenaltyFactors: ItemMapping<ILabel, Double>
/**
 * Gets or sets the mapping from nodes to their [NodeHalo].
 * @see [NodeHalo.NODE_HALO_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterData%23nodeHalos">Online Documentation</a>
 */
final var nodeHalos: ItemMapping<INode, NodeHalo>
/**
 * Gets or sets a mapping from nodes to their [PortCandidateSet].
 * @see [PortCandidateSet.NODE_PORT_CANDIDATE_SET_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterData%23nodePortCandidateSets">Online Documentation</a>
 */
final var nodePortCandidateSets: ItemMapping<INode, PortCandidateSet>
/**
 * Gets or sets the [partition grid][yfiles.layout.PartitionGrid] layout data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterData%23partitionGridData">Online Documentation</a>
 */
final var partitionGridData: PartitionGridData
/**
 * Gets or sets a mapping from edges to an object representing their source edge group.
 * @see [targetGroupIds]
 * @see [PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterData%23sourceGroupIds">Online Documentation</a>
 */
final var sourceGroupIds: ItemMapping<IEdge, Id>
/**
 * Gets or sets a mapping from edges to a collection of their source port [candidates][PortCandidate].
 * @see [sourcePortConstraints]
 * @see [PortCandidate.SOURCE_PORT_CANDIDATE_COLLECTION_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterData%23sourcePortCandidates">Online Documentation</a>
 */
final var sourcePortCandidates: ItemMapping<IEdge, ICollection<out PortCandidate>>
/**
 * Gets or sets a mapping from edges to their source [PortConstraint].
 * @see [sourcePortCandidates]
 * @see [PortConstraintKeys.SOURCE_PORT_CONSTRAINT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterData%23sourcePortConstraints">Online Documentation</a>
 */
final var sourcePortConstraints: ItemMapping<IEdge, PortConstraint>
/**
 * Gets or sets a mapping from edges to an object representing their source port group.
 * @see [targetPortGroupIds]
 * @see [sourceGroupIds]
 * @see [PortConstraintKeys.SOURCE_PORT_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterData%23sourcePortGroupIds">Online Documentation</a>
 */
final var sourcePortGroupIds: ItemMapping<IEdge, Id>
/**
 * Gets or sets a mapping from edges to an object representing their target edge group.
 * @see [sourceGroupIds]
 * @see [PortConstraintKeys.TARGET_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterData%23targetGroupIds">Online Documentation</a>
 */
final var targetGroupIds: ItemMapping<IEdge, Id>
/**
 * Gets or sets a mapping from edges to a collection of their target port [candidates][PortCandidate].
 * @see [targetPortConstraints]
 * @see [PortCandidate.TARGET_PORT_CANDIDATE_COLLECTION_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterData%23targetPortCandidates">Online Documentation</a>
 */
final var targetPortCandidates: ItemMapping<IEdge, ICollection<out PortCandidate>>
/**
 * Gets or sets a mapping from edges to their target [PortConstraint].
 * @see [targetPortCandidates]
 * @see [PortConstraintKeys.TARGET_PORT_CONSTRAINT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterData%23targetPortConstraints">Online Documentation</a>
 */
final var targetPortConstraints: ItemMapping<IEdge, PortConstraint>
/**
 * Gets or sets a mapping from edges to an object representing their target port group.
 * @see [sourcePortGroupIds]
 * @see [targetGroupIds]
 * @see [PortConstraintKeys.TARGET_PORT_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterData%23targetPortGroupIds">Online Documentation</a>
 */
final var targetPortGroupIds: ItemMapping<IEdge, Id>

companion object : ClassMetadata<EdgeRouterData> {
}
}

inline fun EdgeRouterData(
    block: EdgeRouterData.() -> Unit
): EdgeRouterData {
    return EdgeRouterData()
        .apply(block)
}
