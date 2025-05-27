// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.NodeDpKey
import yfiles.lang.ClassMetadata

/**
 * A [LayoutMultiplexer] delegates its layout calls to a core layout algorithm that is dynamically chosen at runtime by inspecting the nodes of the input graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutMultiplexer">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [LayoutMultiplexer].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutMultiplexer%23LayoutMultiplexer-constructor-LayoutMultiplexer">Online Documentation</a>
 */
external open class LayoutMultiplexer  () : LayoutStageBase {

/**
 * Retrieves and invokes the [layout algorithm][ILayoutAlgorithm] that is assigned to the graph.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutMultiplexer%23LayoutMultiplexer-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )
/**
 * Returns the core layout algorithm associated with the nodes contained in the given graph.
 * @param [graph] the input graph
 * @return the according layout algorithm
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutMultiplexer%23LayoutMultiplexer-method-getCoreLayout">Online Documentation</a>
 */
 open protected   fun getCoreLayout( graph: LayoutGraph ):ILayoutAlgorithm?

companion object : ClassMetadata<LayoutMultiplexer> {
/**
 * A data provider key for assigning layout algorithms to the nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutMultiplexer%23LAYOUT_DP_KEY">Online Documentation</a>
 */
 val LAYOUT_DP_KEY: NodeDpKey<ILayoutAlgorithm>
}
}

inline fun LayoutMultiplexer(
    block: LayoutMultiplexer.() -> Unit
): LayoutMultiplexer {
    return LayoutMultiplexer()
        .apply(block)
}
