// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.organic

import yfiles.algorithms.EdgeDirectedness
import yfiles.collections.IMapper
import yfiles.collections.ItemCollection
import yfiles.collections.ItemMapping
import yfiles.geometry.Insets
import yfiles.lang.ClassMetadata
import yfiles.lang.Id
import yfiles.layout.BasicPortData
import yfiles.layout.EdgeLabelPreferredPlacement
import yfiles.layout.LayoutData
import yfiles.layout.LayoutGridData

/**
 * Specifies custom data for the [OrganicLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23OrganicLayoutData-constructor-OrganicLayoutData">Online Documentation</a>
 */
external class OrganicLayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> () : LayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> {
  /**
   * Gets or sets the mapping from nodes to user-defined cluster IDs, overwriting the predefined [clusteringPolicy][OrganicLayout].
   * @see [OrganicLayout.clusteringPolicy]
   * @see [OrganicLayout.CLUSTER_ID_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23clusterIds">Online Documentation</a>
   */
  final var clusterIds: ItemMapping<TNode, Id>
  
  /**
   * Gets or sets the [OrganicConstraintData] that allows to define additional constraints on the nodes of a graph that will be applied by the [OrganicLayout] during the layout calculation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23constraints">Online Documentation</a>
   */
  final var constraints: OrganicConstraintData<TNode>
  
  /**
   * Gets or sets the mapping from edges to their directedness.
   * @see [LayoutKeys.EDGE_DIRECTEDNESS_DATA_KEY][yfiles.layout.LayoutKeys.EDGE_DIRECTEDNESS_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23edgeDirectedness">Online Documentation</a>
   */
  final var edgeDirectedness: ItemMapping<TEdge, EdgeDirectedness>
  
  /**
   * Gets or sets the mapping that provides an [EdgeLabelPreferredPlacement] instance for edge labels.
   * @see [EdgeLabelPreferredPlacement]
   * @see [EdgeLabelPreferredPlacement.EDGE_LABEL_PREFERRED_PLACEMENT_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23edgeLabelPreferredPlacements">Online Documentation</a>
   */
  final var edgeLabelPreferredPlacements: ItemMapping<TEdgeLabel, EdgeLabelPreferredPlacement>
  
  /**
   * Gets or sets a mapping from edges to their orientation in the layout.
   * @see [OrganicLayout.EDGE_ORIENTATION_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23edgeOrientation">Online Documentation</a>
   */
  final var edgeOrientation: ItemMapping<TEdge, Double>
  
  /**
   * Gets or sets the [layoutGridData][OrganicLayoutData].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23layoutGridData">Online Documentation</a>
   */
  final var layoutGridData: LayoutGridData<TNode, TEdge, TNodeLabel, TEdgeLabel>
  
  /**
   * Gets or sets a mapping from edges to their minimum lengths.
   * @see [OrganicLayout.MINIMUM_EDGE_LENGTH_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23minimumEdgeLengths">Online Documentation</a>
   */
  final var minimumEdgeLengths: ItemMapping<TEdge, Double>
  
  /**
   * Gets or sets a mapping from nodes to their minimum distances to other nodes around them.
   * @see [RemoveOverlapsStage.MINIMUM_DISTANCE_DATA_KEY][yfiles.layout.RemoveOverlapsStage.MINIMUM_DISTANCE_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23minimumNodeDistances">Online Documentation</a>
   */
  final var minimumNodeDistances: ItemMapping<TNode, Double>
  
  /**
   * Gets or sets the mapping from non-group nodes to their inertia.
   * @see [OrganicLayout.NODE_INERTIA_DATA_KEY]
   * @see [nodeStress]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23nodeInertia">Online Documentation</a>
   */
  final var nodeInertia: ItemMapping<TNode, Double>
  
  /**
   * Gets or sets the mapping from nodes to their margins.
   * @see [LayoutKeys.NODE_MARGIN_DATA_KEY][yfiles.layout.LayoutKeys.NODE_MARGIN_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23nodeMargins">Online Documentation</a>
   */
  final var nodeMargins: ItemMapping<TNode, Insets>
  
  /**
   * Gets or sets the mapping from non-group nodes to their stress value.
   * @see [OrganicLayout.NODE_STRESS_DATA_KEY]
   * @see [nodeInertia]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23nodeStress">Online Documentation</a>
   */
  final var nodeStress: ItemMapping<TNode, Double>
  
  /**
   * Gets or sets the mapping from nodes to an object defining the node type, which is considered for the detection of star, parallel, chain, and cycle substructures.
   * @see [LayoutKeys.NODE_TYPE_DATA_KEY][yfiles.layout.LayoutKeys.NODE_TYPE_DATA_KEY]
   * @see [OrganicLayout.parallelSubstructureTypeSeparation]
   * @see [OrganicLayout.starSubstructureTypeSeparation]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23nodeTypes">Online Documentation</a>
   */
  final var nodeTypes: ItemMapping<TNode, Any>
  
  /**
   * Gets or sets the collection of nodes that are allowed to overlap with other nodes.
   * @see [OrganicLayout.allowNodeOverlaps]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23overlappingNodes">Online Documentation</a>
   */
  final var overlappingNodes: ItemCollection<TNode>
  
  /**
   * Gets or sets the sub-data that provides a way of influencing the placement of the ports.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23ports">Online Documentation</a>
   */
  final var ports: BasicPortData<TNode, TEdge, TNodeLabel, TEdgeLabel>
  
  /**
   * Gets or sets a mapping from edges to their preferred lengths.
   * @see [OrganicLayout.PREFERRED_EDGE_LENGTH_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23preferredEdgeLengths">Online Documentation</a>
   */
  final var preferredEdgeLengths: ItemMapping<TEdge, Double>
  
  /**
   * Gets or sets the sub-data that specifies the subset of nodes that is moved by the [OrganicLayout].
   * @see [OrganicLayout.SCOPE_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23scope">Online Documentation</a>
   */
  final val scope: OrganicScopeData<TNode>
  
  /**
   * Gets or sets a mapping from edges to an object representing their source edge group.
   * @see [substructureTargetGroupIds]
   * @see [LayoutKeys.SOURCE_EDGE_GROUP_ID_DATA_KEY][yfiles.layout.LayoutKeys.SOURCE_EDGE_GROUP_ID_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23substructureSourceGroupIds">Online Documentation</a>
   */
  final var substructureSourceGroupIds: ItemMapping<TEdge, Id>
  
  /**
   * Gets or sets a mapping from edges to an object representing their target edge group.
   * @see [substructureSourceGroupIds]
   * @see [LayoutKeys.TARGET_EDGE_GROUP_ID_DATA_KEY][yfiles.layout.LayoutKeys.TARGET_EDGE_GROUP_ID_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23substructureTargetGroupIds">Online Documentation</a>
   */
  final var substructureTargetGroupIds: ItemMapping<TEdge, Id>
  
  /**
   * Gets a mapper from non-group nodes to the computed center z-coordinate in case that a [3D layout][OrganicLayout] was created.
   * @see [OrganicLayout.Z_COORDINATE_RESULT_DATA_KEY]
   * @see [OrganicLayout.create3DLayout]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutData%23zCoordinatesResult">Online Documentation</a>
   */
  final val zCoordinatesResult: IMapper<TNode, Double>
  
  companion object : ClassMetadata<OrganicLayoutData<*, *, *, *>> {
  }
}
