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
import yfiles.layout.LayoutData

/**
 * Specifies custom data for the [ParallelEdgeRouter].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouterData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [ParallelEdgeRouterData] which helps configuring [ParallelEdgeRouter].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouterData%23ParallelEdgeRouterData-constructor-ParallelEdgeRouterData">Online Documentation</a>
 */
external open class ParallelEdgeRouterData  () : LayoutData {

/**
 * Gets or sets the [AbortHandler] used during the layout.
 * @see [LayoutExecutor.abortHandler][yfiles.layout.LayoutExecutor.abortHandler]
 * @see [AbortHandler.ABORT_HANDLER_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouterData%23abortHandler">Online Documentation</a>
 */
final var abortHandler: AbortHandler?
/**
 * Gets or sets the collection of edges affected by this router.
 * @see [ParallelEdgeRouter.AFFECTED_EDGES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouterData%23affectedEdges">Online Documentation</a>
 */
final var affectedEdges: ItemCollection<IEdge>
/**
 * Gets or sets the collection of leading edges.
 * @see [ParallelEdgeRouter.LEADING_EDGE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouterData%23leadingEdges">Online Documentation</a>
 */
final var leadingEdges: ItemCollection<IEdge>
/**
 * Gets or sets the edge collection that after the layout run will contain all parallel edges that were routed and not treated as leading edges.
 * @see [ParallelEdgeRouter.ROUTED_PARALLEL_EDGES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParallelEdgeRouterData%23routedParallelEdges">Online Documentation</a>
 */
final var routedParallelEdges: ICollection<out IEdge>?

companion object : ClassMetadata<ParallelEdgeRouterData> {
}
}

inline fun ParallelEdgeRouterData(
    block: ParallelEdgeRouterData.() -> Unit
): ParallelEdgeRouterData {
    return ParallelEdgeRouterData()
        .apply(block)
}
