// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.graph.IEdge
import yfiles.lang.ClassMetadata
import yfiles.layout.EdgeBundleDescriptor
import yfiles.layout.ItemCollection
import yfiles.layout.ItemMapping
import yfiles.layout.LayoutData

/**
 * Specifies custom data for the [TreeReductionStage].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeReductionStageData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [TreeReductionStageData] which helps configuring [TreeReductionStage].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeReductionStageData%23TreeReductionStageData-constructor-TreeReductionStageData">Online Documentation</a>
 */
external open class TreeReductionStageData  () : LayoutData {

/**
 * Gets or sets the mapping of edges to their [EdgeBundleDescriptor].
 * @see [EdgeBundleDescriptor]
 * @see [TreeReductionStage.edgeBundling]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeReductionStageData%23edgeBundleDescriptors">Online Documentation</a>
 */
final var edgeBundleDescriptors: ItemMapping<IEdge, EdgeBundleDescriptor>
/**
 * Gets or sets the collection of edges explicitly marked as not belonging to a tree.
 * @see [TreeReductionStage.NON_TREE_EDGES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeReductionStageData%23nonTreeEdges">Online Documentation</a>
 */
final var nonTreeEdges: ItemCollection<IEdge>

companion object : ClassMetadata<TreeReductionStageData> {
}
}

inline fun TreeReductionStageData(
    block: TreeReductionStageData.() -> Unit
): TreeReductionStageData {
    return TreeReductionStageData()
        .apply(block)
}
