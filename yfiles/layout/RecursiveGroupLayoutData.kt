// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.AbortHandler
import yfiles.collections.ICollection
import yfiles.graph.IEdge
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.Id

/**
 * Specifies custom data for the [RecursiveGroupLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayoutData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [RecursiveGroupLayoutData] which helps configuring [RecursiveGroupLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayoutData%23RecursiveGroupLayoutData-constructor-RecursiveGroupLayoutData">Online Documentation</a>
 */
external open class RecursiveGroupLayoutData  () : LayoutData {

/**
 * Gets or sets the [AbortHandler] used during the layout.
 * @see [LayoutExecutor.abortHandler]
 * @see [AbortHandler.ABORT_HANDLER_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayoutData%23abortHandler">Online Documentation</a>
 */
final var abortHandler: AbortHandler?
/**
 * Gets or sets the mapping from group nodes to the [ILayoutAlgorithm] used for their child nodes.
 * @see [RecursiveGroupLayout.GROUP_NODE_LAYOUT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayoutData%23groupNodeLayouts">Online Documentation</a>
 */
final var groupNodeLayouts: ItemMapping<INode, ILayoutAlgorithm>
/**
 * Gets or set a mapping from group nodes to the [PartitionGridData] used for their content.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayoutData%23groupNodePartitionGrids">Online Documentation</a>
 */
final var groupNodePartitionGrids: ItemMapping<INode, PartitionGridData>
/**
 * Gets or sets the mapping from nodes to their [NodeHalo].
 * @see [NodeHalo.NODE_HALO_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayoutData%23nodeHalos">Online Documentation</a>
 */
final var nodeHalos: ItemMapping<INode, NodeHalo>
/**
 * Gets or sets a mapping from nodes to their [PortCandidateSet].
 * @see [PortCandidateSet.NODE_PORT_CANDIDATE_SET_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayoutData%23nodePortCandidateSets">Online Documentation</a>
 */
final var nodePortCandidateSets: ItemMapping<INode, PortCandidateSet>
/**
 * Gets or sets the [partition grid][PartitionGridData] layout data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayoutData%23partitionGridData">Online Documentation</a>
 */
final var partitionGridData: PartitionGridData
/**
 * Gets or sets a mapping from edges to a collection of their source port [candidates][PortCandidate].
 * @see [sourcePortConstraints]
 * @see [PortCandidate.SOURCE_PORT_CANDIDATE_COLLECTION_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayoutData%23sourcePortCandidates">Online Documentation</a>
 */
final var sourcePortCandidates: ItemMapping<IEdge, ICollection<out PortCandidate>>
/**
 * Gets or sets a mapping from edges to their source [PortConstraint].
 * @see [sourcePortCandidates]
 * @see [PortConstraintKeys.SOURCE_PORT_CONSTRAINT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayoutData%23sourcePortConstraints">Online Documentation</a>
 */
final var sourcePortConstraints: ItemMapping<IEdge, PortConstraint>
/**
 * Gets or sets a mapping from edges connecting to group nodes to source split ids.
 * @see [RecursiveGroupLayout.SOURCE_SPLIT_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayoutData%23sourceSplitIds">Online Documentation</a>
 */
final var sourceSplitIds: ItemMapping<IEdge, Id>
/**
 * Gets or sets a mapping from edges to a collection of their target port [candidates][PortCandidate].
 * @see [targetPortConstraints]
 * @see [PortCandidate.TARGET_PORT_CANDIDATE_COLLECTION_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayoutData%23targetPortCandidates">Online Documentation</a>
 */
final var targetPortCandidates: ItemMapping<IEdge, ICollection<out PortCandidate>>
/**
 * Gets or sets a mapping from edges to their target [PortConstraint].
 * @see [targetPortCandidates]
 * @see [PortConstraintKeys.TARGET_PORT_CONSTRAINT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayoutData%23targetPortConstraints">Online Documentation</a>
 */
final var targetPortConstraints: ItemMapping<IEdge, PortConstraint>
/**
 * Gets or sets a mapping from edges connecting to group nodes to target split ids.
 * @see [RecursiveGroupLayout.TARGET_SPLIT_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveGroupLayoutData%23targetSplitIds">Online Documentation</a>
 */
final var targetSplitIds: ItemMapping<IEdge, Id>

companion object : ClassMetadata<RecursiveGroupLayoutData> {
}
}

inline fun RecursiveGroupLayoutData(
    block: RecursiveGroupLayoutData.() -> Unit
): RecursiveGroupLayoutData {
    return RecursiveGroupLayoutData()
        .apply(block)
}
