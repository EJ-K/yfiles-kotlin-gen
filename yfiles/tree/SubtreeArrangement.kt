// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * A direction specifier for placing the child nodes next to each other in direction of the actual [layout orientation][yfiles.layout.MultiStageLayout.layoutOrientation], with the edges connecting in the direction of flow.
 * @see [AspectRatioTreeLayout.createBends]
 * @see [AspectRatioTreeLayout.getSubtreeArrangement]
 * @see [AspectRatioTreeLayout.subtreeArrangement]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubtreeArrangement">Online Documentation</a>
 */
external sealed class SubtreeArrangement: YEnum<SubtreeArrangement> {
   companion object: EnumMetadata<SubtreeArrangement> {
       /**
 * A direction specifier for placing the child nodes next to each other in direction of the actual [layout orientation][yfiles.layout.MultiStageLayout.layoutOrientation], with the edges connecting in the direction of flow.
 * 
 * Value - `1`
 * @see [AspectRatioTreeLayout.SUBTREE_ROUTING_POLICY_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubtreeArrangement%23HORIZONTAL">Online Documentation</a>
 */
val HORIZONTAL: SubtreeArrangement

/**
 * A direction specifier for placing the child nodes above each other in direction of the actual [layout orientation][yfiles.layout.MultiStageLayout.layoutOrientation], with the edges connecting orthogonally to the direction of flow.
 * 
 * Value - `2`
 * @see [AspectRatioTreeLayout.SUBTREE_ROUTING_POLICY_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubtreeArrangement%23VERTICAL">Online Documentation</a>
 */
val VERTICAL: SubtreeArrangement
   }
}
