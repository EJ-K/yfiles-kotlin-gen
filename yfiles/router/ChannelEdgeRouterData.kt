// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.algorithms.AbortHandler
import yfiles.collections.ICollection
import yfiles.graph.IEdge
import yfiles.lang.ClassMetadata
import yfiles.layout.ItemCollection
import yfiles.layout.ItemMapping
import yfiles.layout.LayoutData
import yfiles.layout.PortCandidate
import yfiles.layout.PortConstraint

/**
 * Specifies custom data for the [ChannelEdgeRouter].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelEdgeRouterData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [ChannelEdgeRouterData] which helps configuring [ChannelEdgeRouter].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelEdgeRouterData%23ChannelEdgeRouterData-constructor-ChannelEdgeRouterData">Online Documentation</a>
 */
external open class ChannelEdgeRouterData  () : LayoutData {

/**
 * Gets or sets the [abortHandler] used during the layout.
 * @see [AbortHandler.ABORT_HANDLER_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelEdgeRouterData%23abortHandler">Online Documentation</a>
 */
final var abortHandler: AbortHandler?
/**
 * Gets or sets the collection of edges affected by this router.
 * @see [ChannelEdgeRouter.AFFECTED_EDGES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelEdgeRouterData%23affectedEdges">Online Documentation</a>
 */
final var affectedEdges: ItemCollection<IEdge>
/**
 * Gets or sets a mapping from edges to a collection of their source port [candidates][PortCandidate].
 * @see [PortCandidate.SOURCE_PORT_CANDIDATE_COLLECTION_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelEdgeRouterData%23sourcePortCandidates">Online Documentation</a>
 */
final var sourcePortCandidates: ItemMapping<IEdge, ICollection<out PortCandidate>>
/**
 * Gets or sets a mapping from edges to their source [PortConstraint].
 * @see [PortConstraintKeys.SOURCE_PORT_CONSTRAINT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelEdgeRouterData%23sourcePortConstraints">Online Documentation</a>
 */
final var sourcePortConstraints: ItemMapping<IEdge, PortConstraint>
/**
 * Gets or sets a mapping from edges to a collection of their target port [candidates][PortCandidate].
 * @see [PortCandidate.TARGET_PORT_CANDIDATE_COLLECTION_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelEdgeRouterData%23targetPortCandidates">Online Documentation</a>
 */
final var targetPortCandidates: ItemMapping<IEdge, ICollection<out PortCandidate>>
/**
 * Gets or sets a mapping from edges to their target [PortConstraint].
 * @see [PortConstraintKeys.TARGET_PORT_CONSTRAINT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelEdgeRouterData%23targetPortConstraints">Online Documentation</a>
 */
final var targetPortConstraints: ItemMapping<IEdge, PortConstraint>

companion object : ClassMetadata<ChannelEdgeRouterData> {
}
}

inline fun ChannelEdgeRouterData(
    block: ChannelEdgeRouterData.() -> Unit
): ChannelEdgeRouterData {
    return ChannelEdgeRouterData()
        .apply(block)
}
