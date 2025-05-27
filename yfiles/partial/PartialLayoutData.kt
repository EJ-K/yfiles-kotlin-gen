// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.partial

import yfiles.algorithms.AbortHandler
import yfiles.collections.ICollection
import yfiles.graph.IEdge
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.Id
import yfiles.layout.ItemCollection
import yfiles.layout.ItemMapping
import yfiles.layout.LayoutData
import yfiles.layout.NodeHalo
import yfiles.layout.PartitionGridData
import yfiles.layout.PortCandidate
import yfiles.layout.PortConstraint

/**
 * Specifies custom data for the [PartialLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayoutData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [PartialLayoutData] which helps configuring [PartialLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayoutData%23PartialLayoutData-constructor-PartialLayoutData">Online Documentation</a>
 */
external open class PartialLayoutData  () : LayoutData {

/**
 * Gets or sets the [AbortHandler] used during the layout.
 * @see [LayoutExecutor.abortHandler][yfiles.layout.LayoutExecutor.abortHandler]
 * @see [AbortHandler.ABORT_HANDLER_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayoutData%23abortHandler">Online Documentation</a>
 */
final var abortHandler: AbortHandler?
/**
 * Gets or sets the collection of edges placed by the layout.
 * @see [PartialLayout.AFFECTED_EDGES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayoutData%23affectedEdges">Online Documentation</a>
 */
final var affectedEdges: ItemCollection<IEdge>
/**
 * Gets or sets the collection of nodes placed by the layout.
 * @see [PartialLayout.AFFECTED_NODES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayoutData%23affectedNodes">Online Documentation</a>
 */
final var affectedNodes: ItemCollection<INode>
/**
 * Gets or sets the mapping from partial nodes to an object defining their component assignment.
 * @see [PartialLayout.COMPONENT_ID_DP_KEY]
 * @see [ComponentAssignmentStrategy.CUSTOMIZED]
 * @see [PartialLayout.componentAssignmentStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayoutData%23componentIds">Online Documentation</a>
 */
final var componentIds: ItemMapping<INode, Id>
/**
 * Gets or sets the collection of edges that are considered as directed by the layout.
 * @see [PartialLayout.DIRECTED_EDGES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayoutData%23directedEdges">Online Documentation</a>
 */
final var directedEdges: ItemCollection<IEdge>
/**
 * Gets or sets the mapping from nodes to their [NodeHalo].
 * @see [NodeHalo.NODE_HALO_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayoutData%23nodeHalos">Online Documentation</a>
 */
final var nodeHalos: ItemMapping<INode, NodeHalo>
/**
 * Gets or sets the [partition grid][yfiles.layout.PartitionGrid] layout data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayoutData%23partitionGridData">Online Documentation</a>
 */
final var partitionGridData: PartitionGridData
/**
 * Gets or sets a mapping from edges to a collection of their source port [candidates][PortCandidate].
 * @see [PortCandidate.SOURCE_PORT_CANDIDATE_COLLECTION_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayoutData%23sourcePortCandidates">Online Documentation</a>
 */
final var sourcePortCandidates: ItemMapping<IEdge, ICollection<out PortCandidate>>
/**
 * Gets or sets a mapping from edges to their source [PortConstraint].
 * @see [PortConstraintKeys.SOURCE_PORT_CONSTRAINT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayoutData%23sourcePortConstraints">Online Documentation</a>
 */
final var sourcePortConstraints: ItemMapping<IEdge, PortConstraint>
/**
 * Gets or sets a mapping from edges to a collection of their target port [candidates][PortCandidate].
 * @see [PortCandidate.TARGET_PORT_CANDIDATE_COLLECTION_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayoutData%23targetPortCandidates">Online Documentation</a>
 */
final var targetPortCandidates: ItemMapping<IEdge, ICollection<out PortCandidate>>
/**
 * Gets or sets a mapping from edges to their target [PortConstraint].
 * @see [PortConstraintKeys.TARGET_PORT_CONSTRAINT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayoutData%23targetPortConstraints">Online Documentation</a>
 */
final var targetPortConstraints: ItemMapping<IEdge, PortConstraint>

companion object : ClassMetadata<PartialLayoutData> {
}
}

inline fun PartialLayoutData(
    block: PartialLayoutData.() -> Unit
): PartialLayoutData {
    return PartialLayoutData()
        .apply(block)
}
