// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.orthogonal

import yfiles.algorithms.EdgeDirectedness
import yfiles.collections.ItemMapping
import yfiles.geometry.Insets
import yfiles.lang.ClassMetadata
import yfiles.lang.Id
import yfiles.layout.BasicPortData
import yfiles.layout.EdgeLabelPreferredPlacement
import yfiles.layout.LayoutData

/**
 * Specifies custom data for the [OrthogonalLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayoutData">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayoutData%23OrthogonalLayoutData-constructor-OrthogonalLayoutData">Online Documentation</a>
 */
external class OrthogonalLayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> () : LayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> {
  /**
   * Gets or sets the mapping from edges to their bend cost.
   * @see [OrthogonalLayout.EDGE_BEND_COST_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayoutData%23edgeBendCosts">Online Documentation</a>
   */
  final var edgeBendCosts: ItemMapping<TEdge, Double>
  
  /**
   * Gets or sets the mapping from edges to their crossing cost.
   * @see [OrthogonalLayout.EDGE_CROSSING_COST_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayoutData%23edgeCrossingCosts">Online Documentation</a>
   */
  final var edgeCrossingCosts: ItemMapping<TEdge, Double>
  
  /**
   * Gets or sets the mapping from edges to their [OrthogonalLayoutEdgeDescriptor].
   * @see [OrthogonalLayoutEdgeDescriptor]
   * @see [OrthogonalLayout.EDGE_DESCRIPTOR_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayoutData%23edgeDescriptors">Online Documentation</a>
   */
  final var edgeDescriptors: ItemMapping<TEdge, OrthogonalLayoutEdgeDescriptor>
  
  /**
   * Gets or sets the mapping from edges to their directedness, which is considered for the detection of substructures.
   * @see [LayoutKeys.EDGE_DIRECTEDNESS_DATA_KEY][yfiles.layout.LayoutKeys.EDGE_DIRECTEDNESS_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayoutData%23edgeDirectedness">Online Documentation</a>
   */
  final var edgeDirectedness: ItemMapping<TEdge, EdgeDirectedness>
  
  /**
   * Gets or sets the mapping that provides an [EdgeLabelPreferredPlacement] instance for edge labels.
   * @see [EdgeLabelPreferredPlacement]
   * @see [EdgeLabelPreferredPlacement.EDGE_LABEL_PREFERRED_PLACEMENT_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayoutData%23edgeLabelPreferredPlacements">Online Documentation</a>
   */
  final var edgeLabelPreferredPlacements: ItemMapping<TEdgeLabel, EdgeLabelPreferredPlacement>
  
  /**
   * Gets or sets the mapping from edges to their orientation, specifying how they should be routed with respect to the main layout direction.
   * @see [OrthogonalLayout.EDGE_ORIENTATION_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayoutData%23edgeOrientation">Online Documentation</a>
   */
  final var edgeOrientation: ItemMapping<TEdge, Double>
  
  /**
   * Gets or sets the mapping from nodes to their margins.
   * @see [LayoutKeys.NODE_MARGIN_DATA_KEY][yfiles.layout.LayoutKeys.NODE_MARGIN_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayoutData%23nodeMargins">Online Documentation</a>
   */
  final var nodeMargins: ItemMapping<TNode, Insets>
  
  /**
   * Gets or sets the mapping from nodes to an object defining the node type, which is considered for the detection of tree, chain, and cycle substructures.
   * @see [LayoutKeys.NODE_TYPE_DATA_KEY][yfiles.layout.LayoutKeys.NODE_TYPE_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayoutData%23nodeTypes">Online Documentation</a>
   */
  final var nodeTypes: ItemMapping<TNode, Any>
  
  /**
   * Gets or sets the sub-data that provides a way of influencing the placement of the ports.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayoutData%23ports">Online Documentation</a>
   */
  final var ports: BasicPortData<TNode, TEdge, TNodeLabel, TEdgeLabel>
  
  /**
   * Gets or sets a mapping from edges to an object representing their source edge group.
   * @see [targetGroupIds]
   * @see [LayoutKeys.SOURCE_EDGE_GROUP_ID_DATA_KEY][yfiles.layout.LayoutKeys.SOURCE_EDGE_GROUP_ID_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayoutData%23sourceGroupIds">Online Documentation</a>
   */
  final var sourceGroupIds: ItemMapping<TEdge, Id>
  
  /**
   * Gets or sets a mapping from edges to an object representing their target edge group.
   * @see [sourceGroupIds]
   * @see [LayoutKeys.TARGET_EDGE_GROUP_ID_DATA_KEY][yfiles.layout.LayoutKeys.TARGET_EDGE_GROUP_ID_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayoutData%23targetGroupIds">Online Documentation</a>
   */
  final var targetGroupIds: ItemMapping<TEdge, Id>
  
  companion object : ClassMetadata<OrthogonalLayoutData<*, *, *, *>> {
  }
}
