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
 * @see [TreeMapLayout.tilingPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TilingPolicy">Online Documentation</a>
 */
external sealed class TilingPolicy: YEnum<TilingPolicy> {
   companion object: EnumMetadata<TilingPolicy> {
       /**
 * A tiling policy that uses the so-called 'squarify' algorithm.
 * 
 * Value - `0`
 * @see [TreeMapLayout.tilingPolicy]
 * @see [TreeMapLayout.aspectRatio]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TilingPolicy%23SQUARIFIED">Online Documentation</a>
 */
val SQUARIFIED: TilingPolicy

/**
 * A tiling policy that places the child nodes one after another inside the parent node.
 * 
 * Value - `1`
 * @see [TreeMapLayout.tilingPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TilingPolicy%23SLICE_AND_DICE">Online Documentation</a>
 */
val SLICE_AND_DICE: TilingPolicy
   }
}
