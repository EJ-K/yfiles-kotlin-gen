// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.EdgeDpKey
import yfiles.algorithms.NodeDpKey
import yfiles.lang.ClassMetadata

/**
 * A [SubgraphLayout] is a [ILayoutStage] that filters out all graph elements that are not part of a specific subgraph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubgraphLayout">Online Documentation</a>
 * 
 * @constructor Creates a new [SubgraphLayout] instance with an optional [core layout algorithm][LayoutStageBase.coreLayout].
 * @param [coreLayout] The core layout algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubgraphLayout%23SubgraphLayout-constructor-SubgraphLayout">Online Documentation</a>
 */
external open class SubgraphLayout  ( coreLayout: ILayoutAlgorithm?  = definedExternally) : LayoutStageBase {

/**
 * Gets or sets the key to register a [IDataProvider][yfiles.algorithms.IDataProvider] which marks the edges that are included in the subgraph, thus, visible during the core layout.
 * 
 * Default value - [SUBGRAPH_EDGES_DP_KEY]
 * @see [SUBGRAPH_EDGES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubgraphLayout%23affectedEdgesDpKey">Online Documentation</a>
 */
open var affectedEdgesDpKey: EdgeDpKey<Boolean>
/**
 * Gets or sets the key to register a [IDataProvider][yfiles.algorithms.IDataProvider] which marks the nodes that induce the subgraph to be arranged.
 * 
 * Default value - [LayoutKeys.AFFECTED_NODES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubgraphLayout%23affectedNodesDpKey">Online Documentation</a>
 */
open var affectedNodesDpKey: NodeDpKey<Boolean>
/**
 * Delegates the arrangement of the [specified subgraph][affectedNodesDpKey] of the given graph to the [core layout algorithm][LayoutStageBase.coreLayout].
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubgraphLayout%23SubgraphLayout-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )

companion object : ClassMetadata<SubgraphLayout> {
/**
 * A data provider key for marking edges that are included in the subgraph, thus, visible during the core layout.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubgraphLayout%23SUBGRAPH_EDGES_DP_KEY">Online Documentation</a>
 */
 val SUBGRAPH_EDGES_DP_KEY: EdgeDpKey<Boolean>
}
}

inline fun SubgraphLayout(
    block: SubgraphLayout.() -> Unit
): SubgraphLayout {
    return SubgraphLayout()
        .apply(block)
}
