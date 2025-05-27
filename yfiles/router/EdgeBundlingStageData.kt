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
import yfiles.layout.EdgeBundleDescriptor
import yfiles.layout.ItemMapping
import yfiles.layout.LayoutData

/**
 * Specifies the layout data for the [EdgeBundlingStage].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBundlingStageData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [EdgeBundlingStageData] which helps configuring [EdgeBundlingStage].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBundlingStageData%23EdgeBundlingStageData-constructor-EdgeBundlingStageData">Online Documentation</a>
 */
external open class EdgeBundlingStageData  () : LayoutData {

/**
 * Gets or sets the [AbortHandler] used during the layout.
 * @see [LayoutExecutor.abortHandler][yfiles.layout.LayoutExecutor.abortHandler]
 * @see [AbortHandler.ABORT_HANDLER_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBundlingStageData%23abortHandler">Online Documentation</a>
 */
final var abortHandler: AbortHandler?
/**
 * Gets or sets the mapping of edges to their [EdgeBundleDescriptor].
 * @see [EdgeBundleDescriptor]
 * @see [EdgeBundling.EDGE_BUNDLE_DESCRIPTOR_DP_KEY][yfiles.layout.EdgeBundling.EDGE_BUNDLE_DESCRIPTOR_DP_KEY]
 * @see [EdgeBundling][yfiles.layout.EdgeBundling]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBundlingStageData%23edgeBundleDescriptors">Online Documentation</a>
 */
final var edgeBundleDescriptors: ItemMapping<IEdge, EdgeBundleDescriptor>

companion object : ClassMetadata<EdgeBundlingStageData> {
}
}

inline fun EdgeBundlingStageData(
    block: EdgeBundlingStageData.() -> Unit
): EdgeBundlingStageData {
    return EdgeBundlingStageData()
        .apply(block)
}
