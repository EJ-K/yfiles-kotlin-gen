// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.circular

import yfiles.algorithms.AbortHandler
import yfiles.algorithms.EdgeDirectedness
import yfiles.collections.IMapper
import yfiles.graph.IEdge
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.Id
import yfiles.layout.EdgeBundleDescriptor
import yfiles.layout.INodeType
import yfiles.layout.ItemCollection
import yfiles.layout.ItemMapping
import yfiles.layout.LayoutData
import yfiles.layout.NodeHalo

/**
 * Specifies custom data for the [CircularLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [CircularLayoutData] which helps configuring [CircularLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutData%23CircularLayoutData-constructor-CircularLayoutData">Online Documentation</a>
 */
external open class CircularLayoutData  () : LayoutData {

/**
 * Gets or sets the [AbortHandler] used during the layout.
 * @see [LayoutExecutor.abortHandler][yfiles.layout.LayoutExecutor.abortHandler]
 * @see [AbortHandler.ABORT_HANDLER_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutData%23abortHandler">Online Documentation</a>
 */
final var abortHandler: AbortHandler?
/**
 * Gets or sets the mapper from nodes to their circle id.
 * @see [CircularLayout.CIRCLE_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutData%23circleIds">Online Documentation</a>
 */
final var circleIds: IMapper<INode, Int>
/**
 * Gets or sets the mapping from nodes to their custom group object.
 * @see [CircularLayout.CUSTOM_GROUPS_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutData%23customGroups">Online Documentation</a>
 */
final var customGroups: ItemMapping<INode, Id>
/**
 * Gets or sets the mapping of edges to their [EdgeBundleDescriptor].
 * @see [EdgeBundleDescriptor]
 * @see [EdgeBundling.EDGE_BUNDLE_DESCRIPTOR_DP_KEY][yfiles.layout.EdgeBundling.EDGE_BUNDLE_DESCRIPTOR_DP_KEY]
 * @see [CircularLayout.edgeBundling]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutData%23edgeBundleDescriptors">Online Documentation</a>
 */
final var edgeBundleDescriptors: ItemMapping<IEdge, EdgeBundleDescriptor>
/**
 * Gets or sets the mapping from edges to their directedness.
 * @see [CircularLayout.starSubstructureStyle]
 * @see [CircularLayout.EDGE_DIRECTEDNESS_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutData%23edgeDirectedness">Online Documentation</a>
 */
final var edgeDirectedness: ItemMapping<IEdge, EdgeDirectedness>
/**
 * Gets or sets the collection of edges that are routed around the exterior of circle formed by each partition.
 * @see [CircularLayoutEdgeRoutingPolicy.MARKED_EXTERIOR]
 * @see [CircularLayout.EXTERIOR_EDGES_DP_KEY]
 * @see [CircularLayout.exteriorEdgeLayoutDescriptor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutData%23exteriorEdges">Online Documentation</a>
 */
final var exteriorEdges: ItemCollection<IEdge>
/**
 * Gets or sets the mapping from nodes to their [NodeHalo].
 * @see [NodeHalo.NODE_HALO_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutData%23nodeHalos">Online Documentation</a>
 */
final var nodeHalos: ItemMapping<INode, NodeHalo>
/**
 * Gets or sets the mapping from nodes to an object defining the node type which is considered during the layout.
 * @see [LayoutKeys.NODE_TYPE_DP_KEY][yfiles.layout.LayoutKeys.NODE_TYPE_DP_KEY]
 * @see [NodeTypeAwareSequencer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutData%23nodeTypes">Online Documentation</a>
 */
final var nodeTypes: ItemMapping<INode, INodeType>

companion object : ClassMetadata<CircularLayoutData> {
}
}

inline fun CircularLayoutData(
    block: CircularLayoutData.() -> Unit
): CircularLayoutData {
    return CircularLayoutData()
        .apply(block)
}
