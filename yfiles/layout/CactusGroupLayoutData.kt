// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.AbortHandler
import yfiles.collections.IComparer
import yfiles.graph.IEdge
import yfiles.graph.INode
import yfiles.lang.ClassMetadata

/**
 * Specifies custom data for the [CactusGroupLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CactusGroupLayoutData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of this class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CactusGroupLayoutData%23CactusGroupLayoutData-constructor-CactusGroupLayoutData">Online Documentation</a>
 */
external open class CactusGroupLayoutData  () : LayoutData {

/**
 * Gets or sets the [AbortHandler] used during the layout.
 * @see [LayoutExecutor.abortHandler]
 * @see [AbortHandler.ABORT_HANDLER_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CactusGroupLayoutData%23abortHandler">Online Documentation</a>
 */
final var abortHandler: AbortHandler?
/**
 * Gets or sets the roots of collapsed subtrees in the hierarchy.
 * @see [CactusGroupLayout.COLLAPSED_SUBTREE_ROOTS_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CactusGroupLayoutData%23collapsedSubtreeRoots">Online Documentation</a>
 */
final var collapsedSubtreeRoots: ItemCollection<INode>
/**
 * Gets or sets the mapping of edges to their [EdgeBundleDescriptor] when using [CactusGroupLayout.edgeBundling].
 * @see [EdgeBundleDescriptor]
 * @see [CactusGroupLayout.edgeBundling]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CactusGroupLayoutData%23edgeBundleDescriptors">Online Documentation</a>
 */
final var edgeBundleDescriptors: ItemMapping<IEdge, EdgeBundleDescriptor>
/**
 * Gets or sets a comparison function used to sort the child nodes of parent nodes.
 * @see [CactusGroupLayout.fromSketchMode]
 * @see [CactusGroupLayout.nodeComparer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CactusGroupLayoutData%23nodeComparer">Online Documentation</a>
 */
final var nodeComparer: IComparer<INode>?
/**
 * Gets or sets the mapping from nodes to their [NodeHalo].
 * @see [NodeHalo.NODE_HALO_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CactusGroupLayoutData%23nodeHalos">Online Documentation</a>
 */
final var nodeHalos: ItemMapping<INode, NodeHalo>
/**
 * Gets or sets the mapping from nodes to the overlap they have with their parent in the hierarchy.
 * @see [CactusGroupLayout.PARENT_OVERLAP_RATIO_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CactusGroupLayoutData%23parentOverlapRatios">Online Documentation</a>
 */
final var parentOverlapRatios: ItemMapping<INode, Double>

companion object : ClassMetadata<CactusGroupLayoutData> {
}
}

inline fun CactusGroupLayoutData(
    block: CactusGroupLayoutData.() -> Unit
): CactusGroupLayoutData {
    return CactusGroupLayoutData()
        .apply(block)
}
