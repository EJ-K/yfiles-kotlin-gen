// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.radial

import yfiles.collections.IMapper
import yfiles.collections.ItemCollection
import yfiles.collections.ItemMapping
import yfiles.geometry.Insets
import yfiles.lang.ClassMetadata
import yfiles.layout.BasicPortData
import yfiles.layout.ChildOrderData
import yfiles.layout.EdgeBundleDescriptor
import yfiles.layout.LayoutData

/**
 * Specifies custom data for the [RadialLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayoutData">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayoutData%23RadialLayoutData-constructor-RadialLayoutData">Online Documentation</a>
 */
external class RadialLayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> () : LayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> {
  /**
   * Gets or sets the collection of nodes that should be placed in the center.
   * @see [RadialLayout.CENTER_NODES_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayoutData%23centerNodes">Online Documentation</a>
   */
  final var centerNodes: ItemCollection<TNode>
  
  /**
   * Gets or sets the [ChildOrderData] which specifies how child nodes are to be sorted.
   * @see [RadialLayout.OUT_EDGE_COMPARATOR_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayoutData%23childOrder">Online Documentation</a>
   */
  final var childOrder: ChildOrderData<TNode, TEdge>
  
  /**
   * Gets or sets the mapping of edges to their [EdgeBundleDescriptor].
   * @see [EdgeBundleDescriptor]
   * @see [RadialLayout.edgeBundling]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayoutData%23edgeBundleDescriptors">Online Documentation</a>
   */
  final var edgeBundleDescriptors: ItemMapping<TEdge, EdgeBundleDescriptor>
  
  /**
   * Gets or sets the mapping from nodes to their layer/circle index.
   * @see [RadialLayout.LAYER_ID_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayoutData%23layerIds">Online Documentation</a>
   */
  final var layerIds: ItemMapping<TNode, Int>
  
  /**
   * Gets or sets the mapping from nodes to their margins.
   * @see [LayoutKeys.NODE_MARGIN_DATA_KEY][yfiles.layout.LayoutKeys.NODE_MARGIN_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayoutData%23nodeMargins">Online Documentation</a>
   */
  final var nodeMargins: ItemMapping<TNode, Insets>
  
  /**
   * Gets the mapping from nodes to a [RadialLayoutNodePlacementResult] describing on which circle and in which sector the node is placed.
   * @see [RadialLayout.NODE_PLACEMENT_RESULT_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayoutData%23nodePlacementsResult">Online Documentation</a>
   */
  final val nodePlacementsResult: IMapper<TNode, RadialLayoutNodePlacementResult>
  
  /**
   * Gets or sets the mapping from nodes to an object defining the node type, which influences the ordering of nodes on the same circle such that nodes of the same type are preferably placed next to each other.
   * @see [LayoutKeys.NODE_TYPE_DATA_KEY][yfiles.layout.LayoutKeys.NODE_TYPE_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayoutData%23nodeTypes">Online Documentation</a>
   */
  final var nodeTypes: ItemMapping<TNode, Any>
  
  /**
   * Gets or sets the collection of edges explicitly marked as not belonging to a tree.
   * @see [RadialLayout.treeReductionStage]
   * @see [TreeReductionStage.NON_TREE_EDGES_DATA_KEY][yfiles.tree.TreeReductionStage.NON_TREE_EDGES_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayoutData%23nonTreeEdges">Online Documentation</a>
   */
  final var nonTreeEdges: ItemCollection<TEdge>
  
  /**
   * Gets or sets the sub-data that influences the placement of the ports.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayoutData%23ports">Online Documentation</a>
   */
  final var ports: BasicPortData<TNode, TEdge, TNodeLabel, TEdgeLabel>
  
  companion object : ClassMetadata<RadialLayoutData<*, *, *, *>> {
  }
}
