// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.orthogonal

import yfiles.algorithms.AbortHandler
import yfiles.algorithms.EdgeDirectedness
import yfiles.graph.IEdge
import yfiles.graph.ILabel
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.Id
import yfiles.layout.INodeType
import yfiles.layout.ItemCollection
import yfiles.layout.ItemMapping
import yfiles.layout.LayoutData
import yfiles.layout.NodeHalo
import yfiles.layout.PreferredPlacementDescriptor

/**
 * Specifies custom data for the [OrthogonalLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayoutData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [OrthogonalLayoutData] which helps configuring [OrthogonalLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayoutData%23OrthogonalLayoutData-constructor-OrthogonalLayoutData">Online Documentation</a>
 */
external open class OrthogonalLayoutData  () : LayoutData {

/**
 * Gets or sets the [AbortHandler] used during the layout.
 * @see [LayoutExecutor.abortHandler][yfiles.layout.LayoutExecutor.abortHandler]
 * @see [AbortHandler.ABORT_HANDLER_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayoutData%23abortHandler">Online Documentation</a>
 */
final var abortHandler: AbortHandler?
/**
 * Gets or sets the collection of edges that should be routed in a way that point in the main layout direction.
 * @see [OrthogonalLayout.DIRECTED_EDGE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayoutData%23directedEdges">Online Documentation</a>
 */
final var directedEdges: ItemCollection<IEdge>
/**
 * Gets or sets the mapping from edges to their bend cost.
 * @see [OrthogonalLayout.EDGE_BEND_COST_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayoutData%23edgeBendCosts">Online Documentation</a>
 */
final var edgeBendCosts: ItemMapping<IEdge, Double>
/**
 * Gets or sets the mapping from edges to their crossing cost.
 * @see [OrthogonalLayout.EDGE_CROSSING_COST_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayoutData%23edgeCrossingCosts">Online Documentation</a>
 */
final var edgeCrossingCosts: ItemMapping<IEdge, Double>
/**
 * Gets or sets the mapping from edges to their directedness, which is considered for the detection of substructures.
 * @see [OrthogonalLayout.EDGE_DIRECTEDNESS_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayoutData%23edgeDirectedness">Online Documentation</a>
 */
final var edgeDirectedness: ItemMapping<IEdge, EdgeDirectedness>
/**
 * Gets or sets the mapping that provides a [PreferredPlacementDescriptor] instance for edge [ILabel]s.
 * @see [PreferredPlacementDescriptor]
 * @see [LayoutGraphAdapter.EDGE_LABEL_LAYOUT_PREFERRED_PLACEMENT_DESCRIPTOR_DP_KEY][yfiles.layout.LayoutGraphAdapter.EDGE_LABEL_LAYOUT_PREFERRED_PLACEMENT_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayoutData%23edgeLabelPreferredPlacement">Online Documentation</a>
 */
final var edgeLabelPreferredPlacement: ItemMapping<ILabel, PreferredPlacementDescriptor>
/**
 * Gets or sets the mapping from edges to their [EdgeLayoutDescriptor].
 * @see [EdgeLayoutDescriptor]
 * @see [OrthogonalLayout.EDGE_LAYOUT_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayoutData%23edgeLayoutDescriptors">Online Documentation</a>
 */
final var edgeLayoutDescriptors: ItemMapping<IEdge, EdgeLayoutDescriptor>
/**
 * Gets or sets the mapping from nodes to their [NodeHalo].
 * @see [NodeHalo.NODE_HALO_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayoutData%23nodeHalos">Online Documentation</a>
 */
final var nodeHalos: ItemMapping<INode, NodeHalo>
/**
 * Gets or sets the mapping from nodes to an object defining the node type, which is considered for the detection of tree, chain and cycle substructures.
 * @see [LayoutKeys.NODE_TYPE_DP_KEY][yfiles.layout.LayoutKeys.NODE_TYPE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayoutData%23nodeTypes">Online Documentation</a>
 */
final var nodeTypes: ItemMapping<INode, INodeType>
/**
 * Gets or sets a mapping from edges to an object representing their source edge group.
 * @see [targetGroupIds]
 * @see [PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY][yfiles.layout.PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayoutData%23sourceGroupIds">Online Documentation</a>
 */
final var sourceGroupIds: ItemMapping<IEdge, Id>
/**
 * Gets or sets a mapping from edges to an object representing their target edge group.
 * @see [sourceGroupIds]
 * @see [PortConstraintKeys.TARGET_GROUP_ID_DP_KEY][yfiles.layout.PortConstraintKeys.TARGET_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayoutData%23targetGroupIds">Online Documentation</a>
 */
final var targetGroupIds: ItemMapping<IEdge, Id>

companion object : ClassMetadata<OrthogonalLayoutData> {
}
}

inline fun OrthogonalLayoutData(
    block: OrthogonalLayoutData.() -> Unit
): OrthogonalLayoutData {
    return OrthogonalLayoutData()
        .apply(block)
}
