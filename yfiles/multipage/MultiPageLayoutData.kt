// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.multipage

import yfiles.algorithms.AbortHandler
import yfiles.graph.IEdge
import yfiles.graph.ILabel
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.Id
import yfiles.layout.ItemMapping
import yfiles.layout.LayoutData

/**
 * Specifies custom data for the [MultiPageLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayoutData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [MultiPageLayoutData] which helps configuring [MultiPageLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayoutData%23MultiPageLayoutData-constructor-MultiPageLayoutData">Online Documentation</a>
 */
external open class MultiPageLayoutData  () : LayoutData {

/**
 * Gets or sets the [AbortHandler] used during the layout.
 * @see [LayoutExecutor.abortHandler][yfiles.layout.LayoutExecutor.abortHandler]
 * @see [AbortHandler.ABORT_HANDLER_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayoutData%23abortHandler">Online Documentation</a>
 */
final var abortHandler: AbortHandler?
/**
 * Gets or sets the mapping from edges to their unique IDs.
 * @see [MultiPageLayout.EDGE_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayoutData%23edgeIds">Online Documentation</a>
 */
final var edgeIds: ItemMapping<IEdge, Id>
/**
 * Gets or sets the mapping from edge labels to their unique IDs.
 * @see [MultiPageLayout.EDGE_LABEL_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayoutData%23edgeLabelIds">Online Documentation</a>
 */
final var edgeLabelIds: ItemMapping<ILabel, Id>
/**
 * Gets or sets the mapping from edges to their type.
 * @see [MultiPageLayout.EDGE_TYPE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayoutData%23edgeTypes">Online Documentation</a>
 */
final var edgeTypes: ItemMapping<IEdge, Any>
/**
 * Gets or sets the mapping from nodes to their cluster id.
 * @see [MultiPageLayout.NODE_CLUSTER_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayoutData%23nodeClusterIds">Online Documentation</a>
 */
final var nodeClusterIds: ItemMapping<INode, Id>
/**
 * Gets or sets the mapping from nodes to their unique IDs.
 * @see [MultiPageLayout.NODE_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayoutData%23nodeIds">Online Documentation</a>
 */
final var nodeIds: ItemMapping<INode, Id>
/**
 * Gets or sets the mapping from node labels to their unique IDs.
 * @see [MultiPageLayout.NODE_LABEL_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayoutData%23nodeLabelIds">Online Documentation</a>
 */
final var nodeLabelIds: ItemMapping<ILabel, Id>

companion object : ClassMetadata<MultiPageLayoutData> {
}
}

inline fun MultiPageLayoutData(
    block: MultiPageLayoutData.() -> Unit
): MultiPageLayoutData {
    return MultiPageLayoutData()
        .apply(block)
}
