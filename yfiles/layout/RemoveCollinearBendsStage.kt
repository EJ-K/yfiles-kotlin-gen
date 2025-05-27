// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.ClassMetadata

/**
 * The [RemoveCollinearBendsStage] removes all collinear bends found in a graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RemoveCollinearBendsStage">Online Documentation</a>
 * 
 * @constructor Creates a new [RemoveCollinearBendsStage] instance with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RemoveCollinearBendsStage%23RemoveCollinearBendsStage-constructor-RemoveCollinearBendsStage">Online Documentation</a>
 */
external open class RemoveCollinearBendsStage  () : LayoutStageBase {

/**
 * Gets or sets whether the algorithm removes only collinear bends which lie in the middle of their neighbors or all collinear bends.
 * 
 * Default value - `false`. All collinear bends are removed from the edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RemoveCollinearBendsStage%23removeStraightOnly">Online Documentation</a>
 */
open var removeStraightOnly: Boolean
/**
 * Gets or sets the scale that defines how accurate the algorithm is when it comes to comparing the coordinates of two bends.
 * 
 * Default value - `2`. Bend coordinates are rounded to the second decimal position before comparing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RemoveCollinearBendsStage%23scale">Online Documentation</a>
 */
open var scale: Double
/**
 * Removes collinear bends of the edges in the given graph.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RemoveCollinearBendsStage%23RemoveCollinearBendsStage-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )

companion object : ClassMetadata<RemoveCollinearBendsStage> {
}
}

inline fun RemoveCollinearBendsStage(
    block: RemoveCollinearBendsStage.() -> Unit
): RemoveCollinearBendsStage {
    return RemoveCollinearBendsStage()
        .apply(block)
}
