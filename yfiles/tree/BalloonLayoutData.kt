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
import yfiles.graph.IEdge
import yfiles.graph.ILabel
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.layout.INodeType
import yfiles.layout.ItemCollection
import yfiles.layout.ItemMapping
import yfiles.layout.LayoutData
import yfiles.layout.NodeHalo
import yfiles.layout.PreferredPlacementDescriptor
import yfiles.layout.SingleItem

/**
 * Specifies custom data for the [BalloonLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayoutData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [BalloonLayoutData] which helps configuring [BalloonLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayoutData%23BalloonLayoutData-constructor-BalloonLayoutData">Online Documentation</a>
 */
external open class BalloonLayoutData  () : LayoutData {

/**
 * Gets or sets the [AbortHandler] used during the layout.
 * @see [LayoutExecutor.abortHandler][yfiles.layout.LayoutExecutor.abortHandler]
 * @see [AbortHandler.ABORT_HANDLER_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayoutData%23abortHandler">Online Documentation</a>
 */
final var abortHandler: AbortHandler?
/**
 * Gets or sets the mapping that provides a [PreferredPlacementDescriptor] instance for edge [ILabel]s.
 * @see [PreferredPlacementDescriptor]
 * @see [LayoutGraphAdapter.EDGE_LABEL_LAYOUT_PREFERRED_PLACEMENT_DESCRIPTOR_DP_KEY][yfiles.layout.LayoutGraphAdapter.EDGE_LABEL_LAYOUT_PREFERRED_PLACEMENT_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayoutData%23edgeLabelPreferredPlacement">Online Documentation</a>
 */
final var edgeLabelPreferredPlacement: ItemMapping<ILabel, PreferredPlacementDescriptor>
/**
 * Gets or sets the collection of nodes whose children should be arranged in an interleaved fashion.
 * @see [BalloonLayout.INTERLEAVED_NODES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayoutData%23interleavedNodes">Online Documentation</a>
 */
final var interleavedNodes: ItemCollection<INode>
/**
 * Gets or sets the mapping from nodes to their [NodeHalo].
 * @see [NodeHalo.NODE_HALO_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayoutData%23nodeHalos">Online Documentation</a>
 */
final var nodeHalos: ItemMapping<INode, NodeHalo>
/**
 * Gets or sets the mapping from nodes to an object defining the node type, which influences the ordering of child nodes such that those with same type are preferably placed next to each other.
 * @see [LayoutKeys.NODE_TYPE_DP_KEY][yfiles.layout.LayoutKeys.NODE_TYPE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayoutData%23nodeTypes">Online Documentation</a>
 */
final var nodeTypes: ItemMapping<INode, INodeType>
/**
 * Gets or sets the comparison function used to sort the nodes' outgoing edges.
 * @see [BalloonLayout.childOrderingPolicy]
 * @see [BalloonLayout.fromSketchMode]
 * @see [BalloonLayout.comparer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayoutData%23outEdgeComparer">Online Documentation</a>
 */
final var outEdgeComparer: IComparer<IEdge>?
/**
 * Gets or sets the mapping for marking the node that will be used as root node of the tree.
 * @see [BalloonLayout.SELECTED_ROOT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BalloonLayoutData%23treeRoot">Online Documentation</a>
 */
final var treeRoot: SingleItem<INode>

companion object : ClassMetadata<BalloonLayoutData> {
}
}

inline fun BalloonLayoutData(
    block: BalloonLayoutData.() -> Unit
): BalloonLayoutData {
    return BalloonLayoutData()
        .apply(block)
}
