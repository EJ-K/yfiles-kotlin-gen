// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.algorithms.AbortHandler
import yfiles.collections.IComparer
import yfiles.collections.IMapper
import yfiles.graph.IEdge
import yfiles.graph.ILabel
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.layout.INodeType
import yfiles.layout.ItemCollection
import yfiles.layout.ItemMapping
import yfiles.layout.LayoutData
import yfiles.layout.NodeHalo
import yfiles.layout.PortConstraint
import yfiles.layout.PreferredPlacementDescriptor
import yfiles.layout.SingleItem

/**
 * Specifies custom data for the [TreeLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [TreeLayoutData] which helps configuring [TreeLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutData%23TreeLayoutData-constructor-TreeLayoutData">Online Documentation</a>
 */
external open class TreeLayoutData  () : LayoutData {

/**
 * Gets or sets the [AbortHandler] used during the layout.
 * @see [LayoutExecutor.abortHandler][yfiles.layout.LayoutExecutor.abortHandler]
 * @see [AbortHandler.ABORT_HANDLER_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutData%23abortHandler">Online Documentation</a>
 */
final var abortHandler: AbortHandler?
/**
 * Gets or sets the collection of nodes the [AssistantNodePlacer] considers as assistants.
 * @see [AssistantNodePlacer.ASSISTANT_NODE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutData%23assistantNodes">Online Documentation</a>
 */
final var assistantNodes: ItemCollection<INode>
/**
 * Gets or sets a mapper from nodes to a strategy memento object for the [CompactNodePlacer].
 * @see [CompactNodePlacer.STRATEGY_MEMENTO_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutData%23compactNodePlacerStrategyMementos">Online Documentation</a>
 */
final var compactNodePlacerStrategyMementos: IMapper<INode, CompactStrategyMemento>?
/**
 * Gets or sets a mapping from edges to their priority to be a 'critical' edge.
 * @see [TreeLayout.CRITICAL_EDGE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutData%23criticalEdgePriorities">Online Documentation</a>
 */
final var criticalEdgePriorities: ItemMapping<IEdge, Double>
/**
 * Gets or sets the collection of nodes the [DelegatingNodePlacer] places with its [DelegatingNodePlacer.primaryPlacer].
 * @see [DelegatingNodePlacer.PRIMARY_NODES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutData%23delegatingNodePlacerPrimaryNodes">Online Documentation</a>
 */
final var delegatingNodePlacerPrimaryNodes: ItemCollection<INode>
/**
 * Gets or sets the mapping that provides a [PreferredPlacementDescriptor] instance for edge [ILabel]s.
 * @see [PreferredPlacementDescriptor]
 * @see [LayoutGraphAdapter.EDGE_LABEL_LAYOUT_PREFERRED_PLACEMENT_DESCRIPTOR_DP_KEY][yfiles.layout.LayoutGraphAdapter.EDGE_LABEL_LAYOUT_PREFERRED_PLACEMENT_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutData%23edgeLabelPreferredPlacement">Online Documentation</a>
 */
final var edgeLabelPreferredPlacement: ItemMapping<ILabel, PreferredPlacementDescriptor>
/**
 * Gets or sets the mapping from nodes to the index of the row the [GridNodePlacer] shall place the node in.
 * @see [GridNodePlacer.ROW_INDEX_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutData%23gridNodePlacerRowIndices">Online Documentation</a>
 */
final var gridNodePlacerRowIndices: ItemMapping<INode, Int>
/**
 * Gets or sets the set of nodes that are placed on the left side of the bus.
 * @see [LeftRightNodePlacer.LEFT_RIGHT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutData%23leftRightNodePlacerLeftNodes">Online Documentation</a>
 */
final var leftRightNodePlacerLeftNodes: ItemCollection<INode>
/**
 * Gets or sets the mapping from nodes to their [NodeHalo].
 * @see [NodeHalo.NODE_HALO_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutData%23nodeHalos">Online Documentation</a>
 */
final var nodeHalos: ItemMapping<INode, NodeHalo>
/**
 * Gets or sets the mapping from nodes to their [INodePlacer].
 * @see [TreeLayout.defaultNodePlacer]
 * @see [TreeLayout.NODE_PLACER_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutData%23nodePlacers">Online Documentation</a>
 */
final var nodePlacers: ItemMapping<INode, INodePlacer>
/**
 * Gets or sets the mapping from nodes to an object defining the node type, which influences the ordering of child nodes such that those with same type are preferably placed next to each other.
 * @see [LayoutKeys.NODE_TYPE_DP_KEY][yfiles.layout.LayoutKeys.NODE_TYPE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutData%23nodeTypes">Online Documentation</a>
 */
final var nodeTypes: ItemMapping<INode, INodeType>
/**
 * Gets or sets the mapping from nodes to comparison functions used to sort the nodes' outgoing edges.
 * @see [TreeLayout.OUT_EDGE_COMPARER_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutData%23outEdgeComparers">Online Documentation</a>
 */
final var outEdgeComparers: ItemMapping<INode, IComparer<IEdge>>
/**
 * Gets or sets the mapping from nodes to their [IPortAssignment].
 * @see [TreeLayout.defaultPortAssignment]
 * @see [TreeLayout.PORT_ASSIGNMENT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutData%23portAssignments">Online Documentation</a>
 */
final var portAssignments: ItemMapping<INode, IPortAssignment>
/**
 * Gets or sets a mapping from edges to their source [PortConstraint].
 * @see [PortConstraintKeys.SOURCE_PORT_CONSTRAINT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutData%23sourcePortConstraints">Online Documentation</a>
 */
final var sourcePortConstraints: ItemMapping<IEdge, PortConstraint>
/**
 * Gets or sets a mapping from edges to their target [PortConstraint].
 * @see [PortConstraintKeys.TARGET_PORT_CONSTRAINT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutData%23targetPortConstraints">Online Documentation</a>
 */
final var targetPortConstraints: ItemMapping<IEdge, PortConstraint>
/**
 * Gets or sets the mapping for marking the node that will be used as root node of the tree.
 * @see [TreeLayout.SELECTED_ROOT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutData%23treeRoot">Online Documentation</a>
 */
final var treeRoot: SingleItem<INode>

companion object : ClassMetadata<TreeLayoutData> {
}
}

inline fun TreeLayoutData(
    block: TreeLayoutData.() -> Unit
): TreeLayoutData {
    return TreeLayoutData()
        .apply(block)
}
