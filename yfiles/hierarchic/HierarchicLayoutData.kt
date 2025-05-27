// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.algorithms.AbortHandler
import yfiles.algorithms.EdgeDirectedness
import yfiles.collections.ICollection
import yfiles.collections.IEnumerable
import yfiles.collections.IMapper
import yfiles.geometry.IPoint
import yfiles.geometry.IRectangle
import yfiles.graph.IEdge
import yfiles.graph.ILabel
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.Func3
import yfiles.lang.Id
import yfiles.layout.HierarchicLayoutSubcomponentDescriptor
import yfiles.layout.INodeType
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
 * Specifies custom data for the [HierarchicLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [HierarchicLayoutData] which helps configuring [HierarchicLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23HierarchicLayoutData-constructor-HierarchicLayoutData">Online Documentation</a>
 */
external open class HierarchicLayoutData  () : LayoutData {

/**
 * Gets or sets the [AbortHandler] used during the layout.
 * @see [LayoutExecutor.abortHandler][yfiles.layout.LayoutExecutor.abortHandler]
 * @see [AbortHandler.ABORT_HANDLER_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23abortHandler">Online Documentation</a>
 */
final var abortHandler: AbortHandler?
/**
 * Gets or sets a mapping from edges to alternative paths for edges connecting to groups, group content or folder nodes.
 * @see [HierarchicLayout.ALTERNATIVE_EDGE_PATH_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23alternativeEdgePaths">Online Documentation</a>
 */
final var alternativeEdgePaths: ItemMapping<IEdge, IEnumerable<IPoint>>
/**
 * Gets or sets a mapping from group/folder nodes to alternative bounds for these nodes.
 * @see [HierarchicLayout.ALTERNATIVE_GROUP_BOUNDS_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23alternativeGroupBounds">Online Documentation</a>
 */
final var alternativeGroupBounds: ItemMapping<INode, IRectangle>
/**
 * Gets or sets the collection of core nodes used by the [BFSLayerer].
 * @see [BFSLayerer.CORE_NODES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23bfsLayererCoreNodes">Online Documentation</a>
 */
final var bfsLayererCoreNodes: ItemCollection<INode>
/**
 * Gets or sets the mapping from nodes to their layer index relative to the root node of the [bus][buses] they belong to.
 * @see [buses]
 * @see [BusDescriptor.ROOT_OFFSET_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23busRootOffsets">Online Documentation</a>
 */
final var busRootOffsets: ItemMapping<INode, Int>
/**
 * Gets or sets the mapping from edges to their [bus descriptor][BusDescriptor] which defines the bus structure they belong to.
 * @see [BusDescriptor]
 * @see [HierarchicLayout.BUS_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23buses">Online Documentation</a>
 */
final var buses: ItemCollectionMapping<IEdge, BusDescriptor>
/**
 * Gets or sets the mapping from edges to an additional weight used by the [ConstraintIncrementalLayerer].
 * @see [ConstraintIncrementalLayerer.ADDITIONAL_EDGE_WEIGHT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23constraintIncrementalLayererAdditionalEdgeWeights">Online Documentation</a>
 */
final var constraintIncrementalLayererAdditionalEdgeWeights: ItemMapping<IEdge, Double>
/**
 * Gets or sets a mapping from edges to their priority to be a 'critical' edge.
 * @see [HierarchicLayout.CRITICAL_EDGE_PRIORITY_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23criticalEdgePriorities">Online Documentation</a>
 */
final var criticalEdgePriorities: ItemMapping<IEdge, Double>
/**
 * Gets or sets the mapping from edges to their crossing cost.
 * @see [HierarchicLayout.EDGE_CROSSING_COST_DP_KEY]
 * @see [reduceCriticalEdgeCrossings]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23edgeCrossingCosts">Online Documentation</a>
 */
final var edgeCrossingCosts: ItemMapping<IEdge, Double>
/**
 * Gets or sets the mapping from edges to their directedness.
 * @see [HierarchicLayout.EDGE_DIRECTEDNESS_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23edgeDirectedness">Online Documentation</a>
 */
final var edgeDirectedness: ItemMapping<IEdge, EdgeDirectedness>
/**
 * Gets or sets the mapping that provides a [PreferredPlacementDescriptor] instance for edge [ILabel]s.
 * @see [PreferredPlacementDescriptor]
 * @see [LayoutGraphAdapter.EDGE_LABEL_LAYOUT_PREFERRED_PLACEMENT_DESCRIPTOR_DP_KEY][yfiles.layout.LayoutGraphAdapter.EDGE_LABEL_LAYOUT_PREFERRED_PLACEMENT_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23edgeLabelPreferredPlacement">Online Documentation</a>
 */
final var edgeLabelPreferredPlacement: ItemMapping<ILabel, PreferredPlacementDescriptor>
/**
 * Gets or sets the mapping of edges to their [EdgeLayoutDescriptor].
 * @see [HierarchicLayout.edgeLayoutDescriptor]
 * @see [HierarchicLayoutCore.EDGE_LAYOUT_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23edgeLayoutDescriptors">Online Documentation</a>
 */
final var edgeLayoutDescriptors: ItemMapping<IEdge, EdgeLayoutDescriptor>
/**
 * Gets or sets the mapping from edges to their thickness.
 * @see [HierarchicLayout.EDGE_THICKNESS_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23edgeThickness">Online Documentation</a>
 */
final var edgeThickness: ItemMapping<IEdge, Double>
/**
 * Gets or sets the collection of folder nodes used for recursive edge styles in incremental mode.
 * @see [HierarchicLayout.FOLDER_NODES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23folderNodes">Online Documentation</a>
 */
final var folderNodes: ItemCollection<INode>
/**
 * Gets or set the mapping from nodes to their layer index when using the [GivenLayersLayerer].
 * @see [GivenLayersLayerer.LAYER_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23givenLayersLayererIds">Online Documentation</a>
 */
final var givenLayersLayererIds: ItemMapping<INode, Int>
/**
 * Gets or sets the mapping from group nodes to the costs for a crossing with the group node border.
 * @see [HierarchicLayout.EDGE_CROSSING_COST_DP_KEY]
 * @see [HierarchicLayout.GROUP_BORDER_CROSSING_COST_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23groupBorderCrossingCosts">Online Documentation</a>
 */
final var groupBorderCrossingCosts: ItemMapping<INode, Double>
/**
 * Gets or sets a mapping from nodes and edges to their incremental hints.
 * @see [HierarchicLayout.INCREMENTAL_HINTS_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23incrementalHints">Online Documentation</a>
 */
final var incrementalHints: IncrementalHintItemMapping
/**
 * Gets or sets the factory to specify layer constraints.
 * @see [HierarchicLayout.createLayerConstraintFactory]
 * @see [ILayerConstraintFactory]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23layerConstraintFactory">Online Documentation</a>
 */
@Deprecated("Read documentation for more information")
final var layerConstraintFactory: ILayerConstraintFactory
/**
 * Gets or sets the layout data to specify layer constraints.
 * @see [HierarchicLayout.createLayerConstraintFactory]
 * @see [ILayerConstraintFactory]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23layerConstraints">Online Documentation</a>
 */
final var layerConstraints: LayerConstraintData
/**
 * Gets or sets a mapper from nodes to the index of their layer.
 * @see [HierarchicLayout.LAYER_INDEX_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23layerIndices">Online Documentation</a>
 */
final var layerIndices: IMapper<INode, Int>?
/**
 * Gets or sets the mapping from nodes to their [NodeHalo].
 * @see [NodeHalo.NODE_HALO_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23nodeHalos">Online Documentation</a>
 */
final var nodeHalos: ItemMapping<INode, NodeHalo>
/**
 * Gets or sets the mapping of nodes to their [NodeLayoutDescriptor]
 * @see [HierarchicLayout.nodeLayoutDescriptor]
 * @see [HierarchicLayoutCore.NODE_LAYOUT_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23nodeLayoutDescriptors">Online Documentation</a>
 */
final var nodeLayoutDescriptors: ItemMapping<INode, NodeLayoutDescriptor>
/**
 * Gets or sets a mapping from nodes to their [PortCandidateSet].
 * @see [PortCandidateSet.NODE_PORT_CANDIDATE_SET_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23nodePortCandidateSets">Online Documentation</a>
 */
final var nodePortCandidateSets: ItemMapping<INode, PortCandidateSet>
/**
 * Gets or sets the mapping from nodes to an object defining the node type, which influences the ordering of nodes during the sequencing such that nodes of same type are preferably placed next to each other.
 * @see [LayoutKeys.NODE_TYPE_DP_KEY][yfiles.layout.LayoutKeys.NODE_TYPE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23nodeTypes">Online Documentation</a>
 */
final var nodeTypes: ItemMapping<INode, INodeType>
/**
 * Gets or sets the collection of [bus][buses] nodes that should be placed before the common bus segment.
 * @see [buses]
 * @see [BusDescriptor.PLACE_BEFORE_BUS_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23nodesBeforeBus">Online Documentation</a>
 */
final var nodesBeforeBus: ItemCollection<INode>
/**
 * Gets or sets the [partition grid][partitionGridData] layout data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23partitionGridData">Online Documentation</a>
 */
final var partitionGridData: PartitionGridData
/**
 * Gets or sets whether or not [critical edges][criticalEdgePriorities] automatically get [crossing costs][edgeCrossingCosts] assigned based on their critical edge priorities.
 * 
 * Default value - `true`. Critical edges automatically get crossing costs based on their priorities
 * @see [edgeCrossingCosts]
 * @see [criticalEdgePriorities]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23reduceCriticalEdgeCrossings">Online Documentation</a>
 */
final var reduceCriticalEdgeCrossings: Boolean
/**
 * Gets or sets the layout data for the [SelfLoopCalculator].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23selfLoopCalculatorData">Online Documentation</a>
 */
final var selfLoopCalculatorData: SelfLoopCalculatorData
/**
 * Gets or sets the factory to specify sequence constraints.
 * @see [HierarchicLayout.createSequenceConstraintFactory]
 * @see [ISequenceConstraintFactory]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23sequenceConstraintFactory">Online Documentation</a>
 */
@Deprecated("Read documentation for more information")
final var sequenceConstraintFactory: ISequenceConstraintFactory
/**
 * Gets or sets the layout data to specify sequence constraints.
 * @see [HierarchicLayout.createSequenceConstraintFactory]
 * @see [ISequenceConstraintFactory]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23sequenceConstraints">Online Documentation</a>
 */
final var sequenceConstraints: SequenceConstraintData
/**
 * Gets or sets a mapper from nodes to the sequence index in their layer.
 * @see [HierarchicLayout.SEQUENCE_INDEX_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23sequenceIndices">Online Documentation</a>
 */
final var sequenceIndices: IMapper<INode, Int>?
/**
 * Gets or sets a mapping from edges to an object representing their source edge group.
 * @see [sourcePortGroupIds]
 * @see [targetGroupIds]
 * @see [PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23sourceGroupIds">Online Documentation</a>
 */
final var sourceGroupIds: ItemMapping<IEdge, Id>
/**
 * Gets or sets a mapping from edges to a collection of their source [port candidates][PortCandidate].
 * @see [sourcePortConstraints]
 * @see [PortCandidate.SOURCE_PORT_CANDIDATE_COLLECTION_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23sourcePortCandidates">Online Documentation</a>
 */
final var sourcePortCandidates: ItemMapping<IEdge, ICollection<out PortCandidate>>
/**
 * Gets or sets a mapping from edges to their source [PortConstraint].
 * @see [sourcePortCandidates]
 * @see [PortConstraintKeys.SOURCE_PORT_CONSTRAINT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23sourcePortConstraints">Online Documentation</a>
 */
final var sourcePortConstraints: ItemMapping<IEdge, PortConstraint>
/**
 * Gets or sets a mapping from edges to an object representing their source port group.
 * @see [targetPortGroupIds]
 * @see [sourceGroupIds]
 * @see [PortConstraintKeys.SOURCE_PORT_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23sourcePortGroupIds">Online Documentation</a>
 */
final var sourcePortGroupIds: ItemMapping<IEdge, Id>
/**
 * Gets or sets the mapping of nodes to a [subcomponent][HierarchicLayoutSubcomponentDescriptor] which is arranged by the layout algorithm defined by property [HierarchicLayoutSubcomponentDescriptor.layoutAlgorithm].
 * @see [HierarchicLayout.SUBCOMPONENT_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23subcomponents">Online Documentation</a>
 */
final var subcomponents: ItemCollectionMapping<INode, HierarchicLayoutSubcomponentDescriptor>
/**
 * Gets or sets the mapping from [tabular group nodes][tabularGroups] to comparison functions used to sort the child nodes of the group.
 * @see [HierarchicLayout.TABULAR_GROUP_CHILD_COMPARER_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23tabularGroupChildComparers">Online Documentation</a>
 */
final var tabularGroupChildComparers: ItemMapping<INode,Func3<INode,INode,Int>>
/**
 * Gets or sets the collection of tabular group nodes whose children are arranged in a tabular fashion.
 * @see [HierarchicLayout.TABULAR_GROUPS_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23tabularGroups">Online Documentation</a>
 */
final var tabularGroups: ItemCollection<INode>
/**
 * Gets or sets a mapping from edges to an object representing their target edge group.
 * @see [sourceGroupIds]
 * @see [targetPortGroupIds]
 * @see [PortConstraintKeys.TARGET_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23targetGroupIds">Online Documentation</a>
 */
final var targetGroupIds: ItemMapping<IEdge, Id>
/**
 * Gets or sets a mapping from edges to a collection of their target port [candidates][PortCandidate].
 * @see [targetPortConstraints]
 * @see [PortCandidate.TARGET_PORT_CANDIDATE_COLLECTION_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23targetPortCandidates">Online Documentation</a>
 */
final var targetPortCandidates: ItemMapping<IEdge, ICollection<out PortCandidate>>
/**
 * Gets or sets a mapping from edges to their target [PortConstraint].
 * @see [targetPortCandidates]
 * @see [PortConstraintKeys.TARGET_PORT_CONSTRAINT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23targetPortConstraints">Online Documentation</a>
 */
final var targetPortConstraints: ItemMapping<IEdge, PortConstraint>
/**
 * Gets or sets a mapping from edges to an object representing their target port group.
 * @see [sourcePortGroupIds]
 * @see [targetGroupIds]
 * @see [PortConstraintKeys.TARGET_PORT_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23targetPortGroupIds">Online Documentation</a>
 */
final var targetPortGroupIds: ItemMapping<IEdge, Id>
/**
 * Gets or sets the collection of group nodes for which the ports of the adjacent edges are uniformly distributed.
 * @see [HierarchicLayout.UNIFORM_PORT_ASSIGNMENT_GROUPS_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutData%23uniformPortAssignmentGroups">Online Documentation</a>
 */
final var uniformPortAssignmentGroups: ItemCollection<INode>

companion object : ClassMetadata<HierarchicLayoutData> {
}
}

inline fun HierarchicLayoutData(
    block: HierarchicLayoutData.() -> Unit
): HierarchicLayoutData {
    return HierarchicLayoutData()
        .apply(block)
}
