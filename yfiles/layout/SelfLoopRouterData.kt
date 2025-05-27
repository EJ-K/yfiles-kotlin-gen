// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.graph.IEdge
import yfiles.lang.ClassMetadata

/**
 * Specifies custom data for the [SelfLoopRouter] layout stage.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopRouterData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [SelfLoopRouterData] which helps configuring [SelfLoopRouter].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopRouterData%23SelfLoopRouterData-constructor-SelfLoopRouterData">Online Documentation</a>
 */
external open class SelfLoopRouterData  () : LayoutData {

/**
 * Gets or sets the collection of self-loop edges that should keep their current path and not be routed by the [SelfLoopRouter].
 * @see [SelfLoopRouter.KEEP_SELF_LOOP_LAYOUT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopRouterData%23fixedSelfLoops">Online Documentation</a>
 */
final var fixedSelfLoops: ItemCollection<IEdge>

companion object : ClassMetadata<SelfLoopRouterData> {
}
}

inline fun SelfLoopRouterData(
    block: SelfLoopRouterData.() -> Unit
): SelfLoopRouterData {
    return SelfLoopRouterData()
        .apply(block)
}
