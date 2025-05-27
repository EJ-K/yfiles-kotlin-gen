// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * @see [HierarchicLayout.layoutMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutMode">Online Documentation</a>
 */
external sealed class LayoutMode: YEnum<LayoutMode> {
   companion object: EnumMetadata<LayoutMode> {
       /**
 * A layout mode that allows to keep some nodes fixed and insert the remaining nodes incrementally.
 * 
 * Value - `0`
 * @see [IIncrementalHintsFactory.createLayerIncrementallyHint]
 * @see [HierarchicLayout.layoutMode]
 * @see [HierarchicLayout.fixedElementsSequencer]
 * @see [HierarchicLayout.fixedElementsLayerer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutMode%23INCREMENTAL">Online Documentation</a>
 */
val INCREMENTAL: LayoutMode

/**
 * A layout mode that will recompute the complete layout from scratch.
 * 
 * Value - `1`
 * @see [HierarchicLayout.layoutMode]
 * @see [HierarchicLayout.fromScratchSequencer]
 * @see [HierarchicLayout.fromScratchLayerer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutMode%23FROM_SCRATCH">Online Documentation</a>
 */
val FROM_SCRATCH: LayoutMode
   }
}
