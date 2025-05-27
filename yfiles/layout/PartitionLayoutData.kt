// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.collections.ICollection
import yfiles.graph.IEdge
import yfiles.lang.ClassMetadata

/**
 * Specifies custom data for the [PartitionLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionLayoutData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [PartitionLayoutData] which helps configuring [PartitionLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionLayoutData%23PartitionLayoutData-constructor-PartitionLayoutData">Online Documentation</a>
 */
external open class PartitionLayoutData  () : LayoutData {

/**
 * Gets or sets a mapping from edges to a collection of their source port [candidates][PortCandidate].
 * @see [PortCandidate.SOURCE_PORT_CANDIDATE_COLLECTION_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionLayoutData%23sourcePortCandidates">Online Documentation</a>
 */
final var sourcePortCandidates: ItemMapping<IEdge, ICollection<out PortCandidate>>
/**
 * Gets or sets a mapping from edges to their source [PortConstraint].
 * @see [PortConstraintKeys.SOURCE_PORT_CONSTRAINT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionLayoutData%23sourcePortConstraints">Online Documentation</a>
 */
final var sourcePortConstraints: ItemMapping<IEdge, PortConstraint>
/**
 * Gets or sets a mapping from edges to a collection of their target port [candidates][PortCandidate].
 * @see [PortCandidate.TARGET_PORT_CANDIDATE_COLLECTION_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionLayoutData%23targetPortCandidates">Online Documentation</a>
 */
final var targetPortCandidates: ItemMapping<IEdge, ICollection<out PortCandidate>>
/**
 * Gets or sets a mapping from edges to their target [PortConstraint].
 * @see [PortConstraintKeys.TARGET_PORT_CONSTRAINT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionLayoutData%23targetPortConstraints">Online Documentation</a>
 */
final var targetPortConstraints: ItemMapping<IEdge, PortConstraint>

companion object : ClassMetadata<PartitionLayoutData> {
}
}

inline fun PartitionLayoutData(
    block: PartitionLayoutData.() -> Unit
): PartitionLayoutData {
    return PartitionLayoutData()
        .apply(block)
}
