// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.layout.ItemMapping
import yfiles.layout.LayoutData

/**
 * Specifies custom data for the [AspectRatioTreeLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioTreeLayoutData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [AspectRatioTreeLayoutData] which helps configuring [AspectRatioTreeLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioTreeLayoutData%23AspectRatioTreeLayoutData-constructor-AspectRatioTreeLayoutData">Online Documentation</a>
 */
external open class AspectRatioTreeLayoutData  () : LayoutData {

/**
 * Gets or sets the mapping from nodes with sub trees to their placements.
 * @see [AspectRatioTreeLayout.ROOT_PLACEMENT_DP_KEY]
 * @see [AspectRatioTreeLayout.getRootPlacement]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioTreeLayoutData%23rootPlacements">Online Documentation</a>
 */
final var rootPlacements: ItemMapping<INode, RootPlacement>
/**
 * Gets or sets the mapping from nodes to the aspect ratio of their sub tree.
 * @see [AspectRatioTreeLayout.SUBTREE_ASPECT_RATIO_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioTreeLayoutData%23subtreeAspectRatios">Online Documentation</a>
 */
final var subtreeAspectRatios: ItemMapping<INode, Double>
/**
 * Gets or sets the mapping from nodes to the routing policies of their sub trees.
 * @see [AspectRatioTreeLayout.SUBTREE_ROUTING_POLICY_DP_KEY]
 * @see [AspectRatioTreeLayout.getSubtreeArrangement]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AspectRatioTreeLayoutData%23subtreeRoutingPolicies">Online Documentation</a>
 */
final var subtreeRoutingPolicies: ItemMapping<INode, SubtreeArrangement>

companion object : ClassMetadata<AspectRatioTreeLayoutData> {
}
}

inline fun AspectRatioTreeLayoutData(
    block: AspectRatioTreeLayoutData.() -> Unit
): AspectRatioTreeLayoutData {
    return AspectRatioTreeLayoutData()
        .apply(block)
}
