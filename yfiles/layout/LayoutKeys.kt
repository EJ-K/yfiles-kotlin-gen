// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.geometry.Insets
import yfiles.geometry.Size

/**
 * Helper class that provides unique identifiers for some general purpose [DataKey] that are used for looking up data registered for the [LayoutGraph] and its items.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutKeys">Online Documentation</a>
 */

external object LayoutKeys {
  /**
   * A [data key][EdgeDataKey] for specifying the directedness of edges.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutKeys%23EDGE_DIRECTEDNESS_DATA_KEY">Online Documentation</a>
   */
   val EDGE_DIRECTEDNESS_DATA_KEY: EdgeDataKey<Number>
  
  /**
   * Gets a [NodeDataKey] used for specifying the padding around the contents of group nodes.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutKeys%23GROUP_NODE_PADDING_DATA_KEY">Online Documentation</a>
   */
   val GROUP_NODE_PADDING_DATA_KEY: NodeDataKey<Insets>
  
  /**
   * Gets a [NodeDataKey] used for specifying the minimum size of group nodes.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutKeys%23MINIMUM_GROUP_NODE_SIZE_DATA_KEY">Online Documentation</a>
   */
   val MINIMUM_GROUP_NODE_SIZE_DATA_KEY: NodeDataKey<Size>
  
  /**
   * A [data key][NodeDataKey] for assigning margins for the nodes.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutKeys%23NODE_MARGIN_DATA_KEY">Online Documentation</a>
   */
   val NODE_MARGIN_DATA_KEY: NodeDataKey<Insets>
  
  /**
   * A [data key][NodeDataKey] for specifying the type of the nodes in the graph.
   * @see [OrganicLayoutData.nodeTypes][yfiles.organic.OrganicLayoutData.nodeTypes]
   * @see [OrthogonalLayoutData.nodeTypes][yfiles.orthogonal.OrthogonalLayoutData.nodeTypes]
   * @see [CompactDiskLayoutData.nodeTypes][yfiles.circular.CompactDiskLayoutData.nodeTypes]
   * @see [CircularLayoutData.nodeTypes][yfiles.circular.CircularLayoutData.nodeTypes]
   * @see [HierarchicalLayoutData.nodeTypes][yfiles.hierarchic.HierarchicalLayoutData.nodeTypes]
   * @see [RadialLayoutData.nodeTypes][yfiles.radial.RadialLayoutData.nodeTypes]
   * @see [RadialTreeLayoutData.nodeTypes][yfiles.tree.RadialTreeLayoutData.nodeTypes]
   * @see [TreeLayoutData.nodeTypes][yfiles.tree.TreeLayoutData.nodeTypes]
   * @see [ComponentLayoutData.nodeTypes]
   * @see [OrganicLayout.parallelSubstructureStyle][yfiles.organic.OrganicLayout.parallelSubstructureStyle]
   * @see [OrganicLayout.starSubstructureStyle][yfiles.organic.OrganicLayout.starSubstructureStyle]
   * @see [OrganicLayout.cycleSubstructureStyle][yfiles.organic.OrganicLayout.cycleSubstructureStyle]
   * @see [OrganicLayout.chainSubstructureStyle][yfiles.organic.OrganicLayout.chainSubstructureStyle]
   * @see [OrganicLayout.parallelSubstructureTypeSeparation][yfiles.organic.OrganicLayout.parallelSubstructureTypeSeparation]
   * @see [OrganicLayout.starSubstructureTypeSeparation][yfiles.organic.OrganicLayout.starSubstructureTypeSeparation]
   * @see [OrthogonalLayout.treeSubstructureStyle][yfiles.orthogonal.OrthogonalLayout.treeSubstructureStyle]
   * @see [OrthogonalLayout.cycleSubstructureStyle][yfiles.orthogonal.OrthogonalLayout.cycleSubstructureStyle]
   * @see [OrthogonalLayout.chainSubstructureStyle][yfiles.orthogonal.OrthogonalLayout.chainSubstructureStyle]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutKeys%23NODE_TYPE_DATA_KEY">Online Documentation</a>
   */
   val NODE_TYPE_DATA_KEY: NodeDataKey<Any>
  
  /**
   * A [data key][EdgeLabelDataKey] for specifying the edge labels as in- or out-of-scope for labeling algorithms.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutKeys%23PLACE_EDGE_LABELS_DATA_KEY">Online Documentation</a>
   */
   val PLACE_EDGE_LABELS_DATA_KEY: EdgeLabelDataKey<Boolean>
  
  /**
   * A [data key][NodeLabelDataKey] for specifying the node labels as in- or out-of-scope for labeling algorithms.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutKeys%23PLACE_NODE_LABELS_DATA_KEY">Online Documentation</a>
   */
   val PLACE_NODE_LABELS_DATA_KEY: NodeLabelDataKey<Boolean>
  
  /**
   * A [data key][EdgeDataKey] for specifying the graph edges as in- or out-of-scope for edge routing algorithms.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutKeys%23ROUTE_EDGES_DATA_KEY">Online Documentation</a>
   */
   val ROUTE_EDGES_DATA_KEY: EdgeDataKey<Boolean>
  
  /**
   * A [data key][EdgeDataKey] for assigning source edge group information for edges.
   * @see [HierarchicalLayoutData.sourceGroupIds][yfiles.hierarchic.HierarchicalLayoutData.sourceGroupIds]
   * @see [GenericLabelingData.sourceGroupIds][yfiles.labeling.GenericLabelingData.sourceGroupIds]
   * @see [OrthogonalLayoutData.sourceGroupIds][yfiles.orthogonal.OrthogonalLayoutData.sourceGroupIds]
   * @see [ClearAreaLayoutData.sourceGroupIds][yfiles.partial.ClearAreaLayoutData.sourceGroupIds]
   * @see [EdgeRouterData.sourceGroupIds][yfiles.router.EdgeRouterData.sourceGroupIds]
   * @see [CurveRoutingStageData.sourceGroupIds][yfiles.router.CurveRoutingStageData.sourceGroupIds]
   * @see [SeriesParallelLayoutData.sourceGroupIds][yfiles.seriesparallel.SeriesParallelLayoutData.sourceGroupIds]
   * @see [ReverseEdgesStageData.sourceGroupIds]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutKeys%23SOURCE_EDGE_GROUP_ID_DATA_KEY">Online Documentation</a>
   */
   val SOURCE_EDGE_GROUP_ID_DATA_KEY: EdgeDataKey<Any>
  
  /**
   * A [data key][EdgeDataKey] for assigning source alignment information for edges.
   * @see [PortData.sourcePortAlignmentIds]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutKeys%23SOURCE_PORT_ALIGNMENT_ID_DATA_KEY">Online Documentation</a>
   */
   val SOURCE_PORT_ALIGNMENT_ID_DATA_KEY: EdgeDataKey<Any>
  
  /**
   * A [data key][EdgeDataKey] for assigning port group ids to the edges' source.
   * @see [BasicPortData.sourcePortGroupIds]
   * @see [PortData.sourcePortGroupIds]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutKeys%23SOURCE_PORT_GROUP_ID_DATA_KEY">Online Documentation</a>
   */
   val SOURCE_PORT_GROUP_ID_DATA_KEY: EdgeDataKey<Any>
  
  /**
   * A [data key][EdgeDataKey] for assigning target edge group information for edges.
   * @see [HierarchicalLayoutData.targetGroupIds][yfiles.hierarchic.HierarchicalLayoutData.targetGroupIds]
   * @see [GenericLabelingData.targetGroupIds][yfiles.labeling.GenericLabelingData.targetGroupIds]
   * @see [OrthogonalLayoutData.targetGroupIds][yfiles.orthogonal.OrthogonalLayoutData.targetGroupIds]
   * @see [ClearAreaLayoutData.targetGroupIds][yfiles.partial.ClearAreaLayoutData.targetGroupIds]
   * @see [EdgeRouterData.targetGroupIds][yfiles.router.EdgeRouterData.targetGroupIds]
   * @see [CurveRoutingStageData.targetGroupIds][yfiles.router.CurveRoutingStageData.targetGroupIds]
   * @see [SeriesParallelLayoutData.targetGroupIds][yfiles.seriesparallel.SeriesParallelLayoutData.targetGroupIds]
   * @see [ReverseEdgesStageData.targetGroupIds]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutKeys%23TARGET_EDGE_GROUP_ID_DATA_KEY">Online Documentation</a>
   */
   val TARGET_EDGE_GROUP_ID_DATA_KEY: EdgeDataKey<Any>
  
  /**
   * A [data key][EdgeDataKey] for assigning target alignment information for edges.
   * @see [PortData.targetPortAlignmentIds]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutKeys%23TARGET_PORT_ALIGNMENT_ID_DATA_KEY">Online Documentation</a>
   */
   val TARGET_PORT_ALIGNMENT_ID_DATA_KEY: EdgeDataKey<Any>
  
  /**
   * A [data key][EdgeDataKey] for assigning port group ids to the edges' target.
   * @see [BasicPortData.targetPortGroupIds]
   * @see [PortData.targetPortGroupIds]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutKeys%23TARGET_PORT_GROUP_ID_DATA_KEY">Online Documentation</a>
   */
   val TARGET_PORT_GROUP_ID_DATA_KEY: EdgeDataKey<Any>
}
