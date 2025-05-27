// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.multipage

import yfiles.lang.YFlags

/**
 * @see [MultiPageLayout.edgeBundleModeMask]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBundleModes">Online Documentation</a>
 */
external class EdgeBundleModes 
    private constructor(): YFlags<EdgeBundleModes> {
    companion object {
    /**
 * Edge bundle mode constant that specifies that all multi-edges (edges with same endpoints) should be distinguished.
 * 
 * Value - `1`
 * @see [MultiPageLayout.edgeBundleModeMask]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBundleModes%23DISTINGUISH_MULTI_EDGES">Online Documentation</a>
 */
val DISTINGUISH_MULTI_EDGES: EdgeBundleModes
/**
 * Edge bundle mode constant that specifies that multi-edges (edges with same endpoints) should be distinguished if they have different directions.
 * 
 * Value - `2`
 * @see [MultiPageLayout.edgeBundleModeMask]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBundleModes%23DISTINGUISH_DIRECTIONS">Online Documentation</a>
 */
val DISTINGUISH_DIRECTIONS: EdgeBundleModes
/**
 * Edge bundle mode constant that specifies that multi-edges (edges with same endpoints) should be distinguished if they are of different (user specified) type, see [MultiPageLayout.EDGE_TYPE_DP_KEY].
 * 
 * Value - `4`
 * @see [MultiPageLayout.edgeBundleModeMask]
 * @see [MultiPageLayout.EDGE_TYPE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeBundleModes%23DISTINGUISH_TYPES">Online Documentation</a>
 */
val DISTINGUISH_TYPES: EdgeBundleModes

    }
}
