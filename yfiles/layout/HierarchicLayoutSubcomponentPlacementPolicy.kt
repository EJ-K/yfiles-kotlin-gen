// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * @see [HierarchicLayoutSubcomponentDescriptor.placementPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutSubcomponentPlacementPolicy">Online Documentation</a>
 */
external sealed class HierarchicLayoutSubcomponentPlacementPolicy: YEnum<HierarchicLayoutSubcomponentPlacementPolicy> {
   companion object: EnumMetadata<HierarchicLayoutSubcomponentPlacementPolicy> {
       /**
 * A placement policy that treats the component as a single node in the containing graph so that it is placed as such by the main layout algorithm.
 * 
 * Value - `0`
 * @see [HierarchicLayoutSubcomponentDescriptor.placementPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutSubcomponentPlacementPolicy%23ISOLATED">Online Documentation</a>
 */
val ISOLATED: HierarchicLayoutSubcomponentPlacementPolicy

/**
 * A placement policy that integrates subcomponents at a *connector* node if such a node exists.
 * 
 * Value - `1`
 * @see [HierarchicLayoutSubcomponentDescriptor.placementPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutSubcomponentPlacementPolicy%23ALWAYS_INTEGRATED">Online Documentation</a>
 */
val ALWAYS_INTEGRATED: HierarchicLayoutSubcomponentPlacementPolicy

/**
 * A placement policy that integrates subcomponents at a *connector* node if such an integration is possible without causing overlaps or violating constraints of the main layout algorithm.
 * 
 * Value - `2`
 * @see [HierarchicLayoutSubcomponentDescriptor.placementPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutSubcomponentPlacementPolicy%23AUTOMATIC">Online Documentation</a>
 */
val AUTOMATIC: HierarchicLayoutSubcomponentPlacementPolicy
   }
}
