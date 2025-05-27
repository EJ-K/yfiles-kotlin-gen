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
 * @see [AspectRatioTreeLayout.createBends]
 * @see [AspectRatioTreeLayout.getRootPlacement]
 * @see [AspectRatioTreeLayout.rootPlacement]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RootPlacement">Online Documentation</a>
 */
external sealed class RootPlacement: YEnum<RootPlacement> {
   companion object: EnumMetadata<RootPlacement> {
       /**
 * A root placement specifier for placing the root centered above its subtree, depending on the actual [layout orientation][yfiles.layout.MultiStageLayout.layoutOrientation].
 * 
 * Value - `1`
 * @see [AspectRatioTreeLayout.ROOT_PLACEMENT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RootPlacement%23TOP">Online Documentation</a>
 */
val TOP: RootPlacement

/**
 * A root placement specifier for placing the root in the upper left corner of the subtree bounds with respect to the actual [layout orientation][yfiles.layout.MultiStageLayout.layoutOrientation].
 * 
 * Value - `2`
 * @see [AspectRatioTreeLayout.ROOT_PLACEMENT_DP_KEY]
 * @see [CORNER_TOP]
 * @see [CORNER_SIDE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RootPlacement%23CORNER">Online Documentation</a>
 */
val CORNER: RootPlacement

/**
 * A root placement specifier for placing the root in the upper left corner of the subtree bounds with respect to the actual [layout orientation][yfiles.layout.MultiStageLayout.layoutOrientation].
 * 
 * Value - `3`
 * @see [AspectRatioTreeLayout.ROOT_PLACEMENT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RootPlacement%23CORNER_SIDE">Online Documentation</a>
 */
val CORNER_SIDE: RootPlacement

/**
 * A root placement specifier for placing the root of a subtree in the upper left corner of the subtree bounds with respect to the actual [layout orientation][yfiles.layout.MultiStageLayout.layoutOrientation].
 * 
 * Value - `4`
 * @see [AspectRatioTreeLayout.ROOT_PLACEMENT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RootPlacement%23CORNER_TOP">Online Documentation</a>
 */
val CORNER_TOP: RootPlacement
   }
}
