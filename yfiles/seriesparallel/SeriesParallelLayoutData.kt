// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.seriesparallel

import yfiles.algorithms.AbortHandler
import yfiles.collections.IComparer
import yfiles.graph.IEdge
import yfiles.graph.ILabel
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.Id
import yfiles.layout.ItemMapping
import yfiles.layout.LayoutData
import yfiles.layout.PreferredPlacementDescriptor

/**
 * Specifies custom data for the [SeriesParallelLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayoutData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [SeriesParallelLayoutData] which helps configuring [SeriesParallelLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayoutData%23SeriesParallelLayoutData-constructor-SeriesParallelLayoutData">Online Documentation</a>
 */
external open class SeriesParallelLayoutData  () : LayoutData {

/**
 * Gets or sets the [AbortHandler] used during the layout.
 * @see [LayoutExecutor.abortHandler][yfiles.layout.LayoutExecutor.abortHandler]
 * @see [AbortHandler.ABORT_HANDLER_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayoutData%23abortHandler">Online Documentation</a>
 */
final var abortHandler: AbortHandler?
/**
 * Gets or sets the mapping that provides a [PreferredPlacementDescriptor] instance for edge [ILabel]s.
 * @see [PreferredPlacementDescriptor]
 * @see [LayoutGraphAdapter.EDGE_LABEL_LAYOUT_PREFERRED_PLACEMENT_DESCRIPTOR_DP_KEY][yfiles.layout.LayoutGraphAdapter.EDGE_LABEL_LAYOUT_PREFERRED_PLACEMENT_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayoutData%23edgeLabelPreferredPlacement">Online Documentation</a>
 */
final var edgeLabelPreferredPlacement: ItemMapping<ILabel, PreferredPlacementDescriptor>
/**
 * Gets or sets the mapping from edges to their [EdgeLayoutDescriptor].
 * @see [EdgeLayoutDescriptor]
 * @see [SeriesParallelLayout.EDGE_LAYOUT_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayoutData%23edgeLayoutDescriptors">Online Documentation</a>
 */
final var edgeLayoutDescriptors: ItemMapping<IEdge, EdgeLayoutDescriptor>
/**
 * Gets or sets the mapping from nodes to comparison functions used to sort the nodes' outgoing edges.
 * @see [SeriesParallelLayout.OUT_EDGE_COMPARER_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayoutData%23outEdgeComparers">Online Documentation</a>
 */
final var outEdgeComparers: ItemMapping<INode, IComparer<IEdge>>
/**
 * Gets or sets the mapping from nodes to their [IPortAssignment].
 * @see [SeriesParallelLayout.PORT_ASSIGNMENT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayoutData%23portAssignments">Online Documentation</a>
 */
final var portAssignments: ItemMapping<INode, IPortAssignment>
/**
 * Gets or sets a mapping from edges to an object representing their source edge group.
 * @see [PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY][yfiles.layout.PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayoutData%23sourceGroupIds">Online Documentation</a>
 */
final var sourceGroupIds: ItemMapping<IEdge, Id>
/**
 * Gets or sets a mapping from edges to an object representing their target edge group.
 * @see [PortConstraintKeys.TARGET_GROUP_ID_DP_KEY][yfiles.layout.PortConstraintKeys.TARGET_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayoutData%23targetGroupIds">Online Documentation</a>
 */
final var targetGroupIds: ItemMapping<IEdge, Id>

companion object : ClassMetadata<SeriesParallelLayoutData> {
}
}

inline fun SeriesParallelLayoutData(
    block: SeriesParallelLayoutData.() -> Unit
): SeriesParallelLayoutData {
    return SeriesParallelLayoutData()
        .apply(block)
}
