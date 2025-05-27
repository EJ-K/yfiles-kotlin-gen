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
import yfiles.graph.IEdge
import yfiles.lang.ClassMetadata
import yfiles.layout.ItemCollection
import yfiles.layout.LayoutData

/**
 * Specifies custom data for the [OrganicEdgeRouter].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicEdgeRouterData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [OrganicEdgeRouterData] which helps configuring [OrganicEdgeRouter].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicEdgeRouterData%23OrganicEdgeRouterData-constructor-OrganicEdgeRouterData">Online Documentation</a>
 */
external open class OrganicEdgeRouterData  () : LayoutData {

/**
 * Gets or sets the [AbortHandler] used during the layout.
 * @see [LayoutExecutor.abortHandler][yfiles.layout.LayoutExecutor.abortHandler]
 * @see [AbortHandler.ABORT_HANDLER_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicEdgeRouterData%23abortHandler">Online Documentation</a>
 */
final var abortHandler: AbortHandler?
/**
 * Gets or sets the collection of edges routed by this router.
 * @see [OrganicEdgeRouter.AFFECTED_EDGES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicEdgeRouterData%23affectedEdges">Online Documentation</a>
 */
final var affectedEdges: ItemCollection<IEdge>

companion object : ClassMetadata<OrganicEdgeRouterData> {
}
}

inline fun OrganicEdgeRouterData(
    block: OrganicEdgeRouterData.() -> Unit
): OrganicEdgeRouterData {
    return OrganicEdgeRouterData()
        .apply(block)
}
