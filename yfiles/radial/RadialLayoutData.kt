// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.radial

import yfiles.algorithms.AbortHandler
import yfiles.collections.IComparer
import yfiles.collections.IMapper
import yfiles.graph.IEdge
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.IComparable
import yfiles.layout.DpKeyItemCollection
import yfiles.layout.EdgeBundleDescriptor
import yfiles.layout.INodeType
import yfiles.layout.ItemMapping
import yfiles.layout.LayoutData
import yfiles.layout.NodeHalo

/**
 * Specifies custom data for the [RadialLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayoutData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [RadialLayoutData] which helps configuring [RadialLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayoutData%23RadialLayoutData-constructor-RadialLayoutData">Online Documentation</a>
 */
external open class RadialLayoutData  () : LayoutData {

/**
 * Gets or sets the [AbortHandler] used during the layout.
 * @see [LayoutExecutor.abortHandler][yfiles.layout.LayoutExecutor.abortHandler]
 * @see [AbortHandler.ABORT_HANDLER_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayoutData%23abortHandler">Online Documentation</a>
 */
final var abortHandler: AbortHandler?
/**
 * Gets or sets the collection of nodes that shall be placed in the center.
 * @see [RadialLayout.centerNodesDpKey]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayoutData%23centerNodes">Online Documentation</a>
 */
final var centerNodes: DpKeyItemCollection<INode>
/**
 * Gets or sets the mapping of edges to their [EdgeBundleDescriptor].
 * @see [EdgeBundleDescriptor]
 * @see [RadialLayout.edgeBundling]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayoutData%23edgeBundleDescriptors">Online Documentation</a>
 */
final var edgeBundleDescriptors: ItemMapping<IEdge, EdgeBundleDescriptor>
/**
 * Gets or sets the mapping from nodes to their layer/circle index when using the layering strategy [LayeringStrategy.USER_DEFINED].
 * @see [LayeringStrategy.USER_DEFINED]
 * @see [RadialLayout.LAYER_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayoutData%23layerIds">Online Documentation</a>
 */
final var layerIds: ItemMapping<INode, Int>
/**
 * Gets or set the mapping from nodes to an [IComparable] (for example number or string) defining their sequence sort order.
 * @see [outEdgeComparers]
 * @see [RadialLayout.OUT_EDGE_COMPARER_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayoutData%23nodeComparables">Online Documentation</a>
 */
final var nodeComparables: ItemMapping<INode, IComparable<*>>
/**
 * Gets or sets the mapping from nodes to their [NodeHalo].
 * @see [NodeHalo.NODE_HALO_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayoutData%23nodeHalos">Online Documentation</a>
 */
final var nodeHalos: ItemMapping<INode, NodeHalo>
/**
 * Gets or sets the mapping from nodes to a [RadialLayoutNodeInfo] describing on which circle and in which sector the node is placed.
 * @see [RadialLayout.NODE_INFO_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayoutData%23nodeInfos">Online Documentation</a>
 */
final var nodeInfos: IMapper<INode, RadialLayoutNodeInfo>?
/**
 * Gets or sets the mapping from nodes to an object defining the node type, which influences the ordering of nodes on the same circle such that nodes of the same type are preferably placed next to each other.
 * @see [LayoutKeys.NODE_TYPE_DP_KEY][yfiles.layout.LayoutKeys.NODE_TYPE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayoutData%23nodeTypes">Online Documentation</a>
 */
final var nodeTypes: ItemMapping<INode, INodeType>
/**
 * Gets or sets the mapping from nodes to comparison functions used to sort the nodes' outgoing edges, which ultimately orders the successor nodes of a node.
 * @see [nodeComparables]
 * @see [RadialLayout.OUT_EDGE_COMPARER_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayoutData%23outEdgeComparers">Online Documentation</a>
 */
final var outEdgeComparers: ItemMapping<INode, IComparer<IEdge>>

companion object : ClassMetadata<RadialLayoutData> {
}
}

inline fun RadialLayoutData(
    block: RadialLayoutData.() -> Unit
): RadialLayoutData {
    return RadialLayoutData()
        .apply(block)
}
