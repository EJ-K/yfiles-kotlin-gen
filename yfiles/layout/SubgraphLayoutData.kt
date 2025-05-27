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
import yfiles.graph.INode
import yfiles.lang.ClassMetadata

/**
 * Specifies custom data for the [SubgraphLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubgraphLayoutData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [SubgraphLayoutData] which helps configuring [SubgraphLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubgraphLayoutData%23SubgraphLayoutData-constructor-SubgraphLayoutData">Online Documentation</a>
 */
external open class SubgraphLayoutData  () : LayoutData {

/**
 * Gets or sets the collection of subgraph edges that are included in the graph, thus, are visible for the [core layout algorithm][LayoutStageBase.coreLayout] of the [SubgraphLayout].
 * @see [SubgraphLayout.SUBGRAPH_EDGES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubgraphLayoutData%23subgraphEdges">Online Documentation</a>
 */
final var subgraphEdges: DpKeyItemCollection<IEdge>
/**
 * Gets or sets the collection of subgraph nodes that are included in the graph, thus, are visible for the [core layout algorithm][LayoutStageBase.coreLayout] of the [SubgraphLayout].
 * @see [SubgraphLayout.affectedNodesDpKey]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubgraphLayoutData%23subgraphNodes">Online Documentation</a>
 */
final var subgraphNodes: DpKeyItemCollection<INode>

companion object : ClassMetadata<SubgraphLayoutData> {
}
}

inline fun SubgraphLayoutData(
    block: SubgraphLayoutData.() -> Unit
): SubgraphLayoutData {
    return SubgraphLayoutData()
        .apply(block)
}
