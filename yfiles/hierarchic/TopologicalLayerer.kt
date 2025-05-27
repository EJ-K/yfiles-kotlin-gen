// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.lang.ClassMetadata
import yfiles.layout.LayoutGraph

/**
 * This class implements the layering phase of the [HierarchicLayout] (i.e., assignment of the nodes to layers).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TopologicalLayerer">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [TopologicalLayerer] with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TopologicalLayerer%23TopologicalLayerer-constructor-TopologicalLayerer">Online Documentation</a>
 */
external open class TopologicalLayerer  () : ILayerer {

/**
 * Gets or sets the (re-)ranking policy used by this [TopologicalLayerer] instance.
 * 
 * Default value - [RankingPolicy.NO_RERANKING]
 * @throws ArgumentError if an unknown ranking policy is given
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TopologicalLayerer%23rankingPolicy">Online Documentation</a>
 */
open var rankingPolicy: RankingPolicy
/**
 * Assigns all nodes of the graph to layers and adds them to the [ILayers] instance.
 * @param [graph] the input graph
 * @param [layers] the [ILayers] instance that will be filled with the results of the calculation
 * @param [ldp] the [ILayoutDataProvider] used for querying information about the nodes and edges
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TopologicalLayerer%23TopologicalLayerer-method-assignLayers">Online Documentation</a>
 */
 override   fun assignLayers( graph: LayoutGraph ,
 layers: ILayers ,
 ldp: ILayoutDataProvider )

companion object : ClassMetadata<TopologicalLayerer> {
}
}

inline fun TopologicalLayerer(
    block: TopologicalLayerer.() -> Unit
): TopologicalLayerer {
    return TopologicalLayerer()
        .apply(block)
}
