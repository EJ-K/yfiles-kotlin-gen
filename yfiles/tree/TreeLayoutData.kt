// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.collections.IMapper
import yfiles.collections.ItemCollection
import yfiles.collections.ItemMapping
import yfiles.geometry.Insets
import yfiles.lang.ClassMetadata
import yfiles.layout.BasicPortData
import yfiles.layout.ChildOrderData
import yfiles.layout.EdgeBundleDescriptor
import yfiles.layout.EdgeLabelPreferredPlacement
import yfiles.layout.LayoutData

/**
 * Specifies custom data for the [TreeLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutData">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutData%23TreeLayoutData-constructor-TreeLayoutData">Online Documentation</a>
 */
external class TreeLayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> () : LayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> {
  /**
   * Gets or sets the collection of nodes the [AssistantSubtreePlacer] considers as assistants.
   * @see [AssistantSubtreePlacer.ASSISTANT_NODE_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutData%23assistantNodes">Online Documentation</a>
   */
  final var assistantNodes: ItemCollection<TNode>
  
  /**
   * Gets or sets the [ChildOrderData] which specifies how child nodes are to be sorted.
   * @see [TreeLayout.OUT_EDGE_COMPARATOR_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutData%23childOrder">Online Documentation</a>
   */
  final var childOrder: ChildOrderData<TNode, TEdge>
  
  /**
   * Gets or sets a mapper from nodes to a strategy memento object for the [CompactSubtreePlacer].
   * @see [CompactSubtreePlacer.STRATEGY_MEMENTO_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutData%23compactSubtreePlacerStrategyMementos">Online Documentation</a>
   */
  final var compactSubtreePlacerStrategyMementos: IMapper<TNode, Any>?
  
  /**
   * Gets or sets a mapping from edges to their priority to be a 'critical' edge.
   * @see [TreeLayout.CRITICAL_EDGE_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutData%23criticalEdgePriorities">Online Documentation</a>
   */
  final var criticalEdgePriorities: ItemMapping<TEdge, Double>
  
  /**
   * Gets or sets the mapping of edges to their [EdgeBundleDescriptor].
   * @see [EdgeBundleDescriptor]
   * @see [TreeLayout.treeReductionStage]
   * @see [TreeReductionStage.edgeBundling]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutData%23edgeBundleDescriptors">Online Documentation</a>
   */
  final var edgeBundleDescriptors: ItemMapping<TEdge, EdgeBundleDescriptor>
  
  /**
   * Gets or sets the mapping that provides an [EdgeLabelPreferredPlacement] instance for edge labels.
   * @see [EdgeLabelPreferredPlacement]
   * @see [EdgeLabelPreferredPlacement.EDGE_LABEL_PREFERRED_PLACEMENT_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutData%23edgeLabelPreferredPlacements">Online Documentation</a>
   */
  final var edgeLabelPreferredPlacements: ItemMapping<TEdgeLabel, EdgeLabelPreferredPlacement>
  
  /**
   * Gets or sets the set of nodes that are placed on the left side of the bus.
   * @see [LeftRightSubtreePlacer.LEFT_RIGHT_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutData%23leftRightSubtreePlacerLeftNodes">Online Documentation</a>
   */
  final var leftRightSubtreePlacerLeftNodes: ItemCollection<TNode>
  
  /**
   * Gets or sets the mapping from nodes to the index of the local layer the [MultiLayerSubtreePlacer] shall place the node in.
   * @see [MultiLayerSubtreePlacer.LAYER_INDEX_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutData%23multiLayerSubtreePlacerLayerIndices">Online Documentation</a>
   */
  final var multiLayerSubtreePlacerLayerIndices: ItemMapping<TNode, Int>
  
  /**
   * Gets or sets the mapping of nodes to their [MultiParentDescriptor].
   * @see [TreeLayout.MULTI_PARENT_DESCRIPTOR_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutData%23multiParentDescriptors">Online Documentation</a>
   */
  final var multiParentDescriptors: ItemMapping<TNode, MultiParentDescriptor>
  
  /**
   * Gets or sets the mapping from nodes to their margins.
   * @see [LayoutKeys.NODE_MARGIN_DATA_KEY][yfiles.layout.LayoutKeys.NODE_MARGIN_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutData%23nodeMargins">Online Documentation</a>
   */
  final var nodeMargins: ItemMapping<TNode, Insets>
  
  /**
   * Gets or sets the mapping from nodes to an object defining the node type, which influences the ordering of child nodes such that those with the same type are preferably placed next to each other.
   * @see [LayoutKeys.NODE_TYPE_DATA_KEY][yfiles.layout.LayoutKeys.NODE_TYPE_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutData%23nodeTypes">Online Documentation</a>
   */
  final var nodeTypes: ItemMapping<TNode, Any>
  
  /**
   * Gets or sets the collection of edges explicitly marked as not belonging to a tree.
   * @see [TreeLayout.treeReductionStage]
   * @see [TreeReductionStage.NON_TREE_EDGES_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutData%23nonTreeEdges">Online Documentation</a>
   */
  final var nonTreeEdges: ItemCollection<TEdge>
  
  /**
   * Gets or sets the mapping from nodes to their [ITreeLayoutPortAssigner].
   * @see [TreeLayout.defaultPortAssigner]
   * @see [TreeLayout.PORT_ASSIGNER_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutData%23portAssigners">Online Documentation</a>
   */
  final var portAssigners: ItemMapping<TNode, ITreeLayoutPortAssigner>
  
  /**
   * Gets or sets the sub-data that influences the placement of the ports.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutData%23ports">Online Documentation</a>
   */
  final var ports: BasicPortData<TNode, TEdge, TNodeLabel, TEdgeLabel>
  
  /**
   * Gets or sets the collection of nodes the [SingleSplitSubtreePlacer] places with its [primaryPlacer][SingleSplitSubtreePlacer].
   * @see [SingleSplitSubtreePlacer.PRIMARY_NODES_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutData%23singleSplitSubtreePlacerPrimaryNodes">Online Documentation</a>
   */
  final var singleSplitSubtreePlacerPrimaryNodes: ItemCollection<TNode>
  
  /**
   * Gets or sets the mapping from nodes to their [ISubtreePlacer].
   * @see [TreeLayout.defaultSubtreePlacer]
   * @see [TreeLayout.SUBTREE_PLACER_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutData%23subtreePlacers">Online Documentation</a>
   */
  final var subtreePlacers: ItemMapping<TNode, ISubtreePlacer>
  
  /**
   * Gets or sets the mapping for marking the node that will be used as the root node of the tree.
   * @see [TreeLayout.SELECTED_ROOT_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutData%23treeRoot">Online Documentation</a>
   */
  final var treeRoot: ItemCollection<TNode>
  
  companion object : ClassMetadata<TreeLayoutData<*, *, *, *>> {
  }
}
